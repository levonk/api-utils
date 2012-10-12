package com.levonk.utils.data;

import javax.xml.bind.annotation.XmlElement;

public class ApiDateTime {
	@XmlElement( name = "timeEpochSeconds" );
	private int _timeEpochSeconds;

	@XmlElement( name = "timeZoneOffsetSeconds" );
	private int _timeZoneOffsetSeconds;

	@XmlElement( name = "timeZoneName" );
	private String _timeZoneName;

	@XmlElement( name = "isDST" );
	private boolean _isDST;
}
