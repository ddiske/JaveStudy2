package com.root.app.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.root.app.utils.DBConnection;

public class ProductDAO {
//	1. 상품 추가
	
	public int add(ProductDTO productDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "INSERT INTO PRODUCTS (PRODUCTNUM, PRODUCTNAME, PRODUCTRATE, PRODUCTDATE, PRODUCTDETAIL)"
				+ " VALUES (PDT_NUM_SEQ.NEXTVAL, ?, ?, ?, ?)";
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, productDTO.getProductName());
		st.setDouble(2, productDTO.getProductRate());
		st.setDate(3, productDTO.getProductDate());
		st.setString(4, productDTO.getProductDetail());
		
		int result = st.executeUpdate();
		
		
		DBConnection.disConnect(st, connection);
		
		
		return result;
	}
	
	
	
//	2. 상품 조회 (전체 조회)
	
	public List<ProductDTO> getList(ProductDTO productDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM PRODUCTS";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<ProductDTO> products = new ArrayList<>();
		
		while(rs.next()) {
			ProductDTO productDTO2 = new ProductDTO();
			productDTO2.setProductNum(rs.getInt("PRODUCTNUM"));
			productDTO2.setProductName(rs.getString("PRODUCTNAME"));
			productDTO2.setProductRate(rs.getDouble("PRODUCTRATE"));
			productDTO2.setProductDate(rs.getDate("PRODUCTDATE"));
			productDTO2.setProductDetail(rs.getString("PRODUCTDETAIL"));
			products.add(productDTO2);
		}
		
		
		DBConnection.disConnect(rs, st, connection);
		
		return products;
	}
	
	
	
	
//	3. 상품 상세조회
	
	public ProductDTO getDetail(ProductDTO productDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM PRODUCTS"
				+ " WHERE PRODUCTNUM = ?";
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setLong(1, productDTO.getProductNum());
		
		ResultSet rs = st.executeQuery();
		
		productDTO = new ProductDTO();
		if(rs.next()) {
			productDTO.setProductNum(rs.getLong("PRODUCTNUM"));
			productDTO.setProductName(rs.getString("PRODUCTNAME"));
			productDTO.setProductRate(rs.getDouble("PRODUCTRATE"));
			productDTO.setProductDate(rs.getDate("PRODUCTDATE"));
			productDTO.setProductDetail(rs.getString("PRODUCTDETAIL"));
			
		}
		
		
		DBConnection.disConnect(rs, st, connection);
		
		
		return productDTO;
	}
	
	
	
//	4. 상품 이자율 수정
	
	
	public int update (ProductDTO productDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "UPDATE PRODUCTS SET PRODUCTRATE = ?"
				+ " WHERE PRODUCTNUM = ?";
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setLong(2, productDTO.getProductNum());
		st.setDouble(1, productDTO.getProductRate());
		
		int result = st.executeUpdate();
		
		
		DBConnection.disConnect(st, connection);
		
		
		return result;
	}
	
	
	

}
