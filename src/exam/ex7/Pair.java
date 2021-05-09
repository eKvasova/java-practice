package exam.ex7;

public class Pair<K,V> {

    private K first;
    private V last;


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

// Не получается реализовать эти 2 метода :(


/*    public Pair<K,V> replaceFirst() {

        if (first instanceof Number) {
           return new Pair("newType",last);

        } else if (first instanceof String) {
            return new Pair((88888,last;
        } else {
            return new Pair("replaced to String", last);
        }
    }

    public Pair<K,V> replaceLast() {
        return new Pair(getFirst(),last);
    }*/
}


