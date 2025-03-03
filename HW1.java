// ეს მეთოდი გამოითვლის ნებისმიერი 4 რიცხვის საშუალო არითმეტიკულს

public class HW1 {
    public static void main(String[] args) {
        float numb1 = 5.79f;
        float numb2 = 5f;
        float numb3 = 9f;
        float numb4 = 4f;
        int myNumblength = 4; //ხელით ჩავწერე ელემენტების რაოდენობა, რომელზეც უნდა გავყო ამ ელემენტების ჯამი. (ასე მიწევს წვალება სანამ მაისივებს ვისწავლი:D:D)
        float myNumbSum = (numb1 + numb2 + numb3 + numb4);//შემოვიტანე ცვლადი, რომელიც მიჩვენებს ელემენტების ჯამს.
        double myNumbAverage = (double) myNumbSum / myNumblength; //შემოვიტანე ცვლადის ტიპი (double) რათა საშუალოს გამოთვლისას თავიდან ავიცილო error არამთელი რიცხვისას.
        System.out.println(myNumbAverage);
    }
}
