package com.test2;

import java.io.IOException;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class ReadingXml {
	 public static void main(String args[]) throws IOException, SAXException {

		    DOMParser parser = new DOMParser();
		    parser.parse("D:\\XML4.xml");

		    Document dom = parser.getDocument();

		    NodeList games = dom.getElementsByTagName("IT_Staff");

		    for (int i = 0; i < games.getLength(); i++) {
		      Node aNode = games.item(i);
		      System.out.println(aNode.getFirstChild().getNodeValue());

		      NamedNodeMap attributes = aNode.getAttributes();

		      for (int a = 0; a < attributes.getLength(); a++) {
		        Node theAttribute = attributes.item(a);
		        System.out.println(theAttribute.getNodeName() + "=" + theAttribute.getNodeValue());
		      }
		    }

		  }
}
