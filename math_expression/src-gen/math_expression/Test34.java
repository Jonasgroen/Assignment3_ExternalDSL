package math_expression;
public class Test34 {

public int perimeterCircle;
public int sideC;
public int perimeterTriangle;
public int radius;
public int sideB;
public int sideA;

private External external;

public Test34(External external)
{
    this.external = external;
}

public void compute(){
	perimeterCircle=0;
	sideC=4;
	perimeterTriangle=11;
	radius=5;
	sideB=4;
	sideA=3;
}

public interface External {
	public int pi();
}
}
