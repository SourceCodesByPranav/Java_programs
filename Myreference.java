class Myreference 
{
    public static void main(String [] A)
    {
        Student s1 = new Student();
        s1.id = 101;

        Student s2 = s1 ;

        System.out.println("s1 id :"+s1.id);
        System.out.println("s2 id :"+s2.id);

        s2.id = 201;

        System.out.println("After Modification");
        System.out.println("s1 id :"+s1.id);
        System.out.println("s2 id :"+s2.id);


    } 
}

class Student
{
    public int id;
}