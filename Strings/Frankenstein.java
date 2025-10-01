package Strings;

import java.util.*;

public class Frankenstein {
    static String[] results = new String[25];          // potion names (left side)
    static String[][] ingredients = new String[25][];  // ingredients for each potion
    static int N;

    // Memoization to avoid recomputation
    static Map<String, Integer> memo = new HashMap<>();

    public static int minOrbs(String potion) {
        if (memo.containsKey(potion)) return memo.get(potion);

        int minCost = Integer.MAX_VALUE;
        boolean hasRecipe = false;

        for (int i = 0; i < N; i++) {
            if (results[i].equals(potion)) {
                hasRecipe = true;
                int cost = ingredients[i].length - 1; // base orbs for this recipe
                for (String ing : ingredients[i]) {
                    cost += minOrbs(ing);
                }
                minCost = Math.min(minCost, cost);
            }
        }

        // If potion is not on LHS of any recipe so item cost will be 0
        if (!hasRecipe) minCost = 0;

        memo.put(potion, minCost);
        return minCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("=");
            results[i] = parts[0];
            ingredients[i] = parts[1].split("\\+");
        }

        String target = sc.nextLine().trim();
        System.out.println(minOrbs(target));
    }
}

