import java.util.Scanner;  
public class Distance{  
public static void main(String[] Strings) 
// calculating distance   
{  
Scanner input = new Scanner(System.in);  
System.out.print("Enter the value of X1:  ");  
// taken input of X1
double X1 = input.nextDouble();  
System.out.print("Enter the value of X2:  ");  
// taken input of X2
double X2 = input.nextDouble();  
System.out.print("Enter the value of Y1:  ");  
double Y1 = input.nextDouble();
// taken input of Y1
System.out.print("Enter the value of Y2:  ");  
double Y2 = input.nextDouble();
// taken input of Y2
//using the formula for calculating a distance
double Distance = Math.sqrt( (X2 - X1)*(X2 - X1) + (Y2 - Y1)*(Y2 - Y1) );
// the output when the value is entered
System.out.println("The distance is  " + Distance);
};
}