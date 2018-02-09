class Alumno
{
    private String nombreCompleto;
    private int notaLengua;
    private int notaMatematicas;
    private int notaIngles;
    private double notaMedia;
    public Alumno(String nombreCompleto, int notaLengua, int notaMatematicas, int notaIngles) 
    {
        this.nombreCompleto = nombreCompleto;
        this.notaLengua = notaLengua;
        this.notaMatematicas = notaMatematicas;
        this.notaIngles = notaIngles;
        notaMedia = calcularMedia();
    }
    
    public double calcularMedia(){
        notaMedia = 0;
        if(comprobarTodoAprobados()){
            notaMedia = (notaLengua + notaMatematicas + notaIngles/3);
        }
        return notaMedia;
    }
    
    public boolean comprobarTodoAprobados(){
        boolean todoAprobado = false;
        if(notaLengua >=5 && notaMatematicas >= 5 && notaIngles >=5 ){
            todoAprobado = true;
        }
        return todoAprobado;
    }
    
    public double getNotaMedia(){
        return notaMedia;
    }
    
}