package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("전화 상담원 할당 방식을 선택하세요.\nR: 순서대로 \nL: 대기가 적은 상담원 우선\nP: 우선순위가 높은 숙련도 상 직원 배분 ");
		
		
		int ch = Character.toLowerCase(System.in.read());
		
		Scheduler scheduler = null;
		
		
		
		// 정책 선택
		if ( ch == 'r' ) {
			scheduler = new RoundRobin();			
		}
		else if ( ch == 'l') {
			scheduler = new LeastJob();
		}
		else if ( ch == 'p'){
			scheduler = new PriorityAllocation();
		} 
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		
		// 정책에 따른 연결
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
