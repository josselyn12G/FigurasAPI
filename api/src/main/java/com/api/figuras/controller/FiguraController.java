package com.api.figuras.controller;

import com.api.figuras.model.FiguraScript;
import com.api.figuras.service.FiguraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/figuras")
@CrossOrigin
public class FiguraController {

    private final FiguraService service;

    public FiguraController(FiguraService service) {
        this.service = service;
    }

    // SOLO GET
    @GetMapping
    public List<FiguraScript> obtenerFiguras() {
        return service.obtenerFiguras();
    }

}