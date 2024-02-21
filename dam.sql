Create Database DuAn2
go
Use DuAn2
go
--Màu Sắc
Create Table MauSac(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not  null,
ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL,
	trangThai bit NULL,
)
go
ALTER TABLE [dbo].[CHATLIEU] ADD  CONSTRAINT [DF_CHATLIEU_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
ALTER TABLE [dbo].[CHATLIEU] ADD  CONSTRAINT [DF_CHATLIEU_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
ALTER TABLE [dbo].[KichCo] ADD  CONSTRAINT [DF_KichCo_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
ALTER TABLE [dbo].[KichCo] ADD  CONSTRAINT [DF_KichCo_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
ALTER TABLE [dbo].[ChucVu] ADD  CONSTRAINT [DF_ChucVu_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
ALTER TABLE [dbo].[ChucVu] ADD  CONSTRAINT [DF_ChucVu_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
ALTER TABLE [dbo].[MAUSAC] ADD  CONSTRAINT [DF_MAUSAC_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
ALTER TABLE [dbo].[MAUSAC] ADD  CONSTRAINT [DF_MAUSAC_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
ALTER TABLE [dbo].[THUONGHIEU] ADD  CONSTRAINT [DF_THUONGHIEU_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
ALTER TABLE [dbo].[THUONGHIEU] ADD  CONSTRAINT [DF_THUONGHIEU_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
ALTER TABLE [dbo].[NSX] ADD  CONSTRAINT [DF_NSX_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
ALTER TABLE [dbo].[NSX] ADD  CONSTRAINT [DF_NSX_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
ALTER TABLE [dbo].[DanhMucSP] ADD  CONSTRAINT [DF_DanhMucSP_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
ALTER TABLE [dbo].[DanhMucSP] ADD  CONSTRAINT [DF_DanhMucSP_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
ALTER TABLE [dbo].[CoAo] ADD  CONSTRAINT [DF_CoAo_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
ALTER TABLE [dbo].[CoAo] ADD  CONSTRAINT [DF_CoAo_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
ALTER TABLE [dbo].[PhongCach] ADD  CONSTRAINT [DF_PhongCach_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
ALTER TABLE [dbo].[PhongCach] ADD  CONSTRAINT [DF_PhongCach_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
ALTER TABLE [dbo].[ChiTietSP] ADD  CONSTRAINT [DF_ChiTietSP_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
ALTER TABLE [dbo].[ChiTietSP] ADD  CONSTRAINT [DF_ChiTietSP_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
GO


--Kích cỡ
Create Table KichCo(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not  null,
ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL,
	trangThai bit NULL,
)
go

--Kích cỡ
Create Table CoAo(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not  null,
ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL,
	trangThai bit NULL,
)
go

--Kích cỡ
Create Table PhongCach(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not  null,
ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL,
	trangThai bit NULL,
)
go

--Chất liệu
Create Table ChatLieu(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not  null,
ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL,
	trangThai bit NULL,
)
go
--Danh Mục sản phẩm
Create Table DanhMucSP(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not null,
ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL,
	trangThai bit NULL,
)
go
--Thương hiệu
Create Table ThuongHieu(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not null,
ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL,
	trangThai bit NULL,
)
go
--Nhà sản xuất
Create Table NSX(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not null,
ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL,
	trangThai bit NULL,
)
go
--Chức vụ
Create Table ChucVu(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not null,
ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL,
	trangThai bit NULL,

)
go
--Khuyến mãi
Create Table KhuyenMai(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not null,
Ngaybatdau Date not null,
Ngayketthuc date not null,
HinhthucKM nvarchar(50) not null,
Giatrigiam decimal DEFAULT 0,
ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL,
	trangThai bit NULL,
)
go
--Chi tiết sản phẩm
Create Table ChitietSP(
Id INT Identity(1,1) PRIMARY KEY ,
Ma nvarchar(10) not  null,
Ten nvarchar(50) not null,
IdNsx INT foreign key references NSX(Id),
IdMauSac INT foreign key references MauSac(Id),
IdDMuc INT foreign key references DanhMucSP(Id),
IdKC INT foreign key references KichCo(Id),
IdCL INT foreign key references ChatLieu(Id),
IdTH INT foreign key references ThuongHieu(Id),
IdKM INT foreign key references KhuyenMai(Id),
IdCA Int foreign key references CoAo(Id),
IdPC Int foreign key references PhongCach(Id),
MoTa NVARCHAR(50) DEFAULT NULL,
SoLuongTon INT,
GiaNhap DECIMAL(20,0) DEFAULT 0,
GiaBan DECIMAL(20,0) DEFAULT 0,
QrCode nvarchar(max) DEFAULT null,

)
go
--User
Create Table Users(
Id INT Identity(1,1) PRIMARY KEY ,
Ten NVARCHAR(30) not null,
TenDem NVARCHAR(30) DEFAULT NULL,
Ho NVARCHAR(30) DEFAULT NULL,
NgaySinh DATE DEFAULT NULL,
Gioitinh bit null,
Sdt VARCHAR(30) DEFAULT NULL,
IdCV INT foreign key references ChucVu(Id),
TaiKhoan VARCHAR(MAX) DEFAULT NULL,
MatKhau VARCHAR(MAX) DEFAULT NULL,
Email varchar(max) not null,
TrangThai bit DEFAULT 0
)
go
--Khách hàng
Create Table KhachHang(
Id INT Identity(1,1) PRIMARY KEY ,
Ten NVARCHAR(30) not null,
TenDem NVARCHAR(30) DEFAULT NULL,
Ho NVARCHAR(30) DEFAULT NULL,
Gioitinh bit Null,
NgaySinh DATE DEFAULT NULL,
Email varchar(max) not null,
Sdt VARCHAR(30) DEFAULT NULL,
Diemthuong int DEFAULT NULL,
diaChi VARCHAR(250) Null
)
go
--Hóa đơn
Create Table HoaDon(
Id INT Identity(1,1) primary key ,
IdKH INT foreign key references KhachHang(Id),
IdNV INT foreign key references Users(Id),
Ma VARCHAR(20) UNIQUE,
NgayTao DATE DEFAULT NULL,
NgayThanhToan DATE DEFAULT NULL,
TinhTrang bit DEFAULT 0

)
go
--Hóa đơn chi tiết
Create Table HoaDonChiTiet(
IdHD int foreign key references HoaDon(Id) not null,
IdCTSP int foreign key references ChitietSP(Id) not null,
Soluong int not  null,
Dongia decimal not  null,
primary key(IdHD,IdCTSP),
Dongiakhigiam decimal not  null
)
ALTER TABLE Hoadon

ADD Ghichu varchar(255)
ALTER TABLE Khuyenmai

ADD Trangthai bit Default 0

ALTER TABLE HoaDonChiTiet
Drop COLUMN Dongiakhigiam

ALTER TABLE Hoadon
ADD TongTien decimal

ALTER TABLE ChiTietSP
ADD ngayTao date NULL,
	ngaySua date NULL,
	nguoiTao varchar(50) NULL,
	nguoiSua varchar(50) NULL,
	deleted bit NULL

ALTER TABLE KhachHang
ADD diaChi VARCHAR(250) Null


	CREATE TABLE [dbo].[HINHTHUCTT](
	[hinhThucTT_id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](50) NULL,
	[moTa] [varchar](50) NULL,
	[ngayTao] [date] NULL,
	[ngaySua] [date] NULL,
	[nguoiTao] [varchar](50) NULL,
	[nguoiSua] [varchar](50) NULL,
	[deleted] [bit] NULL,
	[trangThai] [bit] NULL,
 CONSTRAINT [PK_HINHTHUCTT] PRIMARY KEY CLUSTERED 
(
	[hinhThucTT_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


select Id,GiaBan from ChitietSP
select id from Users
select * from KhachHang
insert into HoaDon (IdNV,IdKH)

select*from Users
select*from ChucVu
insert into ChucVu (Ten)
values (N'Quản Lý')
insert into ChucVu (Ten)
values ('Nhân Viên')

insert into Users(Ho,TenDem,Ten,NgaySinh,Gioitinh,Sdt,IdCV,TaiKhoan,MatKhau,Email,TrangThai)
values(N'Phạm','Minh',N'Tiến','02-02-2003',0,'02659875664',1,'Tien','12345678','tienhq2003@gmail.com',1)
insert into Users(Ho,TenDem,Ten,NgaySinh,Gioitinh,Sdt,IdCV,TaiKhoan,MatKhau,Email,TrangThai)
values(N'Phạm','Minh',N'Tài','02-02-2003',0,'02659875664',1,'admin','12345678','tienhq2003@gmail.com',1)




insert into ChitietSP (Ma,Ten,IdNsx,IdMauSac,IdDMuc,IdKC,IdCL,IdTH,GiaBan,GiaNhap,SoLuongTon,MoTa,QrCode)
values('SP01',N'Áo Thun dài nam',1,1,1,1,1,1,200000,260000,5,'','25')
insert into ChitietSP (Ma,Ten,IdNsx,IdMauSac,IdDMuc,IdKC,IdCL,IdTH,GiaBan,GiaNhap,SoLuongTon,MoTa,QrCode)
values('SP02',N'Áo Thun cộc',1,1,1,1,1,1,200000,260000,0,'','29')

insert into ChitietSP (Ma,Ten,IdNsx,IdMauSac,IdDMuc,IdKC,IdCL,IdTH,IdKM,GiaBan,GiaNhap,SoLuongTon,MoTa,QrCode)
values('SP09',N'Áo Thun cộc',1,1,1,1,1,1,1,200000,260000,0,'','29')
insert into ChitietSP (Ma,Ten,IdNsx,IdMauSac,IdDMuc,IdKC,IdCL,IdTH,IdKM,GiaBan,GiaNhap,SoLuongTon,MoTa,QrCode)
values('SP10',N'Áo Thun Tay Lỡ',1,1,1,1,1,1,1,300000,400000,0,'','28')
insert into ChitietSP (Ma,Ten,IdNsx,IdMauSac,IdDMuc,IdKC,IdCL,IdTH,IdKM,GiaBan,GiaNhap,SoLuongTon,MoTa,QrCode)
values('SP12',N'Áo Thun Nam Dài phong cách Hàn quốc',1,1,1,1,1,1,4,300000,350000,0,'','99')


insert into KhuyenMai(Ten,Giatrigiam,HinhthucKM,Ngaybatdau,Ngayketthuc,Trangthai)
values(N'Khuyến mại giảm 500k',50000 ,'50%','11-11-2023','12-12-2023',1)
insert into KhuyenMai(Ten,Giatrigiam,HinhthucKM,Ngaybatdau,Ngayketthuc,Trangthai)
values(N'Khuyến mại 10%',10,'10%','11-11-2023','12-24-2023',1)

select*from KhuyenMai

SELECT Id,Ten FROM dbo.PhongCach


select*from ChatLieu
select*from Users

SELECT Users.id,Users.Ten,TenDem,Ho,NgaySinh,Gioitinh,Sdt,IdCV,TaiKhoan,MatKhau,Email,ChucVu.Ten,Users.TrangThai FROM Users join ChucVu on ChucVu.Id = Users.IdCV


select*from chiTietSP


SELECT SP.MA , SP.TEN , MS.Ten AS N'Màu Sắc' ,KM.Giatrigiam  , KM.HinhthucKM , KC.Ten AS N'Kích Cỡ' , CL.Ten AS N'CHẤT LIỆU',ca.Ten AS 'Cổ Áo',pc.Ten As 'Phong Cách', SP.SoLuongTon ,SP.GiaBan FROM ChitietSP SP 
              JOIN MauSac MS ON SP.IdMauSac = MS.Id
                JOIN KichCo KC ON SP.IdKC = KC.Id 
				JOIN ChatLieu CL ON SP.IdCL = CL.Id 
				JOIN KhuyenMai KM ON SP.IdKM = KM.Id
				JOIN CoAo ca on SP.IdCA = ca.Id 
				JOIN PhongCach pc on SP.IdPC = pc.Id



			select *from HoaDon
			select *from HoaDonChiTiet
				Delete from HoaDon


				select diaChi from KhachHang
				select*from ChitietSP