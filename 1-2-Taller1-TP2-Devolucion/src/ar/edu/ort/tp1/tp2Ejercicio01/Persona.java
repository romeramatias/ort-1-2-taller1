package ar.edu.ort.tp1.tp2Ejercicio01;

import java.util.ArrayList;

import ar.edu.ort.tp1.tp2Ejercicio02.Mascota;

public class Persona {
	private String apellido;
	private String nombre;
	private ArrayList<Email> listEmails;
	private ArrayList<NumeroTelefonico> listTelefonos;
	private ArrayList<Mascota> listMascotas;
	
	public Persona(String apellido, String nombre){
		this.apellido=apellido;
		this.nombre=nombre;
		listEmails= new ArrayList<Email>();
		listTelefonos= new ArrayList<NumeroTelefonico>();
		listMascotas=new ArrayList<Mascota>();
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void agregarEmail(String email){// composicion
		Email e= new Email(email);
		listEmails.add(e);         // listEmails.add(new Email(email)); 
	}
	public void agregarNumeroTelefonico(NumeroTelefonico numero){// agregacion
		listTelefonos.add(numero);
	}
	public void agregarMascota(Mascota mascota){// agregacion
		listMascotas.add(mascota);
	}
	public void mostrarTodo(){
		System.out.println(apellido+", "+nombre);
		if(listTelefonos.size()==0)
			System.out.println("sin Telefonos");
		else{
			System.out.println("Telefonos:");
			for(int i=0;i<listTelefonos.size();i++){
				NumeroTelefonico numero=listTelefonos.get(i);
				System.out.println(numero.gettipoLinea()+":"+numero.getNumero());// version larga
			}
		}
		if(listEmails.size()==0)
			System.out.println("sin Email");
		else{
			for(int i=0;i<listEmails.size();i++){
			System.out.println("email: "+listEmails.get(i).getDireccion());// version corta
			}
		}
	}
	public void mostrarTodoConMascota(){
		/*System.out.println(apellido+", "+nombre);
		if(listTelefonos.size()==0)
			System.out.println("sin Telefonos");
		else{
			System.out.println("Telefonos:");
			for(NumeroTelefonico num:listTelefonos){
				System.out.println(num.gettipoLinea()+":"+num.getNumero());// version re-corta
			}
		}
		if(listEmails.size()==0)
			System.out.println("sin Email");
		else{
			for(Email email:listEmails){
			System.out.println("email: "+email.getDireccion());// version re-corta
			}
		}*/
		mostrarTodo();
		if(listMascotas.size()==0)
			System.out.println("sin mascotas");
		else{
			System.out.println("Mascotas:");
			for(Mascota mascota:listMascotas){
			System.out.println(mascota.getNombre()+" "+mascota.getAnimal());// version re-corta
			}
		}
	}
}