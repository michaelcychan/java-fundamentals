package todolist;

import java.util.ArrayList;

public class Todo {
  ArrayList<String> tasks = new ArrayList<String>();
  public static void main(String[] args) {

  }

  public ArrayList<String> getTasks(){
    return tasks;
  }

  public void addTask(String newTask) {
    tasks.add(newTask);
  }

}
