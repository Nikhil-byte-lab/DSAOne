package DSAOne;

// Find ith bit 
// Set ith bit
// Clear ith bit
// Toggle ith bit
// Find number of 1 bit in number

public class Day_3_BitMasking {
	
	public static void main(String[] args) {
		int Number = 0b1001;
		
		int bitPosition = 2;
		
		//Original binary value
		System.out.println("Original Binary String: " +Integer.toBinaryString(Number));
		
		// Find ith bit
		int bitValue = find_Bit(Number, bitPosition);
		System.out.println("Bit At postion " +bitPosition+ " is " +Integer.toBinaryString(bitValue));
		
		// Set ith bit
		int AfterSet = set_Bit(Number, bitPosition);
		System.out.println("After setting bit at position " +bitPosition+ " is " +Integer.toBinaryString(AfterSet));
		
		// Clear ith bit
		int AfterClear = clear_Bit(AfterSet, bitPosition);
		System.out.println("After clearing bit at position " +bitPosition+ " is " +Integer.toBinaryString(AfterClear));
		
		// Toggle ith bit
		int ToggleBit = toggle_Bit(Number, bitPosition);
		System.out.println("After performing toggle operation at Position " +bitPosition+ " is " +Integer.toBinaryString(ToggleBit));
		
		// Find number of 1 bit in number
		int TotalBit = no_of_Bit(Number);
		System.out.println("Total No. of bit is " +TotalBit+ ".");
	}
	
	public static int find_Bit(int Number, int bitPosition) {
		return Number & (1 << bitPosition);
	}
	
	public static int set_Bit(int Number, int bitPosition) {
		return Number | (1 << bitPosition);
	}
	
	public static int clear_Bit(int Number, int bitPosition) {
		return Number & ~(1 << bitPosition);
	}
	
	public static int toggle_Bit(int Number, int bitPosition) {
		return Number ^ (1 << bitPosition);
	}
	
	public static int no_of_Bit(int Number) {
		int count = 0;
		while(Number != 0){
			if(Number % 2 != 0) {
				count++;
			}
			Number = Number >> 1;
		}
		return count;
	}
}
