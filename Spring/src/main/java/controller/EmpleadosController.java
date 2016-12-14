package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import data.EmpleadoDetallesDAO;
import data.IDepartamentoDAO;
import model.Empleado;
import model.EmpleadoDetalles;
import service.EmpleadoService;
import service.IEmpleadoService;

@Controller
@RequestMapping("Empleados")
public class EmpleadosController {

	@Autowired
	IEmpleadoService empleadoService;
	
	@Autowired
	IDepartamentoDAO departamentoDAO;
	
	@Autowired
	EmpleadoDetallesDAO	empleadodetallesDAO;

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
	
	@RequestMapping("Eliminar/{id}")
	public String Eliminar(@PathVariable("id")String id){
		try{
			empleadoService.removeEmpleado(Long.parseLong(id));
				
			}
			catch(org.hibernate.ObjectNotFoundException er){
				
			}
		return "redirect:/Empleados/";
	}
	
	@RequestMapping("NuevoDetalle/{id}")
	public ModelAndView NuevoDetalle(@PathVariable("id")String id){
			ModelAndView m = new ModelAndView("Empleados/NuevoDetalle");
			EmpleadoDetalles det =new EmpleadoDetalles();
			det.setId(Long.parseLong(id));
			m.addObject("detalle",det);
		return m;
	}
	
	@RequestMapping("Modificar/{id}")
	public ModelAndView ModificarVista(@PathVariable("id")String id){
			ModelAndView m = new ModelAndView("Empleados/Modificar");
			Empleado empleado = empleadoService.getEmpleado(Long.parseLong(id));
			m.addObject("detalle",empleado);
		return m;
	}
	
	@RequestMapping(path="NuevoDetalle",method=RequestMethod.POST)
	public String AltaDetalle(@ModelAttribute("detalle")EmpleadoDetalles detalle){
			try{
				Empleado e = empleadoService.getEmpleado(detalle.getId());
				detalle.setEmple(e);
				e.setDetalle(detalle);
				empleadodetallesDAO.addEmpleado(detalle);
				empleadoService.updateEmpleado(e);
			}catch(org.hibernate.ObjectNotFoundException er){
				
			}	
			
		return "redirect:/Empleados/";
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
