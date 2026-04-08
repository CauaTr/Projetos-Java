package RevisãoComposição;

public class Telefone {
    private String telefonePessoal;
    private String telefoneComercial;

    public Telefone(String telefonePessoal, String telefoneComercial) {
        this.telefonePessoal = telefonePessoal;
        this.telefoneComercial = telefoneComercial;
    }

    public Telefone(){}


    public String getTelefonePessoal() {
        return telefonePessoal;
    }

    public void setTelefonePessoal(String telefonePessoal) {
        this.telefonePessoal = telefonePessoal;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }
}
