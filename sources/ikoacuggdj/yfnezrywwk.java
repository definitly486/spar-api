package ikoacuggdj;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface yfnezrywwk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f44959iobyxmoadg = iobyxmoadg.f44960iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f44960iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public final yfnezrywwk iobyxmoadg() {
            if (jlmebxxoox.wkgbmnqykc(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? ydmasvzmpa.f44957zoijcleaow : sflfametgt.f44913zoijcleaow;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    uwvvkdfqfp iobyxmoadg(View view, boolean z13, long j13, float f13, float f14, boolean z14, w0.wkgbmnqykc wkgbmnqykcVar, float f15);

    boolean zoijcleaow();
}
