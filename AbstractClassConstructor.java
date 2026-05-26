// Assignment no 38 question no 2 

 abstract class A
{
    public A()
    {
        System.out.println("inside abstract class constructor ");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("inside B class constructor ");
    }
}

class AbstractClassConstructor
{
    public static void main(String A[])
    {
        B bobj = new B();
    }
}