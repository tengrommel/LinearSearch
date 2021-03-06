public class LinearSearch<E> {
    private LinearSearch(){}
    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++)
            if (data[i].equals(target))
                return i;
        return -1;
    }
    // 泛型只能适用于类对象，不能适用于基本类型
    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        int res = LinearSearch.search(data, 16);
        System.out.println(res);
        int res2 = LinearSearch.search(data, 666);
        System.out.println(res2);

        Student[] students = {
            new Student("Alice"),
            new Student("Bob"),
            new Student("Charles"),
        };
        Student bob = new Student("Bob");
        int res3 = LinearSearch.search(students, bob);
        System.out.println(res3);

        Integer[] dataTest = ArrayGenerator.generateOrderedArray(100000);
        int resTest = LinearSearch.search(dataTest, 100000);
        System.out.println(resTest);
    }
}
