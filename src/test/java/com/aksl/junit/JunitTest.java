package com.aksl.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.apache.poi.hpsf.MutableProperty;
import org.apache.poi.hpsf.Property;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hpsf.wellknown.PropertyIDMap;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aksl.entity.system.User;
import com.aksl.service.UserManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:testconfig.xml")
public class JunitTest {

	@Resource(name = "userService")
	private UserManager userService;

	@Test
	public void test() throws Throwable {
		boolean res = checkKey("D:\\省管支撑岗管理规范及考核 .doc","check","123456a654321");
		System.out.println(res);
	}
	
	public boolean checkKey(String path,String key,String value) throws IOException{
		InputStream is = new FileInputStream(path);
		WordExtractor extractor = new WordExtractor(is);
		Pattern p = Pattern.compile("\t|\r|\n");
		String str = extractor.getMetadataTextExtractor().getText();
		Matcher m = p.matcher(str);
		String finishedReplaceStr = m.replaceAll(",").replace(" = ", ":");
		String[] str1 = finishedReplaceStr.split(",");
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		for (int i = 0; i < str1.length; i++) {
			map.put(str1[i].split(":")[0], str1[i].split(":").length>1?str1[i].split(":")[1]:"");
		}
		String docValue = map.get(key);
		return value.equals(docValue);
	}
}
