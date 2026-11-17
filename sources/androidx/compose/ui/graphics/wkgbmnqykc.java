package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import h.ribwqtqdhb;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f6377zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ColorFilter f6378iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ wkgbmnqykc zoijcleaow(iobyxmoadg iobyxmoadgVar, long j13, int i13, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                i13 = ppxfxbqfkf.f6357iobyxmoadg.lereixgezr();
            }
            return iobyxmoadgVar.iobyxmoadg(j13, i13);
        }

        public final wkgbmnqykc iobyxmoadg(long j13, int i13) {
            return new ribwqtqdhb(j13, i13, (gtknphoqwx) null);
        }

        private iobyxmoadg() {
        }
    }

    public wkgbmnqykc(ColorFilter colorFilter) {
        this.f6378iobyxmoadg = colorFilter;
    }

    public final ColorFilter iobyxmoadg() {
        return this.f6378iobyxmoadg;
    }
}
