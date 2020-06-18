public class Funcionario {

    private int idFun;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    private String email;
    private String documento;

    public int getIdFunc() {
        return idFun;
    }

    public void setIdFunc(int idFunc) {
        this.idFun = idFun;
    }
}
