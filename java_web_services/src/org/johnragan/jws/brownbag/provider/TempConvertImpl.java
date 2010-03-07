package org.johnragan.jws.brownbag.provider;

import javax.jws.WebService;

import org.johnragan.jws.brownbag.provider.TempConvert;

/**
 * Service Interface Bean (SIB)
 * @author John
 *
 */
@WebService(endpointInterface = "org.johnragan.jws.brownbag.provider.TempConvert")
public class TempConvertImpl implements TempConvert {

	@Override
	public float c2f(float c) {
		return 32.0f + (c * 9.0f / 5.0f); 
	}

	@Override
	public float f2c(float f) {
		return (5.0f / 9.0f) * (f - 32.0f);
	}

}
