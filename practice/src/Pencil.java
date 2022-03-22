public class Pencil {

    // Field - attribute

    public String color = "white";
    public int length;
    public float diameter;
    private float price;

        public static long nextID=0;


        // 2) method - 함수
        public void setColor(String newColor){
            color=newColor;
        }

        public void printColor() {
            System.out.println(color);
        }

        public void setPrice (float newPrice){
            price=newPrice;
        }

        public void printPrice(){
            System.out.println(price);
        }



}
