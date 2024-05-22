package lesson_7.tests;

import io.qameta.allure.Description;
import lesson_7.apiHelper.PetstoreOperations;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PetstoreTests extends BaseTest {

    private static final String petId = "666";

    @Test
    @DisplayName("Добавление питомца в магазин")
    public void addPet() {
        String petName = "Буся";

        new PetstoreOperations()
                .createPet(petId, petName, petId);
    }
}
