package br.edu.utfpr.dv.sireata.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.dv.sireata.dao.PautaDAO;
import br.edu.utfpr.dv.sireata.model.Pauta;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PautaController {

	private final PautaDAO pautaDAO;

	@GetMapping("/pautas/{idAta}")
	public List<Pauta> listarPorAta(@PathVariable int idAta) throws SQLException {

		return pautaDAO.listarPorAta(idAta);

	}

	@PostMapping("/pautas/salvar")
	public int salvar(Pauta pauta) throws SQLException {

		return pautaDAO.salvar(pauta);

	}
}
