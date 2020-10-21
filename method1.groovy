def method(){
	if(!binding.hasVariable('domain')) {
	    domain = 'example.com'
	}

	if(!(domain in String)) {
	    throw new Exception('PARAMETER ERROR: domain must be a string.')
	}

	InetAddress dnsInetAddress = InetAddress.getByName domain
	//print IP address
	println dnsInetAddress.hostAddress
}
