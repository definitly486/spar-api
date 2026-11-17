package c60;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {
    public static final void btonecajqb(View view, boolean z13, int i13, int i14) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        dxjokdxxww(view, z13, i1.nufgyqmvbu.nufgyqmvbu(view.getContext().getResources(), i13), i1.nufgyqmvbu.nufgyqmvbu(view.getContext().getResources(), i14));
    }

    public static final void draadjrbmk(TypedArray typedArray, draadjrbmk block) {
        zdlpuopuiu.btonecajqb(typedArray, "<this>");
        zdlpuopuiu.btonecajqb(block, "block");
        try {
            block.invoke(typedArray);
        } finally {
            typedArray.recycle();
        }
    }

    public static final void dxjokdxxww(View view, boolean z13, float f13, float f14) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        if (!z13) {
            f13 = f14;
        }
        view.setAlpha(f13);
    }

    public static final int eablkybsjg(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        return lqeggnwhkg(view).top + gxszxtbevo(view)[1];
    }

    public static /* synthetic */ void gtknphoqwx(View view, boolean z13, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = s40.eablkybsjg.button_enabled_alpha;
        }
        if ((i15 & 4) != 0) {
            i14 = s40.eablkybsjg.button_disabled_alpha;
        }
        btonecajqb(view, z13, i13, i14);
    }

    public static final int[] gxszxtbevo(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    public static final int iobyxmoadg(View view, int i13) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        return i1.nufgyqmvbu.wkgbmnqykc(view.getResources(), i13, null);
    }

    public static final Rect lqeggnwhkg(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        Context context = view.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        DisplayMetrics displayMetricsZoijcleaow = zoijcleaow(context);
        return new Rect(0, 0, displayMetricsZoijcleaow.widthPixels, displayMetricsZoijcleaow.heightPixels);
    }

    public static final LayoutInflater nufgyqmvbu(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }

    public static final int[] ppxfxbqfkf(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static final String wkgbmnqykc(View view, int i13) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        String string = view.getResources().getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        return string;
    }

    public static final DisplayMetrics zoijcleaow(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = context.getDisplay();
            zdlpuopuiu.dxjokdxxww(display, "getDisplay(...)");
            display.getRealMetrics(displayMetrics);
        } else {
            Object systemService = context.getSystemService("window");
            zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        return displayMetrics;
    }
}
