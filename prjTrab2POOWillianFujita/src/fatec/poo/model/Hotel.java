package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Willian Kenji
 */
public class Hotel {
    
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private Double valorDiaria;
    private Double totalFaturamento;
    private ArrayList<Reserva> reservas;
    
    public Hotel(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        reservas = new ArrayList<Reserva>();
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }
    
    public void addValorHospedagem(double valorHosped){
        totalFaturamento += valorHosped;
    }
    
    public ArrayList<Reserva> getReservas(){
        return reservas;
    }
    
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }
}
