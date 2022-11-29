package com.example.todo.chapter01.di

import com.example.todo.chapter01.data.repository.ToDoRepository
import com.example.todo.chapter01.data.repository.TestToDoRepository
import com.example.todo.chapter01.domain.todo.*
import com.example.todo.chapter01.domain.todo.DeleteToDoItemUseCase
import com.example.todo.chapter01.domain.todo.GetToDoItemUseCase
import com.example.todo.chapter01.domain.todo.GetToDoListUseCase
import com.example.todo.chapter01.domain.todo.InsertToDoListUseCase
import com.example.todo.chapter01.domain.todo.InsertToDoUseCase
import com.example.todo.chapter01.domain.todo.UpdateToDoUseCase
import com.example.todo.chapter01.presentation.detail.DetailMode
import com.example.todo.chapter01.presentation.list.ListViewModel
import com.example.todo.chapter01.presentation.detail.DetailViewModel
import org.koin.dsl.module
import org.koin.android.viewmodel.dsl.viewModel

internal val appTestModule = module {

    factory { GetToDoListUseCase(get()) }
    factory { GetToDoItemUseCase(get()) }
    factory { InsertToDoListUseCase(get()) }
    factory { InsertToDoUseCase(get()) }
    factory { DeleteToDoItemUseCase(get()) }
    factory { DeleteAllToDoItemUseCase(get()) }
    factory { UpdateToDoUseCase(get()) }

    single<ToDoRepository> { TestToDoRepository() }

    viewModel { ListViewModel(get(), get(), get()) }
    viewModel { (detailMode: DetailMode, id: Long) -> DetailViewModel(detailMode, id, get(), get(), get(), get()) }

}
