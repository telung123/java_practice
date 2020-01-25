package scheduler;

public class LeastJob implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("상담 전화 순서대로 배치(Least)");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 대기가 가장 낮은 상담원에게 콜 할당");
	}
}
