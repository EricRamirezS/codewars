/**
 * codewars
 * <p>
 * Created by Eric Ramírez Santis on 08-11-2018.
 * Github Account: https://github.com/EricRamirezS
 */
public class Max {
	public static int sequence(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i < arr.length; i++){
			int sum = arr[i];
			for (int j=i+1; j < arr.length; j++){
				sum+=arr[j];
				max = max>sum?max:sum;
			}
		}
		return max>0?max:0;
	}
}