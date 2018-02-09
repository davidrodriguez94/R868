import java.util.ArrayList;

public class EjercicioR868
{
    public ArrayList<Alumno> obtenerAlumnosOrdenadorPorNotaMedia(ArrayList<Alumno> alumnosGrupo1, ArrayList<Alumno> alumnosGrupo2) 
    {     
        ArrayList<Alumno> alumnosOrdenadosPorNotaMedia = new ArrayList<>();
        if(alumnosGrupo1.size() > 0 && alumnosGrupo2.size() > 0){
            for(int i=0; i < alumnosGrupo1.size(); i++){
                Alumno notaActual = alumnosGrupo1.get(i);
                if( notaActual.getNotaMedia()> 0){
                    alumnosOrdenadosPorNotaMedia.add(alumnosGrupo1.get(i));
                }
            }
            for(int i=0; i < alumnosGrupo2.size(); i++){
                Alumno notaActual = alumnosGrupo2.get(i);
                if( notaActual.getNotaMedia()> 0){
                    alumnosOrdenadosPorNotaMedia.add(alumnosGrupo2.get(i));
                }
            }
            int posicionLenta = 0;
            while(alumnosOrdenadosPorNotaMedia.size() > 0){
                int posicionRapida = 0;
                int notaMediaMasAlta = 0;
                for(int i= 0; i++ < alumnosOrdenadosPorNotaMedia.size(); i++){
                    int notaMediaActual = 0;
                    if(notaMediaActual >= notaMediaMasAlta){
                        notaMediaMasAlta = notaMediaActual;
                    }
                }
                alumnosOrdenadosPorNotaMedia.add(alumnosOrdenadosPorNotaMedia.get(notaMediaActual));
                alumnosOrdenadosPorNotaMedia.remove(notaMediaMasAlta);
            }
        }
        return alumnosOrdenadosPorNotaMedia;
    }
}