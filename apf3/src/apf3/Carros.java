package apf3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Carros {
	private Connection conexao;
	public Carros(Connection conexao){
        this.conexao = conexao;
    }
	
	private int id_carro;
	private int numero_portas; 
	private String tipo_cambio;
	private String tipo_direcao; 
	private String cor;
	private float motor;
	
	public boolean adicionaCarro(int id_carro, int numero_portas, String tipo_cambio, String tipo_direcao, String cor, float motor) {
		try {
			Statement statement = this.conexao.createStatement();
			statement.executeUpdate("INSERT INTO Carros VALUES("+id_carro+","+numero_portas+","+tipo_cambio+","+tipo_direcao+","+cor+","+motor+")");
			System.out.println("Carro adicionado:") ;
			System.out.println("N�mero do ID:" +id_carro) ;
			System.out.println("Numero de portas:" +numero_portas) ;
			System.out.println("Tipo de c�mbio:" +tipo_cambio) ;
			System.out.println("Tipo de dire��o:" +tipo_direcao) ;
			System.out.println("Cor do carro:" +cor) ;
			System.out.println("O motor do carro �:" +motor);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deletaCarro(int id_carro) {
		try {
			Statement statement = this.conexao.createStatement();
			statement.executeUpdate("DELETE FROM Carros WHERE id_carro = "+id_carro+"");
			System.out.println("Registro deletado.");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
   }
		
		
	
	public boolean updateCarroCambio(int id_carro, String tipo_cambioNovo) {		
		try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("UPDATE Carros SET tipo_cambio ='"+tipo_cambioNovo+"' WHERE id_carro ="+id_carro);          
            System.out.println("Registro atualizado.");
            return true;
        }catch(SQLException e){
            return false;
        }
	}
	
	public boolean updateCarroPortas(int id_carro, int numero_portasNovo) {		
		try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("UPDATE Carros SET numero_portas ='"+numero_portasNovo+"' WHERE id_carro ="+id_carro);          
            System.out.println("Registro atualizado.");
            return true;
        }catch(SQLException e){
            return false;
        }
	}
	
	public boolean updateCarroDirecao(int id_carro, String tipo_direcaoNovo) {		
		try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("UPDATE Carros SET tipo_direcao ='"+tipo_direcaoNovo+"' WHERE id_carro ="+id_carro);          
            System.out.println("Registro atualizado.");
            return true;
        }catch(SQLException e){
            return false;
        }
	}
	
	public boolean updateCarroCor(int id_carro, String corNovo) {		
		try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("UPDATE Carros SET cor ='"+corNovo+"' WHERE id_carro ="+id_carro);          
            System.out.println("Registro atualizado.");
            return true;
        }catch(SQLException e){
            return false;
        }
	}
			
	public boolean procurarPortas(int numero_portas) {
		try{
            Statement statement = this.conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Carros WHERE numero_portas = "+numero_portas);
            while(rs.next()) {
            System.out.println("Os carros com o n�mero de portas pedido s�o: " + rs.getInt("id_carro"));
            }
            return true;
         }catch(SQLException e){
               return false;
        }
  	}
	
	public boolean procurarCambio(String tipo_cambio) {
		try{
            Statement statement = this.conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Carros WHERE tipo_cambio = "+tipo_cambio);
            while(rs.next()) {
                System.out.println("Os carros com o tipo de c�mbio pedido s�o: " + rs.getInt("id_carro"));
                }
                return true;
        }catch(SQLException e){
            return false;
        }
  	}
	
	
	public boolean procurarDirecao(String tipo_direcao) {	
		try{
			Statement statement = this.conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Carros WHERE tipo_direcao = "+tipo_direcao);
            while (rs.next()) {
                System.out.println("Os carros com o tipo de dire��o pedida s�o: "+ rs.getInt("id_carro"));
            }           
            return true;
        }catch(SQLException e){
            return false;
        }
	}
	
	public boolean procurarMotor(float motor) {		
		try{
            Statement statement = this.conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Carros WHERE motor = "+motor);
            while (rs.next()) {
            	System.out.println("Os carros com o tipo de motor pedido s�o: "+ rs.getInt("id_carro"));                
            }           
            return true;
        }catch(SQLException e){
            return false;
        }
	}
	

}

