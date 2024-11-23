package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {

        String sentence = "Wednesday is a goon day. We have java class      234         ";
        System.out.println(sentence);

        sentence = sentence.replace("234", "");
        System.out.println(sentence);

        sentence = "Wednesday is a goon day. We have java class      234         ";

        sentence = sentence.replace("234", "").trim().substring(0, sentence.indexOf(".")).replace(" ", "-");
        System.out.println(sentence);


    }
}
