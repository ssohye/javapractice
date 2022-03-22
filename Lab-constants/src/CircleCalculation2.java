import java.util.Scanner;


public class CircleCalculation2 {

    public static final double PI=3.14159;
    public static void main(String[] args)
    {
        Scanner keyboard= new Scanner(System.in);
        int radius;
        System.out.println("enter the radius of a circle in centimeters");
        radius=keyboard.nextInt();

        System.out.println("area:"+radius*radius*PI+"square centimeters");

    }
}
