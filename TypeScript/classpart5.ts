class Person2{
    
    constructor(private firstName:string,private secondName:string){
        
    }
    getFirstName():string{
        return this.firstName;
    }
    setFirstName(firstName:string):void{
        this.firstName=firstName;
    }
    getSecondName():string{
        return this.secondName;
    }
    setSecondName(secondName:string){
        this.secondName=secondName;
    }
    getFullName(){
        return this.firstName+" "+this.secondName;
    }
}

var pOb:Person2;

pOb=new Person2("Krishna","Tej");
console.log(pOb);
pOb.setFirstName("Himanshu");
pOb.setSecondName("Rai");
// pOb.firstName='Himanshu';
// pOb.secondName='Rai';
// pOb.technology='Java';
console.log(pOb);
console.log("Full Name : "+pOb.getFullName());