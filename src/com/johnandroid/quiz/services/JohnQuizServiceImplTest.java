package com.johnandroid.quiz.services;

import java.util.List;

import com.johnandroid.quiz.domain.Pregunta;

import android.test.AndroidTestCase;

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
}
