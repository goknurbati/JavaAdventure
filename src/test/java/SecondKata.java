public class SecondKata {
    public static void main(String[]args){
        for(int i=1;i<100;i++){
            System.out.println(fizzBuzz(i));
        }

    }
    private static String fizzBuzz(int i) {

        if (i % 7 == 0) {
            return "Pop";
        }
        else if (i % 5 == 0 || i % 7 == 0) {
            return "Buzz Pop";
        }
        else if (i % 3 == 0 || i % 7 == 0) {
            return "Fizz Pop";
        }
        else if (i % 3 == 0 || i % 7 == 0 || i % 5 == 0) {
            return "";
        }
        return i +"";

    }
}
