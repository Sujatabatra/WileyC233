class Person1{
    firstName:string;
    secondName:string;
    // constructor(){
    //     this.firstName="aaa";
    //     this.secondName="sss";
    // }
    getFullName(){
        return this.firstName+" "+this.secondName;
    }
}

var pOb:Person1;

pOb=new Person1();
console.log(pOb);
pOb.firstName='Himanshu';
pOb.secondName='Rai';
// pOb.technology='Java';
console.log(pOb);
console.log("Full Name : "+pOb.getFullName());