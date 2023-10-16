public class ReverseANumber {

    public static void main(String[] args) {

//  Logic to reverse a number using while loop
//        int number = 987654, reverse = 0;
//        while(number != 0)
//        {
//            int remainder = number % 10;
//            reverse = reverse * 10 + remainder;
//            number = number/10;
//        }
//        System.out.println("The reverse of the given number is: " + reverse);



//  Logic to reverse a number using for loop
//
//        int number = 123456, reverse = 0;
////we have not mentioned the initialization part of the for loop
//        for( ;number != 0; number=number/10)
//        {
//            int remainder = number % 10;
//            reverse = reverse * 10 + remainder;
//        }
//        System.out.println("The reverse of the given number is: " + reverse);



//  Logic to reverse a number using recursion
//
//        public static void reverseNumber(int number)
//        {
//            if (number < 10)
//            {
////prints the same number if the number is less than 10
//                System.out.println(number);
//                return;
//            }
//            else
//            {
//                System.out.print(number % 10);
//                reverseNumber(number/10);
//            }
//        }


//    Logic to convert a number from decimal to binary using inbuilt functions
//        System.out.println(Integer.toBinaryString(10));
//        System.out.println(Integer.toBinaryString(21));
//        System.out.println(Integer.toBinaryString(31));



//    Custom logic to convert a decimal to a binary
//        public static void toBinary(int decimal){
//            int binary[] = new int[40];
//            int index = 0;
//            while(decimal > 0){
//                binary[index++] = decimal%2;
//                decimal = decimal/2;
//            }
//            for(int i = index-1;i >= 0;i--){
//                System.out.print(binary[i]);
//            }
//            System.out.println();//new line
//        }

    }
}
