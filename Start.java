
public class Start {

	final static String name= "Death and resurrection show 1.0 alpha";
	
	public static TimeServer ts;
	public static void main(String[] args) {

		System.out.println(name);

		ts = TimeServer.getTimeServer();

//		long ns = System.currentTimeMillis();
//		for(int i = 0; i < 10000; i++){
//			System.out.print(i);
			Soul s = new Soul();
			ts.addObserver(s);
			ts.mainLoop();
			ts.deleteObserver(s);
			ts.reset();
//		}
//		System.out.println("in " + (System.currentTimeMillis() - ns)/1000f + " seconds");
	}

}