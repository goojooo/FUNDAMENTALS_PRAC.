import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> bucket[]; // N =buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bI = key.hashCode();
            return Math.abs(bI) % N;
        }

        private int searchInLL(K key, int bI) {
            LinkedList<Node> ll = bucket[bI];
            int dI = 0;
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; // di
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node> oldBucket[] = bucket;
            bucket = new LinkedList[N * 2];

            for (int i = 0; i < N * 2; i++) {
                bucket[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(i);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bI = hashFunction(key);
            int dI = searchInLL(key, bI); // data index (0+1)

            if (dI == -1) // key doesn't exist
            {
                bucket[bI].add(new Node(key, value));
                n++;
            } else { // key exists
                Node data = bucket[bI].get(dI);
                data.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                // rehashing
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bI = hashFunction(key);
            int dI = searchInLL(key, bI); // data index (0+1)

            if (dI == -1) // key doesn't exist
            {
                return false;
            } else { // key exists
                return true;
            }
        }

        public V remove(K key) {
            int bI = hashFunction(key);
            int dI = searchInLL(key, bI); // data index (0+1)

            if (dI == -1) // key doesn't exist
            {
                return null;
            } else { // key exists
                Node data = bucket[bI].remove(dI);
                n--;
                return data.value;
            }
        }

        public V get(K key) {
            int bI = hashFunction(key);
            int dI = searchInLL(key, bI); // data index (0+1)

            if (dI == -1) // key doesn't exist
            {
                return null;
            } else { // key exists
                Node data = bucket[bI].get(dI);
                return data.value;
            }

        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < bucket.length; i++) {
                LinkedList<Node> ll = bucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 140);
        map.put("China", 150);
        map.put("USA", 100);
        map.put("Shinagapor", 40);
        map.put("Brazil", 60);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
    }
}
