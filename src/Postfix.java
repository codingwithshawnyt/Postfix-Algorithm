import java.util.*;

class Postfix{
	public static void main(String args[]){
		String test = "5 2 4 * + 7 -";
		System.out.println(Postfix(test));
	}
	
	public static int Postfix(String exp)
	{
		Stack<Integer> eval = new Stack<Integer>();
		for(int x = 0; x < exp.length(); x++)
		{
			if(exp.charAt(x) != '*' && exp.charAt(x) != '+' && exp.charAt(x) != '-' && exp.charAt(x) != '/' && exp.charAt(x) != ' ')
			{
				int num = exp.charAt(x);
				eval.push(num);
			}
			if(exp.charAt(x) == '*')
			{
				int y = eval.pop();
				int z = eval.pop();
				eval.push(y * z);
			}
			if(exp.charAt(x) == '+')
			{
				int y = eval.pop();
				int z = eval.pop();
				eval.push(y + z);
			}
			if(exp.charAt(x) == '-')
			{
				int y = eval.pop();
				int z = eval.pop();
				eval.push(y - z);
			}
			if(exp.charAt(x) == '/')
			{
				int y = eval.pop();
				int z = eval.pop();
				eval.push(y / z);
			}
		}
		return eval.pop();
	}
}