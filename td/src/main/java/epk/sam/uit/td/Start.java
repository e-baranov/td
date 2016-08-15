package epk.sam.uit.td;

public class Start {

	public static void main(String[] args) throws Exception {
		System.out.printf("стартовал %s%n" , Thread.currentThread().getName());
		System.out.printf("эту строку я добавил дома. Имя компьютера:  %s%n" , java.net.InetAddress.getLocalHost().getHostName() );
	}

}
