package com.example.todo.domain.todo

import com.example.todo.data.repository.ToDoRepository
import com.example.todo.domain.UseCase

internal class DeleteAllToDoItemUseCase(
    private val toDoRepository: ToDoRepository
): UseCase {

    suspend operator fun invoke() {
        return toDoRepository.deleteAll()
    }

}
