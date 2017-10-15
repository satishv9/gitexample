package com.java.networking;

import java.net.*;

public class URLDemo {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://www.javatpoint.com/URL-class");

		System.out.println("Protocol = " + url.getProtocol());
		System.out.println("Host name = " + url.getHost());
		System.out.println("Port number = " + url.getPort());
		System.out.println("FIle name = " + url.getFile());

	}

}
