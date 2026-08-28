import java.util.ArrayList;
import java.util.List;


public class list1{
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("bob");
        list.add("jhon");
        list.add("siya");
        list.add("hello");
        System.out.println("list of the students"+ list);
        System.out.println("access the index element"+  list.get(2));
    }
}