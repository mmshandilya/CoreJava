package net.design.pattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		VoucherFactory vf=new VoucherFactory();
		AddVchEntry add=vf.getVoucherType("agent");
		add.addVoucher();
		
//		LocalInvoice l=new LocalInvoice();//Without Factory
//		l.addVoucher();
	}

}
