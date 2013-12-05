package com.xinghen.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import com.xinghen.domain.Image;
import com.xinghen.domain.UsedGood;

public class MyIOUtils {

	
	private static MyIOUtils sMyIOUtils;
	private MyIOUtils (){ }

	
	/**单例模式获取一个实例
	 * 
	 */
	public static MyIOUtils getInstance(){
		if (sMyIOUtils == null)
		{
			synchronized (MyIOUtils.class) {
				if (sMyIOUtils == null)
				{
					sMyIOUtils = new MyIOUtils();
				}
			}
		}
		return sMyIOUtils;
	}
	
	/**读取上传上来的所有照片
	 * @param path
	 * @param images
	 * @throws Exception
	 */
	public void inputImage(String path, List <File> images, List<String> imagesName, UsedGood usedGood) throws Exception {

		String imgPath = "/images/";
		Image img = new Image();
		Date date = new Date ();
		usedGood.setUploadDate(date);
		
		System.out.println(path);

		for (int i = 0; i < images.size(); ++i) {

			InputStream is = new FileInputStream( images.get(i));

			File fileTmp = new File(path + imgPath);
			if (false == fileTmp.exists()) {
				if (fileTmp.mkdir()) {
					System.out.println("create file dirc ~~~");
				}
			}
			String imgName = System.currentTimeMillis() + "."
					+ imagesName.get(i).split("\\.")[1];
			
			img.setImageName(imgName);
			if (i == 0){
				img.setImageType("homeImg");
			}
			else {
				img.setImageType("Img");
			}

			img.setUploadDate(date);
			
			usedGood.getImages().add(img);

			File destFile = new File(path + imgPath, imgName);

			System.out.println(destFile.getName());

			OutputStream os = new FileOutputStream(destFile);

			byte[] buffer = new byte[400];

			int length = 0;
			
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}

			is.close();

			os.close();
		}

	}

}
