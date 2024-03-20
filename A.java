abstract class A
{
    abstract void m1();
    public static void main (String args[])
    {
        //new A();//compile time error(as A class is abstract, it cannot be instantiated)
        A ref;
    }
}