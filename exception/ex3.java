package exception;
public class ex3 {
    public static void main(String[] args) {
        String[] enemies = {"スライム", "ドラゴン", "魔王" };

        System.out.println("勇者は敵に遭遇した");

        try {
            int number = 3;
            System.out.println("勇者は" + enemies[number] + "と戦った");
        } catch (NumberFormatException e) {
            System.err.println("文字列を数値に変換できません。");
        } catch (ArrayIndexOutOfBoundsException e) {
           System.err.println("その敵は表示できません");
        } catch (Exception e) {
            System.err.println("例外を捕捉しました。");
            e.printStackTrace();
        } finally {
            System.out.println("勇者は勝利した");
        }
    }
}
