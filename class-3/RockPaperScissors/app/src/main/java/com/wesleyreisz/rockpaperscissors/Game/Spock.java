package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by JT on 9/22/2015.
 */
public class Spock implements GameType {

    @Override
    public String eval(Integer opponentChoice) {
        if (opponentChoice == R.id.btnRock) {
            return GameUtils.BEATS;
        } else if (opponentChoice == R.id.btnScissors) {
            return GameUtils.BEATS;
        } else if (opponentChoice == R.id.btnLizard) {
            return GameUtils.LOSES_TO;
        } else if (opponentChoice == R.id.btnPaper) {
            return GameUtils.LOSES_TO;
        } else {
            return GameUtils.TIES;
        }
    }
}