package prob02;

public class Goods {
	private String name;
	private Integer price;
	private Integer num;
	public Goods(String name,Integer price,Integer num) {
		this.name=name;
		this.price=price;
		this.num=num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return this.name+"(가격:"+this.price+"원)이 "+num+"개 입고 되었습니다.";
	}
	
}
