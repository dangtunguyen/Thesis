public class STAttribute
{
	public String dataType
	public String name
	public List<String> values
	
	public String getDataType(){}
	public String getName(){}
	public List<String> getValues(){}
}
public class STCommand
{
	public List<String> arguments
	public String name
	
	public List<String> getArguments(){}
	public String getName(){}
}
public class STCapability
{
	public List<STAttribute> attributes
	public List<STCommand> commands
	public String name
	
	public List<STAttribute> getAttributes(){}
	public List<STCommand> getCommands(){}
	public String getName(){}
}
public class STState
{
	public double doubleValue
	public double floatValue
	public String name
	public double value
	public String id
	public Integer integerValue
	public Object jsonValue
	public String stringValue
	public double numberValue
	public double numericValue
	public String hubId
	public Date rawDateCreated
	public Date dateCreated
	public Date dateValue
	public Date date
	public STxyz xyzValue
	
	public Date getDate(){}
	public Date getDateValue(){}
	public String getId(){}
	public double getDoubleValue(){}
	public double getFloatValue(){}
	public String getHubId(){}
	public String getInstalledSmartAppId(){}
	public Integer getIntegerValue(){}
	public String getIsoDate(){}
	public Object getJsonValue(){}
	public String getName(){}
	public double getNumberValue(){}
	public double getNumericValue(){}
	public String getStringValue(){}
	public String getUnit(){}
	public double getValue(){}
	public Map<String, BigDecimal> getXyzValue(){}
	public STxyz getXyzValue(){}
}
public class STEvent
{
	public double doubleValue
	public double floatValue
	public String name
	public String value
	public Boolean isStateChange
	public STDevice device
	public String deviceId
	public String hubId
	public Integer integerValue
	public Object jsonValue
	public STLocation location
	public String locationId
	public String source
	public String stringValue
	public double numberValue
	public double numericValue
	public String data
	public Date date
	public Date dateValue
	public String description
	public Boolean physical
	public Boolean type
	
	public String getData(){}
	public Date getDate(){}
	public Date getDateValue(){}
	public String getDescription(){}
	public String getDescriptionText(){}
	public STDevice getDevice(){}
	public String getDisplayName(){}
	public String getDeviceId(){}
	public String getId(){}
	public double getDoubleValue(){}
	public double getFloatValue(){}
	public String getHubId(){}
	public String getInstalledSmartAppId(){}
	public Integer getIntegerValue(){}
	public String getIsoDate(){}
	public Object getJsonValue(){}
	public STLocation getLocation(){}
	public String getLocationId(){}
	public String getName(){}
	public double getNumberValue(){}
	public double getNumericValue(){}
	public String getSource(){}
	public String getStringValue(){}
	public String getUnit(){}
	public String getValue(){}
	public Map<String, BigDecimal> getXyzValue(){}
	public Boolean isDigital(){}
	public Boolean isPhysical(){}
	public Boolean stateChange(){}
}
public class STDevice
{
	public List<STCapability> capabilities
	public String displayName
	public STHub hub
	public String name
	public String id
	public String label
	public String lastActivity
	public String manufacturerName
	public String modelName
	public String status
	public List<STAttribute> supportedAttributes
	public List<STCommand> supportedCommands
	public STState batteryState /* <attribute name>State */
	public double currentBattery /* current<Uppercase attribute name> */
	
	public STState currentState(String attributeName){}
	public List<STEvent> events(double N){}
	public List<STEvent> events(){}
	public List<STEvent> eventsBetween(Date startDate, Date endDate, Map map = [:]){}
	public List<STEvent> eventsBetween(Object startDate, Object endDate, Map map = [:]){}
	public List<STEvent> eventsSince(Date startDate, Map map = [:]){}
	public List<STEvent> eventsSince(Object date){}
	public List<STCapability> getCapabilities(){}
	public String getDisplayName(){}
	public STHub getHub(){}
	public String getName(){}
	public String getId(){}
	public String getLabel(){}
	public String getLastActivity(){}
	public String getManufacturerName(){}
	public String getModelName(){}
	public String getStatus(){}
	public List<STAttribute> getSupportedAttributes(){}
	public List<STCommand> getSupportedCommands(){}
	public Boolean hasAttribute(String attributeName){}
	public Boolean hasCapability(String capabilityName){}
	public Boolean hasCommand(String commandName){}
	public STState latestState(String attributeName){}
	public List<STState> statesBetween(String attributeName, Date startDate, Date endDate, Map map = [:]){}
	public List<STState> statesSince(String attributeName, Date startDate, Map map = [:]){}
}
public class STSwitch extends STDevice /* capability.switch */
{
	public STState switchState /* <attribute name>State */
	public String currentSwitch /* current<Uppercase attribute name> */
	
	public String currentValue(String attributeName){}
	public String latestValue(String attributeName){}
	
	public void on(){}
	public void on(Map map){}
	public void off(){}
	public void off(Map map){}
}