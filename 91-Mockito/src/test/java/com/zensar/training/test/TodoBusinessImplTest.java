package com.zensar.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import com.zensar.training.bean.TodoBusinessImpl;
import com.zensar.training.bean.TodoServiceStub;
import com.zensar.training.bean.TodoServices;

public class TodoBusinessImplTest {

	@Test
	
	public void test() {
		TodoServices todoService=new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(todoService);
		List<String> springrelatedTodos=todoBusinessImpl.retriveTodosRelatedToSpring("user1");
		assertEquals(2,springrelatedTodos.size());
		List<String> springRelatedTodos1=todoBusinessImpl.retriveTodosRelatedToSpring("user2");
		assertEquals(0, springRelatedTodos1.size());
	}
	
}
