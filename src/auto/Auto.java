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

		Auto auto1 = new Auto("Fiat", "Scudo", 10);
		auto1.NaytaTiedot();
		auto1.Kiihdyta();
		auto1.NaytaTiedot();
	}

	public void Kiihdyta() {

		if (bensanMaara > 0) {
			bensanMaara = bensanMaara - 1;
			System.out.println("Auto kiihtyy");
		}
	}

	public void tankkaa(int maara) {
		int tankkauksenJalkeen = maara + bensanMaara;
		System.out.println("Tankissa bensaa: " + bensanMaara);
		System.out.println("Tankkaus: " + maara);
		System.out.println("Tankissa bensaa tankkauksen jälkeen: " + tankkauksenJalkeen);
	}

	public void NaytaTiedot() {
		System.out.println("merkki: " + merkki);
		System.out.println("malli: " + malli);
		System.out.println("bensanMaara: " + bensanMaara);
	}

	public void Jarruta() {
		System.out.println("Auto jarruttaa");
	}
}
