package model;

public abstract class User {
    private String name;
    private String cpf;
    private String email;
    private String type;

    public User(String name, String cpf, String email, String type) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.type = type;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Usuário [Nome: " + name + ", CPF: " + cpf + ", Email: " + email + ", Tipo: " + type + "]";
    }

    public abstract String getRole();
}


