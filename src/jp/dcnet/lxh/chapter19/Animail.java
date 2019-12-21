package jp.dcnet.lxh.chapter19;

public class Animail {

	private String name ;
	private Integer count;
	private Integer legs;

	public Animail(String name, Integer count, Integer legs) {
		this.name = name;
		this.count = count;
		this.legs = legs;
	}

	public String getName() {
		return name;
	}
	public Integer getCount() {
		return count;
	}
	public Integer getLegs() {
		return legs;
	}


}
