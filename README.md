## Exercise

### I created 3 classes: Employee, Developer, and Manager.

* Every employee has a name and an identifier.
* All 3 classes should have the method "calculate salary."
* The Developer class must have an attribute called "experience," which can be (junior, mid, senior), of type Enum.
* The salary for a Developer is the base salary (€800) times 1 for junior, times 2.51 for mid, and times 3.33 for senior.
* The Manager class must have an attribute called "projectNumber."
* The salary for a Manager is the project number times 0.33 times the base salary (€1100).
* I also created another class called HR. HR should have a method that takes an employee and is capable of calculating that employee's salary.
* There's a class named Company that I created as well. This class should be able to add and remove employees.
* This class should also have a method to export the salary of all employees. This method should print the salaries of all employees and return a list of strings with the name and salary of each employee. Be cautious, if the company accidentally registers the same employee twice, this method could be critical. Therefore, it needs to validate this and avoid displaying the salary of the same employee twice.
* Implement this method in two ways: one using streams and the other without.

* Create a Main class with a main method to execute the above exercise.
* Your main method should add at least 3 employees to the company.