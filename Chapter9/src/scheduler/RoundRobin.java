package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화 순서대로 배치");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 콜 배치");
	}
}
