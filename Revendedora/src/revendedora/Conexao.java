package revendedora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/revendedora";
    Connection connection = null;
    Statement statement = null;
    
    public Conexao() throws SQLException{
        try{
            //carregar classes do banco de dados
            Class.forName(JDBC_DRIVER);
            //Estabelece conexão com o BD
            connection = DriverManager.getConnection(DATABASE_URL, "root", "");
            //Cruar a statement para consultar o BD
            statement = connection.createStatement();
        }
        catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
        catch(ClassNotFoundException classNotFound){
           classNotFound.printStackTrace();
        }
    }
    public void inserir(String Texto) throws SQLException{
        statement.executeUpdate(Texto);
    }
    public void alterar(String Texto) throws SQLException{
        statement.executeUpdate(Texto);
    }
    public ResultSet consultar(String Texto) throws SQLException{
        ResultSet rs = null;
        rs = statement.executeQuery(Texto);
        return rs;
    }
    public void sair() throws SQLException{
        statement.close();
        connection.close();
    }

    void buscar(String Comando) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
