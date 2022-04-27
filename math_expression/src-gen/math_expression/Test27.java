package math_expression;
public class Test27 {

public int x;
public int y;

private External external;

public Test27(External external)
{
    this.external = external;
}

public void compute(){
	x=0;
	y=2;
}

public interface External {
	public int pi();
}
}
