package xe;

import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class btonecajqb extends vdvldrhtss {
    @Override // xe.agtfadlqog
    protected Collection gxszxtbevo() {
        return Collections.singleton(com.google.zxing.iobyxmoadg.EAN_13);
    }

    @Override // xe.agtfadlqog
    public boolean[] wkgbmnqykc(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + rgvfuqvkyq.zoijcleaow(str);
            } catch (FormatException e13) {
                throw new IllegalArgumentException(e13);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!rgvfuqvkyq.iobyxmoadg(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        agtfadlqog.ppxfxbqfkf(str);
        int i13 = dxjokdxxww.f122206gxszxtbevo[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iZoijcleaow = agtfadlqog.zoijcleaow(zArr, 0, rgvfuqvkyq.f122219iobyxmoadg, true);
        for (int i14 = 1; i14 <= 6; i14++) {
            int iDigit = Character.digit(str.charAt(i14), 10);
            if (((i13 >> (6 - i14)) & 1) == 1) {
                iDigit += 10;
            }
            iZoijcleaow += agtfadlqog.zoijcleaow(zArr, iZoijcleaow, rgvfuqvkyq.f122218eablkybsjg[iDigit], false);
        }
        int iZoijcleaow2 = iZoijcleaow + agtfadlqog.zoijcleaow(zArr, iZoijcleaow, rgvfuqvkyq.f122222zoijcleaow, false);
        for (int i15 = 7; i15 <= 12; i15++) {
            iZoijcleaow2 += agtfadlqog.zoijcleaow(zArr, iZoijcleaow2, rgvfuqvkyq.f122221wkgbmnqykc[Character.digit(str.charAt(i15), 10)], true);
        }
        agtfadlqog.zoijcleaow(zArr, iZoijcleaow2, rgvfuqvkyq.f122219iobyxmoadg, true);
        return zArr;
    }
}
