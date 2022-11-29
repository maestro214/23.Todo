package com.example.todo.domain.todo

import com.example.todo.data.repository.ToDoRepository
import com.example.todo.domain.UseCase

internal class DeleteToDoItemUseCase(
    private val toDoRepository: ToDoRepository
): UseCase {

    suspend operator fun invoke(id: Long) {
        return toDoRepository.deleteToDoItem(id)
    }

}
