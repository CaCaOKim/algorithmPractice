package StringAndArray;

import java.util.Arrays;
import java.util.Comparator;

class Interval{
	int start;
	int end;
	Interval(){
		this.start = 0;
		this.end =0;
	}//Interval() END
	Interval(int s, int e){
		this.start = s;
		this.end = e;
	}//Interval() END
}//Interval END

public class MeetingRooms {
	public static void main(String[] args) {
		MeetingRooms a = new MeetingRooms();
		
	
//		Interval in1 = new Interval(15,20);
//		Interval in2 = new Interval(5,10);
//		Interval in3 = new Interval(0,30);
//		Interval[] intervals = {in1, in2, in3};
		
		Interval in1 = new Interval(7,10);
		Interval in2 = new Interval(2,4);
		Interval[] intervals = {in1, in2};
		
		System.out.println(a.solve(intervals));
	}//main() END
	
	public boolean solve(Interval[] intervals) {
		
		if(intervals==null) {return false;}
		
		Comparator<Interval> comp = new Comparator<Interval>() {
			
			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				return o1.start - o2.start;
			}//compare() END
		};//compare END
		
		Arrays.sort(intervals, comp);
		
		for(int i=1; i<intervals.length; ++i) {
			if(intervals[i-1].end > intervals[i].start) {
				return false;
			}//if END
		}//for END
		
		return true;
	}//solve() END
	
}//MeetingRooms END
