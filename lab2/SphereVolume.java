import java.util.Scanner;
import java.lang.Math;

public class SphereVolume 
{ 
public static void main(String[] args) 
{ 
Scanner stdin = new Scanner(System.in);
double userDiameter,radius;
double volumeSphere;

System.out.println("What is the diameter of a sphere");
userDiameter = stdin.nextDouble();
radius = userDiameter/2.0;
volumeSphere = (4.0/3.0)*Math.PI*Math.pow(radius,3);

System.out.println("Given a diameter of " + userDiameter + ", the volume of the sphere is " + volumeSphere);
} 
} 
