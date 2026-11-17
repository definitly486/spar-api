package v1;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final PointerIcon f115110iobyxmoadg;

    static class iobyxmoadg {
        static PointerIcon iobyxmoadg(Context context, int i13) {
            return PointerIcon.getSystemIcon(context, i13);
        }
    }

    private cllcsxoeiz(PointerIcon pointerIcon) {
        this.f115110iobyxmoadg = pointerIcon;
    }

    public static cllcsxoeiz zoijcleaow(Context context, int i13) {
        return new cllcsxoeiz(iobyxmoadg.iobyxmoadg(context, i13));
    }

    public Object iobyxmoadg() {
        return this.f115110iobyxmoadg;
    }
}
