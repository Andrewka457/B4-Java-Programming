package day39_a_polymorphism.book;

public abstract class EBook extends Book implements Downloadable {
    int storageSize;
    public abstract void open();
}