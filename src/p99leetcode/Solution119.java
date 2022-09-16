package p99leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
	public static void main(String[] args) {
		Solution119.getRow(0);
	}
	    public static List<Integer> getRow(int rowIndex) {
	        // 파라미터로 받은 rowIndx는 어떤걸 의미하냐?
	        // 만약 1이면 item이 1인 리스트를 리턴 -> 2이면 
	         List<Integer> preList = null;
	        for(int i = 0; i <= rowIndex; i++){
	            
	            List<Integer> colList = new ArrayList<>();
	            for(int j = 0; j <= i; j++){
	                if(j == 0 || i == j){
	                    colList.add(1);
	                }else{
	                    colList.add(j, preList.get(j-1)+preList.get(j));                                 
	                }
	            }
	            preList = colList;
	        }
	        return preList;
	    }
}
