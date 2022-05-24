var obj={
  prop1:'SomeValue',
  '1property':'AnyValue',
  'number':'OneMoreValue',
  propertyName:'xyz'
}
console.log(typeof obj);

console.log(obj);

console.log("prop 1 : "+obj.prop1);
console.log("prop 1 : "+obj['prop1']);

console.log("1property : "+obj['1property']);
console.log("number : "+obj.number);
var prop="propertyName";
console.log("obj.prop : "+obj.prop);
console.log("obj.prop : "+obj[prop]);

