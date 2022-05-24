function print(a,b,c){
  console.log("3 args");
  console.log("a : "+a);
  console.log("b : "+b);
  console.log("c : "+c);
}
function print(a,b,c,d,e,f){
  console.log("6 args");
  console.log("a : "+a);
  console.log("b : "+b);
  console.log("c : "+c);
  console.log("d : "+d);
  console.log("e : "+e);
	console.log("f : "+f);
}

function print(a,b){
  console.log("2 args");
  console.log("a : "+a);
  console.log("b : "+b);
  
}

function print(a){
  console.log("1 arg");
  console.log("a : "+a);
  
}

print(10,20,30);
print(10,20,30,44,55,66);
print();