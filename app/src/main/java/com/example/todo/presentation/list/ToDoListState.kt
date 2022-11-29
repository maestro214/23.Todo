package com.example.todo.presentation.list

import com.example.todo.data.entity.ToDoEntity

sealed class ToDoListState {

    object UnInitialized: ToDoListState()

    object Loading: ToDoListState()

    data class Suceess(
        val toDoList: List<ToDoEntity>
    ): ToDoListState()

    object Error: ToDoListState()

}
