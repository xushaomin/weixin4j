package com.foxinmy.weixin4j.http.factory;

import org.apache.http.util.VersionInfo;

import com.foxinmy.weixin4j.http.HttpClient;

/**
 * 使用Apache的HttpClient4.x
 * 
 * @className HttpComponent4Factory
 * @author jy
 * @date 2015年8月12日
 * @since JDK 1.7
 * @see
 */
public class HttpComponent4Factory extends HttpClientFactory {

	@Override
	public HttpClient newInstance() {
		VersionInfo version = VersionInfo.loadVersionInfo(
				"org.apache.http.client", HttpClient.class.getClassLoader());
		String release = (version != null) ? version.getRelease()
				: VersionInfo.UNAVAILABLE;
		if (release.startsWith("4.")) {
			if (release.startsWith("4.0") || release.startsWith("4.1")
					|| release.startsWith("4.2")) {
				return new HttpComponent4_1();
			} else {
				return new HttpComponent4_2();
			}
		}
		throw new RuntimeException("unknown the HttpClient version:" + release);
	}
}
