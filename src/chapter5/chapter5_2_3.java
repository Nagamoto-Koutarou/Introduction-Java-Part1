package chapter5;

public class chapter5_2_3 {
    public static void main(String[] args) {
        email();
        email("momo", "今日の調子はどうですか");
    }

    public static void email() {
        String title = "勉強";
        String address = "koutarou";
        String text = "今日の調子はどうですか？";

        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }

    public static void email(String x, String y) {
        System.out.println(x + "に、以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + y);
    }
}
