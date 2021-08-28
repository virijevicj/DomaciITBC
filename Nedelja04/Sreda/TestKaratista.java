public class TestKaratista {
    public static void main(String[] args) {
        Karatista x = new Karatista("Jovan", 22, "10kyu", new String[]{"1", "2", "3", "4", "5"});
        System.out.println(x.vatreniNapad());
        System.out.println(x.napadni(2));
        x.log();
    }


}
