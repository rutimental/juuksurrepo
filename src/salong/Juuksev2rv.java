package salong;

public class Juuksev2rv {

	public class java {

	}

	public static String juuksev2rv() {

		String[] v2rvid = new String[] { "must", "punane", "blond", "sinine",
				"plaatinum", "pruun", "roosa" };

		// leiab ühe nullist erineva arvu eelneva massiivi pikkuseni
		int suvaline = 0 + (int) (Math.random() * ((v2rvid.length - 1 - 0) + 1));

		// väljastab massiivi suvalise indeksit kasutades eelnevalt leitud
		// suvalist arvu
		return v2rvid[suvaline];
	}
}
