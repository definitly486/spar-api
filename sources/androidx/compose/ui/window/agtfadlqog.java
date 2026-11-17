package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.cqumvgiudr;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.y;
import androidx.lifecycle.jhduphickx;
import androidx.lifecycle.vipkmwdibw;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.jpowsppfya;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog extends androidx.compose.ui.platform.iobyxmoadg implements y {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private String f7325cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final i1 f7326cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final float f7327dsvhmnatus;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final iwxlajgraz f7328hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private w0.rgvfuqvkyq f7329hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final rgvfuqvkyq f7330iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private yggfygwlhe f7331istkbnxepw;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final iwxlajgraz f7332jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private Object f7333kegysxyocb;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final WindowManager f7334lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private boolean f7335mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private final int[] f7336ntlheqmsrt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private w0.zdlpuopuiu f7337pkzmftpjix;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final androidx.compose.runtime.snapshots.gtknphoqwx f7338stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final iwxlajgraz f7339tzroggbefp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final WindowManager.LayoutParams f7340wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final Rect f7341wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final View f7342yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private zdlpuopuiu f7343ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private tg.iobyxmoadg f7344zynmafqrjb;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private static final ppxfxbqfkf f7324ulzqkzuiru = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    public static final int f7323sopmlzcsov = 8;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private static final tg.draadjrbmk f7322crxdokpmqz = zoijcleaow.f7355zdlpuopuiu;

    public /* synthetic */ class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f7345iobyxmoadg;

        static {
            int[] iArr = new int[w0.zdlpuopuiu.values().length];
            try {
                iArr[w0.zdlpuopuiu.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w0.zdlpuopuiu.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7345iobyxmoadg = iArr;
        }
    }

    static final class gxszxtbevo extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        gxszxtbevo() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            x.rgvfuqvkyq parentLayoutCoordinates = agtfadlqog.this.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null || !parentLayoutCoordinates.gxszxtbevo()) {
                parentLayoutCoordinates = null;
            }
            return Boolean.valueOf((parentLayoutCoordinates == null || agtfadlqog.this.m2getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    public static final class iobyxmoadg extends ViewOutlineProvider {
        iobyxmoadg() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    static final class lqeggnwhkg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        lqeggnwhkg() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void btonecajqb(tg.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadgVar.invoke();
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            lqeggnwhkg((tg.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void lqeggnwhkg(final tg.iobyxmoadg iobyxmoadgVar) {
            Handler handler = agtfadlqog.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                iobyxmoadgVar.invoke();
                return;
            }
            Handler handler2 = agtfadlqog.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.ojitshcjhn
                    @Override // java.lang.Runnable
                    public final void run() {
                        agtfadlqog.lqeggnwhkg.btonecajqb(iobyxmoadgVar);
                    }
                });
            }
        }
    }

    static final class nufgyqmvbu extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ long f7348cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ long f7349iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ w0.rgvfuqvkyq f7350jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f7351yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f7352zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(jpowsppfya jpowsppfyaVar, agtfadlqog agtfadlqogVar, w0.rgvfuqvkyq rgvfuqvkyqVar, long j13, long j14) {
            super(0);
            this.f7352zdlpuopuiu = jpowsppfyaVar;
            this.f7351yggfygwlhe = agtfadlqogVar;
            this.f7350jyumaefscl = rgvfuqvkyqVar;
            this.f7349iwizpuwonk = j13;
            this.f7348cqumvgiudr = j14;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f7352zdlpuopuiu.f60024zdlpuopuiu = this.f7351yggfygwlhe.getPositionProvider().iobyxmoadg(this.f7350jyumaefscl, this.f7349iwizpuwonk, this.f7351yggfygwlhe.getParentLayoutDirection(), this.f7348cqumvgiudr);
        }
    }

    private static final class ppxfxbqfkf {
        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private ppxfxbqfkf() {
        }
    }

    static final class wkgbmnqykc extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f7353yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(int i13) {
            super(2);
            this.f7353yggfygwlhe = i13;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            agtfadlqog.this.zoijcleaow(draadjrbmkVar, f.iobyxmoadg(this.f7353yggfygwlhe | 1));
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f7355zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((agtfadlqog) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(agtfadlqog agtfadlqogVar) {
            if (agtfadlqogVar.isAttachedToWindow()) {
                agtfadlqogVar.esjtqupxsv();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ agtfadlqog(tg.iobyxmoadg iobyxmoadgVar, yggfygwlhe yggfygwlheVar, String str, View view, w0.wkgbmnqykc wkgbmnqykcVar, zdlpuopuiu zdlpuopuiuVar, UUID uuid, rgvfuqvkyq rgvfuqvkyqVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        rgvfuqvkyq oxmwwwfdhmVar;
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            oxmwwwfdhmVar = Build.VERSION.SDK_INT >= 29 ? new oxmwwwfdhm() : new kcexrzcfyt();
        } else {
            oxmwwwfdhmVar = rgvfuqvkyqVar;
        }
        this(iobyxmoadgVar, yggfygwlheVar, str, view, wkgbmnqykcVar, zdlpuopuiuVar, uuid, oxmwwwfdhmVar);
    }

    private final void cqumvgiudr(yggfygwlhe yggfygwlheVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f7331istkbnxepw, yggfygwlheVar)) {
            return;
        }
        if (yggfygwlheVar.gxszxtbevo() && !this.f7331istkbnxepw.gxszxtbevo()) {
            WindowManager.LayoutParams layoutParams = this.f7340wwaezpbzkn;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.f7331istkbnxepw = yggfygwlheVar;
        this.f7340wwaezpbzkn.flags = androidx.compose.ui.window.ppxfxbqfkf.dxjokdxxww(yggfygwlheVar, androidx.compose.ui.window.ppxfxbqfkf.btonecajqb(this.f7342yadqdtsiqt));
        this.f7330iozdgvuglv.zoijcleaow(this.f7334lmojexxdyd, this, this.f7340wwaezpbzkn);
    }

    private final tg.rgvfuqvkyq getContent() {
        return (tg.rgvfuqvkyq) this.f7339tzroggbefp.getValue();
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x.rgvfuqvkyq getParentLayoutCoordinates() {
        return (x.rgvfuqvkyq) this.f7332jpowsppfya.getValue();
    }

    private final w0.rgvfuqvkyq getVisibleDisplayBounds() {
        Rect rect = this.f7341wypolnanlu;
        this.f7330iozdgvuglv.iobyxmoadg(this.f7342yadqdtsiqt, rect);
        return androidx.compose.ui.window.ppxfxbqfkf.gtknphoqwx(rect);
    }

    private final void ojitshcjhn() {
        if (!this.f7331istkbnxepw.iobyxmoadg() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f7333kegysxyocb == null) {
            this.f7333kegysxyocb = androidx.compose.ui.window.nufgyqmvbu.zoijcleaow(this.f7344zynmafqrjb);
        }
        androidx.compose.ui.window.nufgyqmvbu.wkgbmnqykc(this, this.f7333kegysxyocb);
    }

    private final void rgvfuqvkyq() {
        if (Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.window.nufgyqmvbu.eablkybsjg(this, this.f7333kegysxyocb);
        }
        this.f7333kegysxyocb = null;
    }

    private final void setContent(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f7339tzroggbefp.setValue(rgvfuqvkyqVar);
    }

    private final void setParentLayoutCoordinates(x.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f7332jpowsppfya.setValue(rgvfuqvkyqVar);
    }

    private final WindowManager.LayoutParams wflxmlrfwp() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = androidx.compose.ui.window.ppxfxbqfkf.dxjokdxxww(this.f7331istkbnxepw, androidx.compose.ui.window.ppxfxbqfkf.btonecajqb(this.f7342yadqdtsiqt));
        layoutParams.type = 1002;
        layoutParams.token = this.f7342yadqdtsiqt.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f7342yadqdtsiqt.getContext().getResources().getString(a.draadjrbmk.default_popup_window_title));
        return layoutParams;
    }

    private final void zdlpuopuiu(w0.zdlpuopuiu zdlpuopuiuVar) {
        int i13 = eablkybsjg.f7345iobyxmoadg[zdlpuopuiuVar.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            i14 = 0;
        } else if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i14);
    }

    public final void agtfadlqog() {
        vipkmwdibw.zoijcleaow(this, null);
        this.f7334lmojexxdyd.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f7331istkbnxepw.iobyxmoadg()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                tg.iobyxmoadg iobyxmoadgVar = this.f7344zynmafqrjb;
                if (iobyxmoadgVar != null) {
                    iobyxmoadgVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.iobyxmoadg
    public void dxjokdxxww(int i13, int i14) {
        if (this.f7331istkbnxepw.gxszxtbevo()) {
            super.dxjokdxxww(i13, i14);
        } else {
            w0.rgvfuqvkyq visibleDisplayBounds = getVisibleDisplayBounds();
            super.dxjokdxxww(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.gtknphoqwx(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.eablkybsjg(), Integer.MIN_VALUE));
        }
    }

    public final void esjtqupxsv() {
        w0.oxmwwwfdhm oxmwwwfdhmVarM2getPopupContentSizebOM6tXw;
        w0.rgvfuqvkyq rgvfuqvkyqVar = this.f7329hkdspvbjdz;
        if (rgvfuqvkyqVar == null || (oxmwwwfdhmVarM2getPopupContentSizebOM6tXw = m2getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long jBtonecajqb = oxmwwwfdhmVarM2getPopupContentSizebOM6tXw.btonecajqb();
        w0.rgvfuqvkyq visibleDisplayBounds = getVisibleDisplayBounds();
        long jPpxfxbqfkf = w0.oxmwwwfdhm.ppxfxbqfkf((((long) visibleDisplayBounds.gtknphoqwx()) << 32) | (((long) visibleDisplayBounds.eablkybsjg()) & 4294967295L));
        jpowsppfya jpowsppfyaVar = new jpowsppfya();
        jpowsppfyaVar.f60024zdlpuopuiu = w0.agtfadlqog.f118237zoijcleaow.zoijcleaow();
        this.f7338stevsuqkhv.gtknphoqwx(this, f7322crxdokpmqz, new nufgyqmvbu(jpowsppfyaVar, this, rgvfuqvkyqVar, jPpxfxbqfkf, jBtonecajqb));
        this.f7340wwaezpbzkn.x = w0.agtfadlqog.dxjokdxxww(jpowsppfyaVar.f60024zdlpuopuiu);
        this.f7340wwaezpbzkn.y = w0.agtfadlqog.btonecajqb(jpowsppfyaVar.f60024zdlpuopuiu);
        if (this.f7331istkbnxepw.ppxfxbqfkf()) {
            this.f7330iozdgvuglv.ppxfxbqfkf(this, (int) (jPpxfxbqfkf >> 32), (int) (4294967295L & jPpxfxbqfkf));
        }
        this.f7330iozdgvuglv.zoijcleaow(this.f7334lmojexxdyd, this, this.f7340wwaezpbzkn);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f7326cllcsxoeiz.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f7340wwaezpbzkn;
    }

    public final w0.zdlpuopuiu getParentLayoutDirection() {
        return this.f7337pkzmftpjix;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final w0.oxmwwwfdhm m2getPopupContentSizebOM6tXw() {
        return (w0.oxmwwwfdhm) this.f7328hcddaimhww.getValue();
    }

    public final zdlpuopuiu getPositionProvider() {
        return this.f7343ylkuphrtab;
    }

    @Override // androidx.compose.ui.platform.iobyxmoadg
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7335mbcevpiqjq;
    }

    @Override // androidx.compose.ui.platform.y
    public androidx.compose.ui.platform.iobyxmoadg getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f7325cdpycssgdh;
    }

    @Override // androidx.compose.ui.platform.y
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    public final void iwizpuwonk(x.rgvfuqvkyq rgvfuqvkyqVar) {
        setParentLayoutCoordinates(rgvfuqvkyqVar);
        jyumaefscl();
    }

    public final void jyumaefscl() {
        x.rgvfuqvkyq parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.gxszxtbevo()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jIobyxmoadg = parentLayoutCoordinates.iobyxmoadg();
            long jGxszxtbevo = x.vdvldrhtss.gxszxtbevo(parentLayoutCoordinates);
            w0.rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = w0.vdvldrhtss.iobyxmoadg(w0.agtfadlqog.wkgbmnqykc((((long) Math.round(Float.intBitsToFloat((int) (jGxszxtbevo >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jGxszxtbevo & 4294967295L)))))), jIobyxmoadg);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(rgvfuqvkyqVarIobyxmoadg, this.f7329hkdspvbjdz)) {
                return;
            }
            this.f7329hkdspvbjdz = rgvfuqvkyqVarIobyxmoadg;
            esjtqupxsv();
        }
    }

    public final void kcexrzcfyt() {
        this.f7334lmojexxdyd.addView(this, this.f7340wwaezpbzkn);
    }

    @Override // androidx.compose.ui.platform.iobyxmoadg
    public void nufgyqmvbu(boolean z13, int i13, int i14, int i15, int i16) {
        View childAt;
        super.nufgyqmvbu(z13, i13, i14, i15, i16);
        if (this.f7331istkbnxepw.gxszxtbevo() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f7340wwaezpbzkn.width = childAt.getMeasuredWidth();
        this.f7340wwaezpbzkn.height = childAt.getMeasuredHeight();
        this.f7330iozdgvuglv.zoijcleaow(this.f7334lmojexxdyd, this, this.f7340wwaezpbzkn);
    }

    @Override // androidx.compose.ui.platform.iobyxmoadg, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7338stevsuqkhv.vdvldrhtss();
        ojitshcjhn();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7338stevsuqkhv.oxmwwwfdhm();
        this.f7338stevsuqkhv.gxszxtbevo();
        rgvfuqvkyq();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f7331istkbnxepw.zoijcleaow()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            tg.iobyxmoadg iobyxmoadgVar = this.f7344zynmafqrjb;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        tg.iobyxmoadg iobyxmoadgVar2 = this.f7344zynmafqrjb;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.invoke();
        }
        return true;
    }

    public final void oxmwwwfdhm(cqumvgiudr cqumvgiudrVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        setParentCompositionContext(cqumvgiudrVar);
        setContent(rgvfuqvkyqVar);
        this.f7335mbcevpiqjq = true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i13) {
    }

    public final void setParentLayoutDirection(w0.zdlpuopuiu zdlpuopuiuVar) {
        this.f7337pkzmftpjix = zdlpuopuiuVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m3setPopupContentSizefhxjrPA(w0.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f7328hcddaimhww.setValue(oxmwwwfdhmVar);
    }

    public final void setPositionProvider(zdlpuopuiu zdlpuopuiuVar) {
        this.f7343ylkuphrtab = zdlpuopuiuVar;
    }

    public final void setTestTag(String str) {
        this.f7325cdpycssgdh = str;
    }

    public final void vdvldrhtss() {
        int[] iArr = this.f7336ntlheqmsrt;
        int i13 = iArr[0];
        int i14 = iArr[1];
        this.f7342yadqdtsiqt.getLocationOnScreen(iArr);
        int[] iArr2 = this.f7336ntlheqmsrt;
        if (i13 == iArr2[0] && i14 == iArr2[1]) {
            return;
        }
        jyumaefscl();
    }

    public final void yggfygwlhe(tg.iobyxmoadg iobyxmoadgVar, yggfygwlhe yggfygwlheVar, String str, w0.zdlpuopuiu zdlpuopuiuVar) {
        this.f7344zynmafqrjb = iobyxmoadgVar;
        this.f7325cdpycssgdh = str;
        cqumvgiudr(yggfygwlheVar);
        zdlpuopuiu(zdlpuopuiuVar);
    }

    @Override // androidx.compose.ui.platform.iobyxmoadg
    public void zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-857613600);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 3) != 2, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-857613600, i14, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(draadjrbmkVarBtonecajqb, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new wkgbmnqykc(i13));
        }
    }

    public agtfadlqog(tg.iobyxmoadg iobyxmoadgVar, yggfygwlhe yggfygwlheVar, String str, View view, w0.wkgbmnqykc wkgbmnqykcVar, zdlpuopuiu zdlpuopuiuVar, UUID uuid, rgvfuqvkyq rgvfuqvkyqVar) {
        super(view.getContext(), null, 0, 6, null);
        this.f7344zynmafqrjb = iobyxmoadgVar;
        this.f7331istkbnxepw = yggfygwlheVar;
        this.f7325cdpycssgdh = str;
        this.f7342yadqdtsiqt = view;
        this.f7330iozdgvuglv = rgvfuqvkyqVar;
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f7334lmojexxdyd = (WindowManager) systemService;
        this.f7340wwaezpbzkn = wflxmlrfwp();
        this.f7343ylkuphrtab = zdlpuopuiuVar;
        this.f7337pkzmftpjix = w0.zdlpuopuiu.Ltr;
        this.f7328hcddaimhww = c1.ppxfxbqfkf(null, null, 2, null);
        this.f7332jpowsppfya = c1.ppxfxbqfkf(null, null, 2, null);
        this.f7326cllcsxoeiz = v0.eablkybsjg(new gxszxtbevo());
        float fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(8);
        this.f7327dsvhmnatus = fLqeggnwhkg;
        this.f7341wypolnanlu = new Rect();
        this.f7338stevsuqkhv = new androidx.compose.runtime.snapshots.gtknphoqwx(new lqeggnwhkg());
        setId(R.id.content);
        vipkmwdibw.zoijcleaow(this, vipkmwdibw.iobyxmoadg(view));
        jhduphickx.zoijcleaow(this, jhduphickx.iobyxmoadg(view));
        q5.wflxmlrfwp.zoijcleaow(this, q5.wflxmlrfwp.iobyxmoadg(view));
        setTag(a.gtknphoqwx.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(wkgbmnqykcVar.I(fLqeggnwhkg));
        setOutlineProvider(new iobyxmoadg());
        this.f7339tzroggbefp = c1.ppxfxbqfkf(btonecajqb.f7356iobyxmoadg.iobyxmoadg(), null, 2, null);
        this.f7336ntlheqmsrt = new int[2];
    }
}
