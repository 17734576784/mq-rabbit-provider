/**   
* @Title: RabbitMessage.java 
* @Package com.nb.model 
* @Description: TODO(用一句话描述该文件做什么) 
* @author dbr
* @date 2020年2月24日 上午11:46:20 
* @version V1.0   
*/
package com.dbr.model;

import java.io.Serializable;
import java.util.Map;

/** 
* @ClassName: RabbitMessage 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author dbr
* @date 2020年2月24日 上午11:46:20 
*  
*/
public class RabbitMessage implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 6660819358286496296L;
	private String deviceId;
	private Map<String, String> serviceMap;
	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}
	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	/**
	 * @return the serviceMap
	 */
	public Map<String, String> getServiceMap() {
		return serviceMap;
	}
	/**
	 * @param serviceMap the serviceMap to set
	 */
	public void setServiceMap(Map<String, String> serviceMap) {
		this.serviceMap = serviceMap;
	}
	/** 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param deviceId
	* @param serviceMap 
	*/
	public RabbitMessage(String deviceId, Map<String, String> serviceMap) {
		super();
		this.deviceId = deviceId;
		this.serviceMap = serviceMap;
	}
	/** (非 Javadoc) 
	* <p>Title: toString</p> 
	* <p>Description: </p> 
	* @return 
	* @see java.lang.Object#toString() 
	*/
	@Override
	public String toString() {
		return "RabbitMessage [deviceId=" + deviceId + ", serviceMap=" + serviceMap + "]";
	}
	
}
