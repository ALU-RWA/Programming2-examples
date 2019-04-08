package w7;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// This should behave just like an ArrayList
// Our objective is to implement an add method
public class CustomArrayList implements List, Comparable {
    // What should be our fields?
    // size
    // data
    String[] data;
    int size;
    public CustomArrayList(){
        size = 0;
        data = new String[5];
    }

    public void add (String s){
        // Check if the array is full
        // if it's full, create a new array of double the size
        // copy everything into the new array
        if (size == data.length){
            // data = Arrays.copyOf(data, data.length * 2);
            String[] data2 = new String[data.length * 2];
            for (int i = 0; i < data.length; i++){
                data2[i] = data[i];
            }
            data = data2;
        }
        data[size] = s;
        size++;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public String get(int index){
        return data[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }


    public static void main(String[] args) {
        CustomArrayList test = new CustomArrayList();
        test.add("Ethiopia");
        test.add("Spain");
        test.add("Kazakhstan");
        test.add("Ethiopia");
        test.add("Spain");
        test.add("Lesotho");

        System.out.println(test.get(5));

        List test2 = new CustomArrayList();
        test2.add("Alsatian");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
