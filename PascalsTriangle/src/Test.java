public class Test {
	static PascalsTriangle triangle = new PascalsTriangle(13);
	public static void main(String[] args) {
		System.out.println(triangle.getElement(13,8));
		System.out.println(triangle.showTriangle());
	}

}