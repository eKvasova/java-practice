package exam.ex7;

@SuppressWarnings("rawtypes")
public class Pair<K,V> {

    private final K first;
    private final V last;

    Pair(K first, V last) {
        this.first = first;
        this.last = last;
    }

    public K getFirst() {
        return first;
    }

    public V getLast() {
        return last;
    }

    public Pair<K,V> swap() {
         return new Pair(last,first);
    }

    public <R> Pair replaceFirst(R replace) {
         return new Pair(replace,last);
    }

    public <R> Pair replaceLast(R replace) {
        return new Pair(first,replace);
    }
}


