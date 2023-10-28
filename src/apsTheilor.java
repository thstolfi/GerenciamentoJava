import javax.swing.JOptionPane;

public class apsTheilor {
    public static void main(String[] args) throws Exception {
        int[] matricula = new int[20];
		int[] idade = new int[20];
        int aux,i,j,opcao,esq,dir,idadefuncionario;
        boolean verificar;
        String entrada;

        // Coleta matriculas e idades
        for( i = 0; i < matricula.length; i++) {
			entrada = JOptionPane.showInputDialog("Informe o número da matrícula do funcionário " + (i + 1) + ":");
			matricula[i] = Integer.parseInt(entrada);
            entrada = JOptionPane.showInputDialog("Informe a idade do funcionário " + (i + 1) + ":");
			idade[i] = Integer.parseInt(entrada);
		}
        do{
            // Abre o menu
            entrada = JOptionPane.showInputDialog("DIGITE SUA OPCAO\n"+
            "1. Mostrar Lista\n"+
            "2. Ordenar Crescente por Matricula\n"+
            "3. Ordenar Decrescente por Idade\n"+
            "4. Inverter\n"+
            "5. Procurar Idade\n"+
            "6. Procurar Matricula\n"+
            "7. Repete\n"+
            "99. Sair\n");
            opcao = Integer.parseInt(entrada);
            switch (opcao){
                case 1:
                    System.out.println("--- LISTA DE FUNCIONÁRIOS ---");
                    for(i = 0; i < matricula.length; i++){
                        System.out.println("FUNCIONARIO " + (i + 1) + ": Matricula: " + matricula[i] + " - Idade: " + idade[i]);
                    }
                break;
                case 2:
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
                                aux = idade[j];
                                idade[j] = idade[j + 1];
                                idade[j + 1] = aux;
                                verificar = false;
                            }
                        }
                        // Boolean para verificar se os números já estão em ordem
                        if(verificar){
                            break;
                        }
                    }
                    // Printa os números em ordem crescente
                    System.out.println("--- FUNCIONÁRIOS: MATRÍCULA CRESCENTE ---");
                    for(i = 0; i < matricula.length; i++){
                        System.out.println("FUNCIONARIO " + (i + 1) + ": Matricula: " + matricula[i] + " - Idade: " + idade[i]);
                    }
                    break;
                case 3: 
                    // Funcao para ordenar idade DESCRESCENTE
                    for(i = 0; i < idade.length; i++){
                        verificar = true;
                        for(j = 0; j < (idade.length - 1); j++){
                            if(idade[j] < idade[j + 1]){
                                aux = idade[j];
                                idade[j] = idade[j + 1];
                                idade[j + 1] = aux;
                                aux = matricula[j];
                                matricula[j] = matricula[j + 1];
                                matricula[j + 1] = aux; 
                                verificar = false;
                            }
                        }
                        if(verificar){
                            break;
                        }
                    }
                    System.out.println("--- FUNCIONÁRIOS: IDADE DECRESCENTE ---");
                    for(i = 0; i < idade.length; i++){
                        System.out.println("FUNCIONARIO " + (i + 1) + ": Matricula: " + matricula[i] + " - Idade: " + idade[i]);
                    } 
                    break;
                case 4:
                    // Funcao para inverter dados do array
                    for(i = 0; i < matricula.length; i++){
                        esq = 0;
                        dir = matricula.length - 1;
                        while(esq < dir){
                            aux = matricula[esq];
                            matricula[esq] = matricula[dir];
                            matricula[dir] = aux;
                            aux = idade[esq];
                            idade[esq] = idade[dir];
                            idade[dir] = aux;
                            esq++;
                            dir--;
                        }
                    }
                    System.out.println("--- FUNCIONÁRIOS: INVERSO DA ÚLTIMA ORDEM ---");
                    for(i = 0; i < idade.length; i++){
                        System.out.println("FUNCIONARIO " + (i + 1) + ": Matricula: " + matricula[i] + " - Idade: " + idade[i]);
                    } 
                    break;
                case 5:
                    entrada = JOptionPane.showInputDialog("Informe o número da matrícula do funcionário:");
                    aux = Integer.parseInt(entrada);
                    idadefuncionario = 0;
                    verificar = false;
                    for(i = 0; i < matricula.length; i++){
                        if(aux == matricula[i]){
                            idadefuncionario = idade[i];
                            verificar = true;
                            break;
                        }
                    }
                    if(verificar){
                        System.out.println("Idade do funcionário com a matrícula " + aux + ": " + idadefuncionario);
                    }
                    else{
                        System.out.println("Matrícula não encontrada");
                    }
                    break;
                case 6:
                    entrada = JOptionPane.showInputDialog("Informe o número da matrícula do funcionário:");
                    aux = Integer.parseInt(entrada);
                    for(i = 0; i < matricula.length; i++){
                        if(aux == matricula[i]){
                            System.out.println("A matrícula se encontra na posição: " + (i + 1));
                        }
                    }
                    break;
                case 7:
                    verificar = false;
                    for(i = 0; i < matricula.length; i++){
                        for(j = 0; j < matricula.length; j++){
                            if(matricula[i] == matricula[j] && i != j){
                                verificar = true;
                                break;
                            }
                        }
                    }
                    if(verificar){
                        System.out.println("Há matrículas repetidas");
                    }else{
                        System.out.println("Não há matrículas repetidas");
                    }
                    break;
                case 99: 
                    System.out.println("Saindo do programa...");
                    break;
                default: System.out.println("OPCAO INVALIDA");
            }
        }while(opcao != 99);
    }
}