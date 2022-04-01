public class Persona {
   private String nombre;
   private String poblacion;
   private int edad;

   public Persona(String nombre,int edad){
      this.nombre = nombre;
      this.edad = edad;	
      this.poblacion = poblacion;
   }
	
   public Persona() {
      this.nombre=null;	  
   }
	 
   public void setNombre(String nom){
      nombre = nom;
   }

   public void setEdad(int ed){
      edad = ed;
   }

   public String getNombre(){
      return nombre;
   }
   
   public int getEdad(){
      return edad;
   }
   
   public void setPoblacion(String poblacion){
   poblacion = poblacion;
   }
   public String getPoblacion(){
   return poblacion;
   }

}//fin Persona
