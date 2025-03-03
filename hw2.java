//ეს პროგრამა ითვლის სტრინგებში სიმბოლოებს. ამ შემთხვევაში გადაცემულია სამი ცვლადი სტრინგისა. გამოყენებულია მეთოდი length()
public class hw2 {

    public static void main(String[] args) {
        String text1 = "abcd";
        String text2 = "abcd";
        String text3 = "abcd";
        int fullLength = text1.length() + text2.length() + text3.length();
        System.out.println("this text contains "  + fullLength + " symbols");

    }
}
