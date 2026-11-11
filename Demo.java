abstract class car
{
    abstract void show();
    public void drive()
    {
        System.out.println("I can drive");
    }
    public void music()
    {
        System.out.println("I can play music");
    }

}
class Maruthi extends car
{
    public void show()
    {
        System.out.println("I can fly");
    }


}

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Maruthi obj = new Maruthi();
        obj.drive();
        obj.music();
        obj.show();
    }
}
