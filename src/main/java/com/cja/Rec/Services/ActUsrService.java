package com.cja.Rec.Services;

import com.cja.Rec.Entities.ActUsr;
import com.cja.Rec.Repositories.ActUsrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class ActUsrService{
    @Autowired
    private ActUsrRepository actUsrRepository;

    public List<ActUsr> getAllActUsr() {
        return actUsrRepository.findAll(Sort.by(Sort.Direction.DESC, "fechaHora"));
    }

    public List<ActUsr> findByIp(String ip) {
        return actUsrRepository.findByIp(ip);
    }

    public List<ActUsr> findByNombrePc(String nombrePc) {
        return actUsrRepository.findByNombrePc(nombrePc);
    }

    public List<ActUsr> findByUsuario(String usuario) {
        return actUsrRepository.findByUsuario(usuario);
    }

    public List<ActUsr> buscarPorRangoDeFechas(Timestamp fechaIncio, Timestamp fechaFinal) {
        return actUsrRepository.buscarPorRangoDeFechas(fechaIncio,fechaFinal);
    }


}
