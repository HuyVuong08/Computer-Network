try {
	// Get hostname by textual representation of IP address
	InetAddress addr = InetAddress.getByName("127.0.0.1");
	// Get hostname by a byte array containing the IP address
	byte[] ipAddr = new byte[]{127, 0, 0, 1};
	addr = InetAddress.getByAddress(ipAddr);
	// Get the host name
	String hostname = addr.getHostName();
	// Get canonical host name
	String hostnameCanonical = addr.getCanonicalHostName();
}
catch (UnknownHostException e) {
}