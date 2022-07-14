package net.design.pattern;

public class VoucherFactory {
	public AddVchEntry getVoucherType(String vtype)
	{
		if(vtype==null)
		{
			return null;
		}
		else if(vtype.equalsIgnoreCase("Local"))
		{
			return new LocalInvoice();
		}
		else if(vtype.equalsIgnoreCase("Agent"))
		{
			return new AgentInvoice();
		}
		else if(vtype.equalsIgnoreCase("Line"))
		{
			return new LineInvoice();
		}
		else
		{
			return null;
		}		
	}
	

}
