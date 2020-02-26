/*
        [ItemList.java]
        Author: [Aqsa Mahmood]
        Date: [13-02-2020]

        Description
        [This class model the Array List of items. Each item in the item list
         represents all the items of a specific size.]
 */
package mahmooaq;

import java.util.ArrayList;

/**
 *
 * @author aksal
 */
public class ItemList {

    /**
     * Create an Array List to store the Items.
     */
    public ArrayList<Item> itemList = new ArrayList<>();

    /**
     * no-arg constructor can be used to instantiate an Item list
     */
    public ItemList() {
    }

    /**
     * constructor to get Index as an integer
     *
     * @param index as an integer, index for the Array list of Items
     * @returns the Item object at that index
     */
    public Item getIndex(int index) {
        return itemList.get(index);
    }

    /**
     * constructor for add method which accepts an item object and add to 
     * item list.
     * @param item add the item to the list. If the size already exist than
     * baseCost is added else a new item is added to the list.
     */
    public void add(Item item) {
        int index = findItem(item.itemSize);
        if (index >= 0) {
            double newBaseCost = itemList.get(index).getBaseCost()
                    + item.getBaseCost();
            itemList.get(index).setBaseCost(newBaseCost);
        } else {

            itemList.add(item);
        }
    }

    /**
     * constructor to find the item using the Size enum and return the index of
     * the item in the item list
     *
     * @param size enum constant and matches with the item in Array list
     * @return -1 if no element in the item list matches the size or return 
     * if the size exist.
     */
    public int findItem(Size size) {

        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).itemSize == size) {
                return i;
            }
        }
        return -1;

    }
    
    /**
     * constructor for length method to tell the number of elements in the
     * item list.
     * @return the size of item list.
     */
    public int length() {
        return itemList.size();
    }
    /**
     * Overriding the toString method 
     * @return each item object in the list.
     */
    @Override
    public String toString() {
        return "ItemList\n: " + itemList;
    }

}
