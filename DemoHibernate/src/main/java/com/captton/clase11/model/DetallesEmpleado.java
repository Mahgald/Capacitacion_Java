package com.captton.clase11.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="DetallesEmpleado")
public class DetallesEmpleado
{
		@Id
		@Column(name="id")
		private long id;
		
		@Column(name="direccion")
		private String direccion;
		
		@Column(name="pais")
		private String pais;
		
		@Column(name="provincia")
		private String provincia;
		
		@OneToOne
		@PrimaryKeyJoinColumn
		private Empleado emple;
		
		public DetallesEmpleado(){}
		
		public long getId()
		{
			return id;
		}
		public void setId(long id)
		{
			this.id = id;
		}
		public String getDireccion()
		{
			return direccion;
		}
		public void setDireccion(String direccion)
		{
			this.direccion = direccion;
		}
		public String getPais()
		{
			return pais;
		}
		public void setPais(String pais)
		{
			this.pais = pais;
		}
		public String getProvincia()
		{
			return provincia;
		}
		public void setProvincia(String provincia)
		{
			this.provincia = provincia;
		}
		
		public Empleado getEmple()
		{
			return emple;
		}

		public void setEmple(Empleado emple)
		{
			this.emple = emple;
		}

}
