package algs;

import java.util.Stack;

public class EvaluateSelf {

	public static void main(String[] args) {
		
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		
		// TODO
		String[] cauStr = { "(", "1", "(", "(", "2", "3", "+", ")", "(", "4", "5", "*", ")", "*", ")", "+", ")" };

		for (int i = 0; i < cauStr.length; i++) {
			if(cauStr[i].equals("(")){}
			else if(cauStr[i].equals("+")){
				ops.push(cauStr[i]);
			}else if(cauStr[i].equals("-")){
				ops.push(cauStr[i]);
			}else if(cauStr[i].equals("*")){
				ops.push(cauStr[i]);
			}else if(cauStr[i].equals("/")){
				ops.push(cauStr[i]);
			}else if(cauStr[i].equals(")")){
				String op = ops.pop();
				double val = vals.pop();
				if(op.equals("+")){
					val = vals.pop() + val;
				}else if(op.equals("-")){
					val = vals.pop() - val;
				}else if(op.equals("*")){
					val = vals.pop() * val;
				}else if(op.equals("/")){
					val = vals.pop() / val;
				}
				vals.push(val);
			}else{
				vals.push(Double.parseDouble(cauStr[i]));
			}
		}
		
		System.out.println(vals.pop());
	}

}
