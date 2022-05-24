function demo(){
  let var1=10;
  console.log("var1 = "+var1);
  {
    let var2=20;
    console.log("var1 = "+var1);
    console.log("var2 = "+var2);
  }
  console.log("var2 outside block = "+var2);
}

demo();
