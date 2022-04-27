package math_expression;
public class Test29 {

public int x;
public int y;

private External external;

public Test29(External external)
{
    this.external = external;
}

public void compute(){
	x=2;
	y=0;
}

public interface External {
	public int pow(int n,int m);
}
}
