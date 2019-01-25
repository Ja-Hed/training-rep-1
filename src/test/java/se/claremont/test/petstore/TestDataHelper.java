package se.claremont.test.petstore;

public class TestDataHelper {
    public static Pet getPetWithIdAndName(int id, String name){
        String[] photoUrls = {"http://apa.se", "http://apa.fi"};
        Pet myPet = new Pet();
        myPet.setId(id);
        myPet.setName(name);
        myPet.setPhotoUrls(photoUrls);
        return myPet;
    }
}
