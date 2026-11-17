package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import v1.g;
import v1.jhduphickx;
import v1.pkzmftpjix;
import v1.skhdrjzrfn;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ojitshcjhn {

    class iobyxmoadg implements pkzmftpjix {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f22995yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f22996zdlpuopuiu;

        iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, wkgbmnqykc wkgbmnqykcVar) {
            this.f22996zdlpuopuiu = ppxfxbqfkfVar;
            this.f22995yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // v1.pkzmftpjix
        public skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar) {
            return this.f22996zdlpuopuiu.iobyxmoadg(view, skhdrjzrfnVar, new wkgbmnqykc(this.f22995yggfygwlhe));
        }
    }

    public interface ppxfxbqfkf {
        skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar, wkgbmnqykc wkgbmnqykcVar);
    }

    class zoijcleaow implements View.OnAttachStateChangeListener {
        zoijcleaow() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            jhduphickx.ydmasvzmpa(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static PorterDuff.Mode btonecajqb(int i13, PorterDuff.Mode mode) {
        if (i13 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i13 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i13 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i13) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void draadjrbmk(final View view, final boolean z13) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.agtfadlqog
            @Override // java.lang.Runnable
            public final void run() {
                ojitshcjhn.wflxmlrfwp(view, z13);
            }
        });
    }

    private static InputMethodManager eablkybsjg(View view) {
        return (InputMethodManager) androidx.core.content.iobyxmoadg.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static void gtknphoqwx(View view) {
        if (jhduphickx.kegysxyocb(view)) {
            jhduphickx.ydmasvzmpa(view);
        } else {
            view.addOnAttachStateChangeListener(new zoijcleaow());
        }
    }

    public static float gxszxtbevo(View view) {
        float fYggfygwlhe = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fYggfygwlhe += jhduphickx.yggfygwlhe((View) parent);
        }
        return fYggfygwlhe;
    }

    public static void lqeggnwhkg(View view, boolean z13) {
        g gVarHcddaimhww;
        if (z13 && (gVarHcddaimhww = jhduphickx.hcddaimhww(view)) != null) {
            gVarHcddaimhww.iobyxmoadg(skhdrjzrfn.draadjrbmk.wkgbmnqykc());
            return;
        }
        InputMethodManager inputMethodManagerEablkybsjg = eablkybsjg(view);
        if (inputMethodManagerEablkybsjg != null) {
            inputMethodManagerEablkybsjg.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean nufgyqmvbu(View view) {
        return jhduphickx.lereixgezr(view) == 1;
    }

    public static float ppxfxbqfkf(Context context, int i13) {
        return TypedValue.applyDimension(1, i13, context.getResources().getDisplayMetrics());
    }

    public static void wflxmlrfwp(View view, boolean z13) {
        g gVarHcddaimhww;
        if (!z13 || (gVarHcddaimhww = jhduphickx.hcddaimhww(view)) == null) {
            eablkybsjg(view).showSoftInput(view, 1);
        } else {
            gVarHcddaimhww.eablkybsjg(skhdrjzrfn.draadjrbmk.wkgbmnqykc());
        }
    }

    public static Integer wkgbmnqykc(View view) {
        ColorStateList colorStateListGxszxtbevo = com.google.android.material.drawable.wkgbmnqykc.gxszxtbevo(view.getBackground());
        if (colorStateListGxszxtbevo != null) {
            return Integer.valueOf(colorStateListGxszxtbevo.getDefaultColor());
        }
        return null;
    }

    public static void zoijcleaow(View view, ppxfxbqfkf ppxfxbqfkfVar) {
        jhduphickx.igdgnonuha(view, new iobyxmoadg(ppxfxbqfkfVar, new wkgbmnqykc(jhduphickx.yadqdtsiqt(view), view.getPaddingTop(), jhduphickx.cdpycssgdh(view), view.getPaddingBottom())));
        gtknphoqwx(view);
    }

    public static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f22997iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f22998ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f22999wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f23000zoijcleaow;

        public wkgbmnqykc(int i13, int i14, int i15, int i16) {
            this.f22997iobyxmoadg = i13;
            this.f23000zoijcleaow = i14;
            this.f22998ppxfxbqfkf = i15;
            this.f22999wkgbmnqykc = i16;
        }

        public wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar) {
            this.f22997iobyxmoadg = wkgbmnqykcVar.f22997iobyxmoadg;
            this.f23000zoijcleaow = wkgbmnqykcVar.f23000zoijcleaow;
            this.f22998ppxfxbqfkf = wkgbmnqykcVar.f22998ppxfxbqfkf;
            this.f22999wkgbmnqykc = wkgbmnqykcVar.f22999wkgbmnqykc;
        }
    }
}
