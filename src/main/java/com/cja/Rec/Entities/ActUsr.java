package com.cja.Rec.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActUsr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idact_usr",columnDefinition = "INT(11)")
    private Long id;

    @Column(name = "nombre_pc",columnDefinition = "VARCHAR(45)")
    private String nombrePc;

    @Column(name = "usuario",columnDefinition = "VARCHAR(45)")
    private String usuario;

    @Column(name = "ip",columnDefinition = "VARCHAR(45)")
    private String ip;

    @Column(name = "fecha_hora",columnDefinition = "DATETIME")
    private String fechaHora;

    @Column(name = "proceso_sistema",columnDefinition = "VARCHAR(1000)")
    private String procesoSistema;

    @Column(name = "inf_salida",columnDefinition = "VARCHAR(45)")
    private String infSalida;

    @Column(name = "inf_entrada",columnDefinition = "VARCHAR(45)")
    private String infEntrada;

    @Column(name = "ruta_imagenes",columnDefinition = "VARCHAR(1000)")
    private String rutaImagenes;
}
