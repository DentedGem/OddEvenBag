// TODO implement this class and associated methods
package oddevenbag;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Struct;
import java.util.ArrayList;

public class OddEvenBag {

    private ArrayList<Integer> list;
    private int sum;
    private int countOdd;

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
            sum += i;
            if (i % 2 == 1) {
                countOdd++;
            }
        }

    }

    /**
     * Add a new entry into OddEvenBag
     *
     * @param newEntry value to add
     */
    public void add(int newEntry) {
        list.add(newEntry);
        sum += newEntry;
        if (newEntry % 2 == 1) {
            countOdd++;
        }
    }

    /**
     * Remove one occurrence of the given integer from OddEvenBag; If the item does not exist change nothing
     *
     * @param a value to remove
     */
    public void remove(int a) {


        boolean removal = list.remove(new Integer(a));
        if (removal) {
            sum -= a;
            if (a % 2 == 1) {
                countOdd--;
            }
        }
    }

    /**
     * Increments all the items of the OddEvenBag by one
     */
    public void increment() {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 1);
        }
        sum += list.size();
        countOdd = list.size() - countOdd;
    }

    /**
     * Decrements all the items of the OddEvenBag by one
     */
    public void decrement() {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) - 1);
        }
        sum -= list.size();
        countOdd = list.size() - countOdd;
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
     * Obtain the items of OddEvenBag
     *
     * @return the sum
     */
    public long sum() {
        return this.sum;
    }

    /**
     * @param b
     * @return
     */
    public boolean equals(Object b) {
        if (b instanceof OddEvenBag) {
            OddEvenBag other = (OddEvenBag) b;
            if (this.countOdd == other.countOdd && this.list.size() == other.list.size()) {
                return true;
            } else {

            }

        }
        return false;

    }
    public int hashCode(){
        return this.countOdd;
    }
}
