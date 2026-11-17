package kk;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xd0 {
    public static final int iobyxmoadg(Context context, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "<this>");
        return (int) TypedValue.applyDimension(1, i13, context.getResources().getDisplayMetrics());
    }

    public static final void ppxfxbqfkf(androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVar, View view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oxmwwwfdhmVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        Object systemService = oxmwwwfdhmVar.getSystemService("input_method");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void zoijcleaow(Context context, View view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        if (view.requestFocus()) {
            Object systemService = context.getSystemService("input_method");
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        }
    }
}
