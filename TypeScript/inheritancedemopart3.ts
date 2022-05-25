class Person{

    constructor(private firstName:string,private lastName:string){

    }
    greet():void{
        console.log("Hi");
    }
}

class Employee extends Person{

    constructor(firstName:string,lastName:string,private department:string){
        super(firstName,lastName);
    }
    greet(): void {
        console.log("hello");
    }
    greetLikeNormalPeople():void{
        super.greet();
    }
}

var emp:Person;
emp=new Employee("AAA","LLLL","Sales");
emp.greet();
// emp.greetLikeNormalPeople();
console.log("Employee : "+emp);

emp=new Person("aaa","bbb");
emp.greet();
console.log("person : "+emp);

var empl:Employee;
empl=new Employee("AAAA","DDDDD","HR");
empl.greet();
empl.greetLikeNormalPeople();
console.log("empl : "+empl);