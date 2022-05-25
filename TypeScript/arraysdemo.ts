var myarr:number[]=[];

myarr.push(10);
// myarr.push('Sujata');
myarr.push(20);
myarr.push(30);
myarr.push(40);
myarr.push(50);

for(var element of myarr){
    console.log(element);
}

for(var index in myarr){
    console.log("element at location "+index+" : "+myarr[index]);
}