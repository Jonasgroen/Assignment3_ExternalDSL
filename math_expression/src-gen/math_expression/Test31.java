package math_expression;
public class Test31 {

public int x;
public int y;

private External external;

public Test31(External external)
{
    this.external = external;
}

public void compute(){
	x=5;
	y=8;
}

public interface External {
	public int pow(int n,int m);
}
}
