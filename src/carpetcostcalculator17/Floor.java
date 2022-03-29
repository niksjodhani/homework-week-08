package carpetcostcalculator17;

public class Floor {
    double length;
    double width;

    Floor(double width,double length)
    {
        this.width  = width;
        this.length = length;

        if(width<0)
        {
            this.width = 0;
        }

        if(length<0)
        {
            this.length = 0;
        }
    }
    public double getArea()
    {
        double area = 0;
        area = this.width * this.length;

        return  area;
    }
}
