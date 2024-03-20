abstract class Programming
{
    abstract void Developer();
    abstract void Rank();
}
abstract class HTML extends Programming{
    void Developer()
    {
        System.out.println("Tim Bernerlee");
    }
}
class Java extends HTML
{
    void Rank()
    {
        System.out.println(2);
    }
}
class Test6
{
    public static void main(String args[])
    {
        HTML h=new Java(); 
        h.Developer(); h.Rank();
    }
}