package prob5;

public class MyStack {

	int top=0;
	String[] stack;
	public MyStack(int i) {
		stack=new String[i];
	}

	public void push(String string) {
		if(top>=3) {
			System.out.println("스택 오버 플로우");
		}else {
			stack[top++]=string;			
		}
	}

	public boolean isEmpty() {
		if(top >= 1) {
			return false;
		}else {
			return true;
		}
	}

	public String pop() throws Exception {
		if(top>0) {
			return stack[--top];
		}else {
			throw new MyStackException("stack is empty");
		}
		
	}

}