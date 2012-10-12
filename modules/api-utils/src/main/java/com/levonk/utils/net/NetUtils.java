package com.levonk.apiutils.net;

import com.google.common.base.Preconditions;

class NetUtils {
	public static int ipV4toInt32( final String octets )
	{
		String[] octetsArray = new String[4];
		Iterable<String> tok = Splitter.on('.').split(octets);
		for ( String octet : tok )
		{
			ret 
		}
		return NetUtils.ipV4toInt32( octetsArray );
	}

	public static int ipV4toInt32( final String[] octets )
	{
	}

	public static String int32ToIpV4( final int ipaddr )
	{
	}

	public static boolean isSameSubnet( final int ip1, final int ip2, final int subnet )
	{
		return isSameSubnet( ip1, ip2, subnet, subnet );
	}

	/** Do these ips fall in the same subnet
		CIDR	decimal		number of addresses		classful	subnets
		/1	128.0.0.0	2147483646	128 A	2
		/2	192.0.0.0	1073741822	64 A	4
		/3	224.0.0.0	536870910	32 A	8
		/4	240.0.0.0	268435454	16 A	16
		/5	248.0.0.0	134217726	8 A		32
		/6	252.0.0.0	67108862	4 A		64
		/7	254.0.0.0	33554430	2 A		128
		/8	255.0.0.0	16777214	1 A		256
		/9	255.128.0.0		8388606		128 B	512
		/10		255.192.0.0		4194302		64 B	1024
		/11		255.224.0.0		2097150		32 B	2048
		/12		255.240.0.0		1048574		16 B	4096
		/13		255.248.0.0		524286	8 B		8192
		/14		255.252.0.0		262142	4 B		16384
		/15		255.254.0.0		131070	2 B		32768
		/16		255.255.0.0		65534	1 B		65536
		/17		255.255.128.0	32766	128 C	131072
		/18		255.255.192.0	16382	64 C	262144
		/19		255.255.224.0	8190	32 C	524288
		/20		255.255.240.0	4094	16 C	1048576
		/21		255.255.248.0	2046	8 C		2097152
		/22		255.255.252.0	1022	4 C		4194304
		/23		255.255.254.0	510		2 C		8388608
		/24		255.255.255.0	254		1 C		16777216
		/25		255.255.255.128		126		1/2 C	33554432
		/26		255.255.255.192		62	1/4 C	67108864
		/27		255.255.255.224		30	1/8 C	134217728
		/28		255.255.255.240		14	1/16 C	268435456
		/29		255.255.255.248		6	1/32 C	536870912
		/30		255.255.255.252		2	1/64 C	1073741824
		/31		255.255.255.254		0	1/128 C		 
		/32		255.255.255.255		1		
	*/
	public static boolean isSameSubnet( final int ip1, final int ip2,
			final int subnet1, final int subnet2 )
	{
		final int net1 = ip1 & subnet1;
		final int net2 = ip2 & subnet2;
		return !(net1 ^ net2); // XOR
	}

	/** Does this IP call in the range of special ips?
		// Private IPS
		// network | network ID | broadcast addr | host addr | class
		// 10/8 | 10.0.0.0 | 10.255.255.255 | 10.0.0.1 - 10.255.255.254 | class A
		// 172.16/12 | 172.16.0.0 | 172.31.255.255 | 172.16.0.1 - 172.31.255.254 | class B
		// 192.168/16 | 192.168.0.0 | 192.168.255.255 | 192.168.0.1 - 192.168.255.254 | class C

		// Special IPs
		// network | network ID | broadcast addr | name
		// 0.0.0.0/32 | - | - | default network ID (zero)
		// 0.0.0.0/8 | 0.0.0.0 | 0.255.255.255 | zero addr
		// 127.0.0.0/8 | 127.0.0.0 | 127.255.255.255 | localhost loopback addr
		// 169.254.0.0/16 | 169.254.0.0 | 169.254.255.255 | zeroconf addres (APIPA)
		// 192.0.2.0/24 | 192.0.2.0 | 192.0.2.255 | documentation and examples
		// 192.18.18.0/23 | 192.18.18.0 | 192.18.19.255 | network device benchmark
		// 192.88.99.0/24 | 192.88.99.0 | 192.88.99.255 | IPv6 to IPv4 relay Anycast
		// 224.0.0.0/4 | - | - | multicast addresses
	*/
	public static boolean isNonSpecialIpV4 ( final int ipaddr )
	{
	}
}
