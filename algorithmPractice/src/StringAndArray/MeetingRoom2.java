package StringAndArray;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

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


public class MeetingRoom2 {
	public static void main(String[] args) {
		MeetingRoom2 a = new MeetingRoom2();
		
//		Interval in1 = new Interval(5,10);
//		Interval in2 = new Interval(15,20);
//		Interval in3 = new Interval(0,30);
//		//target: 2
		
//		Interval in1 = new Interval(1,4);
//		Interval in2 = new Interval(4,5);
//		Interval in3 = new Interval(4,6);
//		//target: 2
		
//		Interval in1 = new Interval(7,10);
//		Interval in2 = new Interval(2,4);
//		Interval in3 = new Interval(11,30);
//		//target: 1
		
		Interval in1 = new Interval(3,10);
		Interval in2 = new Interval(2,4);
		Interval in3 = new Interval(2,8);
		//target: 3
		
		Interval[] intervals = {in1,in2,in3};
		System.out.println(a.solve(intervals));
	}//main() END
	
	
	public int solve(Interval[] intervals) {
		if(intervals==null || intervals.length==0) {return 0;}
		
		Arrays.sort(intervals, (a,b) -> a.start-b.start);
		
		Queue<Interval> MeetingTime = new PriorityQueue<Interval>((a,b) -> a.end-b.end);
		for(int i=0; i<intervals.length; ++i) {
			
			while(!MeetingTime.isEmpty() && MeetingTime.peek().end <= intervals[i].start) {
				MeetingTime.poll();
			}//while END
			
			MeetingTime.offer(intervals[i]);
		}//for END
		
		return MeetingTime.size();
	}//solve() END
	
}//MeetingRoom2 END
