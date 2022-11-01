package todolist;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TodoTest{
  @Test public void testStartsWithEmptyTodo() {
    Todo todo = new Todo();
    assertTrue("The initialised Todo List has an empty list", todo.tasks.isEmpty());
  }

  @Test public void testAnotherWayEmptyList() {
    Todo todo = new Todo();
    ArrayList<String> expectedList = new ArrayList<String>();
    assertEquals("The initialised list is empty", expectedList, todo.getTasks());
  }

  @Test public void testAddTask() {
    Todo todo = new Todo();
    ArrayList<String> expectedList = new ArrayList<String>();
    expectedList.add("Buy milk");
    todo.addTask("Buy milk");
    assertEquals("getTasks show one added task", expectedList, todo.getTasks());
  }

  @Test public void testAddMultipleTasks() {
    Todo todo = new Todo();
    ArrayList<String> expectedList = new ArrayList<String>();
    expectedList.add("Buy milk");
    expectedList.add("Buy rice");
    expectedList.add("Pay Bill");

    todo.addTask("Buy milk");
    todo.addTask("Buy rice");
    todo.addTask("Pay Bill");
    assertEquals("getTasks show one added task", expectedList, todo.getTasks());
  }
}
