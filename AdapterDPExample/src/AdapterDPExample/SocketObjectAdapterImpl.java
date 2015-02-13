package AdapterDPExample;

public class SocketObjectAdapterImpl implements SocketAdapter{
	private Socket socket = new Socket();//using composition for adapter pattern
	public Volt get120Volt(){
		return socket.getVolt();
	}
	public Volt get12Volt(){
		Volt v = socket.getVolt();
		v.setVolts(v.getVolts()/10);
		return v;
	}
	public Volt get3Volt(){
		Volt v = socket.getVolt();
		v.setVolts(v.getVolts()/40);
		return v;
	}
}
