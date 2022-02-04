package apf3;

public class classeCarro {
	private int id_carro;
	private int numero_portas; 
	private String tipo_cambio;
	private String tipo_direcao; 
	private String cor;
	private float motor;
	

	public int getId_carro() {
		return id_carro;
	}
	
	public int getNumero_portas() {
		return numero_portas;
	}
	
	public String getTipo_cambio() {
		return tipo_cambio;
	}
	
	public String getTipo_direcao() {
		return tipo_direcao;
	}
		
	public String getCor() {
		return cor;
	}
	
	public float getMotor() {
		return motor;
	}
	
	public void setNumero_portas(int numero_portas) {
		this.numero_portas = numero_portas;
	}
	
	public void setTipo_cambio(String tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}
	
	public void setTipo_direcao(String tipo_direcao) {
		this.tipo_direcao = tipo_direcao;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setMotor(float motor) {
		this.motor = motor;
	}

}
