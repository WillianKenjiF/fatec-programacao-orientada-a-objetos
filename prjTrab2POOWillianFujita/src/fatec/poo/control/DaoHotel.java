package fatec.poo.control;

import fatec.poo.model.Hotel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Willian Kenji
 */
public class DaoHotel {
    
    // Atributo Connection para guardar a conexão
    private Connection conn;
    
    public DaoHotel(Connection conn){
        this.conn = conn;
    }
    
    public Hotel consultar(int codigo){
        Hotel objHotel = null;
        
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement("SELECT * from tblHotel where Codigo_Hot = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // Criando um objeto com os dados do banco
                objHotel = new Hotel(rs.getInt("Codigo_Hot"),rs.getString("Nome_Hot"));
                objHotel.setEndereco(rs.getString("Endereco_Hot"));
                objHotel.setTelefone(rs.getString("Telefone_Hot"));
                objHotel.setValorDiaria(rs.getDouble("ValorDiaria_Hot"));
            }
        }
        catch (SQLException ex) {
            // Pegar algum erro do banco
            System.out.println("Erro ao consultar Hotel: " + ex.toString());
        }
        return objHotel;
    }
    
    public void inserir(Hotel objHotel){
        PreparedStatement ps = null;
        
        try{
            // Prepara a query SQL
            ps = conn.prepareStatement("INSERT INTO tblHotel(Codigo_Hot, " + 
                                       "Nome_Hot, Endereco_Hot, Telefone_Hot, " + 
                                       "ValorDiaria_Hot) VALUES(?,?,?,?,?)");
            
            // Vincula os dados do objeto aos parâmetros '?'
            ps.setInt(1, objHotel.getCodigo());
            ps.setString(2, objHotel.getNome());
            ps.setString(3, objHotel.getEndereco());
            ps.setString(4, objHotel.getTelefone());
            ps.setDouble(5, objHotel.getValorDiaria());
            
            // Executa o comando no banco
            ps.execute();
        } catch (SQLException ex){
            // Exibe mensagem de erro no console
            System.out.println("Erro ao inserir hotel: " + ex.toString());  
        }
    }
    
    public void alterar(Hotel objHotel){
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblHotel set Nome_Hot = ?, " +
                                       "Endereco_Hot = ?, " +
                                       "Telefone_Hot = ?, " +
                                       "ValorDiaria_Hot = ? " +
                                       "WHERE Codigo_Hot = ?");
            
            ps.setString(1, objHotel.getNome());
            ps.setString(2, objHotel.getEndereco());
            ps.setString(3, objHotel.getTelefone());
            ps.setDouble(4, objHotel.getValorDiaria());
            ps.setInt(5, objHotel.getCodigo());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println("Erro ao alterar dados do hotel: " + ex.toString());   
        }
    }
    
    public void excluir(Hotel objHotel){
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblHotel where Codigo_Hot = ?");
            
            ps.setInt(1, objHotel.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println("Erro ao excluir hotel: " + ex.toString());   
        }
    }
    
    public void atualizarFaturamento(int codigo, double valorReserva) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblHotel SET TotalFaturamento_Hot = ? " +
                                       "WHERE Codigo_Hot = ?");
            
            ps.setDouble(1, valorReserva);
            ps.setInt(2, codigo);
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao somar faturamento: " + ex.toString());
        }
    }
}
