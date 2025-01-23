package com.root.app.ztest;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.root.app.products.ProductDAO;
import com.root.app.products.ProductDTO;

public class ProductTest {
	
	private Scanner sc;
	private ProductDAO productDAO;
	private ProductDTO productDTO;
	
	
	public void addTest() throws Exception {
		sc = new Scanner(System.in);
		productDAO = new ProductDAO();
		productDTO = new ProductDTO();
		
		
		
		System.out.println("상품명, 이자율, 판매기간, 상세설명 입력");
		productDTO.setProductName(sc.next());
		productDTO.setProductRate(sc.nextDouble());
		productDTO.setProductDate(Date.valueOf(sc.next()));
		productDTO.setProductDetail(sc.next());
		
		int test = productDAO.add(productDTO);
		
		if(test == 1) {
			System.out.println("입력 성공");
		}else {
			System.out.println("실패");
		}
		
	}
	
	
	public void getListTest() throws Exception {
		productDAO = new ProductDAO();
		productDTO = new ProductDTO();
		List<ProductDTO> products = new ArrayList<>();
		products = productDAO.getList(productDTO);
		
		for(ProductDTO productDTO : products) {
			System.out.print(productDTO.getProductNum()+"\t");
			System.out.print(productDTO.getProductName()+"\t");
			System.out.print(productDTO.getProductRate()+"\t");
			System.out.print(productDTO.getProductDate()+"\t");
			System.out.print(productDTO.getProductDetail()+"\n");
		}
		
	}
	
	
	public void getDetailTest() throws Exception {
		productDAO = new ProductDAO();
		sc = new Scanner(System.in);
		productDTO = new ProductDTO();
		
		System.out.println("상품번호 입력");
		productDTO.setProductNum(sc.nextLong());
		
		productDTO = productDAO.getDetail(productDTO);
		
		if(productDTO != null) {
			System.out.print(productDTO.getProductNum()+"\t");
			System.out.print(productDTO.getProductName()+"\t");
			System.out.print(productDTO.getProductRate()+"\t");
			System.out.print(productDTO.getProductDate()+"\t");
			System.out.print(productDTO.getProductDetail()+"\n");
		}else {
			System.out.println("해당 상품 없음");
		}
		
	}
	
	
	public void updateTest() throws Exception {
		productDAO = new ProductDAO();
		sc = new Scanner(System.in);
		productDTO = new ProductDTO();
		
		System.out.println("변경할 상품의 번호 입력");
		productDTO.setProductNum(sc.nextLong());
		System.out.println("해당 상품의 변경된 이자율 입력");
		productDTO.setProductRate(sc.nextDouble());
		
		int result = productDAO.update(productDTO);
		
		if(result == 1) {
			System.out.println("test 성공");
		}else {
			System.out.println("test 실패");
		}
		
	}
	
	
	

}
