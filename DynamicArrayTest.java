public class DynamicArrayTest {

    static DynamicArray da = new DynamicArray();
    public DynamicArrayTest() {}

    static void printArr(){
        System.out.print("Elements in the array: [" );
        for(int i = 0; i < da.size(); i++)
            System.out.print(da.arr[i] + ", ");
        System.out.println("] \tSize: " + da.size());
    }

    public static void main(String args[]){
        //add
        da.add(1);
        da.add(0);
        da.add(4);
        da.add(14);
        da.add(22);
        da.add(43);

        //test accessors & mutator
        printArr();
        System.out.println("Index 3, Element: " + da.get(3));
        System.out.println("Index 0, Element: " + da.get(0));
        System.out.println("Element 14, index: " + da.indexOf(14));
        System.out.println("Element 1, index: " + da.indexOf(1));
        System.out.println("Contains 9? " + da.contains(9));
        System.out.println("Contains 14? " + da.contains(14));
        System.out.println("Set index 1 to number 23");
        da.set(1, 23);
        printArr();

        //remove
        System.out.println("Remove index 0: " + da.removeAt(0));
        printArr();
        System.out.println("Remove index 4: " + da.removeAt(4));
        printArr();
//        System.out.println("Remove index 0: " + da.removeAt(0));
        System.out.println("Remove element 23: " + da.remove(23));
        System.out.println("Remove element 4: " + da.remove(4));
        System.out.println("Remove element 10: " + da.remove(10));
        printArr();

        //clear & empty
        System.out.println("Clear");
        da.clear();
        System.out.println("Empty: " + da.isEmpty());
        da.add(25);
        da.add(13);
        printArr();
        System.out.println("Empty: " + da.isEmpty());

    }
}
