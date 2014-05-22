public class Heapifier{
    public int[] toHeap(int[]data){
	if (data.length == 0 || data.length == 1)
	    return data;
	else{
	    for (int i = 1; i< data.length; i++){
		swap(i, data);
		}
		
	    }
	    return data;
    }
    public void swap(int pos, int[] data){
	if (pos == 0){
	    return;
	}
	else{
	    if (data[pos] > data[(int)(Math.round(pos/2.0) - 1)]){
		int child  = data[pos];
		int parent = data[(int)(Math.round(pos/2.0)-1)];
		data[pos] = parent;
		data[(int)Math.round(pos/2.0)-1] = child;
		swap((int)(Math.round(pos/2.0)-1),data);
	    }
	}
    }
    public static void main(String[]args){
	int[] nums = {3,7,5,1,9,2};
	Heapifier a = new Heapifier();
	nums = a.toHeap(nums);
	for (int i = 0; i < nums.length; i++){
	    System.out.println(nums[i]);
	}
    }
}
