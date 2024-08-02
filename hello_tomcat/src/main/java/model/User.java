package model;

public class User {
    private int id;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private String type;

    public User(int id, String name, String cpf, String email) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public User(int id, String name, String cpf, String email, String password, String type) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getType() { return type; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Usuário [ID: " + id + ", Nome: " + name + ", CPF: " + cpf + ", Email: " + email + ", Tipo: " + type + "]";
    }

}
