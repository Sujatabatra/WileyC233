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
}

var emp:Person;
emp=new Employee();
emp.greet();

emp=new Person();
emp.greet();