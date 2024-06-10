public class ifElseJava{
    public static void main(String[] args) {
        
        // if 
        if (20 > 18) {
            System.out.println("20 is greater than 18");
          }

          int x = 20;
          int y = 18;
          if (x > y) {
            System.out.println("x is greater than y");
          }


        // if else
          int time = 20;
          if (time < 18) {
            System.out.println("Good day.");
          } else {
            System.out.println("Good evening.");
          }
          

        //   else if
        int time1 = 22;
        if (time1 < 10) {
            System.out.println("Good morning.");
        } else if (time1 < 18) {
            System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }
    


        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


        
        int myNum = 5;

        if (myNum % 2 == 0) {
          System.out.println(myNum + " is even");
        } else {
          System.out.println(myNum + " is odd");
        } 
    
    }
}