import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight, value, index;

    public Item(int weight, int value, int index) {
        this.weight = weight;
        this.value = value;
        this.index = index;
    }
}

public class FactorialKnapsack {
    public static void main(String[] args) {
        int[] weights = {2, 3, 5, 7};
        int[] values = {10, 5, 15, 7};
        int capacity = 10;

        Item[] items = new Item[weights.length];
        for (int i = 0; i < weights.length; i++) {
            items[i] = new Item(weights[i], values[i], i);
        }

        Arrays.sort(items, Comparator.comparingDouble(item -> -1.0 * item.value / item.weight));

        int[] knapsack = new int[weights.length];
        int totalValue = 0;

        for (Item item : items) {
            if (item.weight <= capacity) {
                knapsack[item.index] = 1;
                totalValue += factorial(item.index) * item.value;
                capacity -= item.weight;
            }
        }

        System.out.println("Selected items: " + Arrays.toString(knapsack));
        System.out.println("Total value: " + totalValue);
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
