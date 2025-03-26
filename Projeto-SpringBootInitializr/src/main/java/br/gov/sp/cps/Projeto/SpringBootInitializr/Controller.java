package br.gov.sp.cps.Projeto.SpringBootInitializr.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;.org.springframework.stre.Controller;

@Controller
@RequestMapping("/")

    @GetMapping
    public String index(){
    return "index";
    }
public class HomeController {

    @GetMapping("/saudacao/{nome}")
    public String saudacao(){
        model.addAtribute(atributtename"nome",nome);
        return "Saudacao";
    }
    //Simulação de recebimento de variaveis


    //Converter para numericos


    //Calcular IMC
    double nunImc=

    //transformar em String
    @GetMapping("/saudacao/{nome}")
    public String resultadoIMC(ModelMap model){
        model.addAtribute("imc",imc);
        return "imc";
    }


    @GetMapping("/home")
    public String home(ModelMap model){
        model.addAttribute("curso",("Desenvolvimento Multi Plataforma"));
        return "home";
    }
}
