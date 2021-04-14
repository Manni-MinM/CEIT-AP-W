// BWOTSHEWCHB

import java.util.* ;

final class Pair {
	// Fields
	private final String key ;
	private final int value ;
	// Constructor
	public Pair(String key , int value) {
		this.key = key ;
		this.value = value ;
	}
	// Methods
	public String getKey() {
		return key ;
	}
	public int getValue() {
		return value ;
	}
}
class SortByValue implements Comparator<Pair> {
	// Methods
	public int compare(Pair first , Pair second) {
		return second.getValue() - first.getValue() ;
	}
}
