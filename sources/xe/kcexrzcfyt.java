package xe;

import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class kcexrzcfyt extends vdvldrhtss {
    @Override // xe.agtfadlqog
    protected Collection gxszxtbevo() {
        return Collections.singleton(com.google.zxing.iobyxmoadg.UPC_E);
    }

    @Override // xe.agtfadlqog
    public boolean[] wkgbmnqykc(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + rgvfuqvkyq.zoijcleaow(oxmwwwfdhm.ppxfxbqfkf(str));
            } catch (FormatException e13) {
                throw new IllegalArgumentException(e13);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!rgvfuqvkyq.iobyxmoadg(oxmwwwfdhm.ppxfxbqfkf(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        agtfadlqog.ppxfxbqfkf(str);
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i13 = oxmwwwfdhm.f122216lqeggnwhkg[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iZoijcleaow = agtfadlqog.zoijcleaow(zArr, 0, rgvfuqvkyq.f122219iobyxmoadg, true);
        for (int i14 = 1; i14 <= 6; i14++) {
            int iDigit2 = Character.digit(str.charAt(i14), 10);
            if (((i13 >> (6 - i14)) & 1) == 1) {
                iDigit2 += 10;
            }
            iZoijcleaow += agtfadlqog.zoijcleaow(zArr, iZoijcleaow, rgvfuqvkyq.f122218eablkybsjg[iDigit2], false);
        }
        agtfadlqog.zoijcleaow(zArr, iZoijcleaow, rgvfuqvkyq.f122220ppxfxbqfkf, false);
        return zArr;
    }
}
