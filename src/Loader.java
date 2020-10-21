
public class Loader
{
    public static void main(String[] args)
    {
        Cat boris = new Cat();
        for (double i = boris.getWeight(); i > 1000.0; i--)
        {
            boris.meow();
        }
        System.out.println("Boris' weight is " + boris.getWeight());
        System.out.println("Boris is " + boris.getStatus());

        Cat markiz = new Cat();
        for(double j = markiz.getWeight(); markiz.getWeight() < 9000.0; j++)
        {
            markiz.feed(500.0);
        }
        System.out.println("Markiz's weight is " + markiz.getWeight());
        System.out.println("Markis is " + markiz.getStatus());
    }
}