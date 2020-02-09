package StackImplementationWithGenerics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackImpl<T> {

   /* Mam do zaimplementowania klasę Stack<e>, która zarządza tablicą zawierającą elementy typu E. Należy utworzyć metody push i pop.
    Oczywiście lepiej byłoby zaimplementować to za pomocą ArrayList, ale chodzi mi o pewną operację wykonywaną na tablicy, którą nie wiem, jak zaimplementować (zaraz powiem, o co chodzi).
    Stos działa w taki sposób, że w przypadku, gdy jest pełny przy próbie dodania kolejnego elementu, tablica zwiększa rozmiar np. na dwa razy większy. Pytanie brzmi, jak zwiększyć rozmiar tablicy, która ma elementy typu E, skoro nie można użyć operatora new do zarezerwowania pamięci na większą tablicę dla typu E, który jest nieznany.
    Nie można zrobić tak:

    class Stack<e> {
        E tab[];
        int rozm_tab;
        void push(E el) {
            if (rozm_tab == max_rozm) { // tab jest pełna*/

    T array[];
    Class<T> type;
    int lastItemIndex = -1;

    public StackImpl(Class<T> type, int size) {
        this.array = (T[]) Array.newInstance(type, size);
        this.type = type;
    }

    public void push(T obj) {
        if (lastItemIndex >= (array.length - 1)) {
            System.out.println("Creating new aray instance");
            T[] newArray = (T[]) Array.newInstance(this.type, array.length * 2);
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[++lastItemIndex] = obj;
    }

    public T pop() {
        if (lastItemIndex < 0) {
            System.out.println("Stack is empty.");
            return null;
        }
        T temp = array[lastItemIndex];
        array[lastItemIndex--] = null;
        return temp;
    }

    @Override
    public String toString() {
        return "StackImpl{" +
                "array=" + Arrays.toString(array) +
                ", type=" + type +
                ", lastItemIndex=" + lastItemIndex +
                '}';
    }
}
