package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.esjtqupxsv;
import androidx.compose.runtime.cqumvgiudr;
import androidx.compose.ui.platform.y;
import androidx.lifecycle.jhduphickx;
import androidx.lifecycle.vipkmwdibw;
import gg.wwaezpbzkn;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import v1.oipsdeybqn;

/* JADX INFO: loaded from: classes.dex */
final class wflxmlrfwp extends androidx.activity.draadjrbmk implements y {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private draadjrbmk f7431cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final View f7432esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private tg.iobyxmoadg f7433iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gtknphoqwx f7434lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final float f7435pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f7436zynmafqrjb;

    public static final class iobyxmoadg extends ViewOutlineProvider {
        iobyxmoadg() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f7437iobyxmoadg;

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
            f7437iobyxmoadg = iArr;
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((androidx.activity.jyumaefscl) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.activity.jyumaefscl jyumaefsclVar) {
            if (wflxmlrfwp.this.f7431cqumvgiudr.zoijcleaow()) {
                wflxmlrfwp.this.f7433iwizpuwonk.invoke();
            }
        }
    }

    public wflxmlrfwp(tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view, w0.zdlpuopuiu zdlpuopuiuVar, w0.wkgbmnqykc wkgbmnqykcVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), draadjrbmkVar.iobyxmoadg() ? a.wflxmlrfwp.DialogWindowTheme : a.wflxmlrfwp.FloatingDialogWindowTheme), 0, 2, null);
        this.f7433iwizpuwonk = iobyxmoadgVar;
        this.f7431cqumvgiudr = draadjrbmkVar;
        this.f7432esjtqupxsv = view;
        float fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(8);
        this.f7435pmvmpeiblj = fLqeggnwhkg;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        oipsdeybqn.zoijcleaow(window, this.f7431cqumvgiudr.iobyxmoadg());
        window.setGravity(17);
        if (!this.f7431cqumvgiudr.iobyxmoadg()) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 28) {
                eablkybsjg.f7368iobyxmoadg.iobyxmoadg(attributes);
            }
            if (i13 >= 30) {
                gxszxtbevo gxszxtbevoVar = gxszxtbevo.f7378iobyxmoadg;
                gxszxtbevoVar.iobyxmoadg(attributes, 0);
                gxszxtbevoVar.zoijcleaow(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        gtknphoqwx gtknphoqwxVar = new gtknphoqwx(getContext(), window);
        setTitle(this.f7431cqumvgiudr.gxszxtbevo());
        gtknphoqwxVar.setTag(a.gtknphoqwx.compose_view_saveable_id_tag, "Dialog:" + uuid);
        gtknphoqwxVar.setClipChildren(false);
        gtknphoqwxVar.setElevation(wkgbmnqykcVar.I(fLqeggnwhkg));
        gtknphoqwxVar.setOutlineProvider(new iobyxmoadg());
        this.f7434lereixgezr = gtknphoqwxVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            eablkybsjg(viewGroup);
        }
        setContentView(gtknphoqwxVar);
        vipkmwdibw.zoijcleaow(gtknphoqwxVar, vipkmwdibw.iobyxmoadg(view));
        jhduphickx.zoijcleaow(gtknphoqwxVar, jhduphickx.iobyxmoadg(view));
        q5.wflxmlrfwp.zoijcleaow(gtknphoqwxVar, q5.wflxmlrfwp.iobyxmoadg(view));
        draadjrbmk(this.f7433iwizpuwonk, this.f7431cqumvgiudr, zdlpuopuiuVar);
        esjtqupxsv.zoijcleaow(getOnBackPressedDispatcher(), this, false, new zoijcleaow(), 2, null);
    }

    private final void btonecajqb(w0.zdlpuopuiu zdlpuopuiuVar) {
        gtknphoqwx gtknphoqwxVar = this.f7434lereixgezr;
        int i13 = ppxfxbqfkf.f7437iobyxmoadg[zdlpuopuiuVar.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            i14 = 0;
        } else if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        gtknphoqwxVar.setLayoutDirection(i14);
    }

    private static final void eablkybsjg(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof gtknphoqwx) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                eablkybsjg(viewGroup2);
            }
        }
    }

    private final void gtknphoqwx(jyumaefscl jyumaefsclVar) {
        boolean zIobyxmoadg = iwizpuwonk.iobyxmoadg(jyumaefsclVar, androidx.compose.ui.window.ppxfxbqfkf.btonecajqb(this.f7432esjtqupxsv));
        Window window = getWindow();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(window);
        window.setFlags(zIobyxmoadg ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void draadjrbmk(tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        int i13;
        this.f7433iwizpuwonk = iobyxmoadgVar;
        this.f7431cqumvgiudr = draadjrbmkVar;
        gtknphoqwx(draadjrbmkVar.wkgbmnqykc());
        btonecajqb(zdlpuopuiuVar);
        boolean zIobyxmoadg = draadjrbmkVar.iobyxmoadg();
        this.f7434lereixgezr.rgvfuqvkyq(draadjrbmkVar.eablkybsjg(), zIobyxmoadg);
        setCanceledOnTouchOutside(draadjrbmkVar.ppxfxbqfkf());
        Window window = getWindow();
        if (window != null) {
            if (zIobyxmoadg) {
                i13 = 0;
            } else {
                i13 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window.setSoftInputMode(i13);
        }
    }

    public final void dxjokdxxww(cqumvgiudr cqumvgiudrVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f7434lereixgezr.ojitshcjhn(cqumvgiudrVar, rgvfuqvkyqVar);
    }

    public final void nufgyqmvbu() {
        this.f7434lereixgezr.gxszxtbevo();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i13, KeyEvent keyEvent) {
        if (!this.f7431cqumvgiudr.zoijcleaow() || !keyEvent.isTracking() || keyEvent.isCanceled() || i13 != 111) {
            return super.onKeyUp(i13, keyEvent);
        }
        this.f7433iwizpuwonk.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f7431cqumvgiudr.ppxfxbqfkf() || this.f7434lereixgezr.agtfadlqog(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0 && actionMasked != 1 && actionMasked != 3) {
                return zOnTouchEvent;
            }
            this.f7436zynmafqrjb = false;
            return zOnTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.f7436zynmafqrjb = true;
        } else {
            if (actionMasked2 != 1) {
                if (actionMasked2 != 3) {
                    return zOnTouchEvent;
                }
                this.f7436zynmafqrjb = false;
                return zOnTouchEvent;
            }
            if (!this.f7436zynmafqrjb) {
                return zOnTouchEvent;
            }
            this.f7433iwizpuwonk.invoke();
            this.f7436zynmafqrjb = false;
        }
        return true;
    }
}
