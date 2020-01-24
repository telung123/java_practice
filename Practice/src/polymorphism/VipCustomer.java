package polymorphism;

public class VipCustomer extends Customer {
	private int agentId;
	
	public VipCustomer(String name, int agentId) {
		super(name);
		this.agentId = agentId; // 상담원 번호 
	}
	
	
	public int getAgentId() {
		return agentId;
	}
	
	public void setAgentId(int id) { // 상담직원 ID 연결
		agentId = id;
	}

	@Override
	public void init() {
		grade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.15;
	}
	
	@Override
	public String getCustomerInfo() {
		return name + "고객님(상담직원:"+agentId+"), 등급:"+grade+", 아이디: "+ id + "\n포인트: "+ bonusPoint + ", 적립율:"+bonusRatio+", 할인율: "+ salesRatio;
	}
}
