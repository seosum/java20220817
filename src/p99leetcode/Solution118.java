package p99leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);

		list.add(firstRow);

		for (int i = 1; i < numRows; i++) {
			List<Integer> next = new ArrayList<>();
			List<Integer> current = list.get(list.size() - 1);

			next.add(1);
			for (int j = 1; j < current.size(); j++) {
				next.add(current.get(j) + current.get(j - 1));
			}
			next.add(1);

			list.add(next);
		}
		return list;
	}
}

class Solution {
	   public List<List<Integer>> minimumAbsDifference(int[] arr) {
	      Arrays.sort(arr);
	      List<List<Integer>> arrayList = new ArrayList<>();
	      int abs = 0;
	      int absMin = (int)1e6;
	      
	      for (int i = 0; i < arr.length - 1; i++) {
	         absMin = Math.min(absMin, arr[i + 1] - arr[i]);
	      }
	      
	      for (int i = 0; i < arr.length - 1; i++) {
	         List<Integer> list = new ArrayList<>();
	         abs = Math.abs(arr[i + 1] - arr[i]);
	         if (abs == absMin) {
	            list.add(arr[i]);
	            list.add(arr[i + 1]);
	            arrayList.add(list);
	         }
	      }
	      return arrayList;
	   }
	}