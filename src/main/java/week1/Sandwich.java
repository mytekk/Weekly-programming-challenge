package week1;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by mytek on 2017-07-04.
 */
public class Sandwich {

    public static final String CHLEB = "chleb";

    public static String getSandwich(String input) {
        String valueToReturn = "";

        input.toLowerCase();

        int count = StringUtils.countMatches(input, CHLEB);

        if (count >= 2) {
            //usuwam wszystko to co jest do pierwszego slowa chleb
            int firstCut = input.indexOf(CHLEB);

            if (firstCut != -1) {
                firstCut += CHLEB.length();
                input = input.substring(firstCut);
            }

            //usuwam wszystko od ostatniego slowa chleb do konca
            int lastCut = input.lastIndexOf(CHLEB);

            if (lastCut != -1) {
                input = input.substring(0, lastCut);
            }

            //dziele stringa pomiedzy slowami chleb (bo moze byc wiele slow chleb w stringu
            // i tym samym wiele wartosci, ktore sa pomiedzy dwoma slowami chleb)
            String[] split = input.split(CHLEB);

            //zamieniam na liste
            List<String> strings = Arrays.asList(split);

            //w strumieniu pozbywam sie nulli lub pustych stringow
            List<String> collect = strings.stream()
                    .filter(e -> (e != null && e.length() > 0))
                    .collect(Collectors.toList());

            //zwracam pierwszy element listy, o ile lista nie jest pusta
            //(bedzie pusta, jesli w wejsciowym stringu pomiedzy slowami chleb nie bedzie nic)
            if (!collect.isEmpty()) {
                valueToReturn = collect.get(0);
            }
        }

        return valueToReturn;
    }

    public static String getSandwichUsingRegexp(String input){
        Matcher matcher = Pattern.compile("chleb(.*)chleb").matcher(input);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    public static String getSandwichUsingIndexOf(String input) {
        int firstIndex = input.indexOf(CHLEB);
        int lastIndex = input.lastIndexOf(CHLEB);
        if (firstIndex < lastIndex) {
            return input.substring(firstIndex + CHLEB.length(), lastIndex);
        }
        return "";
    }

    public static  String getSandwichUsingSplit(String input){
        String[] ingredients =input.split(CHLEB,-2);
        if(ingredients.length>=3) {
            String[] ingredientsInside = Arrays.copyOfRange(ingredients, 1, ingredients.length - 1);
            return Arrays.stream(ingredientsInside).collect(Collectors.joining(CHLEB));
        }
        return "";
    }

}
