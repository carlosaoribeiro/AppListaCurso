package devandroid.maddo.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.maddo.applistacurso.model.Curso;

public class CursoController {

    private List lisaDetCursos;

    public List getListaDeCurso(){

        lisaDetCursos = new ArrayList<Curso>();

        lisaDetCursos.add(new Curso("Java"));
        lisaDetCursos.add(new Curso("HTML"));
        lisaDetCursos.add(new Curso("ANDROID"));
        lisaDetCursos.add(new Curso("C#"));
        lisaDetCursos.add(new Curso("COBOL"));
        lisaDetCursos.add(new Curso("BANCODADADOS"));
        lisaDetCursos.add(new Curso("Smitch"));
        lisaDetCursos.add(new Curso("Digitacao"));
        lisaDetCursos.add(new Curso("Academi"));
        lisaDetCursos.add(new Curso("Yoga"));
        lisaDetCursos.add(new Curso("Volei"));

        return lisaDetCursos;

    }

    public ArrayList<String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i <getListaDeCurso().size() ; i++) {

            Curso objeto = (Curso) getListaDeCurso().get(i);
            dados.add(objeto.getNomeDoCursoDesejado());
            
        }
        return dados;
    }
}
