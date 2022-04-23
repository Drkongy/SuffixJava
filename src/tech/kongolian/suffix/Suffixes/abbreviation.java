package tech.kongolian.suffix.Suffixes;

import java.text.DecimalFormat;

public class abbreviation {
    public double _number;

    public abbreviation(double number) {
        this._number = number;
    }

    public DecimalFormat df = new DecimalFormat("#.##");

    public String Output() {
        // return something

        if (_number >= 1e306) {
            return df.format(_number / 1e306) + " UNCENT";
        } else if (_number >= 1e303) {
            return df.format(_number / 1e303) + " CENT";
        } else if (_number >= 1e300) {
            return df.format(_number / 1e300) + " NONONGNTL";
        } else if (_number >= 1e297) {
            return df.format(_number / 1e297) + " OTNONGNTL";
        } else if (_number >= 1e294) {
            return df.format(_number / 1e294) + " SPNONGNTL";
        } else if (_number >= 1e291) {
            return df.format(_number / 1e291) + " SXNONGNTL";
        } else if (_number >= 1e288) {
            return df.format(_number / 1e288) + " QNNONGNTL";
        } else if (_number >= 1e285) {
            return df.format(_number / 1e285) + " QTNONGNTL";
        } else if (_number >= 1e282) {
            return df.format(_number / 1e282) + " TNONGNTL";
        } else if (_number >= 1e279) {
            return df.format(_number / 1e279) + " DNONGNTL";
        } else if (_number >= 1e276) {
            return df.format(_number / 1e276) + " UNONGNTL";
        } else if (_number >= 1e273) {
            return df.format(_number / 1e273) + " NONGNTL";
        } else if (_number >= 1e270) {
            return df.format(_number / 1e270) + " NVOTGNTL";
        } else if (_number >= 1e267) {
            return df.format(_number / 1e267) + " OTOTGNTL";
        } else if (_number >= 1e264) {
            return df.format(_number / 1e264) + " SPOTGNTL";
        } else if (_number >= 1e261) {
            return df.format(_number / 1e261) + " SXOTGNTL";
        } else if (_number >= 1e258) {
            return df.format(_number / 1e258) + " QNOTGNTL";
        } else if (_number >= 1e255) {
            return df.format(_number / 1e255) + " QTOTGNTL";
        } else if (_number >= 1e252) {
            return df.format(_number / 1e252) + " TOTGNTL";
        } else if (_number >= 1e249) {
            return df.format(_number / 1e249) + " DOTGNTL";
        } else if (_number >= 1e246) {
            return df.format(_number / 1e246) + " UOTGNTL";
        } else if (_number >= 1e243) {
            return df.format(_number / 1e243) + " OTGNTL";
        } else if (_number >= 1e240) {
            return df.format(_number / 1e240) + " NVSPTGNTL";
        } else if (_number >= 1e237) {
            return df.format(_number / 1e237) + " OSPTGNTL";
        } else if (_number >= 1e234) {
            return df.format(_number / 1e234) + " SPSPTGNTL";
        } else if (_number >= 1e231) {
            return df.format(_number / 1e231) + " SXSPTGNTL";
        } else if (_number >= 1e228) {
            return df.format(_number / 1e228) + " QNSPTGNTL";
        } else if (_number >= 1e225) {
            return df.format(_number / 1e225) + " QTSPTGNTL";
        } else if (_number >= 1e222) {
            return df.format(_number / 1e222) + " TSPTGNTL";
        } else if (_number >= 1e219) {
            return df.format(_number / 1e219) + " DSPTGNTL";
        } else if (_number >= 1e216) {
            return df.format(_number / 1e216) + " USPTGNTL";
        } else if (_number >= 1e213) {
            return df.format(_number / 1e213) + " SPTGNTL";
        } else if (_number >= 1e210) {
            return df.format(_number / 1e210) + " NVSXGNTL";
        } else if (_number >= 1e207) {
            return df.format(_number / 1e207) + " OSXGNTL";
        } else if (_number >= 1e204) {
            return df.format(_number / 1e204) + " SPSXGNTL";
        } else if (_number >= 1e201) {
            return df.format(_number / 1e201) + " SXSXGNTL";
        } else if (_number >= 1e198) {
            return df.format(_number / 1e198) + " QNSXGNTL";
        } else if (_number >= 1e195) {
            return df.format(_number / 1e195) + " QTSXGNTL";
        } else if (_number >= 1e192) {
            return df.format(_number / 1e192) + " TSXGNTL";
        } else if (_number >= 1e189) {
            return df.format(_number / 1e189) + " DSXGNTL";
        } else if (_number >= 1e186) {
            return df.format(_number / 1e186) + " USXGNTL";
        } else if (_number >= 1e183) {
            return df.format(_number / 1e183) + " SXGNTL";
        } else if (_number >= 1e180) {
            return df.format(_number / 1e180) + " NQQGNT";
        } else if (_number >= 1e177) {
            return df.format(_number / 1e177) + " OQQGNT";
        } else if (_number >= 1e174) {
            return df.format(_number / 1e174) + " SpQGNT";
        } else if (_number >= 1e171) {
            return df.format(_number / 1e171) + " sxQGNT";
        } else if (_number >= 1e168) {
            return df.format(_number / 1e168) + " QnQGNT";
        } else if (_number >= 1e165) {
            return df.format(_number / 1e165) + " qdQGNT";
        } else if (_number >= 1e162) {
            return df.format(_number / 1e162) + " tQGNT";
        } else if (_number >= 1e159) {
            return df.format(_number / 1e159) + " dQGNT";
        } else if (_number >= 1e156) {
            return df.format(_number / 1e156) + " uQGNT";
        } else if (_number >= 1e153) {
            return df.format(_number / 1e153) + " qQGNT";
        } else if (_number >= 1e150) {
            return df.format(_number / 1e150) + " NQDDr";
        } else if (_number >= 1e147) {
            return df.format(_number / 1e147) + " OQDDr";
        } else if (_number >= 1e144) {
            return df.format(_number / 1e144) + " SpQDR";
        } else if (_number >= 1e141) {
            return df.format(_number / 1e141) + " sxQDR";
        } else if (_number >= 1e138) {
            return df.format(_number / 1e138) + " QnQDR";
        } else if (_number >= 1e135) {
            return df.format(_number / 1e135) + " qdQDR";
        } else if (_number >= 1e132) {
            return df.format(_number / 1e132) + " tQDR";
        } else if (_number >= 1e129) {
            return df.format(_number / 1e129) + " dQDR";
        } else if (_number >= 1e126) {
            return df.format(_number / 1e126) + " uQDR";
        } else if (_number >= 1e123) {
            return df.format(_number / 1e123) + " QdDR";
        } else if (_number >= 1e120) {
            return df.format(_number / 1e120) + " NoTG";
        } else if (_number >= 1e117) {
            return df.format(_number / 1e117) + " OcTG";
        } else if (_number >= 1e114) {
            return df.format(_number / 1e114) + " SpTG";
        } else if (_number >= 1e111) {
            return df.format(_number / 1e111) + " ssTG";
        } else if (_number >= 1e108) {
            return df.format(_number / 1e108) + " QnTG";
        } else if (_number >= 1e105) {
            return df.format(_number / 1e105) + " qtTG";
        } else if (_number >= 1e102) {
            return df.format(_number / 1e102) + " tsTG";
        } else if (_number >= 1e99) {
            return df.format(_number / 1e99) + " DTG";
        } else if (_number >= 1e96) {
            return df.format(_number / 1e96) + " UTG";
        } else if (_number >= 1e93) {
            return df.format(_number / 1e93) + " TGN";
        } else if (_number >= 1e90) {
            return df.format(_number / 1e90) + " NVG";
        } else if (_number >= 1e87) {
            return df.format(_number / 1e87) + " OVG";
        } else if (_number >= 1e84) {
            return df.format(_number / 1e84) + " SPG";
        } else if (_number >= 1e81) {
            return df.format(_number / 1e81) + " SeV";
        } else if (_number >= 1e78) {
            return df.format(_number / 1e78) + " QnV";
        } else if (_number >= 1e75) {
            return df.format(_number / 1e75) + " qtV";
        } else if (_number >= 1e72) {
            return df.format(_number / 1e72) + " TVg";
        } else if (_number >= 1e69) {
            return df.format(_number / 1e69) + " DVg";
        } else if (_number >= 1e66) {
            return df.format(_number / 1e66) + " UVg";
        } else if (_number >= 1e63) {
            return df.format(_number / 1e63) + " Vgn";
        } else if (_number >= 1e60) {
            return df.format(_number / 1e60) + " NvD";
        } else if (_number >= 1e57) {
            return df.format(_number / 1e57) + " OcD";
        } else if (_number >= 1e54) {
            return df.format(_number / 1e54) + " SpD";
        } else if (_number >= 1e51) {
            return df.format(_number / 1e51) + " sxD";
        } else if (_number >= 1e48) {
            return df.format(_number / 1e48) + " QnD";
        } else if (_number >= 1e45) {
            return df.format(_number / 1e45) + " qdD";
        } else if (_number >= 1e42) {
            return df.format(_number / 1e42) + " tdD";
        } else if (_number >= 1e39) {
            return df.format(_number / 1e39) + " DD";
        } else if (_number >= 1e36) {
            return df.format(_number / 1e36) + " Ud";
        } else if (_number >= 1e33) {
            return df.format(_number / 1e33) + " de";
        } else if (_number >= 1e30) {
            return df.format(_number / 1e30) + " N";
        } else if (_number >= 1e27) {
            return df.format(_number / 1e27) + " O";
        } else if (_number >= 1e24) {
            return df.format(_number / 1e24) + " Sp";
        } else if (_number >= 1e21) {
            return df.format(_number / 1e21) + " Sx";
        } else if (_number >= 1e18) {
            return df.format(_number / 1e18) + " Qn";
        } else if (_number >= 1e15) {
            return df.format(_number / 1e15) + " qd";
        } else if (_number >= 1e12) {
            return df.format(_number / 1e12) + " T";
        } else if (_number >= 1e9) {
            return df.format(_number / 1e9) + " B";
        } else if (_number >= 1e6) {
            return df.format(_number / 1e6) + " M";
        } else if (_number >= 1e3) {
            return df.format(_number / 1e3) + " K";
        } else {
            return df.format(_number);
        }

    }
}
