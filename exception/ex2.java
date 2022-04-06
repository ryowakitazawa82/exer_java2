package exception;

public class ex2 {

    public static void main(String[] args) {

        System.out.println("Hello World");

        try {
            int number = Integer.parseInt("a");
            int answer = 100 / number;
            System.out.println(answer);
        } catch (NumberFormatException e) {
            System.err.println("文字列を数値に変換出来ません。");
            e.printStackTrace();
        } finally {
            System.out.println("Hello Java");
        }

    }

}
