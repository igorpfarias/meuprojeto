package Exemplo1;

import javax.swing.JOptionPane;

public class ControleDeEntrada {

	public static void main(String[] args) {
		    // Solicita a placa do carro
	        String placa = JOptionPane.showInputDialog("Digite a placa do carro:");
	        
	        // Solicita o modelo do carro
	        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");

	        // Verifica se a placa é válida (tem ao menos um número final)
	        if (placa != null && !placa.isEmpty()) {
	            // Remove espaços e transforma em maiúscula
	            placa = placa.trim().toUpperCase();
	            
	            // Pega o último caractere da placa
	            char ultimoChar = placa.charAt(placa.length() - 1);

	            // Verifica se o último caractere é um número
	            if (Character.isDigit(ultimoChar)) {
	                int ultimoNumero = Character.getNumericValue(ultimoChar);

	                // Regra: número final par = entrada liberada
	                boolean entradaLiberada = (ultimoNumero % 2 == 0);

	                // Exibe a mensagem
	                if (entradaLiberada) {
	                    JOptionPane.showMessageDialog(null,
	                            "Entrada LIBERADA para o veículo modelo " + modelo + ", placa " + placa);
	                } else {
	                    JOptionPane.showMessageDialog(null,
	                            "Entrada BLOQUEADA para o veículo modelo " + modelo + ", placa " + placa);
	                }
	            } else {
	                JOptionPane.showMessageDialog(null,
	                        "Placa inválida: o último caractere deve ser um número.");
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Placa não pode estar vazia.");
	        }
	    
	

	}

}
