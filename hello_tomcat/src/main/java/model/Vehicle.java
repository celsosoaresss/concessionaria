package model;

public class Vehicle {
    private int id;
    private String name;
    private int ano;
    private String marca;
    private String modelo;
    private double preco;
    private int quantidade;
    private String cor;
    private int quilometragem;
    private double capacidadeTanque;
    private String transmissao;

    public Vehicle(int id, String name, int ano, String marca, String modelo, double preco, int quantidade, String cor, int quilometragem, double capacidadeTanque, String transmissao) {
        this.id = id;
        this.name = name;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.capacidadeTanque = capacidadeTanque;
        this.transmissao = transmissao;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAno() { return ano; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    public String getCor() { return cor; }
    public int getQuilometragem() { return quilometragem; }
    public double getCapacidadeTanque() { return capacidadeTanque; }
    public String getTransmissao() { return transmissao; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAno(int ano) { this.ano = ano; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public void setCor(String cor) { this.cor = cor; }
    public void setQuilometragem(int quilometragem) { this.quilometragem = quilometragem; }
    public void setCapacidadeTanque(double capacidadeTanque) { this.capacidadeTanque = capacidadeTanque; }
    public void setTransmissao(String transmissao) { this.transmissao = transmissao; }
}
	