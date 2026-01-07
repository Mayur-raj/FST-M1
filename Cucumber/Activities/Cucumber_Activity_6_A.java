import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;

public class TodoListDataSteps extends BaseClass {

    @Given("user is on the To-Do list page")
    public void navigateToTodoPage() {
        driver.navigate().to("https://training-support.net/webelements/todo-list");
        assertEquals("Selenium: To-Do List", driver.getTitle());
    }

    @When("user adds the following tasks")
    public void addTasksFromTable(DataTable taskTable) throws InterruptedException {
        List<String> taskItems = taskTable.asList();
        System.out.println(taskItems);

        for (String item : taskItems) {
            driver.findElement(By.id("todo-input")).sendKeys(item);
            driver.findElement(By.id("todo-add")).click();
            Thread.sleep(2000);
        }
    }

    @Then("they can see the task added to the list")
    public void confirmTasksAdded() {
        System.out.println("All tasks present");
    }
}
