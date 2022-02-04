package apf3;
import java.sql.Connection;
import java.sql.Statement;

public class Main {
	static Connection connection = null;
	Statement statement;  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexao conexao = new Conexao();
		conexao.abrirConexao();
		Carros carros = new Carros(conexao.getConnection());
		Motos motos = new Motos(conexao.getConnection());
		
		carros.adicionaCarro(1, 2, "'Manual'", "'Hidra'","'preto'",(float) 1.5);
		carros.adicionaCarro(2, 2, "'Auto'", "'Hidra'", "'azul'", (float) 2.0);
		carros.adicionaCarro(3, 4, "'Auto'", "'Hidra'", "'azul'", (float) 2.0);
		
		motos.adicionaMoto(1, "'Manual'", "'amarela'", (float) 1.5);
		motos.adicionaMoto(2, "'Auto'", "'azul'", (float) 1.0);
		motos.adicionaMoto(3, "'Auto'", "'azul'", (float) 1.4);
		
		
		//carros.deletaCarro(1);
		//motos.deletaMoto(1);
		
		carros.updateCarroCambio(1, "Manual");
		motos.updateMotoCambio(1, "Manual");
		
		carros.procurarPortas(2);
		carros.procurarCambio("'Manual'");
		carros.procurarDirecao("'Hidra'");
		carros.procurarMotor((float)2.0);
		
		motos.procurarCambioMoto("'Auto'");
		motos.procurarMotorMoto((float) 1.4);
		
		
		conexao.fecharConexao();

	}

}
