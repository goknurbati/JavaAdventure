public class FirstKata {

    public static void main(String[] args){
        for (int i=1;i<100;i++){
            //fizzBuzz(i);
            System.out.println(fizzBuzz(i));
        }
    }
    private static String fizzBuzz(int i) {
        String result = "";
        if (i % 15 == 0) {
            //result += "fizzBuzz";
            return "FizzBuzz";
            //System.out.println(result);
        } else if (i % 3 == 0) {
            //result += "fizz";
            return "fizz";
            //System.out.println(result);
        } else if (i % 5 == 0) {
            //result += "buzz";
            return "buzz";
            //System.out.println(result);
        } else {
            //System.out.println(i);
            //return result;
            return i +"";
        }
    }
}
