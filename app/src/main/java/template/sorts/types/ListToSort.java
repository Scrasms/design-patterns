package template.sorts.types;

import java.util.List;

public abstract class ListToSort {
    public List<Integer> toSort(List<Integer> ogList) {
        List<Integer> newList = filter(ogList);
        long timeTaken = algorithm(newList);
        System.out.println("it took " + timeTaken + " ns for the " + algoUsed() + " algorithm to run\nnew list");
        System.out.println(newList + "\n");
        return null;
    }

    protected abstract List<Integer> filter(List<Integer> list);

    protected abstract long algorithm(List<Integer> list);

    protected abstract String algoUsed();
}
