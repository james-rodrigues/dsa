package hashing;

import java.util.LinkedList;

/**
 * The Class DirectChaining.
 */
public class DirectChaining {

	/** The hash table. */
	LinkedList<String>[] hashTable;

	/** The maximum chain size. */
	int maximumChainSize = 5;

	/**
	 * Instantiates a new direct chaining.
	 */
	DirectChaining() {
		hashTable = new LinkedList[13];
	}// end of method

	/**
	 * Simple ASCII hash function.
	 *
	 * @param x the x
	 * @param M the m
	 * @return the int
	 */
	// HashFunction to be used on Keys
	public int simpleASCIIHashFunction(String x, int M) {
		char ch[];
		ch = x.toCharArray();
		int i, sum;
		for (sum = 0, i = 0; i < x.length(); i++) {
			sum = sum + ch[i];
		}
		// System.out.println("Index from hashfunction: " + sum % M);
		return sum % M;
	}// end of method

	/**
	 * Insert key in hash table.
	 *
	 * @param value the value
	 */
	// Insert Key in HashTable
	public void insertKeyInHashTable(String value) {
		int newIndex = simpleASCIIHashFunction(value, hashTable.length); // returns in which index we need to store this
																			// string
		if (hashTable[newIndex] == null) {
			System.out.println("Index: " + newIndex + " is empty. Creating a new LinkedList there...");
			hashTable[newIndex] = new LinkedList<String>();
			hashTable[newIndex].add(value);
			System.out.println("Successfully inserted " + "\"" + value + "\"" + " in location: " + newIndex);
			System.out.println("-------------------------------------------\n");
		} else {
			System.out.println("\nIndex: " + newIndex + " is having sufficient space. Inserting there...");
			hashTable[newIndex].add(value);
			System.out.println("Successfully inserted " + "\"" + value + "\"" + " in location: " + newIndex);
			System.out.println("-------------------------------------------\n");
		}
	}// end of method

	/**
	 * Search key in hash table.
	 *
	 * @param stringToBeSearched the string to be searched
	 * @return true, if successful
	 */
	// Search for a given key in hashTable
	public boolean searchKeyInHashTable(String stringToBeSearched) {
		int newIndex = simpleASCIIHashFunction(stringToBeSearched, hashTable.length);
		if (hashTable[newIndex] != null && hashTable[newIndex].contains(stringToBeSearched)) {
			System.out
					.println("\n" + "\"" + stringToBeSearched + "\"" + " found in HashTable at location: " + newIndex);
			return true;
		} else {
			System.out.println("\n" + "\"" + stringToBeSearched + "\"" + " not found in HashTable.");
			return false;
		}
	}// end of method

	/**
	 * Delete key from hash table.
	 *
	 * @param stringToBeDeleted the string to be deleted
	 */
	// Delete key from HashTable
	public void deleteKeyFromHashTable(String stringToBeDeleted) {
		int newIndex = simpleASCIIHashFunction(stringToBeDeleted, hashTable.length);
		if (hashTable[newIndex] != null && hashTable[newIndex].contains(stringToBeDeleted)) {
			System.out.println("\n" + "\"" + stringToBeDeleted + "\"" + " has been found in HashTable.");
			hashTable[newIndex].remove(stringToBeDeleted);
			System.out.println("\"" + stringToBeDeleted + "\"" + " has been deleted from HashTable !");
		} else {
			System.out.println("\nCould not find " + "\"" + stringToBeDeleted + "\"" + " in HashTable");
		}
	}// end of method

	/**
	 * Display hash table.
	 */
	// display the hash table
	public void displayHashTable() {
		if (hashTable == null) {
			System.out.println("\nHashTable does not exist !");
			return;
		} else {
			System.out.println("\n---------- HashTable ---------");
			for (int i = 0; i < hashTable.length; i++) {
				System.out.println("Index: " + i + ", key: " + hashTable[i]);

			}
		}
	} // end of method

	/**
	 * Delete hash table.
	 */
	// Deletes entire HashTable
	public void deleteHashTable() {
		hashTable = null;
		System.out.println("Successfully deleted HashTable !");
	}// end of method

}// end of class
