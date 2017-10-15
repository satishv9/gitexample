package com.java.networking;

import java.io.*;
import java.net.*;

public class URLConnectionExample {

	public static void main(String[] args) {

		try {
			URL url1 = new URL("http://www.javatpoint.com/URLConnection-class");
			URLConnection urlcon = url1.openConnection();
			InputStream stream = urlcon.getInputStream();
			int i;
			while ((i = stream.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
