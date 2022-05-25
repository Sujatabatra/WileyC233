class Person{
    firstName:string;
    lastName:string;
    greet():void{
        console.log("Hi");
    }
}

class Employee extends Person{
    greet(): void {
        console.log("hello");
    }
    greetLikeNormalPeople():void{
        super.greet();
    }
}

var emp:Person;
emp=new Employee();
emp.greet();
// emp.greetLikeNormalPeople();

emp=new Person();
emp.greet();

var empl:Employee;
empl=new Employee();
empl.greet();
empl.greetLikeNormalPeople();