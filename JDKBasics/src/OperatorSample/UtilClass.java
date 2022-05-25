package OperatorSample;

public class UtilClass {
int v1,v2;

public UtilClass() {
	super();
}

public UtilClass(int v1,int v2) {
	super();
	this.v1=v1;
	this.v2=v2;
}
public int getV1() {
	System.out.println(v1);
	return v1;
}
public void setV1(int v1) {
	this.v1 = v1;
}
public void arithmatic() {
	System.out.println("sum is "+(v1+v2));
}
}
