package com.superGoma;

public class MaquinaGoma {
	public static final int SEM_MOEDA = 0;
	public static final int COM_MOEDA = 1;
	public static final int GOMA_VENDIDA = 2;
	public static final int SEM_GOMA = 3;
	
	private int numeroGoma = 0;
	private int estado = SEM_GOMA;
	
	public MaquinaGoma(int numeroGoma){
		this.numeroGoma = numeroGoma;
		if(numeroGoma > 0){
			this.estado = SEM_MOEDA;
		}
	}
	
	public void inserirMoeda(){
		if(SEM_MOEDA == estado){
			this.estado = COM_MOEDA;
		}else if(COM_MOEDA == estado){
			System.out.println("Voc� n�o pode inserir mais de uma moeda por vez!");
		}else if(GOMA_VENDIDA == estado){
			System.out.println("Por favor espere um instante, a goma esta sendo entrege!");
		}else if(SEM_GOMA == estado){
			System.out.println("Desculpe!, mas n�o h� gomas no momento!");
		}
		
	}
	
	public void ejetarMoeda(){
		if(SEM_MOEDA == estado){
			System.out.println("Voc� n�o inseriu nem uma moeda!");
		}else if(COM_MOEDA == estado){
			this.estado = SEM_MOEDA;
		}else if(GOMA_VENDIDA == estado){
			System.out.println("Ja entregamos a goma, ela n�o pode mais ser devolvida!");
		}else if(SEM_GOMA == estado){
			System.out.println("N�o h� gomas no momento, enquanto n�o existir gomas n�o aceitamos dinheiro por isso n�o podemos devolver nem um");
		}
	}
	
	public void acionarAlavanca(){
		if(SEM_MOEDA == estado){
			System.out.println("N�o podemos vender sem pagamento, ensira alguma moeda");
		}else if(COM_MOEDA == estado){
			if(numeroGoma > 0){
				this.estado = GOMA_VENDIDA;
				entregarGoma();
			}else{
				this.estado = SEM_GOMA;
				System.out.println("Estamos sem gomas, agradecemos a preferencia!");
			}
		}else if(GOMA_VENDIDA == estado){
			System.out.println("Girar duas vezes n�o lhe dar� duas gomas. Espere um momento, ja estamos entregando sua goma!");
		}else if(SEM_GOMA == estado){
			System.out.println("Estamos sem goma!");
		}
	}
	
	private void entregarGoma(){
		if(GOMA_VENDIDA == estado){	
			this.estado = SEM_MOEDA;
			numeroGoma = numeroGoma -1;
			System.out.println("Goma entregue!");
		}
	}

	/**
	 * @return the numeroGoma
	 */
	public int getNumeroGoma() {
		return numeroGoma;
	}
}
