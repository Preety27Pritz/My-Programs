abstract class B
{
    void m1()
    {
        System.out.println("m1 is executed");
    }
}
class Test1
{
    public static void main(String args[])
    {
        //new B();//compile time error( abstract class can have concrete(normal) method but it cannot be instantiated)
        B ref;
    }
}