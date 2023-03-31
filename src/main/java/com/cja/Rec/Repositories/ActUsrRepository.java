package com.cja.Rec.Repositories;

import com.cja.Rec.Entities.ActUsr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface ActUsrRepository extends JpaRepository<ActUsr, Long> {
    List<ActUsr> findByIp(String ip);

    List<ActUsr> findByNombrePc(String nombrePc);

    List<ActUsr> findByUsuario(String usuario);

    @Query(value = "SELECT * FROM act_usr WHERE fecha_hora BETWEEN ?1 AND ?2",
            nativeQuery = true)
    List<ActUsr> buscarPorRangoDeFechas(Timestamp fechaInicio, Timestamp fechaFin);
}
