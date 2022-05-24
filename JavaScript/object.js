var obj={
  fname:"Sujata",
  lname:"Batra",
  yearOfExp:22,
  prop1:true
}

console.log(typeof obj);
console.log(obj);

obj.gender='F';

console.log(typeof obj);
console.log(obj);

obj.address={houseNo:101,
            street:'Some Street',
            city:'Delhi',
            state:'Delhi',
            pincode:110001}

console.log(typeof obj);
console.log(obj);

delete obj.gender
console.log(typeof obj);
console.log(obj);