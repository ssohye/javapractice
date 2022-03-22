import java.util.Scanner;

public class EggBasket {
    public static void main(String[] args){


        int numberOfBasket,eggsPerBascket,total;


        Scanner keyboard=new Scanner(System.in);

        System.out.println("enter number of bascket");
        numberOfBasket=keyboard.nextInt();
        System.out.println("enter eggs per bascket");
        eggsPerBascket=keyboard.nextInt();
        total=numberOfBasket*eggsPerBascket;





      System.out.println("The count:"+total);

    }
}
