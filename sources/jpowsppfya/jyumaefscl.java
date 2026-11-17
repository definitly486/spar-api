package jpowsppfya;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.utils.ImageUtil;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyumaefscl {
    public static jyumaefscl btonecajqb(Bitmap bitmap, cdpycssgdh.gxszxtbevo gxszxtbevoVar, Rect rect, int i13, Matrix matrix, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
        return new iobyxmoadg(bitmap, gxszxtbevoVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i13, matrix, ojitshcjhnVar);
    }

    public static jyumaefscl draadjrbmk(androidx.camera.core.agtfadlqog agtfadlqogVar, cdpycssgdh.gxszxtbevo gxszxtbevoVar, Size size, Rect rect, int i13, Matrix matrix, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
        if (ImageUtil.lqeggnwhkg(agtfadlqogVar.getFormat())) {
            u1.nufgyqmvbu.lqeggnwhkg(gxszxtbevoVar, "JPEG image must have Exif.");
        }
        return new iobyxmoadg(agtfadlqogVar, gxszxtbevoVar, agtfadlqogVar.getFormat(), size, rect, i13, matrix, ojitshcjhnVar);
    }

    public static jyumaefscl gtknphoqwx(androidx.camera.core.agtfadlqog agtfadlqogVar, cdpycssgdh.gxszxtbevo gxszxtbevoVar, Rect rect, int i13, Matrix matrix, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
        return draadjrbmk(agtfadlqogVar, gxszxtbevoVar, new Size(agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight()), rect, i13, matrix, ojitshcjhnVar);
    }

    public static jyumaefscl wflxmlrfwp(byte[] bArr, cdpycssgdh.gxszxtbevo gxszxtbevoVar, int i13, Size size, Rect rect, int i14, Matrix matrix, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
        return new iobyxmoadg(bArr, gxszxtbevoVar, i13, size, rect, i14, matrix, ojitshcjhnVar);
    }

    public boolean dxjokdxxww() {
        return cdpycssgdh.vdvldrhtss.nufgyqmvbu(zoijcleaow(), nufgyqmvbu());
    }

    public abstract int eablkybsjg();

    public abstract int gxszxtbevo();

    public abstract istkbnxepw.ojitshcjhn iobyxmoadg();

    public abstract Matrix lqeggnwhkg();

    public abstract Size nufgyqmvbu();

    public abstract Object ppxfxbqfkf();

    public abstract cdpycssgdh.gxszxtbevo wkgbmnqykc();

    public abstract Rect zoijcleaow();
}
