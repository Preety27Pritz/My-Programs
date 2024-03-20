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
abstract class Java extends Programming
{
    void Developer()
    {
        System.out.println("James Gosling");
    }
}
class Test4
{
    public static void main(String args[])
    {
        HTML h=new HTML(); 
        h.Developer(); h.Rank();
        //Java j=new Java();//error(Java is not abstract and does not override abstract method Rank() in Programming)
        //j.Developer();
    }
}