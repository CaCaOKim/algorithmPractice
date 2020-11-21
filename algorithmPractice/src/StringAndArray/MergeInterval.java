package StringAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Interval{
//	int start;
//	int end;
//	
//	Interval(){
//		this.start = 0;
//		this.end =0;
//	}//Interval() END
//	
//	Interval(int s, int e){
//		this.start = s;
//		this.end = e;
//	}//Interval() END
//	
//}//Interval END => MeetingRooms에도 있는 클래스


public class MergeInterval {
	public static void main(String[] args) {
		Interval in1 = new Interval(1, 3);
		Interval in2 = new Interval(2, 6);
		Interval in3 = new Interval(8, 10);
		Interval in4 = new Interval(15, 18);

		List<Interval> intervals = new ArrayList<>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);
		MergeInterval a = new MergeInterval();
		List<Interval> list = a.merge(intervals);
		a.print(list);
		
		//target: 1 6     8 10     15 18
	}//main() END
	
	
	public List<Interval> merge(List<Interval> intervals) {
		if (intervals.isEmpty())
			return intervals;
		
		Comparator<Interval> comp = new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				return o1.start - o2.start;
			}//compare() END
		};//Comparator
		Collections.sort(intervals, comp);
		
		List<Interval> result = new ArrayList<Interval>();
		
		Interval before = intervals.get(0);
		for(int i=1; i<intervals.size(); ++i) {
			Interval current = intervals.get(i);
			
			if(before.end >= current.start) {
				before.end = Math.max(before.end, current.end);
			}else {
				result.add(before);
				before = current;
			}//if END
			
		}//for END
		
		if(!result.contains(before)) {
			result.add(before);
		}//if END
		
		return result;
		
	}//merge() END
	
	
	void print(List<Interval> list) {
		for (int i = 0; i < list.size(); i++) {
			Interval in = list.get(i);
			System.out.println(in.start + " " + in.end);
		}//for END
	}//pring() END
	
	
}//MergeInterval END
