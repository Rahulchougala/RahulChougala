package TEST;

import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        
        Map<Integer, Integer> multiplesCount = new LinkedHashMap<>();

        
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            multiplesCount.put(i, count);
        }

        
        for (Map.Entry<Integer, Integer> entry : multiplesCount.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue()+" ");
        }

    }
}

