package base;

public class MyInteger {
int iValue;

public MyInteger(int iValue) {
	this.iValue = iValue;
}

public int getiValue() {
	return iValue;
}
public boolean isEven(){
	if (iValue%2==0)
		return true;
	else
		return false;
}
public boolean isOdd(){
	if (iValue%2==1)
		return true;
	else
		return false;
}
public boolean isPrime(){
	if (iValue<2)
		return true;
	for (int i=2; i<iValue;i++){
		if (iValue%i==0){
			return false;
		}
	}
	return true;
}

public static boolean isEven(int varX){
	if (varX%2==0)
		return true;
	else
		return false;
}
public static boolean isOdd(int varX){
	if (varX%2==1)
		return true;
	else
		return false;
}
public static boolean isPrime(int varX){
	if (varX<2)
		return true;
	for (int i=2; i<varX;i++){
		if (varX%i==0){
			return false;
		}
	}
	return true;
}
public static boolean isEven(MyInteger varY){
	if (varY.getiValue() % 2==0)
		return true;
	else
		return false;
}
public static boolean isOdd(MyInteger varY){
	if (varY.getiValue() % 2==1)
		return true;
	else
		return false;
}
public static boolean isPrime(MyInteger varY){
	if (varY.getiValue() < 2)
		return true;
	for (int i=2; i<varY.getiValue();i++){
		if (varY.getiValue() % i==0){
			return false;
		}
	}
	return true;
}
public boolean equals(int varZ){
	if (getiValue()!=varZ)
		return false;
	else
		return true;
}
public boolean equals(MyInteger varZ){
	if (getiValue()!=varZ.getiValue())
		return false;
	else
		return true;
}
}
