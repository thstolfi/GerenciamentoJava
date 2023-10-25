import javax.swing.JOptionPane;

public class apsTheilor {
    public static void main(String[] args) throws Exception {
        int[] matricula = new int[3];
		int[] idade = new int[3];
        int aux,i,j,opcao;
        boolean verificar;
        String entrada;

        // Coleta matriculas e idades
        for( i = 0; i < matricula.length; i++) {
			entrada = JOptionPane.showInputDialog("Informe o número da matrícula do funcionário:");
			matricula[i] = Integer.parseInt(entrada);
            entrada = JOptionPane.showInputDialog("Informe a idade do funcionmário:");
			idade[i] = Integer.parseInt(entrada);
		}

        // Abre o menu

        entrada = JOptionPane.showInputDialog("DIGITE SUA OPCAO\n"+
        "1. Mostrar\n"+
        "2. Ordenar Crescente por Matricula\n"+
        "3. Ordenar Decrescente por Idade\n"+
        "4. Inverter\n"+
        "5. Procurar Idade\n"+
        "6. Procurar Matricula\n"+
        "7. Repete\n"+
        "99. Vazar\n");
        opcao = Integer.parseInt(entrada);

        // Funcao para ordenar matricula CRESCENTE
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

        // Funcao para ordenar idade DESCRESCENTE
        for(i = 0; i < idade.length; i++){
            verificar = true;
            for(j = 0; j < (idade.length - 1); j++){
                if(idade[j] < idade[j + 1]){
                    aux = idade[j];
                    idade[j] = idade[j + 1];
                    idade[j + 1] = aux;
                    verificar = false;
                }
            }
            if(verificar){
                break;
            }
        }
        for(i = 0; i < idade.length; i++){
            System.out.println(idade[i] + " ");
        }
    }
}
