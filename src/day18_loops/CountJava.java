package day18_loops;

public class CountJava {
    public static void main(String[] args) {

        String str = "java is a good coding language and java requires good logics";
        int countJava = 0;

        for (int i = 0; i <= str.length()-4; i++) {
            String every4Chars = str.substring(i, i + 4);

            if (every4Chars.equals("java")) {
                countJava++;
            }

        }

        System.out.println("There are " + countJava + " \"java\" in the string.");

    }
}
