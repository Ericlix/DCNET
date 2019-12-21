package jp.dcnet.lss.chapter19;

public class Animail {
	private String name;
	private Integer count;
	private Integer legs;

	public Animail( String name,Integer count,Integer legs) {
		this.name = name;
		this.count = count;
		this.legs = legs;
	}




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
	public Integer getLegs() {
		return legs;
	}
	public void setLegs(Integer legs) {
		this.legs = legs;
	}




}
