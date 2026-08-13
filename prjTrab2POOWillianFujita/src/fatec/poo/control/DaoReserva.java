package fatec.poo.control;

import fatec.poo.model.Data;
import fatec.poo.model.Hotel;
import fatec.poo.model.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Willian Kenji
 */
public class DaoReserva {

    private Connection conn;
    private DaoHotel daoHotel;

    public DaoReserva(Connection conn) {
        this.conn = conn;
        this.daoHotel = new DaoHotel(conn);
    }

    public Reserva consultar(int codigo) {
        Reserva objReserva = null;

        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * FROM tblReserva WHERE Codigo_Res = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Data dataEntrada = converterData(rs.getString("DataEntrada_Res"));

                objReserva = new Reserva(rs.getInt("Codigo_Res"),
                                          rs.getString("NomeHosp_Res"),
                                          dataEntrada);

                Hotel objHotel = daoHotel.consultar(rs.getInt("Codigo_Hot"));
                if (objHotel != null) {
                    objReserva.setHotel(objHotel);
                }

                String dataSaidaStr = rs.getString("DataSaida_Res");
                if (dataSaidaStr != null) {
                    Data dataSaida = converterData(dataSaidaStr);
                    objReserva.carregarEncerramento(dataSaida, rs.getDouble("ValorHosped_Res"));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar Reserva: " + ex.toString());
        }
        return objReserva;
    }

    public void inserir(Reserva objReserva) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO tblReserva(Codigo_Res, NomeHosp_Res, " +
                                       "DataEntrada_Res, Codigo_Hot) VALUES(?,?,?,?)");

            ps.setInt(1, objReserva.getCodigo());
            ps.setString(2, objReserva.getNomeHosp());
            ps.setString(3, objReserva.getDataEntrada().obterData());
            ps.setInt(4, objReserva.getHotel().getCodigo());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir reserva: " + ex.toString());
        }
    }

    public void encerrar(Reserva objReserva) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblReserva SET DataSaida_Res = ?, " +
                                       "ValorHosped_Res = ? WHERE Codigo_Res = ?");

            ps.setString(1, objReserva.getDataSaida().obterData());
            ps.setDouble(2, objReserva.getValorHosped());
            ps.setInt(3, objReserva.getCodigo());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao encerrar reserva: " + ex.toString());
        }
    }
    
    private Data converterData(String dataStr) {
        String[] partes = dataStr.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
        return new Data(dia, mes, ano);
    }
}