package com.cja.Rec.Controllers;

import com.cja.Rec.Entities.ActUsr;
import com.cja.Rec.Services.ActUsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/getAll/")
@CrossOrigin
public class ActUsrController {
    @Autowired
    private ActUsrService actUsrService;

    @GetMapping("/actUsr/")
    @CrossOrigin(methods = RequestMethod.GET)
    public List<ActUsr> getAllActUsr() {
        return actUsrService.getAllActUsr();
    }

    @CrossOrigin(methods = RequestMethod.GET)
    @GetMapping("/actUsr/getAllByIp/")
    public ResponseEntity<List<ActUsr>> getActUsrByIp(@RequestParam(value = "ip") String ip) {
        return new ResponseEntity<List<ActUsr>>(actUsrService.findByIp(ip), HttpStatus.OK);
    }

    @CrossOrigin(methods = RequestMethod.GET)
    @GetMapping("/actUsr/getAllByNombrePc/")
    public ResponseEntity<List<ActUsr>> getActUsrByNombrePc(@RequestParam(value = "nombrePc") String nombrePc) {
        return new ResponseEntity<List<ActUsr>>(actUsrService.findByNombrePc(nombrePc), HttpStatus.OK);
    }

    @CrossOrigin(methods = RequestMethod.GET)
    @GetMapping("/actUsr/getAllByUsuario/")
    public ResponseEntity<List<ActUsr>> getActUsrByUsuario(@RequestParam(value = "usuario") String usuario) {
        return new ResponseEntity<List<ActUsr>>(actUsrService.findByUsuario(usuario), HttpStatus.OK);
    }

    @CrossOrigin(methods = RequestMethod.GET)
    @GetMapping("/actUsr/getAllBetweenFechas_hora/")
    public ResponseEntity<List<ActUsr>> listarAccionPorUnidadNegocio(@RequestParam(value = "fechaInicio") Timestamp fechaInicio, @RequestParam(value = "fechaFinal") Timestamp fechaFinal) {
        return new ResponseEntity<List<ActUsr>>(actUsrService.buscarPorRangoDeFechas(fechaInicio, fechaFinal), HttpStatus.OK);
    }
}