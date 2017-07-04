package week1;

/**
 * Created by mytek on 2017-07-04.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("kanapeczka: " + Sandwich.getSandwich("kanapeczka"));
        System.out.println("------------");
        System.out.println("chlebjajkochleb: " + Sandwich.getSandwich("chlebjajkochleb"));
        System.out.println("------------");
        System.out.println("xxchlebszynkachlebyy: " + Sandwich.getSandwich("xxchlebszynkachlebyy"));
        System.out.println("------------");
        System.out.println("xxchlebyy: " + Sandwich.getSandwich("xxchlebyy"));
        System.out.println("------------");
        System.out.println("xxchlebwartoscPierwszachlebwartoscDrugachlebyy: " + Sandwich.getSandwich("xxchlebwartoscPierwszachlebwartoscDrugachlebyy"));
        System.out.println("------------");
        System.out.println("xxchlebwartoscchleb: " + Sandwich.getSandwich("xxchlebwartoscchleb"));
        System.out.println("------------");
        System.out.println("chlebwartoscchlebyy: " + Sandwich.getSandwich("chlebwartoscchlebyy"));
    }


}
