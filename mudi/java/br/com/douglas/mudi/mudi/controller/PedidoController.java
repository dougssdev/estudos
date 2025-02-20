package br.com.douglas.mudi.mudi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.douglas.mudi.mudi.dto.RequisicaoPedido;
import br.com.douglas.mudi.mudi.model.Pedido;
import br.com.douglas.mudi.mudi.repository.PedidoRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pr;
	
	@GetMapping("formulario")
	public String formulario(RequisicaoPedido req) {
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoPedido req, BindingResult result) {
		if(result.hasErrors()) {
			return "pedido/formulario";
		}
		
		Pedido pedido = req.toPedido();
		pr.save(pedido);
		
		return "redirect:/home";
	}
}
