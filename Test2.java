abstract class C{
    abstract void m1();
    void m2()
    {
        System.out.println("m2 in c");
    }
}
class D extends C{
    void m1()
    {
        System.out.println("m1 in D");
    }
}
class Test2
{
    public static void main(String args[])
    {
        C c1=new D();
        c1.m1();
        c1.m2();
    }
}