package com.cjeongmin.nestedrecyclerviewwithviewbinding

object Constant {
    val todoList = arrayListOf<Todo>(
        Todo(title = "Hello", "10:00"),
        Todo(title = "World", "11:00"),
        Todo(title = "Android", "13:00"),
        Todo(title = "Recycle", "14:00"),
        Todo(title = "View", "15:00")
    )

    fun getTodoByLength(maxLength: Int): ArrayList<Todo> {
        val result = ArrayList<Todo>()
        for (todo in todoList) {
            if (todo.title.length == maxLength) {
                result.add(todo)
            }
        }
        return result
    }
}