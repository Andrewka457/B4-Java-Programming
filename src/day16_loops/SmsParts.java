package day16_loops;

public class SmsParts {
    public static void main(String[] args) {

        String fullMessage ="Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        String sender = fullMessage.substring(fullMessage.indexOf("<") + 1, fullMessage.indexOf(">"));
        String number = fullMessage.substring(fullMessage.indexOf("[") + 1, fullMessage.indexOf("]"));
        String message = fullMessage.substring(fullMessage.indexOf("{") + 1, fullMessage.indexOf("}"));

        System.out.println(sender);
        System.out.println(number);
        System.out.println(message);

    }
}
