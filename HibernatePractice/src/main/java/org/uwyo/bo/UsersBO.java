package org.uwyo.bo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uwyo.dao.UsersDAO;
import org.uwyo.model.Users;
//This is Git Modification
@Service
public class UsersBO {
	//Compare
	@Autowired
	UsersDAO userDao;
	
	public int saveUser(Users user ){
		
		System.out.println("I am In BO SaveUSer");
		return userDao.saveUser(user);
	}
	
	public void noOfBytesOfImage(){
		try {
			File file = new File("D:/hi.jpg");
			System.out.println(file.length());
			BufferedImage img = ImageIO.read(file);
			System.out.println(img);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}