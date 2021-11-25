package auto;

public class Auto {

	public String merkki;
	public String malli;
	public int bensanMaara;

	public Auto() {
		merkki = "";
		malli = "";
		bensanMaara = 0;
	}

	public Auto(String autoMerkki, String autoMalli, int bensaaJaljella) {
		merkki = autoMerkki;
		malli = autoMalli;
		bensanMaara = bensaaJaljella;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
