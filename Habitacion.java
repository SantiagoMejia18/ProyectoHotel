public class Habitacion {
    private String tipo;
    private int piso;
    private int idHabitacion;
    private boolean estado;

    public Habitacion(String tipo, int piso, int idHabitacion, boolean estado){
        this.tipo = tipo;
        this.piso = piso;
        this.idHabitacion = idHabitacion;
        this.estado = estado;
    }

    public String getTipo(){
        return this.tipo;
    }
    public int getPiso(){
        return this.piso;
    }
    public int getIdHabitacion(){
        return this.idHabitacion;
    }
    public boolean getEstado(){
        return this.estado;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setPiso(int piso){
        this.piso = piso;
    }
    public void setIdHabitacion(int idHabitacion){
        this.idHabitacion = idHabitacion;
    }
    public void setEstado(int idHabitacion){
        this.idHabitacion = idHabitacion;
    }
}
