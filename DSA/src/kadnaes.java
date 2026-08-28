public class kadnaes {
    public static int kadane(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int Currentmax=arr[0];
        int maxsum=arr [0];

        for(int i=0;i<arr.length; i++){
            Currentmax=Math.max(arr[i],Currentmax+arr[i]);
            maxsum=Math.max(maxsum,Currentmax);

        }
        return maxsum;
    }
}
public static void main(String[] args){
    System.out.print(new int[] {-1,-2,-3,-4,-5});
}
