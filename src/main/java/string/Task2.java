package string;

public class Task2 {

    public static void main(String[] args) {

        String sentence = "Potrafię coraz więcej z programowania.";

        for (int i = 0; i <= sentence.length() - 1; i++) {
            System.out.println(sentence.charAt(i));
        }

        System.out.println();

        for (int i = sentence.length() - 1; i >= 0; i--) {
            System.out.print(sentence.charAt(i));
        }
    }
}
