package chapter3;

public class Chapter3_4 {
    public static void main(String[] args) {
        System.out.println("【数あてゲーム】");
        int ans = new java.util.Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            System.out.print("0~9の数字を入力してください：");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num == ans) {
                System.out.println("アタリ！");
                System.out.println("-------------");
                break;
            } else {
                System.out.println("違います");
                System.out.println("-------------");
                if (i < 4) {
                    System.out.println("残り" + (4 - i) + "回入力できます");
                }
            }
        }
        System.out.println("ゲームを終了します");
    }
}
