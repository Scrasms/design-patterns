package template.sorts;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import template.sorts.types.All;
import template.sorts.types.Even;
import template.sorts.types.ListToSort;
import template.sorts.types.Odd;

public class Client {
    public static void main(String[] args) {
        ListToSort even = new Even();
        ListToSort odd = new Odd();
        ListToSort all = new All();

        List<Integer> l = IntStream.range(0, 100)
                .map(i -> (int) (Math.random() * 1000))
                .boxed()
                .collect(Collectors.toList());
        System.out.println("\nOriginal list: ");
        System.out.println(l + "\n");
        even.toSort(l);
        odd.toSort(l);
        all.toSort(l);
    }
}
