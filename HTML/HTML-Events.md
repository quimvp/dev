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

# HTML Events

## Window Event Attributes
### onafterprint
### onbeforeprint
### onbeforeunload
### onerror
### onhashchange
### onload
### onmessage
### onoffline
### ononline
### onpagehide
### onpageshow
### onpopstate
### onresize
### onstorage
### onunload

## Forms Events
### onblur
### onchange
### oncontextmenu
### onfocus
### oninput
### oninvaild
### onreset
### onsearch
### onselect
### onsubmit

## Keyboard Events
### onkeydown
### onkeypress
### onkeyup

## Mouse Events
### onclick
### ondbclick
### onmousedown
### onmousemove
### onmouseover
### onmouseup
### onmousewheel
### onwheel

## Drag Events
### ondrag
### ondragenter
### ondragover
### ondragstart
### ondrop
### onscroll

## Clipboard Events
### oncopy
### oncut
### onpaste

## Media Events
### onabort
### oncanplay
### oncanplaythrough
### oncuechange
### ondurationchange
### onemptied
### onerror
### onloadeddata
### onloadstart
### onpause
### onplay
### onplaying
### onprogress
### onratechange
### onseeked
### onseeking
### onstalled
### onsuspend
### ontimeupdate
### oncolumechange
### onwaiting

## Misc Events
### ontoggle