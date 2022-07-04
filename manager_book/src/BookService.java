


public class BookService {

    public Book [] arrBook(){
     Book [] arrBooks = new Book[6];
    arrBooks [0] = new Book(1123,"Dòng sông tuổi thơ","Lê Kiên","Truyện thiếu nhi"," Kim Đồng" , 2022);
    arrBooks [1] = new Book(1124,"Ngôi nhà quỷ ám","Đỗ Trọng","Truyện ma"," NXB trẻ" , 2019);
    arrBooks [2] = new Book(1125,"Dưới bóng Hoàng Lan","Thạch Lam","Truyện ngắn"," NXB giáo dục" , 2020);
    arrBooks [3] = new Book(1126,"Nhũng ngôi sao xa xôi","Nguyễn Minh Châu","Truyện ngắn"," NXB giáo dục" , 2021);
    arrBooks [4] = new Book(1127,"Hạt giống tâm hồn","Maththew","Sách động lực sống","NXB trẻ" , 2021);
    arrBooks [5] = new Book(1128,"Chiếc thuyền ngoài xa","Nguyễn Minh Châu","Tuyện ngắn"," NXB giáo dục" , 2019);
    return arrBooks;
    }
    public void Show(Book [] arr){
        for ( Book  b: arrBook()) {
            System.out.println(b.bookCode+"-" + b.nameBook +"-"+ b.author+"-" +b.category +"-"+b.conpany +"-"+ b.year);

        }
    }
    public void finBookByName(Book [] arr ,String names){
        for (Book c: arr) {
            int count = 0;
            if (c.nameBook.contains(names)){
                count ++;
                System.out.println(c.bookCode + "-" + c.nameBook + "-" + c.author + "-" + c.category + "-" + c.conpany + "-" + c.year);
            }
            if (count == 0){
                System.out.println("không có quyển sách này");
            }
        }
    }
    public void finBookByYear(Book[] arr, int year){
        for (Book b : arr){
            if (b.year == year){
                System.out.println(b.bookCode+"-" + b.nameBook +"-"+ b.author+"-" +b.category +"-"+b.conpany +"-"+ b.year);
            }
        }
    }
}
