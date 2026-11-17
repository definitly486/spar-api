package kk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gb0 {
    public static final void iobyxmoadg(final View view, final View view2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view2, "view");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: kk.fb0
            @Override // java.lang.Runnable
            public final void run() {
                gb0.zoijcleaow(view, view2);
            }
        }, 100);
    }

    public static final void zoijcleaow(View this_showDelayedKeyboard, View view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this_showDelayedKeyboard, "$this_showDelayedKeyboard");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "$view");
        Context context = this_showDelayedKeyboard.getContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "context");
        xd0.zoijcleaow(context, view);
    }
}
