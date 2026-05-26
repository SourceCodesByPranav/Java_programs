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

}

class Abstract_DemoX
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
    }
}