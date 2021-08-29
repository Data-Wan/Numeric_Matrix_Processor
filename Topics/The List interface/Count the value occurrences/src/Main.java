import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {

        return list1.stream()
                    .filter(x -> x == elem)
                    .count() == list2.stream()
                                     .filter(x -> x == elem)
                                     .count();
    }
}