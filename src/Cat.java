
public class Cat
{
    private double originWeight;
    private double weight;
    private double feedCount;
    private double peed;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        feedCount = feedCount + amount;
    }

    public double getFeedCount()
    {
        return feedCount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public double getPeedCount()
    {
        peed = weight - originWeight;
        return Math.abs(peed);
    }

    public void pee()
    {
        weight = weight - (50 + 150 * Math.random());
        System.out.println("Psssss");
    }

    public String getStatus()
    {
        if(weight < minWeight)
        {
            return "Dead";
        }
        else if(weight > maxWeight)
        {
            return "Exploded";
        }
        else if(weight > originWeight)
        {
            return "Sleeping";
        }
        else
            return "Playing";
    }
}