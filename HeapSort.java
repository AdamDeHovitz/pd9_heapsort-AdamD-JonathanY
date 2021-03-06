// Adam DeHovitz and Jonathon Yin
// Period 9
// HW #42
// 2014-05-20

public class HeapSort{
    
    public static Integer[] sort( Integer[] data ){
	heapify(data);
	System.out.println(Print(data));
	sortify(data);
	return data;
    }
    public static void heapify(Integer[] data){
	if (data.length == 0 || data.length == 1)
	    return;
	else{
	    for (int i = 1; i< data.length; i++){
		helper(i, data);
		}

	    }
	   
    }
    public static void helper(int pos, Integer[] data){
	if (pos == 0){
	    return;
	}
	else{
	    if (data[pos] > data[(int)(Math.round(pos/2.0) - 1)]){
		int child  = data[pos];
		int parent = data[(int)(Math.round(pos/2.0)-1)];
		data[pos] = parent;
		data[(int)Math.round(pos/2.0)-1] = child;
		helper((int)(Math.round(pos/2.0)-1),data);
	    }
	}
    }

    public static void sortify( Integer[] data){
	int n = data.length - 1;
	int x;
	int index;
	while (n >= 0){
	    x = data[0];
	    data[0] = data[n];
	    index = 0;
	    while (index * 2 + 1 < n){
		if (index * 2 + 2 == n){
		    if (data[index * 2 + 1] >data[index]){
			swap(data, index * 2 + 1, index);
			break;}
		    else {
			break;}
		}
		int l = data[index * 2 + 1];
		int r = data[index * 2 + 2];
		if (l > r && l > data[index]){
		    swap(data, index, index * 2 +1);
		    index = index * 2 + 1;
		}
		else if (l < r && r > data[index]){
		    swap(data, index, index * 2 +2);
		    index = index * 2 + 2;
		}
		else {
		    break;}
		    
	    }
	    data[n] = x;
	    n--;
	    System.out.println("test: "+ Print(data));
	}
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
	Integer[] data = {2,35,3,23,4,1,24,7,5,84,53,52};
	data = sort(data);
	System.out.println(Print(data));
	Integer[] other = {89,3,35,2,4,7,1};
	other = sort(other);
	System.out.println(Print(other));



    }
}