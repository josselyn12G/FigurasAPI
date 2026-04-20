package com.api.figuras.service;

import com.api.figuras.model.FiguraScript;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FiguraService {

    public List<FiguraScript> obtenerFiguras() {

        List<FiguraScript> lista = new ArrayList<>();

        lista.add(new FiguraScript(
                "Heptagono",
                """
                import com.figuras.app.Figura
                class Heptagono extends Figura {
                    int lado
                    Long perimetro(){ lado * 7 }
                    Long area(){ (long)(3.63 * lado * lado) }
                    void setDefaultParams(){ lado = 3 }
                }
                """
        ));

        lista.add(new FiguraScript(
                "Octagono",
                """
                import com.figuras.app.Figura
                class Octagono extends Figura {
                    int lado
                    Long perimetro(){ lado * 8 }
                    Long area(){ (long)(4.82 * lado * lado) }
                    void setDefaultParams(){ lado = 2 }
                }
                """
        ));

        return lista;
    }
}