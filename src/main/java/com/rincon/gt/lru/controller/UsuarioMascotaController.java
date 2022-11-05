/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.lru.controller;

import com.rincon.gt.lru.common.CommonController;
import com.rincon.gt.lru.models.UsuarioMascotaModel;
import com.rincon.gt.lru.svc.UsuarioMascotaSvc;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author egarc
 */
@Api
@RestController
@RequestMapping("/usuario/mascota")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioMascotaController extends CommonController<UsuarioMascotaModel, UsuarioMascotaSvc>{
    
}
