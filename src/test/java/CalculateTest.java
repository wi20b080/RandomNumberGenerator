import at.naghed.RandomNumberGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateTest {


        @Test
        public void test_Calc() {


            //arrange
            RandomNumberGenerator calc = new RandomNumberGenerator();

            //act
            int upperbound = calc.randomNumber();

            //assert

            Assertions.assertTrue(upperbound <= 600);

        }

    @Test
    public void test_CalcUnder() {


        //arrange
        RandomNumberGenerator calc = new RandomNumberGenerator();

        //act
        int underbound = calc.randomNumber();

        //assert

        Assertions.assertTrue(underbound <= 500);

    }





}
