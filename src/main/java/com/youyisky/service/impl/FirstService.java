package com.youyisky.service.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class FirstService {

	public int Add(int i, int k) throws Exception {

		if (i < 0 || k < 0) {
			throw new Exception();
		}
		return i + k;
	}

}
