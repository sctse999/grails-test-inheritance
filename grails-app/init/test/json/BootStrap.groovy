package test.json

class BootStrap {

    def init = { servletContext ->
        Person person = new Person(name: 'person1').save();
        Employee employee = new Employee(name: "employee1", employeeNo: 'employeeNo1').save();

    }
    def destroy = {
    }
}
