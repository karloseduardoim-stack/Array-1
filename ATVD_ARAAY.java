import javax.swing.JOptionPane;
public class ATVD_ARAAY {
public static void main(String []args) {
	int numeral[]=new int[10];
	JOptionPane.showMessageDialog(null, "Escolha 10 números no teste \n de arrays");
	
	for (int i=0;  i<10; i++) {
		
		numeral[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite os seus números:"));
		
	}
	JOptionPane.showMessageDialog(null, "Este são os números escolhidos: \n" +numeral[0] + ","
     + numeral[1]+ "," + numeral[2]+ "," + numeral[3]+ "," +
     numeral[4]+ "," + numeral[5]+ ","+ numeral[6]+
    "," +numeral[7]+ "," + numeral[8]+ "," + numeral[9]     );

	
}
}
