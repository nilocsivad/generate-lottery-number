/**
 * 
 */
package com.iam_vip.generate_lottery_number;

import com.iam_vip.generate_lottery_number.instance.BiColor;

/**
 * @author niloc
 *
 */
public class LotteryFactory {

	/**
	 * 
	 */
	private LotteryFactory() {
	}

	public static LotteryNumber getLottery(final String type) {
		LotteryNumber instance = null;
		switch (type) {
		case "bicolor":
		case "double color ball":
			instance = new BiColor();
			break;
		case "":
		default:
			break;
		}
		return instance;
	}

}
