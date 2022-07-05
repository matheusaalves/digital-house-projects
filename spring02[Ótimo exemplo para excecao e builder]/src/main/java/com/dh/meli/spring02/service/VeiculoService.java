package com.dh.meli.spring02.service;

import com.dh.meli.spring02.dto.VeiculoDto;
import com.dh.meli.spring02.model.Veiculo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface VeiculoService {
    VeiculoDto getVeiculo(String placa);
    List<VeiculoDto> getAllVeiculo();
    void saveVeiculo(@RequestBody Veiculo novoVeiculo);
}
