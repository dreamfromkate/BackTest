package lesson_7.apiHelper;

import io.qameta.allure.Step;

import static lesson_7.tests.BaseTest.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetstoreOperations {

    @Step("Создание питомца")
    public PetstoreOperations createPet(String petId, String petName, String petIdResp) {
        Pet pet = new Pet();

        pet.setId(petId);
        pet.setName(petName);
        pet.setStatus("available");

        String id = api.post(Endpoints.PET, resp200, pet)
                .jsonPath()
                .getString("id");

        assertEquals(petIdResp, id);

        return this;
    }
}
