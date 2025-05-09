package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("==== test 1: seller findbyId: ====");
        Seller seller  = sellerDao.findById(3);

        System.out.println(seller);


        System.out.println("\n==== TEST 2: SEller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for(Seller seller1: list){
            System.out.println(seller1);
        }

        System.out.println("\n==== TEST 3: SEller findAll ====");

        list = sellerDao.findAll();

        for(Seller seller1: list){
            System.out.println(seller1);
        }

        /*
        Department department = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, department);
        System.out.println(seller);
        System.out.println(department);
         */
    }

}
