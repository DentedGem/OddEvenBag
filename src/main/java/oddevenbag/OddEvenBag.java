// TODO implement this class and associated methods
package oddevenbag;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Struct;
import java.util.ArrayList;

public class OddEvenBag {

    private ArrayList<Integer> list;

    /**
     * Create an empty OddEvenBag
     */

    public OddEvenBag() {
        list = new ArrayList<Integer>();
    }

    /**
     * Create an OddEvenBag using the contents of an array
     *
     * @param array is not null
     */

    public OddEvenBag(int[] array) {
        list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }

    }

    /**
     * Add a new entry into OddEvenBag
     *
     * @param newEntry value to add
     */
    public void add(int newEntry) {
        list.add(newEntry);
    }

    /**
     * Remove one occurrence of the given integer from OddEvenBag; If the item does not exist change nothing
     *
     * @param a value to remove
     */
    public void remove(int a) {
        //for (int i = 0; i < list.size(); i++) {
        // if (list.get(i) == a) {
        list.remove(new Integer(a));
        // }
        // }
    }

    /**
     * Increments all the items of the OddEvenBag by one
     */
    public void increment() {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 1);
        }
    }

    /**
     * Decrements all the items of the OddEvenBag by one
     */
    public void decrement() {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)-1);
        }
    }

    /**
     * Checks if OddEvenBag has an item that is equal to integer a
     *
     * @param a
     * @return True or False
     */
    public Boolean contains(int a) {
        return list.contains(a);
    }

    /**
     * Counts the number of items in OddEvenBag that has integer a
     *
     * @param a
     * @return number of items in OddEvenBag that has integer a
     */
    public int getCount(int a) {
        int count = 0;
        for (int i : list) {
            if (i == a) {
                count++;
            }

        }
        return count;
    }

    /**
     * Sums up the items of OddEvenBag
     * @return the sum
     */
    public long sum() {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    /**
     *
     * @param b
     * @return
     */
    public boolean equals(ArrayList<Integer> b) {
        int even1Count = 0;
        int even2Count = 0;
        int odd1Count = 0;
        int odd2Count = 0;

        for (int i : list) {
            if (i % 2 == 0) {
                even1Count++;
            } else {
                odd1Count++;

            }
        }

        for (Integer i : b) {
            if (i % 2 == 0) {
                even2Count++;
            } else {
                odd2Count++;

            }
        }
        return (even1Count == even2Count && odd1Count == odd2Count);
    }

    private static void main(String[] args) {

    }
}