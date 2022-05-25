var Person2 = /** @class */ (function () {
    function Person2(firstName, secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    Person2.prototype.getFirstName = function () {
        return this.firstName;
    };
    Person2.prototype.setFirstName = function (firstName) {
        this.firstName = firstName;
    };
    Person2.prototype.getSecondName = function () {
        return this.secondName;
    };
    Person2.prototype.setSecondName = function (secondName) {
        this.secondName = secondName;
    };
    Person2.prototype.getFullName = function () {
        return this.firstName + " " + this.secondName;
    };
    return Person2;
}());
var pOb;
pOb = new Person2("Krishna", "Tej");
console.log(pOb);
pOb.setFirstName("Himanshu");
pOb.setSecondName("Rai");
// pOb.firstName='Himanshu';
// pOb.secondName='Rai';
// pOb.technology='Java';
console.log(pOb);
console.log("Full Name : " + pOb.getFullName());
