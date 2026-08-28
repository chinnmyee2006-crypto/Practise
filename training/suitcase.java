public class suitcase {
    static String[]item ={"bag", "shirt", "pants", "cap", "shoes"};
    static String[]weight ={"30", "50", "40", "20", "35"};
    static int weightLimit = 50;
    public static void findCombinations(int index, int currentWeight, String currentSpace) {
        if (currentWeight > weightLimit) {
            return;
        }
        if (index == item.length) {
            if (!currentSpace.isEmpty()) {
                System.out.println("Space: " + currentSpace + " | Total Weight: " + currentWeight);
            }
            System.out.println();
            return;
        }
        findCombinations(index + 1, currentWeight, currentSpace);
        findCombinations(index + 1, currentWeight + Integer.parseInt(weight[index]), currentSpace + item[index] + " ");
    }
    public static void main(String[] args) {
        System.out.println("Possible combinations of items within the weight limit:");
        findCombinations(0, 0, "");
    }
    
}

    

