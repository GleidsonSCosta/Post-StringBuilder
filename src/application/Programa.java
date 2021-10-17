package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import classes.Comentarios;
import classes.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios  c1 = new Comentarios("Heva a nice trip!");
		Comentarios c2 = new Comentarios("Wow that's awesome!");
		Comentarios c3 = new Comentarios("Good nigth");
		Comentarios c4 = new Comentarios("Have a nice day!");
		
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Viajando para Nova Zelandia",
				"Vou visitar esse pais maravilhoso" , 
				12);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Boa noite pessoal",
				"Vejo vcs amanhã!!",5);
		
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
