package implementation;

public interface Supermarket{
    default void add(final String item){}
    default void print(){}
    default void delete(final int index){}
}
