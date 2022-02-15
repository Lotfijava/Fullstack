package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/affichage")
	public String affichage(Model model) {

		String Nom = "Couche MVC";
		model.addAttribute("Nom", Nom);
		return "Home/affichage";

	}

	@RequestMapping("/calcul")
	public String calcul(Model model) {
		int A = 9;
		int B = 10;
		int Somme = A + B;
		model.addAttribute("Somme", Somme);
		return "Home/calcul";
	}

	@RequestMapping("/taille")
	public String Taille(Model model) {
		String nom = "Lotfi";
		int Taille = nom.length();
		model.addAttribute("Taille", Taille);
		model.addAttribute("nom", nom);
		return "Home/Taille";

	}

	@RequestMapping("/liste")
	public String Liste(Model model) {
		ArrayList<String> months = new ArrayList<>();
		months.add("Janvier");
		months.add("Février");
		months.add("Mars");
		months.add("Avril");
		months.add("Mai");
		months.add("Juin");
		months.add("Juillet");
		months.add("Aout");
		months.add("Séptembre");
		months.add("Octobre");
		months.add("Novembre");
		months.add("Décembre");
		
		int Nombre = months.size();
		model.addAttribute("months", months);
		model.addAttribute("Nombre", Nombre);
		return "Home/Liste";

	}

}
