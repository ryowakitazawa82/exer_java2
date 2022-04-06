package exception;

public class ex1 {
    public static void main(String[] args) {

        System.out.println("Hello World");

        try {
            int number = 0;
            int answer = 100 / number;
            System.out.println(answer);
        } catch (Exception e) {
            System.err.println("０では割り算できません。");
            // System.err.printlndeで、標準エラー出力に結果を出力
            e.printStackTrace();
            // System.out.println(e);
        } finally {
            System.out.println("Hello Java");
        }

        String[] enemies = { "スライム", "ドラゴン", "魔王" };

        System.out.println("勇者は敵に遭遇した");
        

        // 以下は演習

        try {
            int number = 3;
            System.out.println("勇者は" + enemies[number] + "と戦った");
        } catch (Exception e) {
            System.err.println("その敵は表示できません");
        } finally {
            System.out.println("勇者は勝利した");
        }

    }
}
