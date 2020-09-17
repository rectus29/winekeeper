package com.rectus29.winekeeper.enums;

/*-----------------------------------------------------*/
/*						Rectus29					   */
/*                Date: 13/06/2018 16:28               */
/*                 All right reserved                  */
/*-----------------------------------------------------*/

import java.util.Arrays;
import java.util.List;

public enum State {
	DISABLE, ENABLE, PENDING, DELETED, ERROR, LOCKED;

	public static List<State> enabledState = Arrays.asList(ENABLE, PENDING, LOCKED, ERROR);

	public boolean isEnable() {
		return enabledState.contains(this);
	}
}
