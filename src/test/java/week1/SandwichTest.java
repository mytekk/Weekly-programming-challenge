package week1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mytek on 2017-07-04.
 */
public class SandwichTest {

    String emptyString;

    @Before
    public void setUp() throws Exception {

        emptyString = "";
    }

    @Test
    public void shouldReturnEmptyStringForEmptySandwich() throws Exception {
        //given

        //when
        String result = Sandwich.getSandwich(emptyString);

        //then
        Assert.assertTrue("Nie zwraca pustego stringa dla pustej kanapki.", emptyString.equals(result));
    }

    @Test
    public void shouldReturnEmptyStringWhenSandwichDoesNotContainChleb() {
        //given
        String sandwichWithoutChleb = "xxszynkaxxcokolwiek";

        //when
        String result = Sandwich.getSandwich(sandwichWithoutChleb);

        //then
        Assert.assertTrue("Nie zwraca pustego wiersza jesli w kanapce nie było chleba.", emptyString.equals(result));
    }

    @Test
    public void shouldReturnEmptyStringWhenSandwichHasTwoChlebWithoutNothingBetween() {
        //given
        String sandwichWitchTwoChlebWithoutNothingBetween = "xxchlebchlebyy";

        //when
        String result = Sandwich.getSandwich(sandwichWitchTwoChlebWithoutNothingBetween);

        //then
        Assert.assertTrue("Nie zwraca pustego wiersza jeśli nie było żadnej wartości między dwoma chelbami.", emptyString.equals(result));
    }

    @Test
    public void shouldReturnEmptyStringWhenSandwichHasOnlyOneChleb() {
        //given
        String sandwichWitchOnlyOneChleb = "xxchlebchlebyy";

        //when
        String result = Sandwich.getSandwich(sandwichWitchOnlyOneChleb);

        //then
        Assert.assertTrue("Nie zwraca pustego wiersza jeśli w kanapce jest tylko jeden chleb.", emptyString.equals(result));
    }

    @Test
    public void shouldReturnValueFromFirstGapBetweenTwoChleb() {
        //given
        String sandwichWitchOnlyOneChleb = "xxchlebwartoscPierwszachlebwartoscDrugachlebyy";
        String valueToReturn = "wartoscPierwsza";

        //when
        String result = Sandwich.getSandwich(sandwichWitchOnlyOneChleb);

        //then
        Assert.assertTrue("Nie zwraca poprawnej wartosci jeśli w kanapce jest więcej niż dwa chleby", valueToReturn.equals(result));
    }

}