package fatec.poo.model;

/**
 * @author Willian Kenji
 */
public class Reserva {
    
    private int codigo;
    private String nomeHosp;
    private Data dataEntrada;
    private Data dataSaida;
    private Double valorHosped;
    private Hotel hotel;
    
    public Reserva(int codigo, String nomeHosp, Data dataEntrada) {
        this.codigo = codigo;
        this.nomeHosp = nomeHosp;
        this.dataEntrada = dataEntrada;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNomeHosp() {
        return nomeHosp;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public Data getDataSaida() {
        return dataSaida;
    }

    public double getValorHosped() {
        return valorHosped;
    }
    
    public double encerrarReserva(Data dataSaida){
        this.dataSaida = dataSaida;
        valorHosped = hotel.getValorDiaria() * dataSaida.subtrairDatas(dataEntrada);
        hotel.addValorHospedagem(valorHosped);
        return valorHosped;
    }
    
    public Hotel getHotel(){
        return hotel;
    }
    
    public void setHotel(Hotel hotel){
        this.hotel = hotel;
        hotel.addReserva(this);
    }
}
