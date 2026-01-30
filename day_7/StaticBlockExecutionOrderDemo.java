public class StaticBlockExecutionOrderDemo{

	static int x = 5;
	static int y;

	static {
		System.out.println("SB-1 Start");
		y = x++ + ++x;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("SB-1 End");
	}

	static {
		System.out.println("SB-2 Start");
		x = y-- - --x;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("SB-2 End");
	}
	public static void calculate(int x) {
		System.out.println("SM-1 Start");
		int y = x++ + ++StaticBlockExecutionOrderDemo.x;
        System.out.println("static x "+StaticBlockExecutionOrderDemo.x);
		System.out.println("local x = " + x);
		System.out.println("local y = " + y);
		StaticBlockExecutionOrderDemo.y = y + x;
		System.out.println("static y = " + StaticBlockExecutionOrderDemo.y);
		System.out.println("SM-1 End");
	}
	public static int process() {
		System.out.println("SM-2 Start");
		int x = StaticBlockExecutionOrderDemo.x + y++;
        System.out.println("static of x"+StaticBlockExecutionOrderDemo.x);
		StaticBlockExecutionOrderDemo.x = x - --y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("SM-2 End");
		return x;
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		calculate(x++);
		int result = process();
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Main End");
	}
}