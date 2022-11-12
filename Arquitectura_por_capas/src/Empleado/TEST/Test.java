
package Empleado.TEST;

import Empleado.BO.EmpleadoBO;
import Empleado.ENTITY.Empleado;


public class Test {
    EmpleadoBO ebo = new EmpleadoBO();
    Empleado emp=  new Empleado();
    String mensaje = " ";
    
    public void insertar(){
        emp.setNombres("Leidy Rocio");
        emp.setApellidos("Rodriguez");
        emp.setCedula("24987365");
        emp.setEstadoCivil('c');
        emp.setGenero('F');
        emp.setEdad(27);
        
        mensaje = ebo.agregarEmpleado(emp);
        
        System.out.println(mensaje);
    }
    
    public void modificar(){
        emp.setIdEmpleado(1);
        emp.setNombres("Roger");
        emp.setApellidos("Sierra");
        emp.setCedula("51722305");
        emp.setEstadoCivil('S');
        emp.setGenero('M');
        emp.setEdad(24);
        
        mensaje = ebo.modificarEmpleado(emp);
        
        System.out.println(mensaje);
    }
    
    
        public void eliminar(){
            
        mensaje = ebo.eliminarEmpleado(2);
        
        System.out.println(mensaje);
    }
    
    
    
    public static void main (String[] args){
        Test test = new Test();
        
        //test.insertar();
        //test.modificar();
       // test.eliminar();
        
    }
}
