package org.lang;

public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		
		System.out.println(" Tamil is the language spoken by TamilNadu people");
	}

	private void englishLanguage() {
		System.out.println(" English  is the common language spoken  in India");

	}

	private void hindiLanguage() {

		System.out.println(" HIndi is the language spoken by more people in India");
	}

	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		l.northIndia();
		l.southIndia();
	}

}
