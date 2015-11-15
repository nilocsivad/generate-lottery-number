/**
 * 
 */
package com.iam_vip.generate_lottery_number.instance;

import java.util.Random;

import com.iam_vip.generate_lottery_number.LotteryNumber;

/**
 * @author niloc
 *
 */
public class BiColor extends LotteryNumber {

	private static final int R_LEN = 33, B_LEN = 16;
	private byte[] ARR_R = new byte[R_LEN];

	/**
	 * 
	 */
	public BiColor() {
		for (int i = 0; i < R_LEN; ++i)
			ARR_R[i] = 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.iam_vip.generate_lottery_number.LotteryNumber#generate()
	 */
	@Override
	public String generate() {

		for (int i = 0; i < 6; ++i) {
			int idx = new Random().nextInt(99) % R_LEN;
			this.putR(idx);
		}

		StringBuffer buffer = new StringBuffer(15);
		for (int i = 0; i < R_LEN; ++i) {
			byte b = ARR_R[i];
			if (b == 1) {
				int n = i + 1;
				buffer.append(n <= 9 ? "0" + n : n);
			}
		}

		int b = new Random().nextInt(32) % B_LEN;
		int n = b + 1;
		buffer.append(" " + (n <= 9 ? "0" + n : n));

		return buffer.toString();
	}

	private void putR(int idx) {

		if (ARR_R[idx] == 1) {
			idx = new Random().nextInt(99) % R_LEN;
			idx = Math.abs(idx);
			this.putR(idx);
		} else {
			ARR_R[idx] = 1;
		}
	}

}
