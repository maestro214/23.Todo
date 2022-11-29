package com.example.todo.domain.todo

import com.example.todo.data.entity.ToDoEntity
import com.example.todo.data.repository.ToDoRepository
import com.example.todo.domain.UseCase

internal class InsertToDoListUseCase(
    private val toDoRepository: ToDoRepository
): UseCase {

    suspend operator fun invoke(toDoList: List<ToDoEntity>) {
        return toDoRepository.insertToDoList(toDoList)
    }

}
