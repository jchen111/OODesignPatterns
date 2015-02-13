package AdapterDPExample;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{
	public Volt get120Volt(){
		return getVolt();
	}
	public Volt get12Volt(){
		Volt v = getVolt();
		v.setVolts(v.getVolts()/10);
		return v;
	}
	public Volt get3Volt(){
		Volt v = getVolt();
		v.setVolts(v.getVolts()/40);
		return v;
	}
}
