package chapter5;

public class chapter5_4 {
    public static void main(String[] args) {
        System.out.println(calcTriangleArea(10.0, 5.0) + "cm²");
        System.out.println(calcCircleArea(5.0) + "cm²");
    }

    public static double calcTriangleArea(double baseLength, double height) {
        return baseLength * height / 2;
    }

    public static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }
}
