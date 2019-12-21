package jp.dcnet.lxh.chapter08;

public class Child extends Parent{
//	@Override
//	  String hello() {
//		super.hello();
//		 System.out.println("Child say hello");
//		 return "456";
//	 }

	 /**–¼*/
	 private String givenName;

	 public String getGivenName() {
		return givenName;
	}


	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}


	public Wanju getWanju() {
		return wanju;
	}


	public void setWanju(Wanju wanju) {
		this.wanju = wanju;
	}


	private Wanju wanju;


	void cry(){
		System.out.println("cry!!!!!!");
	}
}
