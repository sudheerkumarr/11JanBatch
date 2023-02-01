// single line comment
/*
    Multi
    line
    comments
*/

// Variable - let & const - JS- ECMA Script5 standard
// let & const 

// let - scope - local
let x = 10; 
console.log(x);

x = 100;
console.log(x);

x = "Hello";
console.log(x)

// Ctrl + Alt + N - runs JS code 

// const
const pi = 3.14;

console.log(pi);

// pi=5;  // TypeError: Assignment to constant variable.
console.log(pi);


//var - scope - global
var n1 = 20;
console.log(n1) ;// 20

n1 = 200;
console.log(n1) ;// 200

// string - '' , ""
n1 = 'Hello';
console.log(n1);// Hello

var n2 = "World";
console.log(n2) // World

for(let i=0; i<5; i++) {
    console.log(i); // 0-4
}
// console.log(i) ;// ERROR:  ReferenceError: i is not defined

for(var i=0; i<5; i++) {
    console.log(i); // 0-4
}
console.log(i) ; //5

// Operator - Arithmetic Operators, Logical Operators, Bitwise Operators, Assignment Operators
//            Comparision Operators, ternary Operator, typeof 

// Data Types
// 1. Number - 0
// 2. string - null
// 3. boolean - true/false
// 4. NaN 
// 5. Object - 

// typeof
console.log(typeof x);//  string
console.log(typeof 'Hello') ;// string
console.log(typeof "Hello") ;// string
console.log()
console.log(typeof 100);// number
console.log(typeof 100.00);//number
console.log()
console.log(typeof true);// boolean
console.log(typeof false);// boolean
console.log(typeof 10/0);// NaN

// Object - {}
// Array - []
// type - Object

// Object creation
const employee = {
    empId: 1001,
    empName: "Raj",
    age: 22,
    salary: 35000.00,
    contactNos: [9999911111, 9999922222, 9999933333, 9999944444],
    address: [
        {
            dNo: '123B',
            streetName: "T.Nagar",
            city: "Chennai",
            zip: 600001
        },
        {
            dNo: '143B',
            streetName: "J.P.Nagar",
            city: "Bengaluru",
            zip: 560001
        }
    ]
}


// typeof
console.log(typeof employee);//object
console.log(employee)

// Read object
// . or []
console.log(employee.empName);
console.log(employee.empId);
console.log(employee.contactNos) ;// [9999911111, 9999922222]
console.log(employee.contactNos[0]);//9999911111
console.log(employee.contactNos[1]);//9999922222

// for(let num:employee.contactNos) {

// }

console.log();
// Iterate
for(let i=0; i<employee.contactNos.length; i++) {
    console.log(employee.contactNos[i]);
}

// []
console.log();
console.log(employee.age) ;//22
console.log(employee["age"]);// 22

// access address of emp
console.log(employee.address);
console.log(employee.address[1].city);


// update
console.log()
console.log("Before update: "+ employee.age);
employee.age=23;
console.log("After update: "+employee.age)

// Add new number - push()
console.log();
console.log("push()")
console.log("Before update: "+ employee.contactNos);
employee.contactNos.push(9999955555);
console.log("After update: "+employee.contactNos);

// remove number - pop()
console.log();
console.log("pop()")
console.log("Before update: "+ employee.contactNos);
employee.contactNos.pop(); // remove last element from the array
console.log("After update: "+employee.contactNos);

// splice
console.log();
console.log("splice()")
console.log("Before remove: "+ employee.contactNos);
employee.contactNos.splice(1,1); // remove last element from the array
console.log("After remove: "+employee.contactNos);


// search - includes
console.log();
console.log("includes()")
console.log(employee.contactNos.includes(9999955555)); // false
console.log(employee.contactNos.includes(9999944444)); // true


// reverse
console.log();
console.log("reverse()")
console.log("Before reverse: "+ employee.contactNos);
employee.contactNos.reverse(); // remove last element from the array
console.log("After reverse: "+employee.contactNos);

// Note: can't reassign whole value
//employee = {}; // TypeError: Assignment to constant variable.


// concat, indexOf, lastIndexOf, findIndex, fill, flat, flatmap, find, join, sort, pop, push, splice, reverse
//
// Arrays
let colors1 = ["Red", "Orange", "Green"];
let colors2 = ["white", "black", "blue"];
console.log(colors1[0]);

// concat
console.log()
console.log("concat(): ")
let colors3 = colors1.concat(colors2);
console.log(colors3); //[ 'Red', 'Orange', 'Green', 'white', 'black', 'blue' ]

// functions
// function declaration
function add(num1, num2) {
    return num1+num2;
}

// function call
console.log(add(10, 20)); // 30
console.log(add(10)); // NaN

// function with default values
function mul(num1, num2=2) {
    return num1*num2;
}

console.log(mul(10)); //20
console.log(mul(10,10)); // 100

// var-arg function
function sub(num1, num2, ...nums) {
    let result = num1-num2;
    for(let i=0; i<nums.length; i++) {
        result-=nums[i];
    }
    return result;
}
 console.log(sub(100, 10)); // 90
 console.log(sub(100, 20, 10));// 70
 console.log(sub(100, 30, 20, 10)) ;// 40






 // Regex
 // test()

 // Quantifiers
 // .  - matches single character  - a-z, A-Z, 0-9, -_*@#...
 // x* - 0-more
 // x+ - 1 or more
 // x? - 0 or 1
 // x{n} - n- count - 
 //      - x{3} - xxx
 // x{n,} - n -min count
 // x{2,} - xx, xxxx, xxxxxx, xxxxxxx
 // x{n,m} - n - min count
//         - m - max count
 // x{2,5} - xx, xxx, xxxx, xxxxx - valid
 //        - xxxxxxx- invalid
 // [] - bracket
 // let contactNo = 99999111111;
 // let pattern = [0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9];  
 // let pattern = [0-9]{10};
 // let pattern = \d\d\d\d\d\d\d\d\d\d;
 // let pattern = \d{10}
 
 // let email = "user_1@gmail.com" - user_111@gmail.in"
 // let pattern = [a-z][a-z][a-z][a-z]_[0-9]{1,3}@[a-z]{5}\.[a-z]{2, 3}
 // let pattern = \w{4}_\d{1,3}@\w{5}\.\w{2,3}
 
// try below examples -
 // let toll = "1800 121 1234";
 // let ip = 10.10.1.100

 // let str = "mr."
 // let str = "mrs."


 // ^ - starts with 
 // $ - ends with
 // let str = "Hello0 World!"
 // let pattern = ^[a-zA-Z0-9]{6}\s[a-zA-Z0-9]{5}!$


 // [xyz] -  matches chars x, y & z
 // [^xyz] - matches chars other than x, y & z

 // Character classes
 //  \d - digit
 //  \D - non digit
 //  \w - word char
 //     - [a-zA-Z0-9_$]
 //  \W - Non word chars
 //  \s - space
 //  \S - non space
 //  \t - tab space
 //  \r - return
 //  \n - new line, \v, \f, [\b], \0, \cX, \xhh, \uhhhh, \u{hhhh}, x|y

// regex - search, match, test, exec

// test - return true/false
let str = "sdggg Hellod World! asagg"
let pattern = /[a-zA-Z0-9]{6}\s[a-zA-Z0-9]{5}!/
console.log(pattern.test(str)); // true 

// exec - pattern matching string
let ipAddr = "112.101.110.20";// - 0-255.0-255.0-255.0-255
let p2 = /[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}/;
let result = p2.exec(ipAddr);
let ip = result[0] ;// 112.101.110.20
console.log(result)


// search() - 0 - match found - exact match
//        - -1 - no match
console.log()
console.log(str.search(pattern));

// match() - return array
let m = str.match(pattern);
console.log(m);//
