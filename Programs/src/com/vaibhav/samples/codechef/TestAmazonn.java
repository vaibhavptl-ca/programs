package com.vaibhav.samples.codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestAmazonn {

    static int findMaxProducts(List<Integer> products) {
        int max = 0, temp_max, max_load;
        for (int i = products.size()-1; i >= 0; i--) {

            temp_max = products.get(i);
            max_load = products.get(i) - 1;

            for (int j = (i - 1); (j >= 0 && max_load >= 1 && products.get(j) != 0); j--)
            {
                if (products.get(j) >= max_load) {
                    temp_max = temp_max + max_load;
                    max_load--;
                } else {
                    temp_max = temp_max + products.get(j);
                    max_load = products.get(j) - 1;
                }
            }
            if (temp_max > max)
                max = temp_max;
        }
        return max;
    }

    private static int ComputeCombination(List<Integer> packageWeights)
    {
        int smallerPackage = 0;
        int largerPackage = 0;
        int index = -1;

        for (int i = 0; i < packageWeights.size() - 1; i++)
        {
            if ((packageWeights.get(i) < packageWeights.get(i + 1)) && (packageWeights.get(i + 1) > largerPackage))
            {
                smallerPackage = packageWeights.get(i);
                largerPackage = packageWeights.get(i + 1);
                index = i;
            }
        }

        if (index != -1)
        {
            computed(packageWeights, smallerPackage, largerPackage, index);
        }
        return Collections.max(packageWeights);
    }

    private static void computed(List<Integer> packageWeights, int smallerPackage, int largerPackage, int index) {
        int combinedWeight = smallerPackage + largerPackage;
        packageWeights.set(index + 1, combinedWeight);
        packageWeights.remove(index);

        ComputeCombination(packageWeights);
    }

    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int productCnt = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> products = IntStream.range(0, productCnt).mapToObj(
                i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$","");
                    }
                    catch (IOException ex){
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        long result = TestAmazonn.findMaxProducts(products);

        // 4,30,15,5,9  -- 30

        ComputeCombination(products);

        System.out.println("Output: " +result);

    }
}
