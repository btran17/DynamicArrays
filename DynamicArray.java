/*
 *  Brittney Tran
 *  CSC 3130
 *  Dr. Zhang
 */
public class DynamicArray {
    static int[] arr;
    private int capacity;
    private int userSize;

    public DynamicArray(){
        arr = new int[5];
        userSize = 0;
        capacity = 5;
    }
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.userSize = 0;
        arr = new int[capacity];
    }

    /**
     * Returns the number of elements currently in the array
     * @return the number of elements
     */
    public int size(){
       return userSize;
    }

    public boolean isEmpty(){
        if(size() == 0)
            return true;
        return false;
    }

    /**
     * Access element by index
     * @param index
     * @return int index of the element
     */
    public int get(int index){
        if( index >= size()) throw new IndexOutOfBoundsException();
        return arr[index];
    }

    public void set(int index, int element){
        if( index >= size()) throw new IndexOutOfBoundsException();
        arr[index] = element;
    }

    /**
     * Clear all content in the array
     */
    public void clear(){
        userSize = 0;
    }

    public void add(int element){
        int[] newArr = new int[capacity * 2];
        if(userSize == capacity){
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[userSize] = element;
       userSize++;
    }

    /**
     * Given an element, return the index
     * @param element
     * @return int value of the index
     */
    public int indexOf(int element){
        if(contains(element)){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == element)
                    return i;
            }
        }
        return -1;
    }

    /**
     * Remove and Return the element at the specified index
     * @param index
     * @return
     */
    public int removeAt(int index){
        int[] n_array = new int[userSize];
        if (index >= userSize || index < 0) //throw new IndexOutOfBoundsException()
            {
            System.out.println("Element does not exist");
        }
        for(int i = 0, k = 0; i < userSize && k < userSize - 1; i++){
            n_array[k] = arr[i];
            if(i != index)
                k++;
        }
        int in = arr[index];
        arr = n_array;
        userSize--;
        return in;
    }

    /**
     * Remove the specified element
     * @param element
     * @return boolean false if no such else; true if found
     */
    public boolean remove(int element){
        if(contains(element)) {
            for(int i = indexOf(element); i < size() - 1; i++){
                //shift units from right to left
                arr[i] = arr[i+1];
            }
            userSize--;
            return true;
        }
        System.out.println("Element does not exist");
        return false;

    }

    /**
     * Check if the element exists in the array
     * @param element
     * @return
     */
    public boolean contains(int element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element)
                return true;
        }
        return false;
    }


}
