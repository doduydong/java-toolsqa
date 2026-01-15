package stringClass;

public class StringManipulations {

    public static void main(String[] args) {
        String sTopic1 = "Selenium Automation Framework";
        String sTopic2 = "Java Tutorial";
        String space = " ";

        System.out.println("Topic 1: " + sTopic1);

        System.out.println("Length: " + sTopic1.length());

        System.out.println(sTopic1.concat(sTopic2));
        System.out.println(sTopic1 + sTopic2);
        System.out.println(sTopic1 + space + sTopic2);
        System.out.println(sTopic1 + " " + sTopic2);

        System.out.println("Compare: " + sTopic1.equals(sTopic2));

        System.out.println("Char at index: " + sTopic1.charAt(7));

        System.out.println("Contains: " + sTopic1.contains("Framework"));

        System.out.println("Index of: " + sTopic1.indexOf("Framework"));

        System.out.println("Sub string from: " + sTopic1.substring(17));
        System.out.println("Sub string from to: " + sTopic1.substring(17, 26));

        System.out.println("Upper case: " + sTopic1.toUpperCase());
        System.out.println("Lower case: " + sTopic1.toLowerCase());

        String[] aSplit = sTopic1.split(" ");
        System.out.println(aSplit[0]);
        System.out.println(aSplit[1]);
        System.out.println(aSplit[2]);
    }
}
