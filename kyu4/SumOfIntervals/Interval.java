package cw;

import java.util.Comparator;

public class Interval {

	public static int sumIntervals(int[][] intervals) {
		if (intervals == null) return 0;
		else if (intervals.length == 0) return 0;
		else if (intervals[0].length == 0) return 0;
		java.util.Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
		int sum = 0, min = intervals[0][0], max = intervals[0][1];
		for (int[] interval : intervals) {
			if (min < interval[0] && max >= interval[0]) {
				if (max < interval[1]) max = interval[1];
			} else if (max < interval[0]) {
				sum += (max - min);
				min = interval[0];
				max = interval[1];
			}
		}
		sum += (max - min);
		return sum;
	}
}
