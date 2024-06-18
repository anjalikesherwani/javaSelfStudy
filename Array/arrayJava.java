public class arrayJava {
    public static void main(String[] args) {
        String[] cars= {"Volvo","BMW","Ford","Mazda"};
        System.out.println(cars);
        System.out.println(cars[2]);

        cars[0] = "OPel";
        System.out.println(cars[0]);

        System.out.println(cars.length);

        int[] myNum = {10,20,34,45}; 
        System.out.println(myNum);
        System.out.println(myNum[1]);

        // String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
        // for (int i = 0; i < car.length; i++) {
        //   System.out.println(car[i]);
        // }


        // String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
        // for (String i : car) {
        //   System.out.println(i);
        // }


        int ages[] = {20,23,34,12,24,35,43,12,21};
        float avg, sum = 0;

        // get the length of the array
        int length = ages.length;

        // loop through the elements of the array
        for(int age : ages){
            sum += age;
        }
        
        // calculate the average by dividing the sum byb the length
        avg = sum/length;
        
        // print the average
        for (int i : ages) {
        System.out.println("Age : "+ i);}
        System.out.println("Sum : "+ sum);
        System.out.println("length : " + length);
        System.out.println("The Average age is : "+ avg);

        // multidimensional array
        // int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        // System.out.println(myNumbers[1][2]);

        // change the value of an element
        // int[][] myNumber = { {1, 2, 3, 4}, {5, 6, 7} };
        // myNumber[1][2] = 9;
        // System.out.println(myNumber[1][2]); 


        // Loop Through a Multi-Dimensional Array
        // int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        // for (int i = 0; i < myNumbers.length; ++i) {
        //   for (int j = 0; j < myNumbers[i].length; ++j) {
        //     System.out.println(myNumbers[i][j]);
        //   }
        // }
 
        
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
          for (int i : row) {
            System.out.println(i);
          }
        }
    
    }
}