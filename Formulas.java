/**
 * Andrea Wang
 * Problem Set 2C
 * September 27th, 2024
 */
public class Formulas{
    
    //method for question 1
public OrderedPair findQuadraticRoots (double a, double b, double c) {
double root1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
double root2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);

OrderedPair OrderedPair1= new OrderedPair(root1, root2);

return OrderedPair1;
}

//method for question 2
public double findSlope (OrderedPair A, OrderedPair B) {

return (B.getY()- A.getY())/ (B.getX()- A.getX());



}
//method for question 3
public OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
    
double totalX= ((A.getX()+ B.getX())/2);
double totalY= ((A.getY()+ B.getY())/2);
OrderedPair OrderedPair2= new OrderedPair(totalX, totalY);
return OrderedPair2  ;

}
//method for question 4
public double findArithmeticSeriesSum (double a, double d, int k){
    return (k/2.0)*((2*a)+(d*(k-1)));
    
    
    
}
//method for question 5
public double findGeometricSeriesSum (double a, double r, int k){
    return a*((1- Math.pow(r,k))/ (1- r));
    
    
    
}

//method for question 6
public int rollDie (int sides) {

return (int)(Math.random()*sides)+1;


}

}

//writing simple class 
// writing driver class
// math tools class (write method)
// string tools class (write method)









    

















    
