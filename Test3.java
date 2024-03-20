abstract class Programming
{
    abstract void Developer();
}
class HTML extends Programming{
    void Developer()
    {
        System.out.println("Tim Bernerlee");
    }
}
class Java extends Programming
{
    void Developer()
    {
        System.out.println("James Gosling");
    }
}
class Test3
{
    public static void main(String args[])
    {
        HTML h=new HTML(); //(object creation as we can extend sub class from abstract super class but either the subclass is to be abstract or the method is tobe overriden)
        h.Developer();
        Java j=new Java();
        j.Developer();

        Programming a=new HTML();//(object reference as the super class is abstract)
        a.Developer();
        Programming b=new Java();
        b.Developer();
    }
}