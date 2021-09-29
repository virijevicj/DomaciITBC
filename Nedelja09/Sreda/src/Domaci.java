import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Domaci {
    /*Za prosledjenu Listu brojeva preko tokova izdvojiti:
    Sve brojeve deljive sa 3 uvecati za 2
    Izbaciti sve brojeve koji su deljivi sa 3 prilikom njihovog dupliranja
    Pomnoziti svaki neparan broj sa 2 i izbaciti duplikate
     */
    public static List<Integer> tranform1(List<Integer> list){
        List<Integer> returnList = list.stream().map(x -> x % 3 == 0 ? x + 2 : x).collect(Collectors.toList());
        return returnList;
    }

    public static List<Integer> transform2(List<Integer> list){
        //imaju 2 resenja, nisam bas najbolje razumeo; verovatno si na ovo prvo mislio
        List<Integer> returnList = list.stream().filter(x -> x % 3 != 0).map(x -> 2 * x).collect(Collectors.toList());
//        List<Integer> returnList = list.stream().map(x -> {
//            if(x % 3 != 0){
//                return 2 * x;
//            }
//            return null;
//        }).collect(Collectors.toList());
//        returnList = returnList.stream().filter(x -> x != null ).collect(Collectors.toList());
        return returnList;
    }

    public static Set<Integer> transform3(List<Integer> list) {
        Set<Integer> returnSet = list.stream().map(x -> x % 2 != 0 ? x * 2 : x).collect(Collectors.toSet());
        return returnSet;
    }

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(2); x.add(3); x.add(4); x.add(6);x.add(9);

        System.out.println(tranform1(x));
        System.out.println("-----------------------");
        System.out.println(transform2(x));
        System.out.println("-----------------------");
        System.out.println(transform3(x));
    }
}
