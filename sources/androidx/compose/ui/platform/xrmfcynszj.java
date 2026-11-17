package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
interface xrmfcynszj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f7137iobyxmoadg = iobyxmoadg.f7138iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f7138iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public final xrmfcynszj iobyxmoadg() {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                return uwvvkdfqfp.f7095zoijcleaow;
            }
            if (i13 >= 29) {
                return czzsidtyhn.f6845zoijcleaow;
            }
            return i13 >= 28 ? rlfsiqarku.f7042zoijcleaow : metgxyhuhe.f7014zoijcleaow;
        }
    }

    Rect iobyxmoadg(Activity activity);
}
