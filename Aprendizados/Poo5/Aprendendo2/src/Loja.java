
    // Class Principal Loja

public class Loja {

    String local;
    String nome;
    String cnpj;
    String email;
    String Proprietario;
    int telephone;


    //Constructor

    public Loja(String local, String nome, String cnpj, String email, String Proprietario, int telefone) {
        this.local = local;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.Proprietario = Proprietario;
        this.telephone = telefone;
    }


    //Getters and Setters

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String proprietario) {
        Proprietario = proprietario;
    }


    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "\n - " + nome + "\n - Localidade " + local + "\n - Indentificacao " + cnpj + "\n - Gmail " + email + "\n - Dono " + Proprietario + "\n - Telefone da Loja " + telephone + "\n";


    }


}
