package apf3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Motos {
	
	private Connection conexao;
	public Motos(Connection conexao){
        this.conexao = conexao;
    }
	
	private int id_moto;
	private String tipo_cambio_moto;
	private String cor_moto;
	private float motor_moto;
	
	public boolean adicionaMoto(int id_moto, String tipo_cambio_moto, String cor_moto, float motor_moto) {		
		try {
			Statement statement = this.conexao.createStatement();
			statement.executeUpdate("INSERT INTO Motos VALUES("+id_moto+","+tipo_cambio_moto+","+cor_moto+","+motor_moto+")");
			System.out.println("Moto adicionada:");
		    System.out.println("Número do ID:" +id_moto);
		    System.out.println("Tipo de câmbio:" +tipo_cambio_moto);
		    System.out.println("Cor do carro:" +cor_moto);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean deletaMoto(int id_moto) {
			try {
				Statement statement = this.conexao.createStatement();
				statement.executeUpdate("DELETE FROM Motos WHERE id_moto = "+id_moto+"");
				System.out.println("Registro deletado.");
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
	}
		
	
	public boolean updateMotoCambio(int id_moto, String tipo_cambioNovo) {
		try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("UPDATE Motos SET tipo_cambio_moto ='"+tipo_cambioNovo+"' WHERE id_moto ="+id_moto);          
            System.out.println("Registro atualizado.");
            return true;
        }catch(SQLException e){
            return false;
        }
	}
	
	public boolean updateMotoCor(int id_moto, String cor_motoNovo) {
		System.out.println("Registro atualizado.");
		try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("UPDATE Motos SET cor_moto ='"+cor_motoNovo+"' WHERE id_moto ="+id_moto);          
            System.out.println("Registro atualizado.");
            return true;
        }catch(SQLException e){
            return false;
        }
	}
	
	public boolean updateMotoMotor(int id_moto, float motor_motoNovo) {
		try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("UPDATE Motos SET motor_moto ='"+motor_motoNovo+"' WHERE id_moto ="+id_moto);          
            System.out.println("Registro atualizado.");
            return true;
        }catch(SQLException e){
            return false;
        }
	}
	
	
	public boolean procurarCambioMoto(String tipo_cambio_moto) {
		try{
			Statement statement = this.conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Motos WHERE tipo_cambio_moto = "+tipo_cambio_moto);
            while (rs.next()) {
            	System.out.println("As motos com o tipo de câmbio pedido são: " + rs.getInt("id_moto"));
            }           
            return true;
        }catch(SQLException e){
            return false;
        }
	}
	
	public boolean procurarMotorMoto(float motor_moto) {		
		try{
            Statement statement = this.conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Motos WHERE motor_moto = "+motor_moto);
            while (rs.next()) {
            	System.out.println("As motos com o tipo de motor pedido são: " + rs.getInt("id_moto"));
            }           
            return true;
        }catch(SQLException e){
            return false;
        }
	}


}
