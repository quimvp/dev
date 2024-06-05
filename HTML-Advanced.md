# HTML Attributes

## Syntax Attributes

### Cú pháp của Attributes

- `attributeName`: thường sẽ được viết chữ thường và được chỉ định riêng cho từng Tag hoặc sử dụng một số `Global Attributes`
- `value`: Thường sẽ là các gợi ý hoặc các `value` đã được tạo ra theo từng `attribute`

```
<tag attributename="value"></tag>
```

## Global Attributes

### Định nghĩa:

- `Global Attributes` thường sẽ là những thuộc tính có thể sử dụng được cho hầu hết các Tag HTML tuy nhiên cũng có những tag sẽ không áp dụng được `Global Attributes`

### Các loại Global Attributes

1. `accesskey`
   - Định nghĩa: Xác định phím tắt để truy cập phần tử.
   - Cách hoạt động: Khi phím tắt được nhấn, phần tử sẽ nhận được sự tập trung.
   - Cú pháp: `<button accesskey="S">Save</button>`
   - Mục đích sử dụng: Cung cấp phím tắt để truy cập nhanh vào phần tử.
   - Value của Attribute: Chuỗi ký tự đại diện cho phím tắt.
2. `class`
   - Định nghĩa: Xác định một hoặc nhiều lớp cho phần tử.
   - Cách hoạt động: Áp dụng CSS hoặc JavaScript cho các phần tử cùng lớp.
   - Cú pháp: `<div class="container">Content</div>`
   - Mục đích sử dụng: Nhóm và tùy chỉnh phần tử dựa trên lớp.
   - Value của Attribute: Tên lớp hoặc các lớp được phân tách bằng khoảng trắng.
3. `contenteditable`
   - Định nghĩa: Cho phép phần tử có thể chỉnh sửa nội dung trực tiếp trên trang.
   - Cách hoạt động: Người dùng có thể chỉnh sửa nội dung bên trong phần tử.
   - Cú pháp: `<div contenteditable="true">Editable Content</div>`
   - Mục đích sử dụng: Cho phép chỉnh sửa nội dung trực tiếp trên trang.
   - Value của Attribute: "true" để cho phép chỉnh sửa, "false" để không cho phép.
4. `data-\*`
   - Định nghĩa: Cho phép tạo các thuộc tính tùy chỉnh bắt đầu bằng "data-".
   - Cách hoạt động: Lưu trữ dữ liệu tùy chỉnh không ảnh hưởng đến việc hiển thị.
   - Cú pháp: `<div data-info="123">Custom Data</div>`
   - Mục đích sử dụng: Lưu trữ dữ liệu tùy chỉnh cho phần tử.
   - Value của Attribute: Giá trị dữ liệu tùy chỉnh.
5. `dir`
   - Định nghĩa: Xác định hướng văn bản của phần tử.
   - Cách hoạt động: Định dạng văn bản từ trái sang phải hoặc ngược lại.
   - Cú pháp: `<div dir="rtl">Right-to-Left Text</div>`
   - Mục đích sử dụng: Định dạng hướng văn bản.
   - Value của Attribute: "ltr" (trái sang phải) hoặc "rtl" (phải sang trái).
6. `draggable`
   - Định nghĩa: Cho phép phần tử có thể kéo thả.
   - Cách hoạt động: Phần tử có thể được kéo và thả trong hoặc giữa các phần tử.
   - Cú pháp: `<img src="image.jpg" draggable="true">`
   - Mục đích sử dụng: Cho phép kéo thả phần tử.
   - Value của Attribute: "true" để cho phép kéo thả, "false" để không cho phép.
7. `hidden`
   - Định nghĩa: Ẩn phần tử khỏi người dùng.
   - Cách hoạt động: Phần tử không được hiển thị trên trang.
   - Cú pháp: `<div hidden>Hidden Content</div>`
   - Mục đích sử dụng: Ẩn phần tử khi cần thiết.
   - Value của Attribute: Không cần giá trị.
8. `id`
   - Định nghĩa: Xác định duy nhất cho phần tử.
   - Cách hoạt động: Định danh duy nhất cho phần tử trên trang.
   - Cú pháp: `<div id="unique-id">Unique Element</div>`
   - Mục đích sử dụng: Xác định phần tử một cách duy nhất.
   - Value của Attribute: Tên định danh duy nhất.
9. `lang`
   - Định nghĩa: Xác định ngôn ngữ của phần tử.
   - Cách hoạt động: Định dạng văn bản theo ngôn ngữ cụ thể.
   - Cú pháp: `<p lang="en">English Text</p>`
   - Mục đích sử dụng: Định dạng văn bản theo ngôn ngữ.
   - Value của Attribute: Mã ngôn ngữ (ví dụ: "en" cho tiếng Anh).
10. `spellcheck`
    - Định nghĩa: Cho phép kiểm tra chính tả cho phần tử.
    - Cách hoạt động: Kiểm tra chính tả khi người dùng nhập liệu.
    - Cú pháp: `<textarea spellcheck="true"></textarea>`
    - Mục đích sử dụng: Kiểm tra chính tả cho phần tử.
    - Value của Attribute: "true" để bật kiểm tra chính tả, "false" để tắt.
11. `style`
    - Định nghĩa: Xác định CSS trực tiếp cho phần tử.
    - Cách hoạt động: Áp dụng các quy tắc CSS cụ thể cho phần tử.
    - Cú pháp: <p style="color: red;">Red Text</p>
    - Mục đích sử dụng: Tùy chỉnh giao diện của phần tử.
    - Value của Attribute: CSS properties và values.
12. `tabindex`
    - Định nghĩa: Xác định thứ tự di chuyển giữa các phần tử có thể tập trung.
    - Cách hoạt động: Định rõ thứ tự khi sử dụng phím tab để di chuyển giữa các phần tử.
    - Cú pháp: `<input type="text" tabindex="1">`
    - Mục đích sử dụng: Điều chỉnh thứ tự tập trung của các phần tử.
    - Value của Attribute: Số nguyên dương xác định thứ tự.
13. `title`
    - Định nghĩa: Xác định tiêu đề cho phần tử, thường hiển thị khi di chuột qua.
    - Cách hoạt động: Hiển thị thông tin mô tả khi di chuột qua phần tử.
    - Cú pháp: `<img src="image.jpg" title="Image Title">`
    - Mục đích sử dụng: Cung cấp thông tin mô tả bổ sung cho phần tử.
    - Value của Attribute: Chuỗi văn bản mô tả.

#### Example Global Attributes

```html
<div
  id="demo"
  class="big"
  dir="ltr"
  lang="en"
  style="color: red;"
  tabindex="0"
  title="Tooltip"
  contenteditable="true"
  spellcheck="true"
  data-htmlcheat="99"
>
  Hello World!
</div>
```

## Internationalization Attributes

Các thuộc tính `(Attributes)` liên quan đến `đa ngôn ngữ (Internationalization)` trong HTML:

1. `dir`
   - Định nghĩa: Xác định hướng hiển thị của văn bản trong phần tử
   - Cách hoạt động: Xác định cách mà hướng văn bản bên trong được hiển thị
   - Cú pháp: ` <div dir="ltr">This is a left-to-right text.</div>` |  `<div dir="rtl">This is a right to left text.</div>`
   - Mục đích sử dụng: Hiển thị văn bản đúng hướng
2. `lang`
   - Định nghĩa: Xác định ngôn ngữ chính của văn bản trong phần tử
   - Cách hoạt động: Xác định ngôn ngữ sử dụng trong văn bản của phần tử
   - Cú pháp: `<p lang="en">This is an English</p>`
   - Mục đích sử dụng: Xác định ngôn ngữ chính của văn bản trong phần tử theo đúng cách
   - Value của Attributes: Tuần thủ các chuẩn ngôn ngữ ISO như `"en", "vi"`
3. `xml:lang`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:

## Link Attributes

Cấc thuộc tính `(Attributes)` liên quan đến `Link` bao gồm:

1. `download`
   - Định nghĩa: Xác định tài liệu được tải xuống
   - Cách hoạt động: Khi người dùng nhấp vào một liên kết có sử dụng `Attributes download`, `browser` sẽ tải xuống tài liệu được liên kết
   - Cú pháp: `<a href="path/to/file.pdf" download>Download File</a>`
   - Mục đích sử dụng: Cho phép User tải xuống tài liệu từ một liên kết
   - Value của Attributes: `không yêu cầu value`
2. `hreflang`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
3. `media`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
4. `rel`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
5. `target`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
6. `type`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
7. `href`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:

## Image Attributes

Cấc thuộc tính `(Attributes)` liên quan đến `Image` bao gồm:

1. `src`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
2. `alt`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
3. `srcset` 
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
4. `width`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
5. `height`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
6. `title`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
7. `sizes`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
8. `ismap`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
9. `longdesc`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:
10. `usemap`
   - Định nghĩa:
   - Cách hoạt động:
   - Cú pháp:
   - Mục đích sử dụng:
   - Value của Attributes:

## All Atributes
## Group Attributes (Thường dùng)
### Form Attributes
1. `accept`
2. `accept-charset`
3. `action`
4. `autocomplete`
5. `enctype`
6. `method`
7. `name`
8. `novalidate`
9. `target`
### Input Attributes
1. `accept`
2. `alt`
3. `autocomplete`
4. `autofocus`
5. `autosave`
6. `checked`
7. `dirname`
8. `disable`
9. `form`
10. `form`
11. `formaction`
12. `height`
13. `list`
14. `max`
15. `maxlength`
16. `min`
17. `minlength`
18. `name`
19. `pattern`
20. `placeholder`
21. `readonly`
22. `required`
23. `size`
24. `src`
25. `step`
26. `type`
27. `usemap`
28. `value`
29. `width`
### Select (Input) Attribute
1. `autofocus`
2. `disabled`
3. `form`
4. `multiple`
5. `name`
6. `required`
7. `size`
### Textarea Attributes
1. `autofocus`
2. `cols`
3. `dirname`
4. `disabled`
5. `form`
6. `maxlength`
7. `name`
8. `placeholder`
### Table Attributes
1. `align`
2. `bgcolor`
### Audio/Video Attributes
1. `audio`
2. `video`
### Script Attributes
1. `async`
2. `defer`
3. `charset`
4. `integrity`
5. `language`
6. `src`
7. `type`