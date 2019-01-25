package se.claremont.test.petstore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import org.junit.Assert;
import org.junit.Test;
import se.claremont.test.Vehicle;

import java.io.IOException;

public class PetStoreTest {

    @Test
    public void putPetInPetStore() throws UnirestException, JsonProcessingException { //
        String[] photoUrls = {"http://apa.se", "http://apa.fi"};
        Pet myPet = new Pet();
        myPet.setId(123);
        myPet.setName("Rinoh");
        myPet.setPhotoUrls(photoUrls);

        new PetStoreClient().putPetInPetStore(myPet);
/*
        HttpResponse<String> response = Unirest.post("https://petstore.swagger.io/v2/pet")
                .header("Content-Type","application/json")
                .body(new ObjectMapper().writeValueAsString(myPet))
                .asString();
        Assert.assertEquals(200,response.getStatus());
        */
    }

    @Test
    public void serializeVehicle() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String myVolvo = mapper.writeValueAsString(new Vehicle("Volvo","v40"));

        System.out.println(myVolvo);
    }
    @Test
    public void deserializeVehicle() throws IOException {

        String myVolvoJson = "{\"make\":\"Volvo\",\"model\":\"v40\",\"owner\":null,\"price\":0}";

        ObjectMapper mapper = new ObjectMapper();
        Vehicle myVolvo = mapper.readValue(myVolvoJson, Vehicle.class);

        Assert.assertEquals("v40",myVolvo.getModel());
    }

    @Test
    public void gettingPet() throws UnirestException, IOException {
        String[] photoUrls = {"http://apa.se", "http://apa.fi"};
        Pet myPet = new Pet();
        myPet.setId(123);
        myPet.setName("Rinoh");
        myPet.setPhotoUrls(photoUrls);

        new PetStoreClient().putPetInPetStore(myPet);

        Pet newPet = new PetStoreClient().getPetbyId(123);
        Assert.assertEquals("Rinoh",newPet.getName());
    }


    //CLEANING UP THE CODE ABOVE

    @Test
    public void putPetInPetStoreClean() throws UnirestException, JsonProcessingException { //
        Pet myPet = TestDataHelper.getPetWithIdAndName(123,"Rinoh");
        PetStoreClient restClient = new PetStoreClient();
    }

    @Test
    public void gettingPetClean() throws UnirestException, IOException {
        Pet myPet = TestDataHelper.getPetWithIdAndName(123,"Rinoh");

        new PetStoreClient().putPetInPetStore(myPet);

        Pet newPet = new PetStoreClient().getPetbyId(123);
        Assert.assertEquals("Rinoh",newPet.getName());
    }
}
