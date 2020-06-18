public class Secretaria extends Funcionario{
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamal() {
        return remal;
    }

    public void setRamal(String ramal) {
        this.remal = ramal;
    }

    private String telefone;
    private String remal;
}
