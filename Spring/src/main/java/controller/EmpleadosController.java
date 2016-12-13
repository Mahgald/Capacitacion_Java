package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import data.IDepartamentoDAO;
import model.Empleado;
import service.IEmpleadoService;

@Controller
@RequestMapping("Empleados")
public class EmpleadosController {

	@Autowired
	IEmpleadoService empleadoService;
	
	@Autowired
	IDepartamentoDAO departamentoDAO;

	@RequestMapping("/")
	public ModelAndView Lista(){
		List<Empleado> listaEmp = empleadoService.listEmpleado();
		return new ModelAndView("Empleados/Lista","listaEmpleados", listaEmp);
	}
	
	@RequestMapping("Detalles/{id}")
	public ModelAndView Detalles(@PathVariable("id")String id){
		Empleado e = null;
		try{
		 e = empleadoService.getEmpleado(Long.parseLong(id));
		}
		catch(org.hibernate.ObjectNotFoundException er){
			e = null;
		}
		return new ModelAndView("Empleados/Detalles","empleado", e);
	}
	
	@RequestMapping("Nuevo")
	public ModelAndView Nuevo(){
		//Nuevo MaV con View
		ModelAndView m = new ModelAndView("Empleados/Nuevo");
		//Agrego los modelos
		m.addObject("empleado", new Empleado());
		m.addObject("listaDptos", departamentoDAO.ListarDepartamentos());
		return m;
	}
	
	@RequestMapping(path="Nuevo", method=RequestMethod.POST)
	public String AltaUsuario(@ModelAttribute("empleado")Empleado e){
		empleadoService.addEmpleado(e);
		return "redirect:/Empleados/";
	}
}
