package chapter4;

public class Chapter4_2 {
    public static void main(String[] args) {
        int[] moneyList = {121902, 8302, 51500};
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }
        for (int j : moneyList) {
            System.out.println(j);
        }
    }
}
