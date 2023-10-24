import javax.swing.JOptionPane;

public class apsTheilor {
    public static void main(String[] args) throws Exception {
        int[] matricula = {4, 5, 1, 3, 2, 7, 8};
		int[] idade = new int[20];
        int aux,i,j;
        boolean verificar;

        // Loop que percorre o array
        for(i = 0; i < matricula.length; i++){
            verificar = true;
            // Loop para trocar os números para ordem crescente
            for(j = 0; j < (matricula.length - 1); j++){
                // Tip: Alterando o ">" no if para "<" invertemos para ordem decrescente
                if(matricula[j] > matricula[j + 1]){
                    aux = matricula[j];
                    matricula[j] = matricula[j + 1];
                    matricula[j + 1] = aux;
                    verificar = false;
                }
            }
            // Boolean para verificar se os números já estão em ordem
            if(verificar){
                break;
            }
        }
        // Printa os números em ordem crescente
        for(i = 0; i < matricula.length; i++){
            System.out.println(matricula[i] + " ");
        }
    }
}
