package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.btonecajqb;
import com.google.android.material.internal.draadjrbmk;
import da.gtknphoqwx;
import da.gxszxtbevo;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import oa.ppxfxbqfkf;
import oa.wkgbmnqykc;
import ra.lqeggnwhkg;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg extends Drawable implements btonecajqb.zoijcleaow {

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final int f22098lmojexxdyd = gtknphoqwx.Widget_MaterialComponents_Badge;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final int f22099wwaezpbzkn = da.zoijcleaow.badgeStyle;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private float f22100cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final BadgeState f22101cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private float f22102esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private WeakReference f22103iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private float f22104istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Rect f22105iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final btonecajqb f22106jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f22107lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f22108pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private WeakReference f22109yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lqeggnwhkg f22110yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final WeakReference f22111zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private float f22112zynmafqrjb;

    /* JADX INFO: renamed from: com.google.android.material.badge.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class RunnableC0395iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ FrameLayout f22114yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ View f22115zdlpuopuiu;

        RunnableC0395iobyxmoadg(View view, FrameLayout frameLayout) {
            this.f22115zdlpuopuiu = view;
            this.f22114yggfygwlhe = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            iobyxmoadg.this.cllcsxoeiz(this.f22115zdlpuopuiu, this.f22114yggfygwlhe);
        }
    }

    private iobyxmoadg(Context context, int i13, int i14, int i15, BadgeState.State state) {
        this.f22111zdlpuopuiu = new WeakReference(context);
        draadjrbmk.ppxfxbqfkf(context);
        this.f22105iwizpuwonk = new Rect();
        btonecajqb btonecajqbVar = new btonecajqb(this);
        this.f22106jyumaefscl = btonecajqbVar;
        btonecajqbVar.lqeggnwhkg().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i13, i14, i15, state);
        this.f22101cqumvgiudr = badgeState;
        this.f22110yggfygwlhe = new lqeggnwhkg(ra.gtknphoqwx.zoijcleaow(context, cqumvgiudr() ? badgeState.wflxmlrfwp() : badgeState.dxjokdxxww(), cqumvgiudr() ? badgeState.draadjrbmk() : badgeState.nufgyqmvbu()).wflxmlrfwp());
        hcddaimhww();
    }

    private CharSequence btonecajqb() {
        return this.f22101cqumvgiudr.rgvfuqvkyq();
    }

    private void cdpycssgdh() {
        this.f22106jyumaefscl.draadjrbmk(true);
        iozdgvuglv();
        dsvhmnatus();
        invalidateSelf();
    }

    private boolean cqumvgiudr() {
        return lereixgezr() || esjtqupxsv();
    }

    private void dsvhmnatus() {
        Context context = (Context) this.f22111zdlpuopuiu.get();
        WeakReference weakReference = this.f22109yadqdtsiqt;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f22105iwizpuwonk);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f22103iozdgvuglv;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null || zoijcleaow.f22116iobyxmoadg) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        ppxfxbqfkf(rect2, view);
        zoijcleaow.wkgbmnqykc(this.f22105iwizpuwonk, this.f22102esjtqupxsv, this.f22107lereixgezr, this.f22104istkbnxepw, this.f22100cdpycssgdh);
        float f13 = this.f22112zynmafqrjb;
        if (f13 != -1.0f) {
            this.f22110yggfygwlhe.ntlheqmsrt(f13);
        }
        if (rect.equals(this.f22105iwizpuwonk)) {
            return;
        }
        this.f22110yggfygwlhe.setBounds(this.f22105iwizpuwonk);
    }

    private void eablkybsjg(Canvas canvas) {
        String strGxszxtbevo = gxszxtbevo();
        if (strGxszxtbevo != null) {
            Rect rect = new Rect();
            this.f22106jyumaefscl.lqeggnwhkg().getTextBounds(strGxszxtbevo, 0, strGxszxtbevo.length(), rect);
            float fExactCenterY = this.f22107lereixgezr - rect.exactCenterY();
            canvas.drawText(strGxszxtbevo, this.f22102esjtqupxsv, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f22106jyumaefscl.lqeggnwhkg());
        }
    }

    private float gtknphoqwx(View view, float f13) {
        return (this.f22102esjtqupxsv - this.f22104istkbnxepw) + view.getX() + f13;
    }

    private String gxszxtbevo() {
        if (lereixgezr()) {
            return kcexrzcfyt();
        }
        if (esjtqupxsv()) {
            return ojitshcjhn();
        }
        return null;
    }

    private void hcddaimhww() {
        iozdgvuglv();
        lmojexxdyd();
        ylkuphrtab();
        cdpycssgdh();
        zynmafqrjb();
        istkbnxepw();
        wwaezpbzkn();
        yadqdtsiqt();
        dsvhmnatus();
        pkzmftpjix();
    }

    private static void hkdspvbjdz(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void iozdgvuglv() {
        Context context = (Context) this.f22111zdlpuopuiu.get();
        if (context == null) {
            return;
        }
        this.f22110yggfygwlhe.setShapeAppearanceModel(ra.gtknphoqwx.zoijcleaow(context, cqumvgiudr() ? this.f22101cqumvgiudr.wflxmlrfwp() : this.f22101cqumvgiudr.dxjokdxxww(), cqumvgiudr() ? this.f22101cqumvgiudr.draadjrbmk() : this.f22101cqumvgiudr.nufgyqmvbu()).wflxmlrfwp());
        invalidateSelf();
    }

    private void istkbnxepw() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f22101cqumvgiudr.eablkybsjg());
        if (this.f22110yggfygwlhe.cqumvgiudr() != colorStateListValueOf) {
            this.f22110yggfygwlhe.crxdokpmqz(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private int iwizpuwonk() {
        int iZynmafqrjb = this.f22101cqumvgiudr.zynmafqrjb();
        if (cqumvgiudr()) {
            iZynmafqrjb = this.f22101cqumvgiudr.pmvmpeiblj();
            Context context = (Context) this.f22111zdlpuopuiu.get();
            if (context != null) {
                iZynmafqrjb = ea.iobyxmoadg.ppxfxbqfkf(iZynmafqrjb, iZynmafqrjb - this.f22101cqumvgiudr.zdlpuopuiu(), ea.iobyxmoadg.zoijcleaow(0.0f, 1.0f, 0.3f, 1.0f, ppxfxbqfkf.eablkybsjg(context) - 1.0f));
            }
        }
        if (this.f22101cqumvgiudr.f22060gtknphoqwx == 0) {
            iZynmafqrjb -= Math.round(this.f22100cdpycssgdh);
        }
        return iZynmafqrjb + this.f22101cqumvgiudr.ppxfxbqfkf();
    }

    private void jpowsppfya(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != gxszxtbevo.mtrl_anchor_parent) {
            WeakReference weakReference = this.f22103iozdgvuglv;
            if (weakReference == null || weakReference.get() != viewGroup) {
                hkdspvbjdz(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(gxszxtbevo.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.f22103iozdgvuglv = new WeakReference(frameLayout);
                frameLayout.post(new RunnableC0395iobyxmoadg(view, frameLayout));
            }
        }
    }

    private int jyumaefscl() {
        int iOxmwwwfdhm = cqumvgiudr() ? this.f22101cqumvgiudr.oxmwwwfdhm() : this.f22101cqumvgiudr.kcexrzcfyt();
        if (this.f22101cqumvgiudr.f22060gtknphoqwx == 1) {
            iOxmwwwfdhm += cqumvgiudr() ? this.f22101cqumvgiudr.f22057btonecajqb : this.f22101cqumvgiudr.f22058dxjokdxxww;
        }
        return iOxmwwwfdhm + this.f22101cqumvgiudr.zoijcleaow();
    }

    private String kcexrzcfyt() {
        String strOxmwwwfdhm = oxmwwwfdhm();
        int iDraadjrbmk = draadjrbmk();
        if (iDraadjrbmk == -2 || strOxmwwwfdhm == null || strOxmwwwfdhm.length() <= iDraadjrbmk) {
            return strOxmwwwfdhm;
        }
        Context context = (Context) this.f22111zdlpuopuiu.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(da.btonecajqb.m3_exceed_max_badge_text_suffix), strOxmwwwfdhm.substring(0, iDraadjrbmk - 1), "…");
    }

    private void lmojexxdyd() {
        wkgbmnqykc wkgbmnqykcVar;
        Context context = (Context) this.f22111zdlpuopuiu.get();
        if (context == null || this.f22106jyumaefscl.eablkybsjg() == (wkgbmnqykcVar = new wkgbmnqykc(context, this.f22101cqumvgiudr.lereixgezr()))) {
            return;
        }
        this.f22106jyumaefscl.gtknphoqwx(wkgbmnqykcVar, context);
        wwaezpbzkn();
        dsvhmnatus();
        invalidateSelf();
    }

    private float lqeggnwhkg(View view, float f13) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f22107lereixgezr + this.f22100cdpycssgdh) - (((View) view.getParent()).getHeight() - view.getY())) + f13;
    }

    private String ojitshcjhn() {
        if (this.f22108pmvmpeiblj == -2 || agtfadlqog() <= this.f22108pmvmpeiblj) {
            return NumberFormat.getInstance(this.f22101cqumvgiudr.cqumvgiudr()).format(agtfadlqog());
        }
        Context context = (Context) this.f22111zdlpuopuiu.get();
        return context == null ? "" : String.format(this.f22101cqumvgiudr.cqumvgiudr(), context.getString(da.btonecajqb.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f22108pmvmpeiblj), "+");
    }

    private void pkzmftpjix() {
        boolean zIozdgvuglv = this.f22101cqumvgiudr.iozdgvuglv();
        setVisible(zIozdgvuglv, false);
        if (!zoijcleaow.f22116iobyxmoadg || dxjokdxxww() == null || zIozdgvuglv) {
            return;
        }
        ((ViewGroup) dxjokdxxww().getParent()).invalidate();
    }

    private boolean pmvmpeiblj() {
        FrameLayout frameLayoutDxjokdxxww = dxjokdxxww();
        return frameLayoutDxjokdxxww != null && frameLayoutDxjokdxxww.getId() == gxszxtbevo.mtrl_anchor_parent;
    }

    private void ppxfxbqfkf(Rect rect, View view) {
        float f13 = cqumvgiudr() ? this.f22101cqumvgiudr.f22066wkgbmnqykc : this.f22101cqumvgiudr.f22065ppxfxbqfkf;
        this.f22112zynmafqrjb = f13;
        if (f13 != -1.0f) {
            this.f22104istkbnxepw = f13;
            this.f22100cdpycssgdh = f13;
        } else {
            this.f22104istkbnxepw = Math.round((cqumvgiudr() ? this.f22101cqumvgiudr.f22063lqeggnwhkg : this.f22101cqumvgiudr.f22059eablkybsjg) / 2.0f);
            this.f22100cdpycssgdh = Math.round((cqumvgiudr() ? this.f22101cqumvgiudr.f22064nufgyqmvbu : this.f22101cqumvgiudr.f22061gxszxtbevo) / 2.0f);
        }
        if (cqumvgiudr()) {
            String strGxszxtbevo = gxszxtbevo();
            this.f22104istkbnxepw = Math.max(this.f22104istkbnxepw, (this.f22106jyumaefscl.nufgyqmvbu(strGxszxtbevo) / 2.0f) + this.f22101cqumvgiudr.lqeggnwhkg());
            float fMax = Math.max(this.f22100cdpycssgdh, (this.f22106jyumaefscl.gxszxtbevo(strGxszxtbevo) / 2.0f) + this.f22101cqumvgiudr.gtknphoqwx());
            this.f22100cdpycssgdh = fMax;
            this.f22104istkbnxepw = Math.max(this.f22104istkbnxepw, fMax);
        }
        int iIwizpuwonk = iwizpuwonk();
        int iGxszxtbevo = this.f22101cqumvgiudr.gxszxtbevo();
        if (iGxszxtbevo == 8388691 || iGxszxtbevo == 8388693) {
            this.f22107lereixgezr = rect.bottom - iIwizpuwonk;
        } else {
            this.f22107lereixgezr = rect.top + iIwizpuwonk;
        }
        int iJyumaefscl = jyumaefscl();
        int iGxszxtbevo2 = this.f22101cqumvgiudr.gxszxtbevo();
        if (iGxszxtbevo2 == 8388659 || iGxszxtbevo2 == 8388691) {
            this.f22102esjtqupxsv = jhduphickx.lereixgezr(view) == 0 ? (rect.left - this.f22104istkbnxepw) + iJyumaefscl : (rect.right + this.f22104istkbnxepw) - iJyumaefscl;
        } else {
            this.f22102esjtqupxsv = jhduphickx.lereixgezr(view) == 0 ? (rect.right + this.f22104istkbnxepw) - iJyumaefscl : (rect.left - this.f22104istkbnxepw) + iJyumaefscl;
        }
        if (this.f22101cqumvgiudr.yadqdtsiqt()) {
            zoijcleaow(view);
        }
    }

    private String rgvfuqvkyq() {
        Context context;
        if (this.f22101cqumvgiudr.vdvldrhtss() == 0 || (context = (Context) this.f22111zdlpuopuiu.get()) == null) {
            return null;
        }
        return (this.f22108pmvmpeiblj == -2 || agtfadlqog() <= this.f22108pmvmpeiblj) ? context.getResources().getQuantityString(this.f22101cqumvgiudr.vdvldrhtss(), agtfadlqog(), Integer.valueOf(agtfadlqog())) : context.getString(this.f22101cqumvgiudr.agtfadlqog(), Integer.valueOf(this.f22108pmvmpeiblj));
    }

    private float vdvldrhtss(View view, float f13) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f22102esjtqupxsv + this.f22104istkbnxepw) - (((View) view.getParent()).getWidth() - view.getX())) + f13;
    }

    public static iobyxmoadg wkgbmnqykc(Context context) {
        return new iobyxmoadg(context, 0, f22099wwaezpbzkn, f22098lmojexxdyd, null);
    }

    private void wwaezpbzkn() {
        this.f22106jyumaefscl.lqeggnwhkg().setColor(this.f22101cqumvgiudr.btonecajqb());
        invalidateSelf();
    }

    private void wypolnanlu() {
        if (draadjrbmk() != -2) {
            this.f22108pmvmpeiblj = ((int) Math.pow(10.0d, ((double) draadjrbmk()) - 1.0d)) - 1;
        } else {
            this.f22108pmvmpeiblj = wflxmlrfwp();
        }
    }

    private void yadqdtsiqt() {
        WeakReference weakReference = this.f22109yadqdtsiqt;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f22109yadqdtsiqt.get();
        WeakReference weakReference2 = this.f22103iozdgvuglv;
        cllcsxoeiz(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private float yggfygwlhe(View view, float f13) {
        return (this.f22107lereixgezr - this.f22100cdpycssgdh) + view.getY() + f13;
    }

    private void ylkuphrtab() {
        wypolnanlu();
        this.f22106jyumaefscl.draadjrbmk(true);
        dsvhmnatus();
        invalidateSelf();
    }

    private CharSequence zdlpuopuiu() {
        CharSequence charSequenceOjitshcjhn = this.f22101cqumvgiudr.ojitshcjhn();
        return charSequenceOjitshcjhn != null ? charSequenceOjitshcjhn : oxmwwwfdhm();
    }

    private void zoijcleaow(View view) {
        float y13;
        float x13;
        View viewDxjokdxxww = dxjokdxxww();
        if (viewDxjokdxxww == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y14 = view.getY();
            x13 = view.getX();
            viewDxjokdxxww = (View) view.getParent();
            y13 = y14;
        } else if (!pmvmpeiblj()) {
            y13 = 0.0f;
            x13 = 0.0f;
        } else {
            if (!(viewDxjokdxxww.getParent() instanceof View)) {
                return;
            }
            y13 = viewDxjokdxxww.getY();
            x13 = viewDxjokdxxww.getX();
            viewDxjokdxxww = (View) viewDxjokdxxww.getParent();
        }
        float fYggfygwlhe = yggfygwlhe(viewDxjokdxxww, y13);
        float fGtknphoqwx = gtknphoqwx(viewDxjokdxxww, x13);
        float fLqeggnwhkg = lqeggnwhkg(viewDxjokdxxww, y13);
        float fVdvldrhtss = vdvldrhtss(viewDxjokdxxww, x13);
        if (fYggfygwlhe < 0.0f) {
            this.f22107lereixgezr += Math.abs(fYggfygwlhe);
        }
        if (fGtknphoqwx < 0.0f) {
            this.f22102esjtqupxsv += Math.abs(fGtknphoqwx);
        }
        if (fLqeggnwhkg > 0.0f) {
            this.f22107lereixgezr -= Math.abs(fLqeggnwhkg);
        }
        if (fVdvldrhtss > 0.0f) {
            this.f22102esjtqupxsv -= Math.abs(fVdvldrhtss);
        }
    }

    private void zynmafqrjb() {
        this.f22106jyumaefscl.lqeggnwhkg().setAlpha(getAlpha());
        invalidateSelf();
    }

    public int agtfadlqog() {
        if (this.f22101cqumvgiudr.istkbnxepw()) {
            return this.f22101cqumvgiudr.iwizpuwonk();
        }
        return 0;
    }

    public void cllcsxoeiz(View view, FrameLayout frameLayout) {
        this.f22109yadqdtsiqt = new WeakReference(view);
        boolean z13 = zoijcleaow.f22116iobyxmoadg;
        if (z13 && frameLayout == null) {
            jpowsppfya(view);
        } else {
            this.f22103iozdgvuglv = new WeakReference(frameLayout);
        }
        if (!z13) {
            hkdspvbjdz(view);
        }
        dsvhmnatus();
        invalidateSelf();
    }

    public int draadjrbmk() {
        return this.f22101cqumvgiudr.yggfygwlhe();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f22110yggfygwlhe.draw(canvas);
        if (cqumvgiudr()) {
            eablkybsjg(canvas);
        }
    }

    public FrameLayout dxjokdxxww() {
        WeakReference weakReference = this.f22103iozdgvuglv;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public boolean esjtqupxsv() {
        return !this.f22101cqumvgiudr.cdpycssgdh() && this.f22101cqumvgiudr.istkbnxepw();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f22101cqumvgiudr.wkgbmnqykc();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f22105iwizpuwonk.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f22105iwizpuwonk.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.internal.btonecajqb.zoijcleaow
    public void iobyxmoadg() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public boolean lereixgezr() {
        return this.f22101cqumvgiudr.cdpycssgdh();
    }

    public CharSequence nufgyqmvbu() {
        if (!isVisible()) {
            return null;
        }
        if (lereixgezr()) {
            return zdlpuopuiu();
        }
        return esjtqupxsv() ? rgvfuqvkyq() : btonecajqb();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.btonecajqb.zoijcleaow
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public String oxmwwwfdhm() {
        return this.f22101cqumvgiudr.esjtqupxsv();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        this.f22101cqumvgiudr.wwaezpbzkn(i13);
        zynmafqrjb();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int wflxmlrfwp() {
        return this.f22101cqumvgiudr.jyumaefscl();
    }
}
