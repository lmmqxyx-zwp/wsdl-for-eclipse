package com.by.service;

/**
 * web service 工程
 * 
 * @author zwpio
 *
 */
public class LoginService {
	
	 public int checkUserRight(String userId, String password) {

         //假设进行数据库操作

         if (password != null && "fred".equals(userId)) {

             return 1;

         }

     return 0;

 }
}
