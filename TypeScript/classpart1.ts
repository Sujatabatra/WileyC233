class Person{
    firstName:string;
    secondName:string;
    getFullName(){
        return this.firstName+" "+this.secondName;
    }
}

var pOb:Person;

pOb=new Person();

pOb.firstName='Himanshu';
pOb.secondName='Rai';
// pOb.technology='Java';
console.log(pOb);
console.log("Full Name : "+pOb.getFullName());