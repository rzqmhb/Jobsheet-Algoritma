import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class DaftarFilm{
    List<Film> film = new Stack<>();

    public void push(Film films){
        film.add(films);
    }

    public void pop(){
        for(Iterator<Film> it = film.iterator(); it.hasNext();){
            Film films = it.next();
            if (!it.hasNext()) {
                System.out.println("Film{ID Film="+films.idFilm+", Judul Film="+films.judulFilm+", Tahun Tayang="+films.tahunTayang+", Director="+films.director+"}");
            }
        }
        film.remove(film.size()-1);
    }

    public void peek(){
        for(Iterator<Film> it = film.iterator(); it.hasNext();){
            Film films = it.next();
            if (!it.hasNext()) {
                System.out.println("Film{ID Film="+films.idFilm+", Judul Film="+films.judulFilm+", Tahun Tayang="+films.tahunTayang+", Director="+films.director+"}");
            }
        }
    }

    public void tampil(){
        film.stream().forEach(f -> {
            System.out.println("" + f.toString());
        });
    }
}