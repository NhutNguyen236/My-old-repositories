public class TestMain {
    public static void main(String[] args){
        //Test for ques5
        //Test for ques6
        RegularPolygon s1 = new PrismRPBased("Hinh1",5,4,"blue",0.5);
        RegularPolygon s2 = new PrismRPBased("Hinh2",6,4,"blue",1.5);
        RegularPolygon s3 = new PrismRPBased("Hinh3",3,5,"blue",1.3);
        RegularPolygon s4 = new PrismRPBased("Hinh4",4,4,"blue",2.3);
        RegularPolygon s5 = new PrismRPBased("Hinh5",4,4,"white",3);
        RegularPolygon s6 = new PrismRPBased("Hinh6",3,4,"red",5.5);
        /*
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s5.equals(s6));
        */
        //Test ques 9
        RegularPolygon s7 = new PrismRPBased("Hinh 7",3,4,"red",1.5);
        System.out.println(s7.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
        System.out.println(s6.toString());
    }
    
}
//String name, int sideAmount, double sideLength, String color
//String name, int sideAmount, double sideLenght, String color, double height
