package com.insurance.integration.cc.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.apache.cxf.message.Message;

import com.insurance.integration.common.client.AbstractServiceClient;
import com.insurance.integration.common.util.IntegrationTools;
import com.insurance.integration.context.BusinessServiceClientFactory;
import com.insurance.integration.domain.gen.weatherService.Weather;
import com.insurance.integration.domain.gen.weatherService.WeatherReturn;
import com.insurance.integration.domain.gen.weatherService.WeatherSoap;
/**
 * Sample weather service client for demonstration
 * This is a free web service, And available only for US
 * http://wsf.cdyne.com/WeatherWS/Weather.asmx?op=GetCityWeatherByZIP
 * Example San Francisco(Post Code- 94101)
 * @author Shivanand
 *
 */
public class WeatherServiceClient extends AbstractServiceClient {
	
	public WeatherReturn getCityWeatherByZIP(String zip) {
		WeatherReturn result = new WeatherReturn();
		WeatherSoap weatherService = getWeatherService();
		result = weatherService.getCityWeatherByZIP(zip);
		return result; 
	}
	
	public WeatherSoap getWeatherService() {
		return (WeatherSoap) BusinessServiceClientFactory
				.getBusinessService("weatherService");
		 
	}

}
