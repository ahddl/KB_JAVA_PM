package main.java.basic.ch13.sec02.exam01;

public class Product<T,G> {
    public T kind;
    public G model;

    public T getKind() {
        return kind;
    }

    public G getModel() {
        return model;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public void setModel(G model) {
        this.model = model;
    }
}
