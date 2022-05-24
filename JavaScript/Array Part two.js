var arr=[10,20,30];
console.log(typeof arr);
for(index=0;index<arr.length;index++){
  console.log(arr[index]);
}

console.log(arr);

arr['first']=90;
console.log(arr);

console.log(arr['first']);
console.log(arr.first);

console.log(arr[0]);
//console.log(arr.0);
console.log("=====================")
arr[10]=300;
arr[-2]=90;
console.log(arr);
for(index=0;index<arr.length;index++){
  console.log(arr[index]);
}
