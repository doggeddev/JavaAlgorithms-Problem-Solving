/**
 * 
 */
package sphereOnlineJudgeProblems;

import java.util.Hashtable;

/**
 * @author Richard Drexel
 * Checking multiple arrays for duplicated elements.
 * 
 */
public class ArrayUnions<K> {

	/**
	 * @return the duplicates
	 */
	

	Hashtable<K, Integer> duplicates;

	public ArrayUnions() {

		duplicates = new Hashtable<K, Integer>();
	}

	
	//items assigned to keys in hashtable. If key value not null, then get the count and increment it
	public void addItems(K[] items) {

		for (K item : items) {
			Integer count = (duplicates.get(item));
			duplicates.put(item, ((count != null) ? count += 1 : 1));
		}
	}

	public Hashtable<K, Integer> getDuplicates() {
		return duplicates;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ArrayUnions [duplicates=" + duplicates.toString() + "]";
	}

}
