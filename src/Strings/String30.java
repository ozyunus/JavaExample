package Strings;

import javax.sound.midi.Soundbank;

public class String30 {

	public static void main(String[] args) {
		String[] words1 = {"insan","ekmek","su","toprak"};
		String[] words2 = {"hayat","dağ","hava","su"};
		
		for(int i=0; i<words1.length; i++) {
			for(int j=0; j<words2.length; j++) {
				if(words1[i]==words2[j]){
					System.out.println(words1[i]+" kelimei "+i+".indekste bulunmaktadır.");
				}
			}
		}
		
	}

}
