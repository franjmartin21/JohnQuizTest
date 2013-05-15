package com.johnandroid.quiz.services;

import java.util.List;

import android.test.AndroidTestCase;
import android.util.Log;

import com.johnandroid.quiz.domain.Pregunta;

public class JohnQuizServiceImplTest extends AndroidTestCase{
	
	private JohnQuizServiceImpl johnQuizServiceImpl;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		johnQuizServiceImpl = new JohnQuizServiceImpl(getContext());
	}
	

	public void testGetPreguntas(){
		List <Pregunta>preguntas = johnQuizServiceImpl.getPreguntas(2);
		assertEquals(2, preguntas.size());
		assertEquals(3, preguntas.get(0).getRespuestas().size());
	}
	/* Comentado ya que he hecho el metodo privado
	public void testRandomGenerator(){
		for(int i = 0; i < 100; i++){
			int numgen = johnQuizServiceImpl.getRandomId(10);
			assertTrue(numgen >= 0);
			assertTrue(numgen < 10);
		}
	}*/
}
