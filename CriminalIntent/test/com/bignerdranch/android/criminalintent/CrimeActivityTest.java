package com.bignerdranch.android.criminalintent;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import android.content.Intent;

@RunWith(RobolectricTestRunner.class)
public class CrimeActivityTest {

	private CrimeActivity mActivity;
	
	@Before
	public void setup() {
		mActivity = new CrimeActivity();
		Intent intent = new Intent();
		intent.putExtra(CrimeFragment.EXTRA_CRIME_ID, UUID.randomUUID());
		mActivity.setIntent(intent);
	}

	@Test
	public void testFragmentType() throws Exception {
		assertEquals(true, mActivity.createFragment() instanceof CrimeFragment);
	}
}
