package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Vendedor implements Serializable {

    private Integer id;
    private String nome;
    private String email;
    private Date dataNascimeto;
    private Double salarioBase;
    // variável de associação com a entidade Departamento
    private Departamento departamento;

    public Vendedor(){
    }

    public Vendedor(Integer id, String nome, String email, Date dataNascimeto, Double salarioBase, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimeto = dataNascimeto;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getDataNascimeto() {
        return dataNascimeto;
    }

    public void setDataNascimeto(Date dataNascimeto) {
        this.dataNascimeto = dataNascimeto;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartmento() {
        return departamento;
    }

    public void setDepartmento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vendedor vendedor = (Vendedor) o;
        return Objects.equals(id, vendedor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimeto=" + dataNascimeto +
                ", salarioBase=" + salarioBase +
                ", departmento=" + departamento +
                '}';
    }


}
