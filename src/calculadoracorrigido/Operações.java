package calculadoracorrigido;
/***
 **    Classe para preencher o campo ComboBox das operações
 **    e
 **    Dizer se uma operação é binária ou não
***/
public class Operações {
    
    private String operações;
    private boolean binario;
    
    public Operações(String operações,boolean binario) {
        this.operações = operações;
        this.binario= binario;
    }
    
    public boolean getBinario() {
        return binario;
    }
    
    public void setBinario(boolean binario) {
        this.binario = binario;
    }
    
    public String getOperações() {
        return operações;
    }
    
    public void setOperações(String operações) {
        this.operações = operações;
    }
    
    // Aqui retorna a o nome da operação selecionada para o ComboBox, através do ToString
    @Override
    public String toString() {
        return operações;
    }
}