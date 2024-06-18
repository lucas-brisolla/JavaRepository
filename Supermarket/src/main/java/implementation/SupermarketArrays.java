package implementation;

import implementation.Supermarket;

public class SupermarketArrays implements Supermarket {
    private final String[] items;

    private int lastIndex;

    public SupermarketArrays(final int size) {
        this.items = new String[size];
        this.lastIndex = -1;
    }


    @Override
    public void add(String item) {
        if (lastIndex == items.length - 1) {
            System.err.println("Lista de compras cheia!");
        } else {
            lastIndex++;
            items[lastIndex] = item;
        }

    }

    @Override
    public void print() {
        System.out.println("|-------------------------------------------------------|");
        if (lastIndex < 0) {
            System.out.println("A lista está vazia!");
        }
        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(i + " - " + items[i]);
        }
        System.out.println("|-------------------------------------------------------|");
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Indice inváldio: " + index);
        }
    }

    private void shift(final int index) {
        for (int i = index; i < lastIndex; i++) {
            items[i] = items[i + 1];
        }
    }
}
