var Person1 = /** @class */ (function () {
    function Person1() {
    }
    // constructor(){
    //     this.firstName="aaa";
    //     this.secondName="sss";
    // }
    Person1.prototype.getFullName = function () {
        return this.firstName + " " + this.secondName;
    };
    return Person1;
}());
var pOb;
pOb = new Person1();
console.log(pOb);
pOb.firstName = 'Himanshu';
pOb.secondName = 'Rai';
// pOb.technology='Java';
console.log(pOb);
console.log("Full Name : " + pOb.getFullName());
