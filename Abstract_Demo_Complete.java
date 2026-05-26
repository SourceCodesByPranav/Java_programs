abstract class Demo
{
    public int i , j ;

    public int Add( int a , int b )             // Concrete method 
    {
        return a + b ;
    }

    public abstract int Sub( int a , int b);        // abstract method

}

class Hello extends Demo
{
    public int Sub( int a , int b )
    {
        return a - b ;
    }
}

class Abstract_Demo_Complete
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();

        System.out.println(hobj.Add( 10 , 11));
        System.out.println(hobj.Sub( 10 , 11));

    }
}