package template.sorts.types;

import java.util.ArrayList;
import java.util.List;

public class Odd extends ListToSort {

    @Override
    protected List<Integer> filter(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i : list) {
            if ((i % 2) == 1) {
                newList.add(i);
            }
        }

        return newList;
    }

    @Override
    protected long algorithm(List<Integer> list) {
        long startTime = System.nanoTime();

        list.sort(null);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    @Override
    protected String algoUsed() {
        return "bubble";
    }

}
