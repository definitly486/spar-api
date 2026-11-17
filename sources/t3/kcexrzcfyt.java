package t3;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcexrzcfyt {
    public static boolean eablkybsjg(vdvldrhtss vdvldrhtssVar, int i13) {
        try {
            vdvldrhtssVar.draadjrbmk(i13);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static void iobyxmoadg(boolean z13, String str) throws ParserException {
        if (!z13) {
            throw ParserException.iobyxmoadg(str, null);
        }
    }

    public static int ppxfxbqfkf(vdvldrhtss vdvldrhtssVar, byte[] bArr, int i13, int i14) {
        int i15 = 0;
        while (i15 < i14) {
            int iGtknphoqwx = vdvldrhtssVar.gtknphoqwx(bArr, i13 + i15, i14 - i15);
            if (iGtknphoqwx == -1) {
                break;
            }
            i15 += iGtknphoqwx;
        }
        return i15;
    }

    public static boolean wkgbmnqykc(vdvldrhtss vdvldrhtssVar, byte[] bArr, int i13, int i14) {
        try {
            vdvldrhtssVar.readFully(bArr, i13, i14);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zoijcleaow(vdvldrhtss vdvldrhtssVar, byte[] bArr, int i13, int i14, boolean z13) throws EOFException {
        try {
            return vdvldrhtssVar.ppxfxbqfkf(bArr, i13, i14, z13);
        } catch (EOFException e13) {
            if (z13) {
                return false;
            }
            throw e13;
        }
    }
}
