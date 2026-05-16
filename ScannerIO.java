import java.util.Scanner;

class ScannerIo
{
    public static void main(String A[])
    {
        String name ;

        System.out.println("Enter your name : ");

        Scanner sobj = new Scanner(System.in);
        name = sobj.nextLine();

        System.out.println("Hello " +name);

    }
}