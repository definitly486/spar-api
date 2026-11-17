package iwxlajgraz;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.w;
import j0.f;
import j0.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class grlcpdaxtj implements e {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private Rect f49849draadjrbmk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private opjhrmiecq.igdgnonuha f49851eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private skhdrjzrfn.skhdrjzrfn f49853gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f49854iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private w f49855lqeggnwhkg;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final wizcaqwiak f49858wflxmlrfwp;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwxlajgraz f49860zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private tg.draadjrbmk f49857ppxfxbqfkf = new tg.draadjrbmk() { // from class: iwxlajgraz.ageimvtcrz
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return grlcpdaxtj.agtfadlqog((List) obj);
        }
    };

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private tg.draadjrbmk f49859wkgbmnqykc = new tg.draadjrbmk() { // from class: iwxlajgraz.fyldjkxazc
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return grlcpdaxtj.ojitshcjhn((p0.kcexrzcfyt) obj);
        }
    };

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private p0.tzroggbefp f49856nufgyqmvbu = new p0.tzroggbefp("", l.f50289zoijcleaow.iobyxmoadg(), (l) null, 4, (kotlin.jvm.internal.gtknphoqwx) null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private p0.zdlpuopuiu f49850dxjokdxxww = p0.zdlpuopuiu.f75327lqeggnwhkg.iobyxmoadg();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private List f49848btonecajqb = new ArrayList();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final gg.gtknphoqwx f49852gtknphoqwx = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: iwxlajgraz.ipoelvxyzq
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return grlcpdaxtj.btonecajqb(this.f49876zdlpuopuiu);
        }
    });

    public static final class iobyxmoadg implements auzgnhcxok {
        iobyxmoadg() {
        }

        @Override // iwxlajgraz.auzgnhcxok
        public void eablkybsjg(jrbgnlbqoe jrbgnlbqoeVar) {
            int size = grlcpdaxtj.this.f49848btonecajqb.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((WeakReference) grlcpdaxtj.this.f49848btonecajqb.get(i13)).get(), jrbgnlbqoeVar)) {
                    grlcpdaxtj.this.f49848btonecajqb.remove(i13);
                    return;
                }
            }
        }

        @Override // iwxlajgraz.auzgnhcxok
        public void iobyxmoadg(KeyEvent keyEvent) {
            grlcpdaxtj.this.draadjrbmk().sendKeyEvent(keyEvent);
        }

        @Override // iwxlajgraz.auzgnhcxok
        public void ppxfxbqfkf(int i13) {
            grlcpdaxtj.this.f49859wkgbmnqykc.invoke(p0.kcexrzcfyt.btonecajqb(i13));
        }

        @Override // iwxlajgraz.auzgnhcxok
        public void wkgbmnqykc(List list) {
            grlcpdaxtj.this.f49857ppxfxbqfkf.invoke(list);
        }

        @Override // iwxlajgraz.auzgnhcxok
        public void zoijcleaow(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
            grlcpdaxtj.this.f49858wflxmlrfwp.zoijcleaow(z13, z14, z15, z16, z17, z18);
        }
    }

    public grlcpdaxtj(View view, tg.draadjrbmk draadjrbmkVar, iwxlajgraz iwxlajgrazVar) {
        this.f49854iobyxmoadg = view;
        this.f49860zoijcleaow = iwxlajgrazVar;
        this.f49858wflxmlrfwp = new wizcaqwiak(draadjrbmkVar, iwxlajgrazVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn agtfadlqog(List list) {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseInputConnection btonecajqb(grlcpdaxtj grlcpdaxtjVar) {
        return new BaseInputConnection(grlcpdaxtjVar.f49854iobyxmoadg, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection draadjrbmk() {
        return (BaseInputConnection) this.f49852gtknphoqwx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ojitshcjhn(p0.kcexrzcfyt kcexrzcfytVar) {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void rgvfuqvkyq() {
        this.f49860zoijcleaow.ppxfxbqfkf();
    }

    @Override // androidx.compose.ui.platform.e
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public jrbgnlbqoe iobyxmoadg(EditorInfo editorInfo) {
        wypolnanlu.ppxfxbqfkf(editorInfo, this.f49856nufgyqmvbu.draadjrbmk(), this.f49856nufgyqmvbu.gtknphoqwx(), this.f49850dxjokdxxww, null, 8, null);
        fiwbwshyhd.wkgbmnqykc(editorInfo);
        jrbgnlbqoe jrbgnlbqoeVar = new jrbgnlbqoe(this.f49856nufgyqmvbu, new iobyxmoadg(), this.f49850dxjokdxxww.zoijcleaow(), this.f49851eablkybsjg, this.f49853gxszxtbevo, this.f49855lqeggnwhkg);
        this.f49848btonecajqb.add(new WeakReference(jrbgnlbqoeVar));
        return jrbgnlbqoeVar;
    }

    public final void kcexrzcfyt(p0.tzroggbefp tzroggbefpVar, p0.ylkuphrtab ylkuphrtabVar, f fVar, g.lqeggnwhkg lqeggnwhkgVar, g.lqeggnwhkg lqeggnwhkgVar2) {
        this.f49858wflxmlrfwp.wkgbmnqykc(tzroggbefpVar, ylkuphrtabVar, fVar, lqeggnwhkgVar, lqeggnwhkgVar2);
    }

    public final void oxmwwwfdhm(p0.tzroggbefp tzroggbefpVar, p0.tzroggbefp tzroggbefpVar2) {
        boolean z13 = (l.lqeggnwhkg(this.f49856nufgyqmvbu.gtknphoqwx(), tzroggbefpVar2.gtknphoqwx()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f49856nufgyqmvbu.btonecajqb(), tzroggbefpVar2.btonecajqb())) ? false : true;
        this.f49856nufgyqmvbu = tzroggbefpVar2;
        int size = this.f49848btonecajqb.size();
        for (int i13 = 0; i13 < size; i13++) {
            jrbgnlbqoe jrbgnlbqoeVar = (jrbgnlbqoe) ((WeakReference) this.f49848btonecajqb.get(i13)).get();
            if (jrbgnlbqoeVar != null) {
                jrbgnlbqoeVar.nufgyqmvbu(tzroggbefpVar2);
            }
        }
        this.f49858wflxmlrfwp.iobyxmoadg();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar, tzroggbefpVar2)) {
            if (z13) {
                iwxlajgraz iwxlajgrazVar = this.f49860zoijcleaow;
                int iDraadjrbmk = l.draadjrbmk(tzroggbefpVar2.gtknphoqwx());
                int iGtknphoqwx = l.gtknphoqwx(tzroggbefpVar2.gtknphoqwx());
                l lVarBtonecajqb = this.f49856nufgyqmvbu.btonecajqb();
                int iDraadjrbmk2 = lVarBtonecajqb != null ? l.draadjrbmk(lVarBtonecajqb.oxmwwwfdhm()) : -1;
                l lVarBtonecajqb2 = this.f49856nufgyqmvbu.btonecajqb();
                iwxlajgrazVar.zoijcleaow(iDraadjrbmk, iGtknphoqwx, iDraadjrbmk2, lVarBtonecajqb2 != null ? l.gtknphoqwx(lVarBtonecajqb2.oxmwwwfdhm()) : -1);
                return;
            }
            return;
        }
        if (tzroggbefpVar != null && (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar.draadjrbmk(), tzroggbefpVar2.draadjrbmk()) || (l.lqeggnwhkg(tzroggbefpVar.gtknphoqwx(), tzroggbefpVar2.gtknphoqwx()) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar.btonecajqb(), tzroggbefpVar2.btonecajqb())))) {
            rgvfuqvkyq();
            return;
        }
        int size2 = this.f49848btonecajqb.size();
        for (int i14 = 0; i14 < size2; i14++) {
            jrbgnlbqoe jrbgnlbqoeVar2 = (jrbgnlbqoe) ((WeakReference) this.f49848btonecajqb.get(i14)).get();
            if (jrbgnlbqoeVar2 != null) {
                jrbgnlbqoeVar2.dxjokdxxww(this.f49856nufgyqmvbu, this.f49860zoijcleaow);
            }
        }
    }

    public final void vdvldrhtss(p0.tzroggbefp tzroggbefpVar, hszhottldk.iobyxmoadg iobyxmoadgVar, p0.zdlpuopuiu zdlpuopuiuVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        this.f49856nufgyqmvbu = tzroggbefpVar;
        this.f49850dxjokdxxww = zdlpuopuiuVar;
        this.f49857ppxfxbqfkf = draadjrbmkVar;
        this.f49859wkgbmnqykc = draadjrbmkVar2;
        this.f49851eablkybsjg = iobyxmoadgVar != null ? iobyxmoadgVar.Y() : null;
        this.f49853gxszxtbevo = iobyxmoadgVar != null ? iobyxmoadgVar.r() : null;
        this.f49855lqeggnwhkg = iobyxmoadgVar != null ? iobyxmoadgVar.getViewConfiguration() : null;
    }

    public final void wflxmlrfwp(g.lqeggnwhkg lqeggnwhkgVar) {
        Rect rect;
        this.f49849draadjrbmk = new Rect(vg.iobyxmoadg.wkgbmnqykc(lqeggnwhkgVar.nufgyqmvbu()), vg.iobyxmoadg.wkgbmnqykc(lqeggnwhkgVar.gtknphoqwx()), vg.iobyxmoadg.wkgbmnqykc(lqeggnwhkgVar.dxjokdxxww()), vg.iobyxmoadg.wkgbmnqykc(lqeggnwhkgVar.eablkybsjg()));
        if (!this.f49848btonecajqb.isEmpty() || (rect = this.f49849draadjrbmk) == null) {
            return;
        }
        this.f49854iobyxmoadg.requestRectangleOnScreen(new Rect(rect));
    }
}
