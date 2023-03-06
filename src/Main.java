import java.util.Scanner;

/* A number is called Automorphic, if the square of the number ends with the number itself.
For example 25 is an Automorphic number because (25)2 = 625.
You can see that the square value of 25 ends with the same number 25 (i.e. 625).
*/

public class Main{
    private static boolean isAutomorphic(int num){
        int length=0;
        int square = num*num;
        int temp = num;

        while(temp>0){
            length++;
            temp /= 10;
        }
        /* Here we are finding the last few digits of the square
           equal to the length of the number. For example, if the number
           has two digits then we are finding last two digits of square
           if the number has four digits, we are finding last four digits of
           square.
         */
        int lastDigits = (int)(square%(Math.pow(10, length)));

        return num == lastDigits;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int first = in.nextInt();
        System.out.print("Enter the ending range: ");
        int last = in.nextInt();
        System.out.println("Automorphic numbers between " + first + " and " + last + " are: ");
        for(int i=first ; i<=last ; i++)
        {
            if(isAutomorphic(i))
                System.out.print(i + "  ");
        }
    }
}