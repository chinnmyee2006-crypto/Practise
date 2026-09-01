package DSA;

public class greedy {
    public static void main(String[] args) {
        int[] price = {25, 10, 5, 1};
        int money= 63;
        int chocolatePrice =50;
         
        int noofChocolates= money/chocolatePrice;
        int remainingMoney= money%chocolatePrice;
        System.out.println("Number of chocolates: " + noofChocolates);
        System.out.println("Remaining money: " + remainingMoney);
    }
}
