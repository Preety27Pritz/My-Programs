abstract class Programming
{
    abstract void Developer();
    abstract void Rank();
}
class HTML extends Programming{
    void Developer()
    {
        System.out.println("Tim Bernerlee");
    }
    void Rank()
    {
        System.out.println(3);
    }
}
class Java extends Programming
{
    void Developer()
    {
        System.out.println("James Gosling");
    }
    void Rank()
    {
       System.out.println(2);
    }
}
class Test5
{
    public static void main(String args[])
    {
        HTML h=new HTML(); 
        h.Developer(); 
        Java j=new Java();//error(Java is not abstract and does not override abstract method Rank() in Programming)
        j.Developer();
    }
}