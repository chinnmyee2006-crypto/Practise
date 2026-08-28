import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class markslist{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(85);
        list.add(92);
        list.add(78);
        list.add(90);
        list.add(65);
        list.add(88);
        list.add(76);

        System.out.println("markslist" + list);

        int highest =
                java.util.Collections.max(list);
        System.out.println("display highest marks" + highest);

        int lowest =
                java.util.Collections.min(list);
        System.out.println("display lowest marks" + lowest);

        int sum = 0;
        for (int m : list) {
            sum += m;
            System.out.println("sum of marks" + sum);
        }
        int average =(int) sum / list.size();
        System.out.println("average of marks"+average);

        list.removeIf(m->m<80 );
        System.out.println("after removing marks"+list);

        System.out.println("marks list"+list);

        boolean removed=list.contains(90);
        System.out.println("marks present in list"+removed);
    }
}