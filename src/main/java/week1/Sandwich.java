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


    public static String getSandwich(String ingredients) {
        String valueToReturn = "";

        ingredients.toLowerCase();

        int count = StringUtils.countMatches(ingredients, "chleb");

        if (count >= 2) {
            //usuwam wszystko to co jest do pierwszego slowa chleb


            //usuwam od konca wszystko do pierwszego slowa chleb

            //dziele stringa pomiedzy slowami chleb
            String[] split = ingredients.split("chleb");
            System.out.println("Splitted table: " + Arrays.toString(split));

            //zamieniam na liste
            List<String> strings = Arrays.asList(split);

            //w strumieniu pozbywam sie nulli lub pustych stringow
            List<String> collect = strings.stream()
                    .filter(e -> (e != null && e.length() > 0))
                    .collect(Collectors.toList());

            System.out.println("Lista: " + collect.toString());


            valueToReturn = collect.get(0);
        }

        return valueToReturn;
    }

}
