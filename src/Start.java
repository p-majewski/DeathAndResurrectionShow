
public class Start {

	final static String name= "Death and resurrection show 1.0 alpha";
	
	public static TimeServer ts;
	public static void main(String[] args) {

		System.out.println(name);

		ts = TimeServer.getTimeServer();

//		We'll play the simulation just once so I commented out the loop		
//		long ms = System.currentTimeMillis();
//		for(int i = 0; i < 10000; i++){
//			System.out.print(i);
			Soul s = new Soul();
			ts.addObserver(s);
			ts.mainLoop();
			ts.deleteObserver(s);
			ts.reset();
//		}
//		System.out.println("in " + (System.currentTimeMillis() - ms)/1000f + " seconds");
	}

}
