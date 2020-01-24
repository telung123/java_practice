package interfaceex;

public interface Calc {
	double PI = 3.14; // Compile 단계에서 final static 으로 컴파일 됨
	int ERROR = -999999999; // Error number - integer 범위 내에서 사용하지 않을것같은(?) 번호를 사용함
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
