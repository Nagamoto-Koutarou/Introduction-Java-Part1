package chapter4;

public class Chapter4_3 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};
        System.out.print("1桁の数字を入力してください：");
        int input = new java.util.Scanner(System.in).nextInt();

        if (numbers[0] == input) {
            System.out.println("アタリ！");
        } else if (numbers[1] == input) {
            System.out.println("アタリ！");
        } else if (numbers[2] == input){
            System.out.println("アタリ！");
        }

        for (int i : numbers) {
            if (i == input) {
                System.out.println("アタリ！");
            }
        }
    }
}
