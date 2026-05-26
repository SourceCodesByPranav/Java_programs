// Assignment no 38 question no 6 

abstract class A
{
    public static void show()
    {
        System.out.println("Static method show ");

    }   

    abstract void display(); 
}

class B extends A
{
    public void display()
    {
        System.out.println("Implementing Abstract display method ");
    }
}



class AbstractClassStaticMethod
{
    public static void main(String B[])
    {
        A.show();                       // calling static method using class name 

        B bobj = new B();
        bobj.display();
    }
}