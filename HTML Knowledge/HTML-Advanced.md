# Weekly 02 - HTML Attributes

# HTML Inline & Block

## HTML Inline

### Định nghĩa
`Inline` trong HTML được sử dụng để định dạng một phần của nội dung trong một dòng.

### Cách hoạt động
`Inline` trong HTML hoạt động bằng cách duy trì sự liên tục đối với văn bản xung quanh để hiển thị trên một dòng. Khi thử dụng thẻ `Inline` nội dung của nó sẽ hiển thị cùng dòng với các nội dung khác, thay vì tách ra thành nhiều dòng như các `Element Block`
### Cú pháp
Các thẻ thường có định dạng Inline bao gồm:
```html
<span>Link</span>
<a href="google.com">Link</a>
<strong>Nội dung</strong>
<em></em>
<img src="" alt="">
```
### Mục đích sử dụng
- Nhấn mạnh một phần của văn bản hoặc áp dụng Style cụ thể mà không làm ảnh hưởng đến việc xuống hàng
- Tạo liên kêt trong một đoạn văn bản nhưng muốn chèn thêm liên kết giữa đoạn văn bản đó
- Chèn hình ảnh vào giữa dòng văn bản

## HTML Block
### Định nghĩa
`Block Element` đề cập đến các Element trong HTML sử dụng để tạo ra các khối có nội dung riêng biệt, Luôn bắt đầu bằng một dòng mới và chiếm toàn bộ chiều rộng có sẳn của phần tử chứa nó, Block thường sẽ tạo ra ngắt dòng trước và sau `Tag Block`
### Cách hoạt động
Block thường tạo ra các khối riêng biệt trên trang web. Bắt đầu trên một dòng mới và kéo dài hết chiều rộng của phần tử chứa nó. Nội dung sẽ có một khối rõ ràng và dễ quản lý
### Cu pháp
```html
<div>
    <p>Nội dung của Block</p>
</div>
```
### Mục đích sử dụng
- Tổ chức nội dung: Giúp sắp xếp các nội dung thành các khối rõ ràng, dễ quản lý
- Tạo bố cục trang: Xây dựng cấu trúc web bằng cách sử dụng các phần tử Block mới như Semantic HTML
- Áp dụng CSS: Dễ dàng áp dụng CSS để kiểm soát bố cục, khoảng cách và Style của khối chứa nội dung
## Điểm khác biệt giữa Inline & Block
### Bố cục
- `inline`: Hiển thị trên một dòng, không tạo ngắt dòng
- `block`: Bắt đầu trên một dòng mới, chiếm toàn bộ chiều rộng của phần tử chứa nó
### height & width
- `inline`: `không thể` đặt height & width
- `block`: `Có thể` thiết lập height & width

### Khoảng cách(margin & padding)
- `inline`: `Margin & Padding` chỉ ảnh hưởng đến phần tử trái phải, không ảnh hưởng đến phần tử trên dưới
- `block`: `Margin & Padding`: ảnh hưởng đến tất cả các phía

## Inline-Block

### Định nghĩa
`inline-block` là giá trị của thuộc tính CSS kết hợp việc sử dụng cả các phần tử `inline & block`. Cho phép các phần tử như `inline` nhưng vẫn có thể được định dạng như các phần tử `block`
### Cách hoạt động
Các phần tử với `display: inline-block` sẽ thực hiện:
- Hiển thị trên cùng một dòng với các phần tử khác, giống như phần tử inline
- Có thể thiết lập: width, height giống như các phần tử block
- Tạo ra ngắt dọng giữa các phần tử inline-block nếu không có đủ không gian trên một dòng
### Cú pháp
Thường sẽ sử dụng thuộc tính `display` trong CSS để áp dụng `inline-block` cho một phần tử HTML
```html
<html>
    <head>
        <style>
            .inline-block {
                display: inline-block;
                width: 200px;
                height: 200px;
            }
        </style>
    </head>
    <body>
        <div class="inline-block">Nội dung sử dụng Inline & Block</div>
    </body>
</html>
```
### Mục đích sử dụng
- Đặt các phần tử cạnh nhau
- Định dạng các phần tử inline áp dụng các thuộc tính block như `(margin, padding, width, height)` cho các phần tử inline

# HTML Structure
Một số cấu trúc HTML:
1. HTML Structure Cơ bản
```html
<!DOCTYPE html>
<html>
<head>
    <title>Page Title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Main Heading</h1>
    <p>This is a paragraph.</p>
</body>
</html>
```

2. Lists
```html
<ol>
    <li>First item</li>
    <li>Second item</li>
</ol>

<ul>
    <li>First item</li>
    <li>Second item</li>
</ul>
```

3. Tables
```html
<table>
    <tr>
        <th>Header 1</th>
        <th>Header 2</th>
    </tr>
    <tr>
        <td>Data 1</td>
        <td>Data 2</td>
    </tr>
</table>
```

4. Form
```html
<form action="/submit" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name">
    
    <label for="email">Email:</label>
    <input type="email" id="email" name="email">
    
    <input type="submit" value="Submit">
</form>
```

5. Semantic HTML
```html
<header>
    <h1>Website Title</h1>
    <nav>
        <a href="#home">Home</a>
        <a href="#about">About</a>
    </nav>
</header>
<main>
    <section>
        <h2>Section Title</h2>
        <p>Section content goes here.</p>
    </section>
    <article>
        <h2>Article Title</h2>
        <p>Article content goes here.</p>
    </article>
</main>
<aside>
    <h2>Related Links</h2>
    <p>Links and content related to the main content.</p>
</aside>
<footer>
    <p>&copy; 2024 Your Website</p>
</footer>
```
# HTML Semantic

## header

### Định nghĩa
Thẻ `header` sử dụng để định ngia phần đầu của một Document hoặc phần tử cụ thể cảu tại liệu như `(section, article, ...)`. Phần tử thường chứa các nội dung như tiêu đề, logo, hoặc các phần tử giới thiệu trang web
### Cách hoạt động
Thẻ `<header>` cung cấp ngữ nghĩa rõ rang cho nội dung, giúp cải thiện khả năng truy cập và SEO.
### Cú pháp
```html
<header>
    Nội dung của phần menu header
<header>
```
### Mục đích hoạt động
- Chứa tiêu đề của trang hoặc một phần nội dung
- Đặt các thành phần điều hướng chính của website
- Chứa Logo, biểu tượng, khâu hiệu của trang

## footer
### Định nghĩa
Thẻ `<footer>` sử dụng để định nghĩa phần chân hoặc các nội dung hiển thị dưới cùng của website. Thường chứa các thông tin như: Tác giả, thông tin liên hệ, bản quyền, các liên kết điều hướng bổ sung
### Cách hoạt động
Thẻ `<footer>` Cung cấp ngữ nghĩa rõ ràng cho nội dung, cải thiện SEO. Các công cụ tìm kiếm và browser sẽ sử dụng thông tin này để biết chi tiết hơn về cấu trúc trang web
### Cú pháp
```html
<footer>
  <!-- Nội dung của phần chân -->
</footer>
```
### Mục đích hoạt động
- Chứa thông tin bản quyền của website
- Cung cấp các liên kết điều hướng bổ sung như chính sách bảo mật, điều khoản dịch vụ, các thông tin liên hệ
- Đưa vào các thông tin liên hệ hoặc thông tin về tác giả của trang web hoặc phần cụ thể.
## main
### Định nghĩa
Thẻ `<main>` sử dụng để xác định phần nội dung chính của tài liệu, nó sẽ tương tự với `body` và là thẻ duy nhất trong một file HTML. loại trừ các phần tử như sidebar, navigation, footer, và các phần tử bổ trợ khác
### Cách hoạt động
Thẻ `<main>` cung cấp ngữ nghĩa cho nội dung, cải thiện SEO
### Cú pháp
```html
<main>
  <h1>About Us</h1>
  <p>We are a company that specializes in providing excellent services.</p>
  <section>
    <h2>Our Mission</h2>
    <p>Our mission is to deliver quality services to our customers.</p>
  </section>
</main>
```
### Mục đích hoạt động
- Chứa nội dung chính của tài liệu HTML
- Giúp các công cụ hỗ trợ truy cập dễ dàng và xác định phần nội dung quan trọng của trang
- Cải thiện SEO

## article
### Định nghĩa
Thẻ `<article>` sử dụng để xác định một phần nội dung độc lập, tự chứa, có ý nghĩa hoàn chỉnh và có thể tái sử dụng. Nội dung bên trong thẻ `<article>` thường có thể được phân phối độc lập còn lại của trang web. Các áp dụng thường dùng đối với thẻ `<article>`: Post, Blog, Post in Forum
### Cách hoạt động
Thẻ `<article>` hoạt động như một container chứa một nội dung hoàn chỉnh. Mooix `<article>` có thể chứa các phần tử khác như tiêu đề, đoạn văn, hình ảnh, các thẻ Semantic khác.
### Cú pháp
```html
<article>
  <h2>The Rise of Web Development</h2>
  <p>Web development has become one of the most sought-after skills in the modern world.</p>
  <p>...</p>
</article>
```
### Mục đích hoạt động
- Định nghĩa một phần nội dung độc lập, tự chứa, có thể tái sử dụng
- Cải thiện khả năng truy cập và SEO
## aside
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## section
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## details
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## dialog
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## figure
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## figcaption
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## mark
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## nav
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## menuitem
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## meter
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## progress
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## rp
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## rt
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## ruby
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## summary
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## bdi
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## time
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

## wbr
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích hoạt động

# HTML APIs

## Canvas API
### Định nghĩa
`Canvas API` cho phép vẽ đồ họa `2D` và `3D` trên một phần tử `<canvas>` trong trang web.
### Cách hoạt động
Sử dụng JavaScript để vẽ hình dạng, đường, văn bản và hình ảnh trên phần tử `<canvas>`.
### Cú pháp
```js
<canvas id="myCanvas" width="200" height="100"></canvas>
<script>
  var canvas = document.getElementById('myCanvas');
  var ctx = canvas.getContext('2d');
  ctx.fillStyle = "#FF0000";
  ctx.fillRect(0, 0, 150, 75);
</script>
```
### Mục đích sử dụng
Tạo game, biểu đồ, đồ họa tùy chỉnh.
### Attributes/Properties/Methods
- `fillStyle`: Thiết lập màu sắc, gradient, hoặc pattern để tô.
- `fillRect(x, y, width, height)`: Vẽ một hình chữ nhật được tô màu.
- `strokeStyle`: Thiết lập màu sắc, gradient, hoặc pattern để viền.
- `strokeRect(x, y, width, height)`: Vẽ một hình chữ nhật chỉ có viền.
- `clearRect(x, y, width, height)`: Xóa một vùng chữ nhật đã vẽ.
- `beginPath()`: Bắt đầu một đường path mới.
- `moveTo(x, y)`: Di chuyển bút vẽ đến tọa độ (x, y).
- `lineTo(x, y)`: Vẽ một đường từ điểm hiện tại đến điểm (x, y).

## Web Storage API 
### Định nghĩa
`Web Storage API` cung cấp cách lưu trữ dữ liệu tạm thời hoặc vĩnh viễn trên trình duyệt.
### Cách hoạt động
Sử dụng `localStorage` để lưu trữ dữ liệu không hết hạn và `sessionStorage` để lưu trữ dữ liệu trong phiên duyệt hiện tại.
### Cú pháp
```js
// localStorage
localStorage.setItem('key', 'value');
var data = localStorage.getItem('key');

// sessionStorage
sessionStorage.setItem('key', 'value');
var data = sessionStorage.getItem('key');
```
### Mục đích sử dụng.
Lưu trữ dữ liệu người dùng, giỏ hàng, tùy chọn giao diện.
### Attributes/Properties/Methods
- `setItem(key, value)`: Lưu trữ một cặp key-value.
- `getItem(key)`: Lấy giá trị của key đã lưu trữ.
- `removeItem(key)`: Xóa một mục đã lưu trữ theo key.
- `clear()`: Xóa tất cả các mục đã lưu trữ.
- `length`: Trả về số lượng các mục đã lưu trữ.

## Geolocation API
### Định nghĩa
`Geolocation API` cho phép lấy vị trí địa lý của người dùng.
### Cách hoạt động
Sử dụng phương thức `getCurrentPosition` để lấy tọa độ hiện tại của người dùng.
### Cú pháp
```js
if (navigator.geolocation) {
  navigator.geolocation.getCurrentPosition(function(position) {
    console.log('Latitude: ' + position.coords.latitude);
    console.log('Longitude: ' + position.coords.longitude);
  });
}
```
### Mục đích sử dụng
Ứng dụng bản đồ, theo dõi vị trí, dịch vụ dựa trên địa điểm.
### Attributes/Properties/Methods
- `getCurrentPosition(successCallback, errorCallback, options)`: Lấy vị trí hiện tại.
- `watchPosition(successCallback, errorCallback, options)`: Theo dõi thay đổi vị trí.
- `clearWatch(id)`: Dừng theo dõi vị trí.

## File API
### Định nghĩa
`File API` cho phép người dùng đọc và thao tác với các file từ hệ thống của họ.
### Cách hoạt động
Sử dụng đối tượng `File` và `FileReader` để đọc nội dung file.
### Cú pháp
```js
<input type="file" id="fileInput">
<script>
  document.getElementById('fileInput').addEventListener('change', function(event) {
    var file = event.target.files[0];
    var reader = new FileReader();
    reader.onload = function(e) {
      console.log(e.target.result);
    };
    reader.readAsText(file);
  });
</script>
```
### Mục đích sử dụng
Upload file, xử lý file trên trình duyệt.
### Attributes/Properties/Methods
- `files`: Trả về một danh sách các file được chọn trong input.
- `readAsText(file)`: Đọc nội dung file dưới dạng văn bản.
- `readAsDataURL(file)`: Đọc nội dung file dưới dạng URL.
- `onload`: Xác định hàm xử lý khi quá trình đọc hoàn tất.
- `onerror`: Xác định hàm xử lý khi có lỗi xảy ra trong quá trình đọc.

## Web Workers API 
### Định nghĩa
`Web Workers API` cho phép chạy các script trong nền mà không làm gián đoạn giao diện người dùng.
### Cách hoạt động
Sử dụng đối tượng `Worker` để tạo và giao tiếp với `worker thread`.
### Cú pháp
```js
// main.js
if (window.Worker) {
  var worker = new Worker('worker.js');
  worker.postMessage('Hello Worker');
  worker.onmessage = function(event) {
    console.log(event.data);
  };
}

// worker.js
onmessage = function(event) {
  postMessage('Received: ' + event.data);
};
```
### Mục đích sử dụng
Tính toán phức tạp, xử lý dữ liệu lớn, đảm bảo giao diện mượt mà.
### Attributes/Properties/Methods
- `postMessage(message)`: Gửi tin nhắn đến worker.
- `onmessage`: Xác định hàm xử lý khi nhận được tin nhắn từ worker.
- `terminate()`: Dừng worker.


## WebSockets API
### Định nghĩa
`WebSockets API` cung cấp giao tiếp thời gian thực giữa trình duyệt và máy chủ.
### Cách hoạt động
Sử dụng đối tượng `WebSocket` để mở một kết nối, gửi và nhận tin nhắn qua kết nối đó.
### Cú pháp
```js
var socket = new WebSocket('ws://example.com/socket');
socket.onopen = function() {
  socket.send('Hello Server');
};
socket.onmessage = function(event) {
  console.log('Received: ' + event.data);
};
```
### Mục đích sử dụng
Chat trực tuyến, cập nhật dữ liệu thời gian thực.
### Attributes/Properties/Methods
``onopen`: Xác định hàm xử lý khi kết nối mở.
``onmessage`: Xác định hàm xử lý khi nhận được tin nhắn.
``onclose`: Xác định hàm xử lý khi kết nối đóng.
``send(data)`: Gửi dữ liệu qua kết nối WebSocket.
``close()`: Đóng kết nối WebSocket.

## Fetch API
### Định nghĩa
`Fetch API` cung cấp cách hiện đại để thực hiện các yêu cầu `HTTP`.
### Cách hoạt động
Sử dụng phương thức `fetch` để gửi yêu cầu `HTTP` và nhận phản hồi.
### Cú pháp
```js
fetch('https://api.example.com/data')
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error('Error:', error));
```
### Mục đích sử dụng
Lấy dữ liệu từ API, gửi dữ liệu đến máy chủ.
### Attributes/Properties/Methods
- `fetch(url, options)`: Gửi yêu cầu HTTP.
- `then(response)`: Xử lý phản hồi thành công.
- `catch(error)`: Xử lý lỗi trong yêu cầu.

## IndexedDB API
### Định nghĩa
`IndexedDB API` cung cấp cơ sở dữ liệu NoSQL lưu trữ trên trình duyệt để lưu trữ dữ liệu lớn và phức tạp.
### Cách hoạt động
Sử dụng đối tượng `indexedDB` để mở cơ sở dữ liệu, tạo object store và thêm/lấy dữ liệu.
### Cú pháp
```js
var request = indexedDB.open('myDatabase', 1);

request.onupgradeneeded = function(event) {
  var db = event.target.result;
  var objectStore = db.createObjectStore('myStore', { keyPath: 'id' });
  objectStore.createIndex('name', 'name', { unique: false });
};

request.onsuccess = function(event) {
  var db = event.target.result;
  var transaction = db.transaction('myStore', 'readwrite');
  var objectStore = transaction.objectStore('myStore');
  objectStore.add({ id: 1, name: 'John Doe' });
};
```
### Mục đích sử dụng
Lưu trữ dữ liệu phức tạp, ứng dụng web offline
### Attributes/Properties/Methods
- `open(name, version)`: Mở cơ sở dữ liệu.
- `createObjectStore(name, options)`: Tạo object store mới.
- `transaction(storeNames, mode)`: Tạo transaction cho một hoặc nhiều object store.
- `add(value)`: Thêm một mục vào object store.
- `get(key)`: Lấy một mục từ object store theo key.
- `createIndex(name, keyPath, options)`: Tạo chỉ mục trong object store.

## Notification API
### Định nghĩa
`Notification API` cho phép gửi thông báo đến người dùng từ trình duyệt.
### Cách hoạt động
Sử dụng đối tượng `Notification` để tạo và hiển thị thông báo.
### Cú pháp
```js
if (Notification.permission === 'granted') {
  new Notification('Hello, world!');
} else if (Notification.permission !== 'denied') {
  Notification.requestPermission().then(permission => {
    if (permission === 'granted') {
      new Notification('Hello, world!');
    }
  });
}
```
### Mục đích sử dụng
- Thông báo cập nhật, nhắc nhở người dùng.
### Attributes/Properties/Methods
- `title`: Tiêu đề của thông báo.
- `body`: Nội dung của thông báo.
- `icon`: URL của hình ảnh icon cho thông báo.
- `Notification.requestPermission()`: Yêu cầu quyền gửi thông báo.
- `Notification.permission`: Trạng thái quyền hiện tại (granted, denied, default).

## Service Workers API
### Định nghĩa
Service Workers API cho phép lưu trữ và quản lý nội dung ngoại tuyến, hỗ trợ các tính năng như thông báo đẩy, đồng bộ hóa nền
### Cách hoạt động
Sử dụng script service worker để quản lý cache va xử lý các yêu cầu mạng
### Cú pháp
```js
// service-worker.js
self.addEventListener('install', event => {
  event.waitUntil(
    caches.open('v1').then(cache => {
      return cache.addAll([
        '/',
        '/index.html',
        '/styles.css',
        '/script.js'
      ]);
    })
  );
});

self.addEventListener('fetch', event => {
  event.respondWith(
    caches.match(event.request).then(response => {
      return response || fetch(event.request);
    })
  );
});
```
### Mục đích sử dụng
- Ứng dụng web ngoại tuyến
- Progressive Web Apps (PWAs)

### Attributes/Properties/Methods
- `install event`: Sự kiện được kích hoạt khi service worker được cài đặt.
- `activate event`: Sự kiện được kích hoạt khi service worker được kích hoạt.
- `fetch event`: Sự kiện được kích hoạt khi có yêu cầu mạng.
- `waitUntil(promise)`: Chờ cho đến khi promise hoàn thành trong quá trình cài đặt hoặc kích hoạt.
- `respondWith(response)`: Trả lời một yêu cầu mạng bằng response được chỉ định.
# HTML Attributes

## Global Attributes
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích sử dụng

## Internationalization
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích sử dụng

## Link
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích sử dụng

## Image
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích sử dụng

## All Attributes
### Định nghĩa
### Cách hoạt động
### Cú pháp
### Mục đích sử dụng

### Form
#### Định nghĩa
#### Cách hoạt động
#### Cú pháp
#### Mục đích sử dụng

### input
#### Định nghĩa
#### Cách hoạt động
#### Cú pháp
#### Mục đích sử dụng

### select
#### Định nghĩa
#### Cách hoạt động
#### Cú pháp
#### Mục đích sử dụng

### textarea
#### Định nghĩa
#### Cách hoạt động
#### Cú pháp
#### Mục đích sử dụng

### table
#### Định nghĩa
#### Cách hoạt động
#### Cú pháp
#### Mục đích sử dụng

### audio/video
#### Định nghĩa
#### Cách hoạt động
#### Cú pháp
#### Mục đích sử dụng

### script
#### Định nghĩa
#### Cách hoạt động
#### Cú pháp
#### Mục đích sử dụng
