package br.com.fiap.banco;

public class App {
	
		public static void main(String[] args) {
			
			try {
			} catch (DepositarValorNegativoException e) {
				System.out.println("Valor do depósito negativo");
			} catch (SacarValorMaiorQueSaldoException e) {
				System.out.println("Saque do valor maior que saldo");
			} catch (TransferirValorMaiorQueSaqueException e) {
				System.out.println("Valor de transferência maior que saldo");
			} catch (TransferirValorNegativoException e) {
				System.out.println("Valor de transferência negativo");
			} finally {
				
			}
			
			ContaCorrente conta = new ContaCorrente("00234-6", "Nathan");
			ContaPoupanca conta2 = new ContaPoupanca("30289-3", "Nathalia");
			
			conta.setSaldo(20000);
			conta2.setSaldo(20000);
			
			System.out.println("O saldo atual da conta " + conta.getNome() + " é de: " + "R$" + conta.getSaldo());
			
			conta.setDepositar(3000);
			conta.setSacar(2000);
			conta.setTransferir(900);
			
			System.out.println("\nO extrato atual da conta " + conta.getNome() + " do número " + conta.getNumeroDaConta() + ":" + 
								"\n\nDepositou um total de R$" + conta.getDepositar() +
								"\nSacou um total de R$" + conta.getSacar() +
								"\nTransferiu um total de R$" + conta.getTransferir() +
								"\nSaldo atual da conta: R$" + conta.getSaldo());				
		}
}
