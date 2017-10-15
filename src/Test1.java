/**
 * this keyword can be used to return current class instance.
 * 
 * We can return this keyword as an statement from the method. In such case,
 * return type of the method must be the class type (non-primitive).
 * 
 * Let's see the example:
 * 
 * Syntax of this that can be returned as a statement
 * 
 * return_type method_name(){ return this; }
 * 
 * Example of this keyword that you return as a statement from the method
 */

class A {
	A getA() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}
}

class Test1 {
	public static void main(String args[]) {
		new A().getA().msg();
	}
}
