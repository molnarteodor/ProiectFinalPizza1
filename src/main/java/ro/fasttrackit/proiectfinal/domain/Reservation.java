package ro.fasttrackit.proiectfinal.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private Integer id;
    private String nume;
    private String numarTelefon;

    public Reservation() {
        this.id = id;
        this.nume = nume;
        this.numarTelefon = numarTelefon;
    }

    public Reservation(String nume, String numarTelefon, Integer id) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(nume, that.nume) &&
                Objects.equals(numarTelefon, that.numarTelefon) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, numarTelefon, id);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "nume='" + nume + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", id=" + id +
                '}';
    }
}
