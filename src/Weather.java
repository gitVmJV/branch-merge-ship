public class Weather {

    public static String describe(int temperature) {
        if (temperature > 30) {
            return "Hot"; // BUG: should be "Hot"
        } else if (temperature < 10) {
            return "Cold";  // BUG: should be "Cold"
        } else {
            return "Mild";
        }
    }

    public static void main(String[] args) {
        System.out.println("35C is " + describe(35));
        System.out.println("5C is " + describe(5));
        System.out.println("20C is " + describe(20));
    }
}
