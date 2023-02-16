package Question;

import java.lang.reflect.Array;

public class ArrayBag<T> implements BagInterface<T> {
    private T[] bag;
    private final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    public ArrayBag() {
        T[] initializeBag = (T[]) new Object[DEFAULT_CAPACITY];
        bag = initializeBag;
        numberOfEntries = 0;
    }
    
    public int getCurrentSize() {
        return numberOfEntries;
    }
    
    public boolean isFull() {
        return numberOfEntries == DEFAULT_CAPACITY;
    }
    
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }
    
    public boolean add(T newEntry) {
        boolean result = true;
        if (!isFull()) {
            bag[numberOfEntries++] = newEntry;
            return true;
        }
        return false;
    }
    
    public T remove() {
        if (isEmpty()) return null;
        T removed = bag[numberOfEntries-1];
        bag[--numberOfEntries] = null;
        return removed;
    }
    
    public boolean remove(T newEntry) {
        if (isEmpty()) return false;
        boolean found = false;
        
        for(int i = 0; i<numberOfEntries; i++) {
            if(bag[i].equals(newEntry)) {
                found = true;
                
                for (int j = i+1; j<numberOfEntries; j++) {
                    bag[j-1] = bag[j];
                }
                bag[--numberOfEntries] = null;
                break;
            }
        }
        return found;
    }
    
    public void clear() {
        bag = (T[]) new Object[bag.length];
    }
    
    public int getFrequencyOf(T anEntry) {
        int counter = 0;
        for(int index = 0; index < numberOfEntries; index++) {
            if (anEntry.equals(bag[index])) {
                counter++;
            }
        }
        return counter;
    }
    
    public boolean contains(T anEntry) {
        int where = -1;
        boolean found = false;
        int index = 0;
        
        while (!found && (index < numberOfEntries)) {
            if(anEntry.equals(bag[index])) {
                found = true;
                where = index;
            }
            index++;
        }
        return where > -1;
    }
    
    public T[] toArray() {
        T[] result = (T[]) new Object[numberOfEntries];
        for(int index = 0; index < numberOfEntries; index++) {
            result[index] = bag[index];
        }
        return result;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag) {
        BagInterface<T> bag = new ArrayBag();
        for(int i = 0; i<this.toArray().length; i++) {
            bag.add(this.toArray()[i]);
        }
        for(int i = 0; i<anotherBag.toArray().length; i++) {
            anotherBag.add(anotherBag.toArray()[i]);
        }
        return bag;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag) {
        
        BagInterface<T> newBag = new ArrayBag<>();
        BagInterface<T> tempBag = new ArrayBag<>();
        
        for (T element : this.bag) {
            tempBag.add(element);
        }
        
        for(T element : anotherBag.toArray()) {
            if(tempBag.contains(element)) {
                newBag.add(element);
                tempBag.remove(element);
            }
        }
        return newBag;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> anotherBag) {
        T[] commonItems = (T[]) this.intersection(anotherBag).toArray();
        BagInterface<T> leftOver = new ArrayBag();
        
        for(int i=0; i<this.toArray().length; i++) {
            leftOver.add((T) Array.get(this.toArray(), i));
        }
        
        for(T commonItem : commonItems) {
            leftOver.remove(commonItem);
        }
        return leftOver;
    }
}