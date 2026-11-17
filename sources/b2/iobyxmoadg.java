package b2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.xrmfcynszj;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import v1.jhduphickx;
import w1.jyumaefscl;
import w1.yggfygwlhe;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg extends v1.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final Rect f14965agtfadlqog = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final b2.zoijcleaow.iobyxmoadg f14966ojitshcjhn = new C0250iobyxmoadg();

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final b2.zoijcleaow.InterfaceC0252zoijcleaow f14967rgvfuqvkyq = new zoijcleaow();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private ppxfxbqfkf f14968btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final View f14970dxjokdxxww;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final AccessibilityManager f14975nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Rect f14977wkgbmnqykc = new Rect();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Rect f14971eablkybsjg = new Rect();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Rect f14973gxszxtbevo = new Rect();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int[] f14974lqeggnwhkg = new int[2];

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    int f14972gtknphoqwx = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    int f14969draadjrbmk = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f14976wflxmlrfwp = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0250iobyxmoadg implements b2.zoijcleaow.iobyxmoadg {
        C0250iobyxmoadg() {
        }

        @Override // b2.zoijcleaow.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, Rect rect) {
            zdlpuopuiuVar.gtknphoqwx(rect);
        }
    }

    private class ppxfxbqfkf extends yggfygwlhe {
        ppxfxbqfkf() {
        }

        @Override // w1.yggfygwlhe
        public boolean gxszxtbevo(int i13, int i14, Bundle bundle) {
            return iobyxmoadg.this.wypolnanlu(i13, i14, bundle);
        }

        @Override // w1.yggfygwlhe
        public zdlpuopuiu wkgbmnqykc(int i13) {
            int i14 = i13 == 2 ? iobyxmoadg.this.f14972gtknphoqwx : iobyxmoadg.this.f14969draadjrbmk;
            if (i14 == Integer.MIN_VALUE) {
                return null;
            }
            return zoijcleaow(i14);
        }

        @Override // w1.yggfygwlhe
        public zdlpuopuiu zoijcleaow(int i13) {
            return zdlpuopuiu.crxdokpmqz(iobyxmoadg.this.wwaezpbzkn(i13));
        }
    }

    class zoijcleaow implements b2.zoijcleaow.InterfaceC0252zoijcleaow {
        zoijcleaow() {
        }

        @Override // b2.zoijcleaow.InterfaceC0252zoijcleaow
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public zdlpuopuiu iobyxmoadg(xrmfcynszj xrmfcynszjVar, int i13) {
            return (zdlpuopuiu) xrmfcynszjVar.rgvfuqvkyq(i13);
        }

        @Override // b2.zoijcleaow.InterfaceC0252zoijcleaow
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public int zoijcleaow(xrmfcynszj xrmfcynszjVar) {
            return xrmfcynszjVar.ojitshcjhn();
        }
    }

    public iobyxmoadg(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f14970dxjokdxxww = view;
        this.f14975nufgyqmvbu = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (jhduphickx.cqumvgiudr(view) == 0) {
            jhduphickx.uawqvzlxes(view, 1);
        }
    }

    private boolean agtfadlqog(int i13) {
        if (this.f14972gtknphoqwx != i13) {
            return false;
        }
        this.f14972gtknphoqwx = Integer.MIN_VALUE;
        this.f14970dxjokdxxww.invalidate();
        ntlheqmsrt(i13, 65536);
        return true;
    }

    private static Rect cdpycssgdh(View view, int i13, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i13 == 17) {
            rect.set(width, 0, width, height);
        } else if (i13 == 33) {
            rect.set(0, height, width, height);
        } else if (i13 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i13 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private xrmfcynszj esjtqupxsv() {
        ArrayList arrayList = new ArrayList();
        istkbnxepw(arrayList);
        xrmfcynszj xrmfcynszjVar = new xrmfcynszj();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            xrmfcynszjVar.draadjrbmk(((Integer) arrayList.get(i13)).intValue(), zdlpuopuiu(((Integer) arrayList.get(i13)).intValue()));
        }
        return xrmfcynszjVar;
    }

    private static int iozdgvuglv(int i13) {
        if (i13 == 19) {
            return 33;
        }
        if (i13 != 21) {
            return i13 != 22 ? 130 : 66;
        }
        return 17;
    }

    private AccessibilityEvent kcexrzcfyt(int i13) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i13);
        this.f14970dxjokdxxww.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private boolean kegysxyocb(int i13, Bundle bundle) {
        return jhduphickx.okpsazkaxt(this.f14970dxjokdxxww, i13, bundle);
    }

    private void lereixgezr(int i13, Rect rect) {
        wwaezpbzkn(i13).gtknphoqwx(rect);
    }

    private boolean lmojexxdyd(int i13, Rect rect) {
        zdlpuopuiu zdlpuopuiuVar;
        xrmfcynszj xrmfcynszjVarEsjtqupxsv = esjtqupxsv();
        int i14 = this.f14969draadjrbmk;
        zdlpuopuiu zdlpuopuiuVar2 = i14 == Integer.MIN_VALUE ? null : (zdlpuopuiu) xrmfcynszjVarEsjtqupxsv.eablkybsjg(i14);
        if (i13 == 1 || i13 == 2) {
            zdlpuopuiuVar = (zdlpuopuiu) b2.zoijcleaow.wkgbmnqykc(xrmfcynszjVarEsjtqupxsv, f14967rgvfuqvkyq, f14966ojitshcjhn, zdlpuopuiuVar2, i13, jhduphickx.lereixgezr(this.f14970dxjokdxxww) == 1, false);
        } else {
            if (i13 != 17 && i13 != 33 && i13 != 66 && i13 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i15 = this.f14969draadjrbmk;
            if (i15 != Integer.MIN_VALUE) {
                lereixgezr(i15, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                cdpycssgdh(this.f14970dxjokdxxww, i13, rect2);
            }
            zdlpuopuiuVar = (zdlpuopuiu) b2.zoijcleaow.ppxfxbqfkf(xrmfcynszjVarEsjtqupxsv, f14967rgvfuqvkyq, f14966ojitshcjhn, zdlpuopuiuVar2, rect2, i13);
        }
        return mbcevpiqjq(zdlpuopuiuVar != null ? xrmfcynszjVarEsjtqupxsv.gtknphoqwx(xrmfcynszjVarEsjtqupxsv.nufgyqmvbu(zdlpuopuiuVar)) : Integer.MIN_VALUE);
    }

    private AccessibilityEvent oxmwwwfdhm(int i13, int i14) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i14);
        zdlpuopuiu zdlpuopuiuVarWwaezpbzkn = wwaezpbzkn(i13);
        accessibilityEventObtain.getText().add(zdlpuopuiuVarWwaezpbzkn.esjtqupxsv());
        accessibilityEventObtain.setContentDescription(zdlpuopuiuVarWwaezpbzkn.oxmwwwfdhm());
        accessibilityEventObtain.setScrollable(zdlpuopuiuVarWwaezpbzkn.stevsuqkhv());
        accessibilityEventObtain.setPassword(zdlpuopuiuVarWwaezpbzkn.wypolnanlu());
        accessibilityEventObtain.setEnabled(zdlpuopuiuVarWwaezpbzkn.pkzmftpjix());
        accessibilityEventObtain.setChecked(zdlpuopuiuVarWwaezpbzkn.lmojexxdyd());
        jpowsppfya(i13, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(zdlpuopuiuVarWwaezpbzkn.ojitshcjhn());
        jyumaefscl.ppxfxbqfkf(accessibilityEventObtain, this.f14970dxjokdxxww, i13);
        accessibilityEventObtain.setPackageName(this.f14970dxjokdxxww.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private boolean rgvfuqvkyq() {
        int i13 = this.f14969draadjrbmk;
        return i13 != Integer.MIN_VALUE && pkzmftpjix(i13, 16, null);
    }

    private boolean stevsuqkhv(int i13, int i14, Bundle bundle) {
        if (i14 == 1) {
            return mbcevpiqjq(i13);
        }
        if (i14 == 2) {
            return ojitshcjhn(i13);
        }
        if (i14 != 64) {
            return i14 != 128 ? pkzmftpjix(i13, i14, bundle) : agtfadlqog(i13);
        }
        return tzroggbefp(i13);
    }

    private boolean tzroggbefp(int i13) {
        int i14;
        if (!this.f14975nufgyqmvbu.isEnabled() || !this.f14975nufgyqmvbu.isTouchExplorationEnabled() || (i14 = this.f14972gtknphoqwx) == i13) {
            return false;
        }
        if (i14 != Integer.MIN_VALUE) {
            agtfadlqog(i14);
        }
        this.f14972gtknphoqwx = i13;
        this.f14970dxjokdxxww.invalidate();
        ntlheqmsrt(i13, 32768);
        return true;
    }

    private void ulzqkzuiru(int i13) {
        int i14 = this.f14976wflxmlrfwp;
        if (i14 == i13) {
            return;
        }
        this.f14976wflxmlrfwp = i13;
        ntlheqmsrt(i13, UserVerificationMethods.USER_VERIFY_PATTERN);
        ntlheqmsrt(i14, UserVerificationMethods.USER_VERIFY_HANDPRINT);
    }

    private AccessibilityEvent vdvldrhtss(int i13, int i14) {
        return i13 != -1 ? oxmwwwfdhm(i13, i14) : kcexrzcfyt(i14);
    }

    private boolean yadqdtsiqt(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f14970dxjokdxxww.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f14970dxjokdxxww.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private zdlpuopuiu yggfygwlhe() {
        zdlpuopuiu zdlpuopuiuVarSopmlzcsov = zdlpuopuiu.sopmlzcsov(this.f14970dxjokdxxww);
        jhduphickx.jhduphickx(this.f14970dxjokdxxww, zdlpuopuiuVarSopmlzcsov);
        ArrayList arrayList = new ArrayList();
        istkbnxepw(arrayList);
        if (zdlpuopuiuVarSopmlzcsov.agtfadlqog() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            zdlpuopuiuVarSopmlzcsov.wkgbmnqykc(this.f14970dxjokdxxww, ((Integer) arrayList.get(i13)).intValue());
        }
        return zdlpuopuiuVarSopmlzcsov;
    }

    private zdlpuopuiu zdlpuopuiu(int i13) {
        zdlpuopuiu zdlpuopuiuVarUlzqkzuiru = zdlpuopuiu.ulzqkzuiru();
        zdlpuopuiuVarUlzqkzuiru.weqkydbzbr(true);
        zdlpuopuiuVarUlzqkzuiru.zeieaojujs(true);
        zdlpuopuiuVarUlzqkzuiru.uwvvkdfqfp("android.view.View");
        Rect rect = f14965agtfadlqog;
        zdlpuopuiuVarUlzqkzuiru.xrmfcynszj(rect);
        zdlpuopuiuVarUlzqkzuiru.metgxyhuhe(rect);
        zdlpuopuiuVarUlzqkzuiru.hszhottldk(this.f14970dxjokdxxww);
        cllcsxoeiz(i13, zdlpuopuiuVarUlzqkzuiru);
        if (zdlpuopuiuVarUlzqkzuiru.esjtqupxsv() == null && zdlpuopuiuVarUlzqkzuiru.oxmwwwfdhm() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        zdlpuopuiuVarUlzqkzuiru.gtknphoqwx(this.f14971eablkybsjg);
        if (this.f14971eablkybsjg.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iDxjokdxxww = zdlpuopuiuVarUlzqkzuiru.dxjokdxxww();
        if ((iDxjokdxxww & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iDxjokdxxww & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        zdlpuopuiuVarUlzqkzuiru.lxfrhoxuzk(this.f14970dxjokdxxww.getContext().getPackageName());
        zdlpuopuiuVarUlzqkzuiru.ezmngbhpjk(this.f14970dxjokdxxww, i13);
        if (this.f14972gtknphoqwx == i13) {
            zdlpuopuiuVarUlzqkzuiru.ikoacuggdj(true);
            zdlpuopuiuVarUlzqkzuiru.iobyxmoadg(UserVerificationMethods.USER_VERIFY_PATTERN);
        } else {
            zdlpuopuiuVarUlzqkzuiru.ikoacuggdj(false);
            zdlpuopuiuVarUlzqkzuiru.iobyxmoadg(64);
        }
        boolean z13 = this.f14969draadjrbmk == i13;
        if (z13) {
            zdlpuopuiuVarUlzqkzuiru.iobyxmoadg(2);
        } else if (zdlpuopuiuVarUlzqkzuiru.hcddaimhww()) {
            zdlpuopuiuVarUlzqkzuiru.iobyxmoadg(1);
        }
        zdlpuopuiuVarUlzqkzuiru.nuxfzjnpeb(z13);
        this.f14970dxjokdxxww.getLocationOnScreen(this.f14974lqeggnwhkg);
        zdlpuopuiuVarUlzqkzuiru.draadjrbmk(this.f14977wkgbmnqykc);
        if (this.f14977wkgbmnqykc.equals(rect)) {
            zdlpuopuiuVarUlzqkzuiru.gtknphoqwx(this.f14977wkgbmnqykc);
            if (zdlpuopuiuVarUlzqkzuiru.f118507zoijcleaow != -1) {
                zdlpuopuiu zdlpuopuiuVarUlzqkzuiru2 = zdlpuopuiu.ulzqkzuiru();
                for (int i14 = zdlpuopuiuVarUlzqkzuiru.f118507zoijcleaow; i14 != -1; i14 = zdlpuopuiuVarUlzqkzuiru2.f118507zoijcleaow) {
                    zdlpuopuiuVarUlzqkzuiru2.fiwbwshyhd(this.f14970dxjokdxxww, -1);
                    zdlpuopuiuVarUlzqkzuiru2.xrmfcynszj(f14965agtfadlqog);
                    cllcsxoeiz(i14, zdlpuopuiuVarUlzqkzuiru2);
                    zdlpuopuiuVarUlzqkzuiru2.gtknphoqwx(this.f14971eablkybsjg);
                    Rect rect2 = this.f14977wkgbmnqykc;
                    Rect rect3 = this.f14971eablkybsjg;
                    rect2.offset(rect3.left, rect3.top);
                }
                zdlpuopuiuVarUlzqkzuiru2.ribwqtqdhb();
            }
            this.f14977wkgbmnqykc.offset(this.f14974lqeggnwhkg[0] - this.f14970dxjokdxxww.getScrollX(), this.f14974lqeggnwhkg[1] - this.f14970dxjokdxxww.getScrollY());
        }
        if (this.f14970dxjokdxxww.getLocalVisibleRect(this.f14973gxszxtbevo)) {
            this.f14973gxszxtbevo.offset(this.f14974lqeggnwhkg[0] - this.f14970dxjokdxxww.getScrollX(), this.f14974lqeggnwhkg[1] - this.f14970dxjokdxxww.getScrollY());
            if (this.f14977wkgbmnqykc.intersect(this.f14973gxszxtbevo)) {
                zdlpuopuiuVarUlzqkzuiru.metgxyhuhe(this.f14977wkgbmnqykc);
                if (yadqdtsiqt(this.f14977wkgbmnqykc)) {
                    zdlpuopuiuVarUlzqkzuiru.e(true);
                }
            }
        }
        return zdlpuopuiuVarUlzqkzuiru;
    }

    protected abstract void cllcsxoeiz(int i13, zdlpuopuiu zdlpuopuiuVar);

    public final int cqumvgiudr() {
        return this.f14972gtknphoqwx;
    }

    protected abstract void dsvhmnatus(int i13, boolean z13);

    @Override // v1.iobyxmoadg
    public void gxszxtbevo(View view, AccessibilityEvent accessibilityEvent) {
        super.gxszxtbevo(view, accessibilityEvent);
        hcddaimhww(accessibilityEvent);
    }

    protected void hcddaimhww(AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void hkdspvbjdz(zdlpuopuiu zdlpuopuiuVar);

    protected abstract void istkbnxepw(List list);

    public final boolean iwizpuwonk(KeyEvent keyEvent) {
        int i13 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return lmojexxdyd(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return lmojexxdyd(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iIozdgvuglv = iozdgvuglv(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z13 = false;
                    while (i13 < repeatCount && lmojexxdyd(iIozdgvuglv, null)) {
                        i13++;
                        z13 = true;
                    }
                    return z13;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        rgvfuqvkyq();
        return true;
    }

    protected void jpowsppfya(int i13, AccessibilityEvent accessibilityEvent) {
    }

    public final boolean jyumaefscl(MotionEvent motionEvent) {
        if (!this.f14975nufgyqmvbu.isEnabled() || !this.f14975nufgyqmvbu.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iZynmafqrjb = zynmafqrjb(motionEvent.getX(), motionEvent.getY());
            ulzqkzuiru(iZynmafqrjb);
            return iZynmafqrjb != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f14976wflxmlrfwp == Integer.MIN_VALUE) {
            return false;
        }
        ulzqkzuiru(Integer.MIN_VALUE);
        return true;
    }

    @Override // v1.iobyxmoadg
    public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
        super.lqeggnwhkg(view, zdlpuopuiuVar);
        hkdspvbjdz(zdlpuopuiuVar);
    }

    public final boolean mbcevpiqjq(int i13) {
        int i14;
        if ((!this.f14970dxjokdxxww.isFocused() && !this.f14970dxjokdxxww.requestFocus()) || (i14 = this.f14969draadjrbmk) == i13) {
            return false;
        }
        if (i14 != Integer.MIN_VALUE) {
            ojitshcjhn(i14);
        }
        if (i13 == Integer.MIN_VALUE) {
            return false;
        }
        this.f14969draadjrbmk = i13;
        dsvhmnatus(i13, true);
        ntlheqmsrt(i13, 8);
        return true;
    }

    public final boolean ntlheqmsrt(int i13, int i14) {
        ViewParent parent;
        if (i13 == Integer.MIN_VALUE || !this.f14975nufgyqmvbu.isEnabled() || (parent = this.f14970dxjokdxxww.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f14970dxjokdxxww, vdvldrhtss(i13, i14));
    }

    public final boolean ojitshcjhn(int i13) {
        if (this.f14969draadjrbmk != i13) {
            return false;
        }
        this.f14969draadjrbmk = Integer.MIN_VALUE;
        dsvhmnatus(i13, false);
        ntlheqmsrt(i13, 8);
        return true;
    }

    protected abstract boolean pkzmftpjix(int i13, int i14, Bundle bundle);

    public final int pmvmpeiblj() {
        return this.f14969draadjrbmk;
    }

    zdlpuopuiu wwaezpbzkn(int i13) {
        return i13 == -1 ? yggfygwlhe() : zdlpuopuiu(i13);
    }

    boolean wypolnanlu(int i13, int i14, Bundle bundle) {
        return i13 != -1 ? stevsuqkhv(i13, i14, bundle) : kegysxyocb(i14, bundle);
    }

    public final void ylkuphrtab(boolean z13, int i13, Rect rect) {
        int i14 = this.f14969draadjrbmk;
        if (i14 != Integer.MIN_VALUE) {
            ojitshcjhn(i14);
        }
        if (z13) {
            lmojexxdyd(i13, rect);
        }
    }

    @Override // v1.iobyxmoadg
    public yggfygwlhe zoijcleaow(View view) {
        if (this.f14968btonecajqb == null) {
            this.f14968btonecajqb = new ppxfxbqfkf();
        }
        return this.f14968btonecajqb;
    }

    protected abstract int zynmafqrjb(float f13, float f14);
}
