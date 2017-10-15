package com.java.networking;

import java.io.*;
import java.net.*;

//public class MyServer {
//
//	public static void main(String[] args) {
//
//		try {
//			ServerSocket ss = new ServerSocket(6666);
//			Socket s = ss.accept();
//			DataInputStream dis = new DataInputStream(s.getInputStream());
//			String str = (String) dis.readUTF();
//			System.out.println("message= " + str);
//			ss.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}

class MyServer {
	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "", str2 = "";
		while (!str.equals("stop")) {
			str = din.readUTF();
			System.out.println("client says: " + str);
			str2 = br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		din.close();
		s.close();
		ss.close();
	}
}
