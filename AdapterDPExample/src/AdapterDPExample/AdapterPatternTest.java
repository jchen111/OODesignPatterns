package AdapterDPExample;

public class AdapterPatternTest {
	public static Volt getVolt(SocketAdapter socketadapter, int i){
		switch(i){
		case 120: return socketadapter.get120Volt();
		case 12: return socketadapter.get12Volt();
		case 3: return socketadapter.get3Volt();
		default: return socketadapter.get120Volt();
		}
	}
	public static void testObjectAdapter(){
		SocketAdapter socketadapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(socketadapter,3);
		Volt v12 = getVolt(socketadapter,12);
		Volt v120 = getVolt(socketadapter,120);
		System.out.println("v3 volts using object adapter="+v3.getVolts());
		System.out.println("v12 volts using object adapter="+v12.getVolts());
		System.out.println("120 volts using object adapter="+v120.getVolts());
	}
	public static void testClassAdapter(){
		SocketAdapter socketadapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(socketadapter,3);
		Volt v12 = getVolt(socketadapter,12);
		Volt v120 = getVolt(socketadapter,120);
		System.out.println("v3 volts using class adapter="+v3.getVolts());
		System.out.println("v12 volts using class adapter="+v12.getVolts());
		System.out.println("120 volts using class adapter="+v120.getVolts());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testObjectAdapter();
		testClassAdapter();
	}

}
