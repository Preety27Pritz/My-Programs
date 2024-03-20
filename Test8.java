abstract class Vehicle
{ 
    Vehicle()
    {
        System.out.println("Vehicle Id@1234");
    }
    abstract void start();
    abstract void accelerate();
    abstract void stop();
}
class BMW extends Vehicle
{
    void start()
    { 
        System.out.println("BMW starts");
    }
    void accelerate()
    {
        System.out.println("BMW accelerates");
    }
    void stop()
    {
        System.out.println("BMW stops");
    }
}
class Benz extends Vehicle
{
    void start()
    { 
        System.out.println("Benz starts");
    }
    void accelerate()
    {
        System.out.println("Benz accelerates");
    }
    void stop()
    {
        System.out.println("Benz stops");
    }
}
class Test8
{
    public static void main(String args[])
    {
        Vehicle v;
        v=new BMW();
        v.start();
        v.accelerate();
        v.stop();
        v=new Benz();
        v.start();
        v.accelerate();
        v.stop();
    }
}