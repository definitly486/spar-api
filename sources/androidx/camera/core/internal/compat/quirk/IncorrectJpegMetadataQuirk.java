package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.agtfadlqog;
import istkbnxepw.vipkmwdibw;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Set f3918iobyxmoadg = new HashSet(Arrays.asList("A24"));

    private static boolean eablkybsjg() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f3918iobyxmoadg.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    static boolean lqeggnwhkg() {
        return eablkybsjg();
    }

    private boolean ppxfxbqfkf(byte[] bArr) {
        byte b13;
        int i13 = 2;
        while (i13 + 4 <= bArr.length && (b13 = bArr[i13]) == -1) {
            if (b13 == -1 && bArr[i13 + 1] == -38) {
                return true;
            }
            i13 += (((bArr[i13 + 2] & 255) << 8) | (bArr[i13 + 3] & 255)) + 2;
        }
        return false;
    }

    private int wkgbmnqykc(byte[] bArr) {
        int i13 = 2;
        while (true) {
            int i14 = i13 + 1;
            if (i14 > bArr.length) {
                return -1;
            }
            if (bArr[i13] == -1 && bArr[i14] == -40) {
                return i13;
            }
            i13 = i14;
        }
    }

    public byte[] gxszxtbevo(agtfadlqog agtfadlqogVar) {
        int iWkgbmnqykc = 0;
        ByteBuffer byteBufferZoijcleaow = agtfadlqogVar.eslsurpljm()[0].zoijcleaow();
        byte[] bArr = new byte[byteBufferZoijcleaow.capacity()];
        byteBufferZoijcleaow.rewind();
        byteBufferZoijcleaow.get(bArr);
        return (ppxfxbqfkf(bArr) || (iWkgbmnqykc = wkgbmnqykc(bArr)) != -1) ? Arrays.copyOfRange(bArr, iWkgbmnqykc, byteBufferZoijcleaow.limit()) : bArr;
    }
}
