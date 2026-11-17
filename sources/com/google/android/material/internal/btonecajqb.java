package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private oa.wkgbmnqykc f22892lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f22893ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f22894wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TextPaint f22891iobyxmoadg = new TextPaint(1);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oa.gxszxtbevo f22895zoijcleaow = new iobyxmoadg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f22889eablkybsjg = true;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private WeakReference f22890gxszxtbevo = new WeakReference(null);

    class iobyxmoadg extends oa.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // oa.gxszxtbevo
        public void iobyxmoadg(int i13) {
            btonecajqb.this.f22889eablkybsjg = true;
            zoijcleaow zoijcleaowVar = (zoijcleaow) btonecajqb.this.f22890gxszxtbevo.get();
            if (zoijcleaowVar != null) {
                zoijcleaowVar.iobyxmoadg();
            }
        }

        @Override // oa.gxszxtbevo
        public void zoijcleaow(Typeface typeface, boolean z13) {
            if (z13) {
                return;
            }
            btonecajqb.this.f22889eablkybsjg = true;
            zoijcleaow zoijcleaowVar = (zoijcleaow) btonecajqb.this.f22890gxszxtbevo.get();
            if (zoijcleaowVar != null) {
                zoijcleaowVar.iobyxmoadg();
            }
        }
    }

    public interface zoijcleaow {
        int[] getState();

        void iobyxmoadg();

        boolean onStateChange(int[] iArr);
    }

    public btonecajqb(zoijcleaow zoijcleaowVar) {
        btonecajqb(zoijcleaowVar);
    }

    private void dxjokdxxww(String str) {
        this.f22893ppxfxbqfkf = wkgbmnqykc(str);
        this.f22894wkgbmnqykc = ppxfxbqfkf(str);
        this.f22889eablkybsjg = false;
    }

    private float ppxfxbqfkf(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f22891iobyxmoadg.getFontMetrics().ascent);
    }

    private float wkgbmnqykc(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f22891iobyxmoadg.measureText(charSequence, 0, charSequence.length());
    }

    public void agtfadlqog(Context context) {
        this.f22892lqeggnwhkg.agtfadlqog(context, this.f22891iobyxmoadg, this.f22895zoijcleaow);
    }

    public void btonecajqb(zoijcleaow zoijcleaowVar) {
        this.f22890gxszxtbevo = new WeakReference(zoijcleaowVar);
    }

    public void draadjrbmk(boolean z13) {
        this.f22889eablkybsjg = z13;
    }

    public oa.wkgbmnqykc eablkybsjg() {
        return this.f22892lqeggnwhkg;
    }

    public void gtknphoqwx(oa.wkgbmnqykc wkgbmnqykcVar, Context context) {
        if (this.f22892lqeggnwhkg != wkgbmnqykcVar) {
            this.f22892lqeggnwhkg = wkgbmnqykcVar;
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.ojitshcjhn(context, this.f22891iobyxmoadg, this.f22895zoijcleaow);
                zoijcleaow zoijcleaowVar = (zoijcleaow) this.f22890gxszxtbevo.get();
                if (zoijcleaowVar != null) {
                    this.f22891iobyxmoadg.drawableState = zoijcleaowVar.getState();
                }
                wkgbmnqykcVar.agtfadlqog(context, this.f22891iobyxmoadg, this.f22895zoijcleaow);
                this.f22889eablkybsjg = true;
            }
            zoijcleaow zoijcleaowVar2 = (zoijcleaow) this.f22890gxszxtbevo.get();
            if (zoijcleaowVar2 != null) {
                zoijcleaowVar2.iobyxmoadg();
                zoijcleaowVar2.onStateChange(zoijcleaowVar2.getState());
            }
        }
    }

    public float gxszxtbevo(String str) {
        if (!this.f22889eablkybsjg) {
            return this.f22894wkgbmnqykc;
        }
        dxjokdxxww(str);
        return this.f22894wkgbmnqykc;
    }

    public TextPaint lqeggnwhkg() {
        return this.f22891iobyxmoadg;
    }

    public float nufgyqmvbu(String str) {
        if (!this.f22889eablkybsjg) {
            return this.f22893ppxfxbqfkf;
        }
        dxjokdxxww(str);
        return this.f22893ppxfxbqfkf;
    }

    public void wflxmlrfwp(boolean z13) {
        this.f22889eablkybsjg = z13;
    }
}
