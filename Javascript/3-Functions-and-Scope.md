# Các function trong JS

## 1. Function Declarations (Hàm khai báo)
### Định nghĩa
Dùng từ khóa `function` để khai báo một hàm
### Cách hoạt động
Được định nghĩa bằng cách gán một tên hàm và một khối mã cho hàm đó
### Cú pháp
```js
function functionName(parameters) {
    // Code execution
}

// Example: Một hàm để tính tổng của hai số
function sum(a, b) {
    return a + b;
}

console.log(sum(5, 3)); // Output: 8
```
### Mục đích sử dụng
Được sử dụng để tạo ra một hàm có thể tái sử dụng
### Ưu và nhược điểm
1. Ưu điểm
- Dễ đọc, dễ sử dụng, dễ bảo trì
2. Nhược điểm
- Không thể gọi trước khi khai báo (Hoisting)

## 2. Function Expressions (Hàm biểu thức)
### Định nghĩa
Gán một hàm vào một biến hoặc một thuộc tính của một đối tượng
### Cách hoạt động
Tạo một biến và gán một hàm cho biến đó
### Cú pháp
```js
const functionName = function(parameters) {
    // Execution
}

// Example: Sử dụng một hàm expression để lọc một mảng các số chẵn
const filterEven = function(numbers) {
    return numbers.filter(num => num % 2 === 0);
};

console.log(filterEven([1, 2, 3, 4, 5, 6])); // Output: [2, 4, 6]
```
### Mục đích sử dụng
Được sử dụng khi cần truyền một hàm như một đối số hoặc gán cho một biến
### Ưu và nhược điểm
1. Ưu điểm
- Có thể gán cho các biến và đối số
- Có thể tạo hàm ẩn danh
2. Nhược điểm
- Không thể gọi trước khi được khai báo (Hoisting)
- Không thể tái sử dụng với `super` hoặc `this`

## 3. Arrow Function (Hàm mũi tên)
### Định nghĩa
Hàm ngắn gọn và thường được sử dụng trong các biểu thức hàm.
### Cách hoạt động
Sử dụng cú pháp rút gọn và tự động gắn `this` từ ngữ cảnh
### Cú pháp
```js
const functionName = (parameters) => {
    // Mã thực thi
};

// Example: Sử dụng hàm mũi tên để tính bình phương của một số
const square = num => num * num;

console.log(square(5)); // Output: 25
```
### Mục đích sử dụng
Thường dùng cho các biểu thức hàm ngắn
### Ưu và nhược điểm
1. Ưu điểm
- Cú pháp ngắn gọn
- không gắn `this` một cách tường mình
2. Nhược điểm
- Không thể sử dụng với `super`
- không có `arguments` object
- không thể tạo hàm ẩn danh

## 4. Generator Functions (Hàm tạo ra Generator)
### Định nghĩa
Tạo ra một iterator (Vòng lặp), cho phép code JS chạy không đồng bộ
### Cách hoạt động
Sửu dụng từ khóa `funtion*` và `yield` để tạo ra một `generator`
### Cú pháp
```js
function* functionName(parameter) {
    yield value;
}

// Example
```
### Mục đích sử dụng
- Được sử dụng để tạo ra một chuỗi các giá trị được tạo ra từ một hàm
### Ưu và nhược điểm
1. Ưu điểm
- Cho phép tạo ra các giá trị một cách lười biếng (lazy), tốt cho xử lý lớn
2. Nhược điểm
- Khó sử dụng
- Không phù hợp cho tất cả các tình huống

## 5. IIFE (Immediately invoked Function Expression)
### Định nghĩa
Hàm tức thì được gọi sau khi được định nghĩa
### Cách hoạt động
Khai báo và gọi hàm ngay lập tức
### Cú pháp
```js
(function () {
    // code
})();

// Example
```
### Mục đích sử dụng
Thường được sử dụng để tạo một phạm vi (scope) riêng tư cho các biến
### Ưu và nhược điểm
1. Ưu điểm
- Ngăn chặn việc truy cập vào biến từ bên ngoài
2. Nhược điểm
- Cú pháp không thân thiện cho người đọc

## 6. Async Function (Hàm bất đồng bộ)
### Định nghĩa
Hàm trả về một `promise` và sử dụng từ khóa `await` để đợi kết quả của một `promise`
### Cách hoạt động
Sử dụng từ khóa `async` trước khai báo hàm, và `await` trong hàm
### Cú pháp
```js
async function functionName(parameters) {
    await someAsyncOperation();
}

// Example: Sử dụng hàm async để gọi một API từ xa và xử lý kết quả.
async function fetchData() {
    try {
        const response = await fetch('https://api.example.com/data');
        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error('Error fetching data:', error);
    }
}

fetchData();
```
### Mục đích sử dụng
Xử lý các tác vụ bất đồng bộ một cách đồng bộ và dễ đọc.
### Ưu và nhược điểm
1. Ưu điểm
- Giúp tránh `callback hell`, mã dễ đọc hơn khi làm việc với các tác vụ bất đồng bộ
2. Nhược điểm
- Sử dụng không đúng có thể dẫn đến hiệu suất kém

## 7. Higher-Order Functions (Hàm cao cấp)
### Định nghĩa
Function mà nhận một hoặc nhiều hàm khác làm đối số hoặc trả về một hàm khác
### Cách hoạt động
có thể truyền vào một hàm khác hoặc trả về một hàm từ một hàm khác
### Cú pháp
```js
function higherOrderFunction(callback) {
    // Thực thi hàm callback
    callback();
}

// Example: Sử dụng hàm cao cấp để tính tổng các số trong một mảng
const sumArray = numbers => numbers.reduce((acc, curr) => acc + curr, 0);

const array = [1, 2, 3, 4, 5];
console.log(sumArray(array)); // Output: 15
```
### Mục đích sử dụng
Được sử dụng để tạo ra các hàm linh hoạt và tái sử dụng
### Ưu và nhược điểm
1. Ưu điểm
- Tăng tính linh hoạt và tái sử dụng mã
2. Nhược điểm
- Có thể gây hiểu nhầm khi không được sử dụng một cách cấn thận

## 8. Currying Function (Hàm Currying)
### Định nghĩa
Chia một hàm nhận nhiều đối số thành một chuỗi các hàm nhận một đối số
### Cách hoạt động
Trả về một hàm mới mỗi khi nhận một đối số
### Cú pháp
```js
function curriedFunction(a) {
    return function(b) {
        return a + b;
    }
}

// Example: Sử dụng hàm currying để tạo ra một hàm để tính tổng của hai số.
function curriedSum(a) {
    return function(b) {
        return a + b;
    };
}

const addFive = curriedSum(5);
console.log(addFive(3)); // Output: 8
```
### Mục đích sử dụng
Giúp chia nhỏ các hàm lớn thành các hàm nhỏ hơn và dễ quản lý hơn
### Ưu và nhược điểm
1. Ưu điểm
- Tạo ra code dễ đọc và dễ bảo trì
2. Nhược điểm
- Có thể làm tăng độ phức tạp của code

## 9. Partial Application Function (Hàm ứng dụng một phần)
### Định nghĩa
Tạo ra một phiên bản mới của một hàm bằng cách cung cấp một số đổi số
### Cách hoạt động
Tạo ra một hàm mới mà một số đối số đã được cung cấp trước
### Cú pháp
```js
function partial(func, ...args) {
    return function(...rest) {
        return func.apply(this, args.concat(rest));
    }
}

// Example: Sử dụng hàm ứng dụng một phần để tạo ra một hàm mới từ hàm gốc.
function greet(greeting, name) {
    return `${greeting}, ${name}!`;
}

const sayHello = partial(greet, 'Hello');
console.log(sayHello('John')); // Output: "Hello, John!"
```
### Mục đích sử dụng
Cho phép tái sử dụng hàm bằng cách cung cấp một số đối số trước
### Ưu và nhược điểm
1. Ưu điểm
- Giảm sự lặp lại trong code
2. Nhược điểm
- Có thể tăng độ phức tạp của mã

## 10. Memoization Function (Hàm nhớ)
### Định nghĩa
### Cách hoạt động
### Cú pháp
```js
// Sử dụng memoization để lưu trữ kết quả của hàm tính Fibonacci để tối ưu hóa hiệu suất.
function memoize(fn) {
    const cache = {};
    return function(...args) {
        const key = JSON.stringify(args);
        if (!cache[key]) {
            cache[key] = fn(...args);
        }
        return cache[key];
    };
}

const fibonacci = memoize(function(n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
});

console.log(fibonacci(10)); // Output: 55
```
### Mục đích sử dụng
### Ưu & nhược điểm


# Scope Function

## Global Scope (Phạm vi toàn cục)
### Định nghĩa
Phạm vi toàn cục là phạm vi mà các biến và hàm 
### Cách hoạt động
### Cú pháp
### Mục đích sử dụng
### Tối ưu hóa
### Clean
### Nên & Hạn chế
## Local Scope (Phạm vi cục bộ)

## Lexical Scope (Phạm vi từ vựng)

## Block Scope (Phạm vi khối)

## Module Scope (Phạm vi module)

## Function Scope (Phạm vi hàm)

## Dynamic Scope (Phạm vi động)
