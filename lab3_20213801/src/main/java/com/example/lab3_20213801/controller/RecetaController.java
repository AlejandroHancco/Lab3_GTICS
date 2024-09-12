package com.example.lab3_20213801.controller;

import com.example.lab3_20213801.entity.Categoria;
import com.example.lab3_20213801.entity.Receta;
import com.example.lab3_20213801.entity.RecetaIngrediente;
import com.example.lab3_20213801.repository.CategoriaRepo;
import com.example.lab3_20213801.repository.IngredientesRepo;
import com.example.lab3_20213801.repository.RecetaRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/receta")
public class RecetaController {

    final RecetaRepo recetaRepository;
    final CategoriaRepo CategoriaRepository;
   // final IngredientesRepo IngredientesRepository;

    public RecetaController(CategoriaRepo CategoriaRepository, RecetaRepo recetaRepository) {
        this.CategoriaRepository = CategoriaRepository;
        this.recetaRepository = recetaRepository;

    }


    @GetMapping("/list")
    public String listaReceta(Model model) {
        List<Receta> listaReceta = recetaRepository.findAll();
        model.addAttribute("listaReceta", listaReceta);
        return "listarReceta";
    }

    @GetMapping("/info/{id}")
    public String informReceta(Model model, @PathVariable int id) {
        List<Categoria> listaCategoria = CategoriaRepository.findAll();

        model.addAttribute("listaCategoria", listaCategoria);
        Optional<Receta> recetaOptional = recetaRepository.findById(id);
        if(recetaOptional.isPresent()) {
            Receta receta = recetaOptional.get();
            model.addAttribute("receta", receta);
            return "infoReceta";
        }else{
            return "redirect:/receta/list";
        }
    }
    @GetMapping("/edit/{id}")
    public String editReceta(Model model, @PathVariable int id) {
        List<Categoria> listaCategoria = CategoriaRepository.findAll();

        model.addAttribute("listaCategoria", listaCategoria);
        Optional<Receta> recetaOptional = recetaRepository.findById(id);
        if(recetaOptional.isPresent()) {
            Receta receta = recetaOptional.get();
            model.addAttribute("receta", receta);
            return "editarReceta";
        }else{
            return "redirect:/receta/list";
        }
    }

    @GetMapping("/ingredientes/{id}")
    public String ingredientesReceta(Model model, @PathVariable int id) {
       // List<RecetaIngrediente> listaIngredientes = IngredientesRepository.findbyIdReceta(id);

       // model.addAttribute("listaIngredientes", listaIngredientes);
        Optional<Receta> recetaOptional = recetaRepository.findById(id);
        if(recetaOptional.isPresent()) {
            Receta receta = recetaOptional.get();
            model.addAttribute("receta", receta);
            return "editarReceta";
        }else{
            return "redirect:/receta/list";
        }
    }


    @GetMapping("/delete/{id}")
    public String borrarReceta(Model model, @PathVariable int id, RedirectAttributes redirectAttributes) {
        try {
            recetaRepository.deleteById(id);
            redirectAttributes.addFlashAttribute("msg", "Se borró la receta");
            redirectAttributes.addFlashAttribute("alert", "alert-success");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("msg", "No se pudo borrar la receta");
            redirectAttributes.addFlashAttribute("alert", "alert-danger");
        }
        return "redirect:/receta/list";
    }
    @PostMapping("/save")
    public String saveReceta(Receta receta) {
        recetaRepository.save(receta);
            return "redirect:/receta/list";

    }





}
