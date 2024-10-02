
/**
 * Andrea Wang
 * Problem Set 2C
 * September 27th, 2024
 */
public class OrderedPair
{
    //instance variables
   double x;
   double y;


//default constructor
public OrderedPair(){
    x=0.0;
    y=0.0;
}

//constructor 
public OrderedPair (double xvalue, double yvalue){
    x= xvalue;
    y= yvalue;
}
//behaviour methods
public String toString() {
    return "("+ x + "," + y + ")";
}
public double getX() {
    return x;
}
public double getY(){
    return y;
}
}

