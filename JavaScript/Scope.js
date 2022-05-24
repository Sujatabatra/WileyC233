function demo(){
  var1=10;
  console.log("var1 = "+var1);
  {
    var var2=20;
    console.log("var1 = "+var1);
    console.log("var2 = "+var2);
  }
  console.log("var2 outside block = "+var2);
}


//console.log("var2 outside method = "+var2);


demo();
console.log("var1 outside method = "+var1);