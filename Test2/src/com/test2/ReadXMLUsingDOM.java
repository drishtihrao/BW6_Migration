package com.test2;


import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXMLUsingDOM {

	public static void main(String args[]) {

	    try {

		File xmlFile = new File("D:\\contactbook.xml");
		DocumentBuilderFactory docbuildFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docbuildFactory.newDocumentBuilder();
		Document document = docBuilder.parse(xmlFile);

		document.getDocumentElement().normalize();

		System.out.println("Root element name :- " + document.getDocumentElement().getNodeName());

		NodeList nodeList = document.getElementsByTagName("employee");

		for (int i = 0; i < nodeList.getLength(); i++) {

			Node node = nodeList.item(i);

			System.out.println("\nCurrent element name :- " + node.getNodeName());
			System.out.println("-------------------------------------");

			if (node.getNodeType() == Node.ELEMENT_NODE) {

				Element element = (Element) node;

				System.out.println("Employee id :- " + element.getAttribute("id"));
				System.out.println("Employee Name : " + element.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("Email: " + element.getElementsByTagName("email").item(0).getTextContent());
				System.out.println("Phone: " + element.getElementsByTagName("phone").item(0).getTextContent());
				
			}
		}
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	  }
	
}
