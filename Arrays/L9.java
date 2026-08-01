 import java.util.*;
 public class L9 {
 
    
 public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();

    for (int i = 0; i < numRows; i++) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // First element is always 1

        // Fill in the middle elements
        for (int j = 1; j < i; j++) {
            int prevRowVal1 = triangle.get(i - 1).get(j - 1);
            int prevRowVal2 = triangle.get(i - 1).get(j);
            row.add(prevRowVal1 + prevRowVal2);
        }

        if (i > 0) {
            row.add(1); // Last element is also 1 (except for first row)
        }

        triangle.add(row);
    }

    return triangle;
}
}