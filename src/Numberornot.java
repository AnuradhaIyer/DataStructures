import java.util.Scanner;

class Utility {

    static boolean numberornot(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return false;
        }

        return true;
    }
}

public class Numberornot {
    public static void main(String[] args) {
        System.out.println("Enter your mobile number");

        Scanner sc=new Scanner(System.in);

        String input=sc.next();
        if(Utility.numberornot(input) && (input.length()==10))

        {
            System.out.println("Correct number");
        }
        else
        {
            System.out.println("Wrong number");
        }
    }
}
