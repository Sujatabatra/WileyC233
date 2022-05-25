var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    function Person(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person.prototype.greet = function () {
        console.log("Hi");
    };
    return Person;
}());
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee(firstName, lastName, department) {
        var _this = _super.call(this, firstName, lastName) || this;
        _this.department = department;
        return _this;
    }
    Employee.prototype.greet = function () {
        console.log("hello");
    };
    Employee.prototype.greetLikeNormalPeople = function () {
        _super.prototype.greet.call(this);
    };
    return Employee;
}(Person));
var emp;
emp = new Employee("AAA", "LLLL", "Sales");
emp.greet();
// emp.greetLikeNormalPeople();
console.log("Employee : " + emp);
emp = new Person("aaa", "bbb");
emp.greet();
console.log("person : " + emp);
var empl;
empl = new Employee("AAAA", "DDDDD", "HR");
empl.greet();
empl.greetLikeNormalPeople();
console.log("empl : " + empl);
