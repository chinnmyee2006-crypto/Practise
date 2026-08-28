public class backtracking {
    static String[]food ={"Pizza", "Burger", "Pasta", "Salad", "Sushi"};
    static String[]caloreis ={"300", "500", "400", "200", "350"};
    static int caloriesLimit = 1000;
    public static void findCombinations(int index, int currentCalories, String currentPlate) {
        if (currentCalories > caloriesLimit) {
            return;
        }
        if (index == food.length) {
            if (!currentPlate.isEmpty()) {
                System.out.println("Plate: " + currentPlate + " | Total Calories: " + currentCalories);
            }
            System.out.println();
            return;
        }
        findCombinations(index + 1, currentCalories, currentPlate);
        findCombinations(index + 1, currentCalories + Integer.parseInt(caloreis[index]), currentPlate + food[index] + " ");
    }
    public static void main(String[] args) {
        System.out.println("Possible combinations of food items within the calorie limit:");
        findCombinations(0, 0, "");
    }
    
}
