package lereixgezr;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface ydmasvzmpa extends Closeable {

    public static abstract class iobyxmoadg {
        public static iobyxmoadg gxszxtbevo(Size size, Rect rect, istkbnxepw.iwizpuwonk iwizpuwonkVar, int i13, boolean z13) {
            return new eablkybsjg(size, rect, iwizpuwonkVar, i13, z13);
        }

        public abstract int eablkybsjg();

        public abstract istkbnxepw.iwizpuwonk iobyxmoadg();

        public abstract Size ppxfxbqfkf();

        public abstract boolean wkgbmnqykc();

        public abstract Rect zoijcleaow();
    }

    public static abstract class zoijcleaow {
        zoijcleaow() {
        }

        public static zoijcleaow ppxfxbqfkf(int i13, ydmasvzmpa ydmasvzmpaVar) {
            return new gxszxtbevo(i13, ydmasvzmpaVar);
        }

        public abstract int iobyxmoadg();

        public abstract ydmasvzmpa zoijcleaow();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    Surface dvvnrvtcbc(Executor executor, u1.iobyxmoadg iobyxmoadgVar);

    int getFormat();

    Size getSize();

    void h(float[] fArr, float[] fArr2);

    void ylkuphrtab(float[] fArr, float[] fArr2, boolean z13);
}
