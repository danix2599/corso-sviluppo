package lab01;

public class ProvaArrayString {

	public static void main(String[] args) {
		
		int lung= 7;
		String[] nani = new String[7]; // la lunghezza dell'array deve essere nota a priori
		
		nani[0]="pisolo";
		nani[1]="eolo";
		nani[2]="mammolo";
		nani[3]="dotto";
		nani[4]="brontolo";
		nani[5]="gongolo";
		nani[6]="cucciolo";
		
		int lunghezza = nani.length;//proprietà
		
		for (int i = 0; i < nani.length; i++) {
			if (nani[i].length()>5)
			System.out.println(nani[i]);
		}
		
		
		
		
		

	}

}
