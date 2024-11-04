package LucaSodini.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "dipendenti")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Dipendente {
    @Id
    @GeneratedValue
    private UUID id;

    private String username;
    private String nome;
    private String cognome;
    private String email;
    private String avatarURL;

    public Dipendente(String username, String nome, String cognome, String email, String avatarURL) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.avatarURL = avatarURL;
    }
}
