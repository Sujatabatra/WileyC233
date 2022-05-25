var Person = /** @class */ (function () {
    function Person() {
    }
    Person.prototype.getFullName = function () {
        return this.firstName + " " + this.secondName;
    };
    return Person;
}());
var pOb;
pOb = new Person();
pOb.firstName = 'Himanshu';
pOb.secondName = 'Rai';
console.log(pOb);
console.log("Full Name : " + pOb.getFullName());
