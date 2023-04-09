package projetoIphone;

public class Multifuncoes implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	//Reprodutor Musical
	public void selecionarMusica() {
		System.out.println("Selecionando Música");
	}
	public void tocarMusica() {
		System.out.println("Tocando Música");
	}
	public void pausarMusica() {
		System.out.println("Pausando Música");
	}
	
	//Aparelho Telefonico
	public void ligar() {
		System.out.println("Ligando");
	}
	public void atender() {
		System.out.println("Atendendo Ligação");
	}
	public void iniciarCorrerioVoz() {
		System.out.println("Iniciando Correio de Voz");
	}
	
	//Navegador Internet
	public void exibirPagina() {
		System.out.println("Exibindo Página na Web");
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando Página");
	}
}
