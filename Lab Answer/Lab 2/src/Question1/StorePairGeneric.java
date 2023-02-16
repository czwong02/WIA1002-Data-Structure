package Question1;

public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>  {
    private T first, second;
    
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public T getSecond() {
        return second;
    }
    
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object b) {
        StorePairGeneric<T> another = (StorePairGeneric<T>) b;
        return first.equals(another);
    }
    
    public int compareTo(StorePairGeneric<T> o) {
        return first.compareTo(o.first);
    }
}