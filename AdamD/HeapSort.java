// Adam DeHovitz
// Period 9
// HW #41
// 2014-05-19


public class HeapSort{

    /*
In the best case, it will already be in order from min to max, which would decrease the time to input but still lead to nlogn run time due to remove.
In the worse case it would be reversed order, but stil nlogn runtime.

    */

    
    public static Integer[] sort( Integer[] data ){
	ALHeap heap = new ALHeap();
	for (Integer x: data){
	    heap.add(x);
	}
	Integer ret[] = new Integer[data.length];
	for(int x = 0; x < data.length; x++){
		ret[x] = heap.removeMin();
	}
	return ret;
    } //O(nlogn)

    public static String Print( Integer[] A){ //helper
	String ans = "";
	for (Integer x:  A ){
	    ans += x+ ", ";}
	return ans;}

    public static void main( String[] args){
	Integer[] data = {2,35,5,3,23,1,3,4,1,24,7,5,84,53,52,3,};
	data = sort(data);
	System.out.println(Print(data));


    }
}