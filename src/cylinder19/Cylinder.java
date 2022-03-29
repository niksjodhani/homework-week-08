package cylinder19;

public class Cylinder extends Circle
{
    double height;

    Cylinder(double radius,double height) {
        super(radius);

        this.height = height;
        if(height < 0)
        {
            this.height = 0;
        }

    }

    public double getHeight()
    {
        return this.height;
    }

    public double getVolume()
    {
        double volume = getArea() * this.height;
        return volume;
    }



}
