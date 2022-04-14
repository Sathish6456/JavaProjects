package com.zensar.training.bean;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {

	private TodoServices todoServices;

	public TodoBusinessImpl(TodoServices todoServices) {
		super();
		this.todoServices = todoServices;
	}
	
	public List<String> retriveTodosRelatedToSpring(String user) {
		List<String> filteredTodos=new ArrayList<String>();
		List<String> todos=this.todoServices.retriveTodos(user);
		for(String todo:todos) {
			if (todo.contains("Spring"))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}
}
