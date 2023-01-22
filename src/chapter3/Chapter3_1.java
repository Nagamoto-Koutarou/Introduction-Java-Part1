package chapter3;

public class Chapter3_1 {
    public static void main(String[] args) {
        System.out.print("0か1を入力してください：");
        int isHungry = new java.util.Scanner(System.in).nextInt();
        String food = "りんご";
        if (isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }
}
