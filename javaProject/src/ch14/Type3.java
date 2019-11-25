package ch14;

public class Type3<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	public static void main(String[] args) {
		Type3<String> a = new Type3<String>();
		a.setData("kim");
		System.out.println(a.getData());
		Type3<Integer> b = new Type3<Integer>();
		b.setData(10);
		System.out.println(b.getData());
		Type3<Double> c = new Type3<Double>();
		c.setData(100.5);
		System.out.println(c.getData());
				
	}

}
