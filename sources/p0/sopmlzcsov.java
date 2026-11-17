package p0;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import j0.f;
import j0.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class sopmlzcsov implements jpowsppfya {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private Runnable f75280agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final gg.gtknphoqwx f75281btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final p0.eablkybsjg f75282draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private List f75283dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private tg.draadjrbmk f75284eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private Rect f75285gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private tg.draadjrbmk f75286gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f75287iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private tzroggbefp f75288lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private zdlpuopuiu f75289nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Executor f75290ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f75291wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f75292wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jyumaefscl f75293zoijcleaow;

    static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final eablkybsjg f75294zdlpuopuiu = new eablkybsjg();

        eablkybsjg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((List) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(List list) {
        }
    }

    static final class gxszxtbevo extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final gxszxtbevo f75295zdlpuopuiu = new gxszxtbevo();

        gxszxtbevo() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg(((kcexrzcfyt) obj).rgvfuqvkyq());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(int i13) {
        }
    }

    private enum iobyxmoadg {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard;


        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f75297esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    static final class lqeggnwhkg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final lqeggnwhkg f75302zdlpuopuiu = new lqeggnwhkg();

        lqeggnwhkg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((List) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(List list) {
        }
    }

    static final class nufgyqmvbu extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final nufgyqmvbu f75303zdlpuopuiu = new nufgyqmvbu();

        nufgyqmvbu() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg(((kcexrzcfyt) obj).rgvfuqvkyq());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(int i13) {
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        ppxfxbqfkf() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(sopmlzcsov.this.vdvldrhtss(), false);
        }
    }

    public static final class wkgbmnqykc implements yggfygwlhe {
        wkgbmnqykc() {
        }

        @Override // p0.yggfygwlhe
        public void eablkybsjg(hkdspvbjdz hkdspvbjdzVar) {
            int size = sopmlzcsov.this.f75283dxjokdxxww.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((WeakReference) sopmlzcsov.this.f75283dxjokdxxww.get(i13)).get(), hkdspvbjdzVar)) {
                    sopmlzcsov.this.f75283dxjokdxxww.remove(i13);
                    return;
                }
            }
        }

        @Override // p0.yggfygwlhe
        public void iobyxmoadg(KeyEvent keyEvent) {
            sopmlzcsov.this.rgvfuqvkyq().sendKeyEvent(keyEvent);
        }

        @Override // p0.yggfygwlhe
        public void ppxfxbqfkf(int i13) {
            sopmlzcsov.this.f75286gxszxtbevo.invoke(kcexrzcfyt.btonecajqb(i13));
        }

        @Override // p0.yggfygwlhe
        public void wkgbmnqykc(List list) {
            sopmlzcsov.this.f75284eablkybsjg.invoke(list);
        }

        @Override // p0.yggfygwlhe
        public void zoijcleaow(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
            sopmlzcsov.this.f75282draadjrbmk.zoijcleaow(z13, z14, z15, z16, z17, z18);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f75306iobyxmoadg;

        static {
            int[] iArr = new int[iobyxmoadg.values().length];
            try {
                iArr[iobyxmoadg.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iobyxmoadg.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iobyxmoadg.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[iobyxmoadg.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f75306iobyxmoadg = iArr;
        }
    }

    public sopmlzcsov(View view, t.lqeggnwhkg lqeggnwhkgVar, jyumaefscl jyumaefsclVar, Executor executor) {
        this.f75287iobyxmoadg = view;
        this.f75293zoijcleaow = jyumaefsclVar;
        this.f75290ppxfxbqfkf = executor;
        this.f75284eablkybsjg = eablkybsjg.f75294zdlpuopuiu;
        this.f75286gxszxtbevo = gxszxtbevo.f75295zdlpuopuiu;
        this.f75288lqeggnwhkg = new tzroggbefp("", l.f50289zoijcleaow.iobyxmoadg(), (l) null, 4, (kotlin.jvm.internal.gtknphoqwx) null);
        this.f75289nufgyqmvbu = zdlpuopuiu.f75327lqeggnwhkg.iobyxmoadg();
        this.f75283dxjokdxxww = new ArrayList();
        this.f75281btonecajqb = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new ppxfxbqfkf());
        this.f75282draadjrbmk = new p0.eablkybsjg(lqeggnwhkgVar, jyumaefsclVar);
        this.f75291wflxmlrfwp = new ipoelvxyzq.ppxfxbqfkf(new iobyxmoadg[16], 0);
    }

    private final void cqumvgiudr(boolean z13) {
        if (z13) {
            this.f75293zoijcleaow.eablkybsjg();
        } else {
            this.f75293zoijcleaow.gxszxtbevo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(sopmlzcsov sopmlzcsovVar) {
        sopmlzcsovVar.f75280agtfadlqog = null;
        sopmlzcsovVar.kcexrzcfyt();
    }

    private final void jyumaefscl(iobyxmoadg iobyxmoadgVar) {
        this.f75291wflxmlrfwp.zoijcleaow(iobyxmoadgVar);
        if (this.f75280agtfadlqog == null) {
            Runnable runnable = new Runnable() { // from class: p0.ulzqkzuiru
                @Override // java.lang.Runnable
                public final void run() {
                    sopmlzcsov.iwizpuwonk(this.f75312zdlpuopuiu);
                }
            };
            this.f75290ppxfxbqfkf.execute(runnable);
            this.f75280agtfadlqog = runnable;
        }
    }

    private final void kcexrzcfyt() {
        View viewFindFocus;
        if (!this.f75287iobyxmoadg.isFocused() && (viewFindFocus = this.f75287iobyxmoadg.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
            this.f75291wflxmlrfwp.nufgyqmvbu();
            return;
        }
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar2 = new kotlin.jvm.internal.hkdspvbjdz();
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f75291wflxmlrfwp;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            zdlpuopuiu((iobyxmoadg) objArr[i13], hkdspvbjdzVar, hkdspvbjdzVar2);
        }
        this.f75291wflxmlrfwp.nufgyqmvbu();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(hkdspvbjdzVar.f60015zdlpuopuiu, Boolean.TRUE)) {
            yggfygwlhe();
        }
        Boolean bool = (Boolean) hkdspvbjdzVar2.f60015zdlpuopuiu;
        if (bool != null) {
            cqumvgiudr(bool.booleanValue());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(hkdspvbjdzVar.f60015zdlpuopuiu, Boolean.FALSE)) {
            yggfygwlhe();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection rgvfuqvkyq() {
        return (BaseInputConnection) this.f75281btonecajqb.getValue();
    }

    private final void yggfygwlhe() {
        this.f75293zoijcleaow.ppxfxbqfkf();
    }

    private static final void zdlpuopuiu(iobyxmoadg iobyxmoadgVar, kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar2) {
        int i13 = zoijcleaow.f75306iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            Boolean bool = Boolean.TRUE;
            hkdspvbjdzVar.f60015zdlpuopuiu = bool;
            hkdspvbjdzVar2.f60015zdlpuopuiu = bool;
        } else if (i13 == 2) {
            Boolean bool2 = Boolean.FALSE;
            hkdspvbjdzVar.f60015zdlpuopuiu = bool2;
            hkdspvbjdzVar2.f60015zdlpuopuiu = bool2;
        } else {
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(hkdspvbjdzVar.f60015zdlpuopuiu, Boolean.FALSE)) {
                return;
            }
            hkdspvbjdzVar2.f60015zdlpuopuiu = Boolean.valueOf(iobyxmoadgVar == iobyxmoadg.ShowKeyboard);
        }
    }

    @Override // p0.jpowsppfya
    public void eablkybsjg() {
        jyumaefscl(iobyxmoadg.HideKeyboard);
    }

    @Override // p0.jpowsppfya
    public void gxszxtbevo(tzroggbefp tzroggbefpVar, tzroggbefp tzroggbefpVar2) {
        boolean z13 = (l.lqeggnwhkg(this.f75288lqeggnwhkg.gtknphoqwx(), tzroggbefpVar2.gtknphoqwx()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75288lqeggnwhkg.btonecajqb(), tzroggbefpVar2.btonecajqb())) ? false : true;
        this.f75288lqeggnwhkg = tzroggbefpVar2;
        int size = this.f75283dxjokdxxww.size();
        for (int i13 = 0; i13 < size; i13++) {
            hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) ((WeakReference) this.f75283dxjokdxxww.get(i13)).get();
            if (hkdspvbjdzVar != null) {
                hkdspvbjdzVar.gxszxtbevo(tzroggbefpVar2);
            }
        }
        this.f75282draadjrbmk.iobyxmoadg();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar, tzroggbefpVar2)) {
            if (z13) {
                jyumaefscl jyumaefsclVar = this.f75293zoijcleaow;
                int iDraadjrbmk = l.draadjrbmk(tzroggbefpVar2.gtknphoqwx());
                int iGtknphoqwx = l.gtknphoqwx(tzroggbefpVar2.gtknphoqwx());
                l lVarBtonecajqb = this.f75288lqeggnwhkg.btonecajqb();
                int iDraadjrbmk2 = lVarBtonecajqb != null ? l.draadjrbmk(lVarBtonecajqb.oxmwwwfdhm()) : -1;
                l lVarBtonecajqb2 = this.f75288lqeggnwhkg.btonecajqb();
                jyumaefsclVar.zoijcleaow(iDraadjrbmk, iGtknphoqwx, iDraadjrbmk2, lVarBtonecajqb2 != null ? l.gtknphoqwx(lVarBtonecajqb2.oxmwwwfdhm()) : -1);
                return;
            }
            return;
        }
        if (tzroggbefpVar != null && (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar.draadjrbmk(), tzroggbefpVar2.draadjrbmk()) || (l.lqeggnwhkg(tzroggbefpVar.gtknphoqwx(), tzroggbefpVar2.gtknphoqwx()) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar.btonecajqb(), tzroggbefpVar2.btonecajqb())))) {
            yggfygwlhe();
            return;
        }
        int size2 = this.f75283dxjokdxxww.size();
        for (int i14 = 0; i14 < size2; i14++) {
            hkdspvbjdz hkdspvbjdzVar2 = (hkdspvbjdz) ((WeakReference) this.f75283dxjokdxxww.get(i14)).get();
            if (hkdspvbjdzVar2 != null) {
                hkdspvbjdzVar2.lqeggnwhkg(this.f75288lqeggnwhkg, this.f75293zoijcleaow);
            }
        }
    }

    @Override // p0.jpowsppfya
    public void iobyxmoadg() {
        jyumaefscl(iobyxmoadg.StartInput);
    }

    @Override // p0.jpowsppfya
    public void lqeggnwhkg() {
        jyumaefscl(iobyxmoadg.ShowKeyboard);
    }

    @Override // p0.jpowsppfya
    public void nufgyqmvbu(tzroggbefp tzroggbefpVar, zdlpuopuiu zdlpuopuiuVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        this.f75292wkgbmnqykc = true;
        this.f75288lqeggnwhkg = tzroggbefpVar;
        this.f75289nufgyqmvbu = zdlpuopuiuVar;
        this.f75284eablkybsjg = draadjrbmkVar;
        this.f75286gxszxtbevo = draadjrbmkVar2;
        jyumaefscl(iobyxmoadg.StartInput);
    }

    public final InputConnection ojitshcjhn(EditorInfo editorInfo) {
        if (!this.f75292wkgbmnqykc) {
            return null;
        }
        ribwqtqdhb.nufgyqmvbu(editorInfo, this.f75289nufgyqmvbu, this.f75288lqeggnwhkg);
        ribwqtqdhb.dxjokdxxww(editorInfo);
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz(this.f75288lqeggnwhkg, new wkgbmnqykc(), this.f75289nufgyqmvbu.zoijcleaow());
        this.f75283dxjokdxxww.add(new WeakReference(hkdspvbjdzVar));
        return hkdspvbjdzVar;
    }

    public final boolean oxmwwwfdhm() {
        return this.f75292wkgbmnqykc;
    }

    @Override // p0.jpowsppfya
    public void ppxfxbqfkf() {
        this.f75292wkgbmnqykc = false;
        this.f75284eablkybsjg = lqeggnwhkg.f75302zdlpuopuiu;
        this.f75286gxszxtbevo = nufgyqmvbu.f75303zdlpuopuiu;
        this.f75285gtknphoqwx = null;
        jyumaefscl(iobyxmoadg.StopInput);
    }

    public final View vdvldrhtss() {
        return this.f75287iobyxmoadg;
    }

    @Override // p0.jpowsppfya
    public void wkgbmnqykc(g.lqeggnwhkg lqeggnwhkgVar) {
        Rect rect;
        this.f75285gtknphoqwx = new Rect(vg.iobyxmoadg.wkgbmnqykc(lqeggnwhkgVar.nufgyqmvbu()), vg.iobyxmoadg.wkgbmnqykc(lqeggnwhkgVar.gtknphoqwx()), vg.iobyxmoadg.wkgbmnqykc(lqeggnwhkgVar.dxjokdxxww()), vg.iobyxmoadg.wkgbmnqykc(lqeggnwhkgVar.eablkybsjg()));
        if (!this.f75283dxjokdxxww.isEmpty() || (rect = this.f75285gtknphoqwx) == null) {
            return;
        }
        this.f75287iobyxmoadg.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // p0.jpowsppfya
    public void zoijcleaow(tzroggbefp tzroggbefpVar, ylkuphrtab ylkuphrtabVar, f fVar, tg.draadjrbmk draadjrbmkVar, g.lqeggnwhkg lqeggnwhkgVar, g.lqeggnwhkg lqeggnwhkgVar2) {
        this.f75282draadjrbmk.wkgbmnqykc(tzroggbefpVar, ylkuphrtabVar, fVar, draadjrbmkVar, lqeggnwhkgVar, lqeggnwhkgVar2);
    }

    public /* synthetic */ sopmlzcsov(View view, t.lqeggnwhkg lqeggnwhkgVar, jyumaefscl jyumaefsclVar, Executor executor, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(view, lqeggnwhkgVar, jyumaefsclVar, (i13 & 8) != 0 ? ribwqtqdhb.wkgbmnqykc(Choreographer.getInstance()) : executor);
    }

    public sopmlzcsov(View view, t.lqeggnwhkg lqeggnwhkgVar) {
        this(view, lqeggnwhkgVar, new iwizpuwonk(view), null, 8, null);
    }
}
