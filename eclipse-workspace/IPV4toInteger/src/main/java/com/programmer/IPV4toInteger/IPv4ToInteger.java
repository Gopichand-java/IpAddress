package com.programmer.IPV4toInteger;

/**
 * IPv4ToInteger
 *
 */
public class IPv4ToInteger 
{
	/**
	 * converting IPV4 to 32 bit integer address
	 *
	 */
	public int ipToInt(String IPv4Address) {

	    String[] ipAddressInArray = IPv4Address.split("\\.");

	    long address = 0;
	    
	    for (int i = 0; i < ipAddressInArray.length; i++) {

	        int power = 3 - i;
	        int ip = Integer.parseInt(ipAddressInArray[i]);
	        address +=  ip * Math.pow(256, power);
	       
	    }
	    
	    String temp = Long.toString(address);

	    return Integer.parseUnsignedInt(temp, 8);
	  }
	
	
	public static void main(String[] args)
	{
		IPv4ToInteger IPinteger = new IPv4ToInteger();
		String ipv4 = "192.168.1.1";
		Integer result = IPinteger.ipToInt(ipv4);
		System.out.println(result);
	}
}
