# week05_www_lab
## Yêu cầu bài tập:
Hãy tạo một ứng dụng web sử dụng spring boot rồi thực hiện các công việc sau
1. Tạo các enities sao cho khi thực thi sẽ tạo ra các bảng như hình
2. Viết các repositories interface
3. Viết các lớp services
4. Tạo các trang web cho phép công ty đăng tin tuyển người với các skill mong muốn
5. Các ứng viên khi log vào sẽ được gợi ý các công việc có skill phù hợp với mình
6. Giúp các công ty tìm các ứng viên có skill phù hợp rồi gửi mail mời.
7. Đề xuất một số skill mà ứng viên chưa có để học.
## Những yêu cầu đã làm được:
### Ánh xạ sơ đồ CSDL:
![CSDL](https://github.com/trungthinh2k2/week05_www_lab/assets/89030667/4a16d48f-5b90-4bb5-ab0b-bcf5827c55e6)
### Xử lý với bảng Candidate: Lấy được danh sách candidate theo trang, không theo trang, thêm candidate mới, cập nhật lại candidate
#### Danh sách candidate theo trang:
![CandidatesByPaging](https://github.com/trungthinh2k2/week05_www_lab/assets/89030667/0f3ef328-9dbc-47ca-95cf-bfba3f1f6cbb)
#### Danh sách candidate không theo trang:
![CandidateNoPaging](https://github.com/trungthinh2k2/week05_www_lab/assets/89030667/3a71dc99-65e2-4d94-b1f7-ae6f2c8f521b)
#### Thêm candidate mới
![insertCandidate](https://github.com/trungthinh2k2/week05_www_lab/assets/89030667/376fbcda-063f-4987-870a-3a9e3382989b)
#### Cập nhật lại candidate:
![UpdateCandidate_](https://github.com/trungthinh2k2/week05_www_lab/assets/89030667/e14b3a79-6006-4bbf-80bd-1672951fb694)
### Xử lý với bảng company: lấy được danh sách company
#### Danh sách company:
![ListCompanies](https://github.com/trungthinh2k2/week05_www_lab/assets/89030667/71ddefbb-47e2-4304-b617-3ae4c4890d01)
### Xử lý với bảng job: xem được danh sách job của 1 company
#### danh sách job của company:
![ListJobOfCompany](https://github.com/trungthinh2k2/week05_www_lab/assets/89030667/1b7fad58-1033-44cc-b0e2-ebcb0a7ba816)

### CSDL sau khi thêm và cập nhật candidate:
![result](https://github.com/trungthinh2k2/week05_www_lab/assets/89030667/957a367a-4172-4abf-8452-2565cba92005)

