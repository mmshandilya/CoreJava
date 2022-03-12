
public final class ImmutableDemo 
{
	private final int id;
	private final String name;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public ImmutableDemo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}	
	public static void main(String args[])
	{
		ImmutableDemo demo=new ImmutableDemo(1,"Mahesh");
		demo.getId();
		System.out.println(""+demo.getId()+" "+demo.getName());
	}

}
