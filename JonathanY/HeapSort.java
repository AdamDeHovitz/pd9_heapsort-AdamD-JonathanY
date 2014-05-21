//Jonathan Yin
// APCS2 pd.09
// 05-19-2014
// HW#41
public class HeapSort{
    private ALHeap _heap;
    public Integer[] Sort(Integer[]nums){
	Integer[] retVal = new Integer[nums.length];
	for (int i = 0; i<nums.length; i++){
	    _heap.add(nums[i]);
	}
	for (int i = 0; i <retVal.length; i++){
	    retVal[i] = _heap.removeMin();
	}
	return retVal;
    }
}
// This has O(nlogn) runtime as the add and remove functions as of log n time and these calculations are performed n times. Their product is nlogn. The only other sort that has this run time (that we know of) is the merge sort.
		      
