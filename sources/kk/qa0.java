package kk;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qa0 {
    public static int iobyxmoadg(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final ms ppxfxbqfkf(long j13, String currency) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(currency, "currency");
        int i13 = R.string.spay_currency_pattern;
        Object[] args = {zoijcleaow(j13), currency};
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        return new ms(i13, hg.agtfadlqog.i(args));
    }

    public static final String zoijcleaow(long j13) {
        int i13 = 0;
        boolean z13 = j13 < 0;
        String strLxfrhoxuzk = mj.kcexrzcfyt.lxfrhoxuzk(String.valueOf(j13), "-");
        if (strLxfrhoxuzk.length() == 2 && j13 != 0) {
            return ir.zoijcleaow("0," + strLxfrhoxuzk, z13);
        }
        if (strLxfrhoxuzk.length() <= 2 || j13 == 0) {
            if (j13 == 0) {
                return CommonUrlParts.Values.FALSE_INTEGER;
            }
            return ir.zoijcleaow(strLxfrhoxuzk + ",0", z13);
        }
        String string = mj.kcexrzcfyt.fiwbwshyhd(strLxfrhoxuzk, strLxfrhoxuzk.length() - 2, strLxfrhoxuzk.length() - 2, StringUtils.COMMA).toString();
        for (int length = string.length() - 4; -1 < length; length--) {
            i13++;
            if (i13 != 0 && i13 % 3 == 0 && length != 0) {
                string = mj.kcexrzcfyt.fiwbwshyhd(string, length, length, " ").toString();
            }
        }
        if (string.charAt(string.length() - 1) == '0' && string.charAt(string.length() - 2) == '0') {
            string = mj.kcexrzcfyt.wizcaqwiak(string, string.length() - 3, string.length()).toString();
        }
        return ir.zoijcleaow(string, z13);
    }
}
