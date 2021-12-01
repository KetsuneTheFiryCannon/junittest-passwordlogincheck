import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @ParameterizedTest
    @CsvSource({
            "Ketsune, , 0",
            "Ketsune, Ketsune, 0",
            "Ketsune, a, 1",
            "Ketsune, Aa, 2",
            "Ketsune, Aa1, 3",
            "Ketsune, Aa1@, 4",
            "Ketsune, Aa1@ass, 5"
    })
    void CheckingData(String login, String password, int totalExpected) {
        DataHolder dataHolder = new DataHolder(login, password);
        int totalCalculated = dataHolder.CheckingPassword();
        //int total = Integer.parseInt(totalCalculated.get(0));
        if (totalCalculated==5) System.out.println("User created");
        else System.out.println("User can not be created");
        assertEquals(totalExpected, totalCalculated);
    }
}