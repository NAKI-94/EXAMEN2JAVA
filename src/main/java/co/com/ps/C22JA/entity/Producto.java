package co.com.ps.C22JA.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="productos")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;


}
