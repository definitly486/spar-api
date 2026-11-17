package xe;

import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx extends vdvldrhtss {
    @Override // xe.agtfadlqog
    protected Collection gxszxtbevo() {
        return Collections.singleton(com.google.zxing.iobyxmoadg.EAN_8);
    }

    @Override // xe.agtfadlqog
    public boolean[] wkgbmnqykc(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + rgvfuqvkyq.zoijcleaow(str);
            } catch (FormatException e13) {
                throw new IllegalArgumentException(e13);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
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
        boolean[] zArr = new boolean[67];
        int iZoijcleaow = agtfadlqog.zoijcleaow(zArr, 0, rgvfuqvkyq.f122219iobyxmoadg, true);
        for (int i13 = 0; i13 <= 3; i13++) {
            iZoijcleaow += agtfadlqog.zoijcleaow(zArr, iZoijcleaow, rgvfuqvkyq.f122221wkgbmnqykc[Character.digit(str.charAt(i13), 10)], false);
        }
        int iZoijcleaow2 = iZoijcleaow + agtfadlqog.zoijcleaow(zArr, iZoijcleaow, rgvfuqvkyq.f122222zoijcleaow, false);
        for (int i14 = 4; i14 <= 7; i14++) {
            iZoijcleaow2 += agtfadlqog.zoijcleaow(zArr, iZoijcleaow2, rgvfuqvkyq.f122221wkgbmnqykc[Character.digit(str.charAt(i14), 10)], true);
        }
        agtfadlqog.zoijcleaow(zArr, iZoijcleaow2, rgvfuqvkyq.f122219iobyxmoadg, true);
        return zArr;
    }
}
