package com.zensar.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.zensar.training.bean.TodoBusinessImpl;
import com.zensar.training.bean.TodoServices;

public class TodoBusinessImplTest1 {

	
	@Test
	public void test() {
	TodoServices todoService=Mockito.mock(TodoServices.class);

	TodoBusinessImpl businessImpl=new TodoBusinessImpl(todoService);
	
	List<String> springRelatedTodos=businessImpl.retriveTodosRelatedToSpring("user1");
	assertEquals(2, springRelatedTodos.size());
	}
}