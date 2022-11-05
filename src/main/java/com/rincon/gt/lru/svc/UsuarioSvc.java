/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.lru.svc;

import com.rincon.gt.lru.common.CommonSvc;
import com.rincon.gt.lru.models.UsuarioModel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author egarc
 */
public interface UsuarioSvc extends CommonSvc<UsuarioModel>{
    public Optional<List<UsuarioModel>> obtenerUsuarioByContrasenia(String correoElectronico, String passwordUsuario) throws Exception;
}
