package com.cja.Rec.Entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity // Indica que esta clase es una entidad de la base de datos
@Getter // Genera automáticamente los getters para todas las propiedades
@Setter // Genera automáticamente los setters para todas las propiedades
@AllArgsConstructor // Genera automáticamente un constructor con todos los parámetros
@NoArgsConstructor // Genera automáticamente un constructor sin parámetros
@Data // Genera automáticamente los métodos toString, equals, hashCode, entre otros

public class ActUsr {
    @Id // Indica que esta propiedad es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que la clave primaria es generada automáticamente
    @Column(name = "idact_usr", columnDefinition = "INT(11)") // Especifica las propiedades de la columna idact_usr en la base de datos
    private Long id;

    @Column(name = "nombre_pc", columnDefinition = "VARCHAR(45)")
    private String nombrePc;

    @Column(name = "usuario", columnDefinition = "VARCHAR(45)")
    private String usuario;

    @Column(name = "ip", columnDefinition = "VARCHAR(45)")
    private String ip;

    @Column(name = "fecha_hora", columnDefinition = "DATETIME")
    private Timestamp fechaHora;

    @Column(name = "proceso_sistema", columnDefinition = "VARCHAR(1000)")
    private String procesoSistema;

    @Column(name = "inf_salida", columnDefinition = "VARCHAR(45)")
    private String infSalida;

    @Column(name = "inf_entrada", columnDefinition = "VARCHAR(45)")
    private String infEntrada;

    @Column(name = "ruta_imagenes", columnDefinition = "VARCHAR(1000)")
    private String rutaImagenes;
}