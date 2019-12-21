package dcnet.yh.chapter19;

public class Animal {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getLeg() {
		return leg;
	}

	public void setLeg(Integer leg) {
		this.leg = leg;
	}

	private Integer count;
	private Integer leg;

	public  Animal (String name,Integer count,Integer legs) {
		this.name = name;
		this.count = count;
		this.leg = legs;
	}






}
