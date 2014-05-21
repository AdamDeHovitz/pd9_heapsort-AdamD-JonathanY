// Adam DeHovitz
// Period 9
// HW #42
// 2014-05-20

public class HeapSort{
    
    public static Integer[] sort( Integer[] data ){
	heapify(data);
	//return sort(data);
	return data;
    }
    public static void heapify( Integer[] data){ //This just barely doesn't work :/
	for (int x = data.length - 1; x >= 0; x--){
	    int z = x;
	    while (z > 0){
		if (data[z] < data[(z-1)/2]){
		    swap(data,z,(z-1)/2);
		    z = (z-1)/2;
		}
		else{
		    break;}
	    }
	}
	
	//System.out.println(data);
}
    public static void swap(Integer[] data, int ind1, int ind2){
	int temp = data[ind1];
	data[ind1] = data[ind2];
	data[ind2] = temp;
    }


     //O(nlogn)

    public static String Print( Integer[] A){ //helper
	String ans = "";
	for (Integer x:  A ){
	    ans += x+ ", ";}
	return ans;}

    public static void main( String[] args){
	Integer[] data = {2,35,5,3,23,4,1,24,7,5,84,53,52};
	data = sort(data);
	System.out.println(Print(data));
	Integer[] other = {89,3,35,2,4,7,1};
	other = sort(other);
	System.out.println(Print(other));



    }
}