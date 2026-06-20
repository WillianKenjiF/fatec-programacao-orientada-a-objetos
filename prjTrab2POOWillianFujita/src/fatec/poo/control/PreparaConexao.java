package fatec.poo.control;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 * @author Willian Kenji
 */
public class PreparaConexao {
    /*
    Classe responsável por abrir e fechar uma conexão JDBC(Java Database Connectivity) com o banco de dados Oracle.
    Ela encapsula os detalhes da conexão para que outras partes do sistema não precisem lidar diretamente com o
    código de acesso ao banco de dados.
    */
    
    private String connectionString;        // Armazena a string de conexão (URL JDBC)
    private String driver;                  // Armazena o driver JDBC
    private String usuario;
    private String senha;
    private Connection connection = null;   // Declara uma variável que armazenará um objeto Connection,
                                            // permitindo utilizar os métodos JDBC para operações no banco
    
    public PreparaConexao (String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public void setConnectionString (String connectionString){
        this.connectionString = connectionString;
    }
    
    public void setDriver (String driver){
        this.driver = driver;
    }
    
    // 
    public Connection abrirConexao(){
        if (connection == null){ // Verifique se ainda não existe uma conexão criada
            try{
                Class.forName(driver); // Carrega a classe do driver na memória
                connection = DriverManager.getConnection(connectionString, usuario, senha); // Abertura da conexão
                System.out.println("[Conexão OK]");
            }catch (Exception ex){
                System.out.println("Falha na Abertura da Conexao");
                System.out.println(ex.toString() + ex.getMessage());
            }
        }
        return connection;
    }
    
    public void fecharConexao(){
        try{
            connection.close(); // Fechamento da conexão
            System.out.println("[Conexao Encerrada]");
        }catch (Exception ex){
            System.out.println("Falha no Encerramento da Conexao");
            System.out.println(ex.toString() + ex.getMessage()); 
        }
    }
}