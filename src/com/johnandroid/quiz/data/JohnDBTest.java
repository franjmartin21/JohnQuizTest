package com.johnandroid.quiz.data;

import java.util.List;

import android.test.AndroidTestCase;

import com.johnandroid.quiz.domain.Pregunta;
import com.johnandroid.quiz.domain.Respuesta;

public class JohnDBTest extends AndroidTestCase{
	
	private JohnDB johnDB;
	

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		johnDB = new JohnDB(getContext());
	}
	
	private Pregunta initPregunta(){
		Pregunta pregunta = new Pregunta();
		pregunta.setId(1);
		pregunta.setTextoPregunta("¿Que equipo se proclamo vencedor de liga en la temporada 2012/2013?");
		Respuesta respuesta = new Respuesta();
		respuesta.setId(11);
		respuesta.setTextoRespuesta("At. Madrid");
		respuesta.setCorrecta(false);
		pregunta.addRespuesta(respuesta);
		respuesta = new Respuesta();
		respuesta.setId(12);
		respuesta.setTextoRespuesta("Barça");
		respuesta.setCorrecta(true);
		pregunta.addRespuesta(respuesta);
		respuesta = new Respuesta();
		respuesta.setId(13);
		respuesta.setTextoRespuesta("Real Madrid");
		respuesta.setCorrecta(false);
		pregunta.addRespuesta(respuesta);
		return pregunta;
	}
	
	public void testCargaPreguntas(){
		Pregunta pregunta=initPregunta();
		List <Pregunta>preguntas = johnDB.getPreguntas();
		assertEquals(3, preguntas.size());
		assertEquals(3, preguntas.get(0).getRespuestas().size());
		assertEquals(pregunta, johnDB.getPreguntas().get(0));
	}
	
	
}
