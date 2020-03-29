package br.com.meuprojeto.forum.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.meuprojeto.forum.controller.dto.TopicoDto;
import br.com.meuprojeto.forum.model.Topico;
import br.com.meuprojeto.forum.repository.TopicoRepository;

@RestController
public class TopicosController {

	@Autowired
	private TopicoRepository topicoRepository;

	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {

		List<Topico> topicos = topicoRepository.findAll();

		return TopicoDto.converter(topicos);

	}
}
