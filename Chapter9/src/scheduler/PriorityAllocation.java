package scheduler;

public class PriorityAllocation implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객 콜 할당");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 숙련도가 높은 상담원에게 콜 배치");
	}

}
