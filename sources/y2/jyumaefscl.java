package y2;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyumaefscl {
    public static void eablkybsjg(MediaFormat mediaFormat, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            mediaFormat.setByteBuffer("csd-" + i13, ByteBuffer.wrap((byte[]) list.get(i13)));
        }
    }

    public static void iobyxmoadg(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void ppxfxbqfkf(MediaFormat mediaFormat, String str, float f13) {
        if (f13 != -1.0f) {
            mediaFormat.setFloat(str, f13);
        }
    }

    public static void wkgbmnqykc(MediaFormat mediaFormat, String str, int i13) {
        if (i13 != -1) {
            mediaFormat.setInteger(str, i13);
        }
    }

    public static void zoijcleaow(MediaFormat mediaFormat, v2.dxjokdxxww dxjokdxxwwVar) {
        if (dxjokdxxwwVar != null) {
            wkgbmnqykc(mediaFormat, "color-transfer", dxjokdxxwwVar.f115326ppxfxbqfkf);
            wkgbmnqykc(mediaFormat, "color-standard", dxjokdxxwwVar.f115324iobyxmoadg);
            wkgbmnqykc(mediaFormat, "color-range", dxjokdxxwwVar.f115328zoijcleaow);
            iobyxmoadg(mediaFormat, "hdr-static-info", dxjokdxxwwVar.f115327wkgbmnqykc);
        }
    }
}
