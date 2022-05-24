var arr=[10,20,30,40,56,77,89];
arr[10]=99;
arr.forEach(function(item){
  console.log("Element : "+item);
})


arr.forEach(function(item,index,array){
  console.log("Element at location "+index+" : "+item);
})
