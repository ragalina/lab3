import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class checkA implements StringChecker {
    public boolean checkString(String s) {
        for (char c : s.toCharArray()) {
            if (c == 'a') {return true;}
        }
        return false;
    }
}

public class ListTests {
    @Test
    public void testListFilter() {
        List<String> test = new ArrayList<>(Arrays.asList("hello", "pineapple", "sheep", "goat"));
        StringChecker CA = new checkA();
        ListExamples listEx = new ListExamples();
        String[] expected = {"pineapple", "goat"};

        assertArrayEquals(expected, listEx.filter(test, CA).toArray());
    }

    @Test
    public void testListMerge() {
        List<String> input1 = new ArrayList<>();
        input1.add("apple");
        input1.add("cabbage");
        List<String> input2 = new ArrayList<>();
        input2.add("banana");
        input2.add("donut");

        String[] expected = {"apple", "banana", "cabbage", "donut"};
    
        assertArrayEquals(expected, ListExamples.merge(input1, input2).toArray());
    }
}