
import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String args[]){
        Map<Integer,String>name=new HashMap<>();
        name.put(1,"bob");
        name.put(2,"john");
        System.out.println(name.get(1));

        System.out.println("check the value"+name.containsValue("john"));
        System.out.println("check the key"+name.containsKey("2"));

        name.remove(1);
        System.out.println(name.get(1));
        System.out.println("find the size"+ name.size());


    }
}
