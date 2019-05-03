package com.test2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CustomisedSaxParser {
	static Map<String, String> tmpAtrb = null;
	static Map<String, String> xmlValue = new LinkedHashMap<String, String>();

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, VerifyError {

		SAXParserFactory saxDoc = SAXParserFactory.newInstance();
		SAXParser saxParser = saxDoc.newSAXParser();

		DefaultHandler handler = new DefaultHandler() {
			String tmpElementName = null;
			String tmpElementValue = null;

			@Override
			public void startElement(String uri, String localName, String qName, Attributes attributes)
					throws SAXException {
				tmpElementValue = "";
				tmpElementName = qName;
				tmpAtrb = new HashMap();

				/**
				 * Store attributes in HashMap
				 */
				for (int i = 0; i < attributes.getLength(); i++) {

					String atrributeName = attributes.getLocalName(i);
					String atrributeValue = attributes.getValue(i);
					tmpAtrb.put(atrributeName, atrributeValue);
				}

			}

			@Override
			public void endElement(String uri, String localName, String qName) throws SAXException {

				System.out.println();
				System.out.println("****");
				System.out.println();

				if (tmpElementName.equals(qName)) {

					System.out.println("Element Name :" + tmpElementName);
					/**
					 * Retrive attributes from HashMap
					 */
					for (Map.Entry<String, String> entrySet : tmpAtrb.entrySet()) {
						System.out.println(
								"Attribute Name :" + entrySet.getKey() + "Attribute Value :" + entrySet.getValue());
					}
					System.out.println("Element Value :" + tmpElementValue);
					xmlValue.put(tmpElementName, tmpElementValue);

					String getKeyValues = xmlValue.get(tmpElementName);
					System.out
							.println("XmlTag: " + tmpElementName + ":::::" + "ValueFetchedFromTheMap: " + getKeyValues);

				}
			}

			@Override
			public void characters(char ch[], int start, int length) throws SAXException {
				tmpElementValue = new String(ch, start, length);
			}

		};

		saxParser.parse(new File("D:\\XML4.xml"), handler);
	}
}
