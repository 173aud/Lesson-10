
Search Theory
=============

Searching Methods:
    
    Linear Searching: Begins at the first item and moves through each of them until a match is found
                      If the item does not exist it will run through the entire list looking for it.
    
    Binary Searching: Begins at the centre of the list. If the item is higher try the middle of the higher half, do the opposite if lower.
                      Repeat the process until the item is found or there are no other places to search.

                      Only avaliable if the items in the list are sorted

    


Objects and Searching
=====================

Objects from classes can be made to be searchable if the class implements the comparable class.

public class Class implements Comparable <Class> {

    Choose which property (instance variable) to be searched/compared
    Create a compareTo() method that returns a comparison of the property with another property of the same type
    Returns an integer.
    When comparing integer you can perform a calculation of the difference between the two values, highernum-lowernum=difference
    Can also return +1, -1, or 0 depending on which one is greater

    The collection of objects you are searching must be sorted using the compareTo property (Binary Search)
           