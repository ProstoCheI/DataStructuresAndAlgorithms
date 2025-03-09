package Lr1;

public class BubbleSort extends NewArray{
    public BubbleSort(int size) {super(size);}
    private int nElems;

    @Override
    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    @Override
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        for (int out = nElems - 1; out > 1; out--) { // Внешний цикл (обратный)
            for (int in = 0; in < out; in++) {  // Внутренний цикл (прямой)
                if (array[in] > array[in + 1]) { // Порядок нарушен?
                    swap(in, in + 1); // Поменять местами
                }
            }
        }
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
