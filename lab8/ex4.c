#include <stdio.h>

typedef struct {
	int ID;
	char name[100];
	char sex;
	int birthYear;
	char phoneNumber[12];
	float salary;
} employee_t;

int findEmployee(employee_t a[], int size, int id);

int main()
{
	// khai bao mang a co 10 phan tu, moi phan tu la 1 employee_t
	// Nhu vay ta co:
	// a[0].ID la 217, a[0].name la "Vu Duc Minh", a[0].sex la 'M', a[0].birthYear la 1998, a[0].phoneNumber la "0123456789", a[0].salary la 2000
	// a[1].ID la 333, a[1].name la "Nguyen Dinh Luan", v.v...
	employee_t a[10] = {
		{ 217, "Vu Duc Minh", 'M', 1998, "0123456789", 2000},
		{ 333, "Nguyen Dinh Luan", 'M', 1996, "0123456788", 2500 },
		{ 486, "Do Duc Huy", 'M', 1997, "0123456787", 3000 },
		{ 76, "Nguyen Thao Vy", 'F', 1997, "0123456786", 2300 },
		{ 235, "Nguyen Thi Dieu", 'F', 1996, "0123456785", 1800 },
		{ 688, "Vo Hoang Phi", 'M', 1996, "0123456784", 2700 },
		{ 117, "Pham Minh Tam", 'F', 1999, "0123456783", 3600 },
		{ 82, "Tran Cong Thuan", 'M', 1994, "0123456782", 5000 },
		{ 941, "Le Thanh Hung", 'M', 1994, "0123456781", 5000 },
		{ 10, "Lam Hoang Quan", 'M', 1994, "0123456780", 4500 }
	};
	
	int id;
	printf("Nhap vao ID can tim: ");
	scanf("%d", &id);

	int index = findEmployee(a, 10, id);
	if (index == -1) {
		printf("Khong tim thay\n");
	} else {
		printf("%d ", a[index].ID); // in ID
		printf("%s ", a[index].name); // in ten
		printf("%c ", a[index].sex); // in gioi tinh
		printf("%d ", a[index].birthYear); // in nam sinh
		printf("%s ", a[index].phoneNumber); // in so dien thoai
		printf("%.2f", a[index].salary); // in muc luong
		printf("\n"); // xuong dong
	}

	return 0;
}

int findEmployee(employee_t a[], int size, int id)
{
	int i;
	for (i = 0; i < size; i++) {
		if (a[i].ID == id) { // kiem tra nhan vien co ID trung voi id do nguoi dung nhap vao
			return i;
		}
	}
	
	return -1;
}