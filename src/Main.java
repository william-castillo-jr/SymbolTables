import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Symbol table test client");

        // see p. 370 for basic symbol-table test client
        // this is Ken's rewrite in an attempt to add clarity

        SymbolTable<String, Integer> table = new SequentialSearchST<>();

        // hard coding input so that we don't need to type it
        // in the console each time, for convenience
        Scanner in = new Scanner("S E A R C H E X A M P L E");

        // desire is to create a table that has the following key-value pairs
        // keys: S  E  A  R  C  H  E  X  A  M  P  L  E
        // vals: 0  1  2  3  4  5  6  7  8  9  10 11 12

        // we could make 12 calls to put: put("S", 0); put("E", 1); ...
        // but we'll use a loop to do it instead

        int i = 0;
        while (in.hasNext()) {
            String theKey = in.next();
            int theValue = i;
            table.put(theKey, theValue);

            i++;
        }

        // grab all the keys from the table (via table.keys()) and
        // iterate through them and print out the key-value pairs
        for (String key : table.keys()) {
            System.out.println(key + " " + table.get(key));
        }
    }
}