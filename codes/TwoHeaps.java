import java.util.ArrayList;

public class TwoHeaps {
    MinHeap<Integer> hi = new MinHeap<>();
    MaxHeap<Integer> lo = new MaxHeap<>();
    public static void main(String[] args) throws Exception {
        TwoHeaps twoHeaps = new TwoHeaps();
        int[] arr = {1,4,2,5,3,6,9,11};
        for( int i = 0; i< arr.length; i++){
            twoHeaps.addNum(arr[i]);
        }
        System.out.println(twoHeaps.findMedian());
    }
    public void addNum(int num) throws Exception{
        lo.insert(num);
        hi.insert(lo.poll());
        lo.remove();
        if(lo.getSize()<hi.getSize()){
            lo.insert(hi.poll());
            hi.remove();
        }
    }
    public Double findMedian() throws Exception{
        return lo.getSize()>hi.getSize() ? lo.poll() : (double)((lo.poll() + hi.poll())*0.5);
    }
}

class MaxHeap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public MaxHeap() {
        list = new ArrayList<>();
    }

    public int getSize(){
        return list.size();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if(index == 0) {
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public T poll() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Polling from an empty heap!");
        }
        return list.get(0);
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        T temp = list.get(0);

        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }

        return temp;
    }

    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    public ArrayList<T> heapSortAsc() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }
}

class MinHeap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public MinHeap() {
        list = new ArrayList<>();
    }

    public int getSize(){
        return list.size();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if(index == 0) {
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) > 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public T poll() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Polling from an empty heap!");
        }
        return list.get(0);
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        T temp = list.get(0);

        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }

        return temp;
    }

    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) < 0) {
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) < 0) {
            min = right;
        }

        if(min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    public ArrayList<T> heapSortDesc() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }
}
