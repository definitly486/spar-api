package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ylkuphrtab f7141iobyxmoadg = new ylkuphrtab();

    private ylkuphrtab() {
    }

    public final void iobyxmoadg(View view, t.jyumaefscl jyumaefsclVar) {
        PointerIcon pointerIconZoijcleaow = zoijcleaow(view.getContext(), jyumaefsclVar);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(view.getPointerIcon(), pointerIconZoijcleaow)) {
            return;
        }
        view.setPointerIcon(pointerIconZoijcleaow);
    }

    public final PointerIcon zoijcleaow(Context context, t.jyumaefscl jyumaefsclVar) {
        return jyumaefsclVar instanceof t.iobyxmoadg ? PointerIcon.getSystemIcon(context, ((t.iobyxmoadg) jyumaefsclVar).iobyxmoadg()) : PointerIcon.getSystemIcon(context, 1000);
    }
}
