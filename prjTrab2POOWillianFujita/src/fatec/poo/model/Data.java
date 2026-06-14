package fatec.poo.model;

/**
 * @author Willian Kenji
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    private Reserva reserva;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public String obterData(){
        return (dia + "/" + mes + "/" + ano);
    }
    
    public int calcDiasCorridos(){
        int[] qtdeDiasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDias = (int) ((((ano - 1) - 1900) * 365.25) + dia);
        
        for (int i=0; i<mes-1; i++){
            totalDias += qtdeDiasMes[i];
        }
        
        if(ano%4 == 0){
            totalDias += 1;
        }
        
        return totalDias;
    }
    
    public int subtrairDatas(Data d){
        return (calcDiasCorridos() - d.calcDiasCorridos());
    }
}
