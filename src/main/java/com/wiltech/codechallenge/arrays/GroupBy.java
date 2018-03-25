/**
 * (c) Midland Software Limited 2018
 * Name     : GroupBy.java
 * Author   : ferraciolliw
 * Date     : 24 Mar 2018
 */
package com.wiltech.codechallenge.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class GroupBy {

    public static void main(String... args) {
        String[][] dishes = {
                {"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};

        groupingDishes(dishes);
    }

    static String[][] groupingDishes(String[][] dishes) {
        //for every row loop through and get the ingredients and add their count.
        Map<String, Integer> ingredients = new HashMap<>();
        for (int row = 0; row < dishes.length; row++) {
            for (int index = 1; index < dishes[row].length; index++) {
                //add to the map and count it
                int ingredientCount = Optional.ofNullable(ingredients.get(dishes[row][index])).orElse(0);
                if (ingredientCount == 0) {
                    ingredients.put(dishes[row][index], 1);
                } else {
                    ingredients.put(dishes[row][index], ingredientCount + 1);
                }
            }
        }
        //remove the ones that only appear once
        ingredients.values().removeIf(value -> value.equals(new Integer(1)));

        //String[][] result = new String[100000][1000];
        //convert the array of dishes into a Map<String,List<String> to hold dishes and its ingredients
        Map<String, List<String>> result = new HashMap<>();
        ingredients.keySet().stream()
                .forEach(ingredient -> result.put(ingredient, findDishesWithIngredient(ingredient, dishes)));

        //return the array
        //        String[][] r = result.entrySet().stream()
        //                .map(ingredient -> new Object[] {ingredient})
        //                .toArray(Object[][]::new);
        // String[][] r = result.entrySet().stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
        String[][] result1 = new String[result.entrySet().size()][10000];
        int i = 0;
        for (Map.Entry<String, List<String>> e : result.entrySet()) {
            result1[i][0] = e.getKey();
            for (int j = 1; j <= e.getValue().size(); j++) {
                result1[i][j] = e.getValue().get(j - 1);
            }
            i++;
        }
        return result1;
    }

    private static List<String> findDishesWithIngredient(final String ingredient, final String[][] dishes) {
        List<String> temp = new ArrayList<>();
        for (int row = 0; row < dishes.length; row++) {
            for (int index = 1; index < dishes[row].length; index++) {
                if (ingredient.equals(dishes[row][index])) {
                    temp.add(dishes[row][0]);
                }
            }
        }
        return temp;
    }
}