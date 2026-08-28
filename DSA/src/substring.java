public class substring {
    public static void main(String[] args){
        String name="aba";
        String reverse="";

        for(int i=name.length() -1;i>=0;i--){
            reverse +=name.charAt(i);
        }

        if(name.equals(reverse))
            System.out.println("true");
        else
            System.out.println("false");

        int count=0;
        for(int i=0;i<100;i++);
        count++;
        System.out.println("no of char:"+count);
    }
}




