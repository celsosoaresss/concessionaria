package model;

public class Venda {
    private int id;
    private int idVendedor;
    private int idComprador;
    private int idCarro;
    private String carroNome;
    private int ano;
    private String marca;
    private String modelo;
    private double preco;
    private String vendedorNome;
    private String compradorNome;

    // Construtor completo
    public Venda(int id, int idVendedor, int idComprador, int idCarro, String carroNome, int ano, String marca, String modelo, double preco, String vendedorNome, String compradorNome) {
        this.id = id;
        this.idVendedor = idVendedor;
        this.idComprador = idComprador;
        this.idCarro = idCarro;
        this.carroNome = carroNome;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.vendedorNome = vendedorNome;
        this.compradorNome = compradorNome;
    }

    // Construtor com apenas IDs
    public Venda(int idVendedor, int idComprador, int idCarro) {
        this.idVendedor = idVendedor;
        this.idComprador = idComprador;
        this.idCarro = idCarro;
    }

    public int getId() {
        return id;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public String getCarroNome() {
        return carroNome;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public String getVendedorNome() {
        return vendedorNome;
    }

    public String getCompradorNome() {
        return compradorNome;
    }
}