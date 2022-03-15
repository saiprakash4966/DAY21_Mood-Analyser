package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class TestAnalyser
{
	/**
	 * Identifies a method as a test method.
	 */
	@Test
	/**
	 * created method analyseSadMood() for getting mood as sad
	 */
	public void analyseSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		moodAnalyser.setMessage("I am in Sad Mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", actualResult);
	}

	@Test
	/**
	 * created method analyseAnyMood() for getting mood as Happy
	 */
	public void analyseHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		moodAnalyser.setMessage("I am in Happy Mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", actualResult);
	}
}