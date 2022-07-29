use classicmodels;

-- Liệt kê tên các văn phòng theo tên thành phố và số lượng nhân viên thuộc các văn phòng đó
SELECT o.city, COUNT(e.employeeNumber) AS numbers_employees 
FROM offices o
INNER JOIN employees e ON o.officeCode = e.officeCode
GROUP BY city;
;

-- Liệt kê các tình trạng đơn hàng và số lượng đơn hàng thuộc tình trạng đó
SELECT status,  COUNT(status) AS number_status
FROM orders 
GROUP BY status;


-- Liệt kê các productLine và số lượng sản phẩm thuộc product line đó
SELECT productLine, COUNT(productLine) AS number_productLine
FROM productlines
GROUP BY productLine;

-- Liệt kê thông tin những đơn hàng bị hủy gồm: id đơn hàng,id khách hàng ,tên khách hàng,OderDate,requireDate,nguyên nhân đơn hàng bị hủy
SELECT o.orderNumber, o.customerNumber, c.customerName, o.orderDate, o.requiredDate, o.comments
FROM orders o
INNER JOIN customers c ON o.customerNumber = c.customerNumber
WHERE o.status LIKE '%Cancelled%';


-- Liệt kê id đơn hàng,id khách hàng,tên khách hàng.oderDate,sản phẩm(id,tên,số lượng),comment của đơn hàng có id 10165

SELECT o.orderNumber,o.customerNumber,c.customerName,o.orderDate,o.requiredDate,odd.productCode,
p.productName,odd.quantityOrdered,o.comments
FROM orders o 
INNER JOIN customers c ON o.customerNumber = c.customerNumber
INNER JOIN orderdetails odd ON o.orderNumber = odd.orderNumber
INNER JOIN products p ON odd.productCode = p.productCode
WHERE o.orderNumber = 10165;


