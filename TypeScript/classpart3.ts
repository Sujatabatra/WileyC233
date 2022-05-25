class Person1{
    firstName:string;
    secondName:string;
    constructor(firstName:string,secondName:string){
        this.firstName=firstName;
        this.secondName=secondName;
    }
    getFullName(){
        return this.firstName+" "+this.secondName;
    }
}

var pOb:Person1;

pOb=new Person1("Krishna","Tej");
console.log(pOb);
pOb.firstName='Himanshu';
pOb.secondName='Rai';
// pOb.technology='Java';
console.log(pOb);
console.log("Full Name : "+pOb.getFullName());