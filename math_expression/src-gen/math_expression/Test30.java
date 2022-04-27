package math_expression;
public class Test30 {

public int x;

private External external;

public Test30(External external)
{
    this.external = external;
}

public void compute(){
	x=2;
}

public interface External {
	public int pi();
}
}
