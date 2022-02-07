import java.util.Scanner;
/*

//while loop

public class biCon {
    public static void main(String[] args) {
        Scanner scan_n = new Scanner(System.in);
        System.out.print("Enter number you want converted: ");
        int n = scan_n.nextInt();
        scan_n.close();
        int n_save = n;
        String biNum = "";
        while (n > 0) {
            if (n%2 == 0) {
                biNum += "0";
            }
            else{
                biNum += "1";
            }
            n = n/2;
        }
        System.out.println("The binary conversion of " + n_save + " is: " + new StringBuilder(biNum).reverse());
    }
}

//recursive

public class biCon {
    public static void main(String[] args) {
        Scanner scan_n = new Scanner(System.in);
        System.out.print("Enter number you want converted: ");
        int n = scan_n.nextInt();
        scan_n.close();        
        System.out.println("The binary conversion of " + n + " is: " + biRecur(n));
    }
    public static String biRecur(int n) {
        if (n>0) {
            if (n%2 == 0) {
                return biRecur(n/2) + "0";
            }
            else {
                return biRecur(n/2) + "1";
            }         
        }
        else {
            return "";
        }
    }
}
*/

//one liner
public class biCon {
    public static void main(String[] args) {
        Scanner scan_n = new Scanner(System.in);
        System.out.print("Enter number you want converted: ");
        int n = scan_n.nextInt();
        scan_n.close();        
        System.out.println("The binary conversion of " + n + " is: " + biRecur(n));
    }
    public static String biRecur(int n) {
        if (n>0) {
            return biRecur(n/2) + n%2;
        }
        return "";
    }
}









