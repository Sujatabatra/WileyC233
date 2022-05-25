var myarr = [];
myarr.push(10);
// myarr.push('Sujata');
myarr.push(20);
myarr.push(30);
myarr.push(40);
myarr.push(50);
for (var _i = 0, myarr_1 = myarr; _i < myarr_1.length; _i++) {
    var element = myarr_1[_i];
    console.log(element);
}
for (var index in myarr) {
    console.log("element at location " + index + " : " + myarr[index]);
}
