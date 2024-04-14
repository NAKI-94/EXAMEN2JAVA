package co.com.ps.C22JA.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Table(name ="usuarios")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
}
