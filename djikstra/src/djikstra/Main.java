package djikstra;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Stacks<String> operators = new Stacks<String>();
		Stacks<Double> values = new Stacks<Double>();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		String[] tokens = input.nextLine().split(" ");

		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals("("))
				;
			 else if (tokens[i].equals("+"))
				operators.push(tokens[i]);
			 else if (tokens[i].equals("-"))
				operators.push(tokens[i]);
			 else if (tokens[i].equals("*"))
				operators.push(tokens[i]);
			 else if (tokens[i].equals("/"))
				operators.push(tokens[i]);
			 else if (tokens[i].equals("sqrt"))
				operators.push(tokens[i]);
			 else if (tokens[i].equals("^"))
				operators.push(tokens[i]);
			 else if (tokens[i].equals(")")) {
				String op = operators.pop();
				 double v = values.pop();
				 if (op.equals("+"))
					v = values.pop() + v;
				 else if (op.equals("-"))
					v = values.pop() - v;
				 else if (op.equals("*"))
					v = values.pop() * v;
				 else if (op.equals("/"))
					v = values.pop() / v;
				 else if (op.equals("sqrt"))
					v = Math.sqrt(v);
				 else if (op.equals("^"))
					v = Math.pow(values.pop(), v);
				values.push(v);
			}  else
				values.push(Double.parseDouble(tokens[i]));
		}
		System.out.println(values.pop());
	}

}
