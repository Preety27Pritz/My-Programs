abstract class E{
    E()
    {
        System.out.println("Constructor in E");
    }
}
class F extends E{
    F()
    {
        System.out.println("Constructor in F");
    }
}
class Test7
{
    public static void main(String args[])
    {
        new F();
    }
}