package b;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.collection.jpowsppfya;
import androidx.collection.lmojexxdyd;
import androidx.collection.ntlheqmsrt;
import g0.esjtqupxsv;
import g0.iwizpuwonk;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow extends agtfadlqog implements g0.vdvldrhtss, f.lqeggnwhkg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f14885dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f14886eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Rect f14887gxszxtbevo = new Rect();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private zdlpuopuiu f14888iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private AutofillId f14889lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private lmojexxdyd f14890nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final View f14891ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final h0.zoijcleaow f14892wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwizpuwonk f14893zoijcleaow;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f14894yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(int i13) {
            super(4);
            this.f14894yggfygwlhe = i13;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(int i13, int i14, int i15, int i16) {
            zoijcleaow.this.eablkybsjg().eablkybsjg(zoijcleaow.this.f14891ppxfxbqfkf, this.f14894yggfygwlhe, new Rect(i13, i14, i15, i16));
        }
    }

    /* JADX INFO: renamed from: b.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0246zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ g0.ojitshcjhn f14896yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0246zoijcleaow(g0.ojitshcjhn ojitshcjhnVar) {
            super(4);
            this.f14896yggfygwlhe = ojitshcjhnVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(int i13, int i14, int i15, int i16) {
            zoijcleaow.this.f14887gxszxtbevo.set(i13, i14, i15, i16);
            zoijcleaow.this.eablkybsjg().ppxfxbqfkf(zoijcleaow.this.f14891ppxfxbqfkf, this.f14896yggfygwlhe.zynmafqrjb(), zoijcleaow.this.f14887gxszxtbevo);
        }
    }

    public zoijcleaow(zdlpuopuiu zdlpuopuiuVar, iwizpuwonk iwizpuwonkVar, View view, h0.zoijcleaow zoijcleaowVar, String str) {
        this.f14888iobyxmoadg = zdlpuopuiuVar;
        this.f14893zoijcleaow = iwizpuwonkVar;
        this.f14891ppxfxbqfkf = view;
        this.f14892wkgbmnqykc = zoijcleaowVar;
        this.f14886eablkybsjg = str;
        view.setImportantForAutofill(1);
        c0.iobyxmoadg iobyxmoadgVarIobyxmoadg = c0.wkgbmnqykc.iobyxmoadg(view);
        AutofillId autofillIdIobyxmoadg = iobyxmoadgVarIobyxmoadg != null ? iobyxmoadgVarIobyxmoadg.iobyxmoadg() : null;
        if (autofillIdIobyxmoadg == null) {
            w.iobyxmoadg.ppxfxbqfkf("Required value was null.");
            throw new KotlinNothingValueException();
        }
        this.f14889lqeggnwhkg = autofillIdIobyxmoadg;
        this.f14890nufgyqmvbu = new lmojexxdyd(0, 1, null);
    }

    public final void btonecajqb(g0.ojitshcjhn ojitshcjhnVar, int i13) {
        if (this.f14890nufgyqmvbu.kcexrzcfyt(i13)) {
            this.f14888iobyxmoadg.wkgbmnqykc(this.f14891ppxfxbqfkf, i13, false);
        }
        g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
        if (wflxmlrfwpVarWkgbmnqykc == null || !ppxfxbqfkf.eablkybsjg(wflxmlrfwpVarWkgbmnqykc)) {
            return;
        }
        this.f14890nufgyqmvbu.lqeggnwhkg(ojitshcjhnVar.zynmafqrjb());
        this.f14888iobyxmoadg.wkgbmnqykc(this.f14891ppxfxbqfkf, ojitshcjhnVar.zynmafqrjb(), true);
    }

    public final void draadjrbmk(ViewStructure viewStructure) {
        nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.f14835iobyxmoadg;
        g0.ojitshcjhn ojitshcjhnVarPpxfxbqfkf = this.f14893zoijcleaow.ppxfxbqfkf();
        jyumaefscl.iobyxmoadg(viewStructure, ojitshcjhnVarPpxfxbqfkf, this.f14889lqeggnwhkg, this.f14886eablkybsjg, this.f14892wkgbmnqykc);
        jpowsppfya jpowsppfyaVarNufgyqmvbu = ntlheqmsrt.nufgyqmvbu(ojitshcjhnVarPpxfxbqfkf, viewStructure);
        while (jpowsppfyaVarNufgyqmvbu.nufgyqmvbu()) {
            Object objZynmafqrjb = jpowsppfyaVarNufgyqmvbu.zynmafqrjb(jpowsppfyaVarNufgyqmvbu.f4344zoijcleaow - 1);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objZynmafqrjb, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure2 = (ViewStructure) objZynmafqrjb;
            Object objZynmafqrjb2 = jpowsppfyaVarNufgyqmvbu.zynmafqrjb(jpowsppfyaVarNufgyqmvbu.f4344zoijcleaow - 1);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objZynmafqrjb2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List listOjitshcjhn = ((g0.ojitshcjhn) objZynmafqrjb2).ojitshcjhn();
            int size = listOjitshcjhn.size();
            for (int i13 = 0; i13 < size; i13++) {
                g0.ojitshcjhn ojitshcjhnVar = (g0.ojitshcjhn) listOjitshcjhn.get(i13);
                if (!ojitshcjhnVar.istkbnxepw() && ojitshcjhnVar.gxszxtbevo() && ojitshcjhnVar.gtknphoqwx()) {
                    g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
                    if (wflxmlrfwpVarWkgbmnqykc == null || !ppxfxbqfkf.gxszxtbevo(wflxmlrfwpVarWkgbmnqykc)) {
                        jpowsppfyaVarNufgyqmvbu.agtfadlqog(ojitshcjhnVar);
                        jpowsppfyaVarNufgyqmvbu.agtfadlqog(viewStructure2);
                    } else {
                        ViewStructure viewStructureLqeggnwhkg = nufgyqmvbuVar.lqeggnwhkg(viewStructure2, nufgyqmvbuVar.iobyxmoadg(viewStructure2, 1));
                        jyumaefscl.iobyxmoadg(viewStructureLqeggnwhkg, ojitshcjhnVar, this.f14889lqeggnwhkg, this.f14886eablkybsjg, this.f14892wkgbmnqykc);
                        jpowsppfyaVarNufgyqmvbu.agtfadlqog(ojitshcjhnVar);
                        jpowsppfyaVarNufgyqmvbu.agtfadlqog(viewStructureLqeggnwhkg);
                    }
                }
            }
        }
    }

    public final void dxjokdxxww(g0.ojitshcjhn ojitshcjhnVar) {
        g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
        if (wflxmlrfwpVarWkgbmnqykc == null || !ppxfxbqfkf.eablkybsjg(wflxmlrfwpVarWkgbmnqykc)) {
            return;
        }
        this.f14890nufgyqmvbu.lqeggnwhkg(ojitshcjhnVar.zynmafqrjb());
        this.f14888iobyxmoadg.wkgbmnqykc(this.f14891ppxfxbqfkf, ojitshcjhnVar.zynmafqrjb(), true);
    }

    public final zdlpuopuiu eablkybsjg() {
        return this.f14888iobyxmoadg;
    }

    public final void gtknphoqwx(SparseArray sparseArray) {
        g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc;
        g0.iobyxmoadg iobyxmoadgVar;
        tg.draadjrbmk draadjrbmkVar;
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iKeyAt = sparseArray.keyAt(i13);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.f14835iobyxmoadg;
            if (nufgyqmvbuVar.eablkybsjg(autofillValue)) {
                g0.ojitshcjhn ojitshcjhnVarIobyxmoadg = this.f14893zoijcleaow.iobyxmoadg(iKeyAt);
                if (ojitshcjhnVarIobyxmoadg != null && (wflxmlrfwpVarWkgbmnqykc = ojitshcjhnVarIobyxmoadg.wkgbmnqykc()) != null && (iobyxmoadgVar = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarWkgbmnqykc, g0.draadjrbmk.f35622iobyxmoadg.gtknphoqwx())) != null && (draadjrbmkVar = (tg.draadjrbmk) iobyxmoadgVar.iobyxmoadg()) != null) {
                }
            } else if (nufgyqmvbuVar.ppxfxbqfkf(autofillValue)) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (nufgyqmvbuVar.wkgbmnqykc(autofillValue)) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (nufgyqmvbuVar.gxszxtbevo(autofillValue)) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }

    public final void gxszxtbevo(g0.ojitshcjhn ojitshcjhnVar) {
        if (this.f14890nufgyqmvbu.kcexrzcfyt(ojitshcjhnVar.zynmafqrjb())) {
            this.f14888iobyxmoadg.wkgbmnqykc(this.f14891ppxfxbqfkf, ojitshcjhnVar.zynmafqrjb(), false);
        }
    }

    @Override // g0.vdvldrhtss
    public void iobyxmoadg(g0.ojitshcjhn ojitshcjhnVar, g0.wflxmlrfwp wflxmlrfwpVar) {
        j0.eablkybsjg eablkybsjgVar;
        j0.eablkybsjg eablkybsjgVar2;
        g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
        int iZynmafqrjb = ojitshcjhnVar.zynmafqrjb();
        String strBtonecajqb = null;
        String strBtonecajqb2 = (wflxmlrfwpVar == null || (eablkybsjgVar2 = (j0.eablkybsjg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVar, esjtqupxsv.f35662iobyxmoadg.ojitshcjhn())) == null) ? null : eablkybsjgVar2.btonecajqb();
        if (wflxmlrfwpVarWkgbmnqykc != null && (eablkybsjgVar = (j0.eablkybsjg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarWkgbmnqykc, esjtqupxsv.f35662iobyxmoadg.ojitshcjhn())) != null) {
            strBtonecajqb = eablkybsjgVar.btonecajqb();
        }
        boolean z13 = false;
        if (strBtonecajqb2 != strBtonecajqb) {
            if (strBtonecajqb2 == null) {
                this.f14888iobyxmoadg.wkgbmnqykc(this.f14891ppxfxbqfkf, iZynmafqrjb, true);
            } else if (strBtonecajqb == null) {
                this.f14888iobyxmoadg.wkgbmnqykc(this.f14891ppxfxbqfkf, iZynmafqrjb, false);
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((rgvfuqvkyq) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarWkgbmnqykc, esjtqupxsv.f35662iobyxmoadg.ppxfxbqfkf()), rgvfuqvkyq.f14875iobyxmoadg.iobyxmoadg())) {
                this.f14888iobyxmoadg.iobyxmoadg(this.f14891ppxfxbqfkf, iZynmafqrjb, nufgyqmvbu.f14835iobyxmoadg.zoijcleaow(strBtonecajqb.toString()));
            }
        }
        boolean z14 = wflxmlrfwpVar != null && ppxfxbqfkf.eablkybsjg(wflxmlrfwpVar);
        if (wflxmlrfwpVarWkgbmnqykc != null && ppxfxbqfkf.eablkybsjg(wflxmlrfwpVarWkgbmnqykc)) {
            z13 = true;
        }
        if (z14 != z13) {
            if (z13) {
                this.f14890nufgyqmvbu.lqeggnwhkg(iZynmafqrjb);
            } else {
                this.f14890nufgyqmvbu.kcexrzcfyt(iZynmafqrjb);
            }
        }
    }

    public final void lqeggnwhkg() {
        if (this.f14890nufgyqmvbu.ppxfxbqfkf() && this.f14885dxjokdxxww) {
            this.f14888iobyxmoadg.commit();
            this.f14885dxjokdxxww = false;
        }
        if (this.f14890nufgyqmvbu.wkgbmnqykc()) {
            this.f14885dxjokdxxww = true;
        }
    }

    public final void nufgyqmvbu(g0.ojitshcjhn ojitshcjhnVar) {
        if (this.f14890nufgyqmvbu.kcexrzcfyt(ojitshcjhnVar.zynmafqrjb())) {
            this.f14888iobyxmoadg.wkgbmnqykc(this.f14891ppxfxbqfkf, ojitshcjhnVar.zynmafqrjb(), false);
        }
    }

    public final void wflxmlrfwp(g0.ojitshcjhn ojitshcjhnVar) {
        this.f14892wkgbmnqykc.eablkybsjg().draadjrbmk(ojitshcjhnVar.zynmafqrjb(), new C0246zoijcleaow(ojitshcjhnVar));
    }

    @Override // f.lqeggnwhkg
    public void zoijcleaow(androidx.compose.ui.focus.vdvldrhtss vdvldrhtssVar, androidx.compose.ui.focus.vdvldrhtss vdvldrhtssVar2) {
        g0.ojitshcjhn ojitshcjhnVarOxmwwwfdhm;
        g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc;
        g0.ojitshcjhn ojitshcjhnVarOxmwwwfdhm2;
        g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc2;
        if (vdvldrhtssVar != null && (ojitshcjhnVarOxmwwwfdhm2 = z.gtknphoqwx.oxmwwwfdhm(vdvldrhtssVar)) != null && (wflxmlrfwpVarWkgbmnqykc2 = ojitshcjhnVarOxmwwwfdhm2.wkgbmnqykc()) != null && ppxfxbqfkf.wkgbmnqykc(wflxmlrfwpVarWkgbmnqykc2)) {
            this.f14888iobyxmoadg.zoijcleaow(this.f14891ppxfxbqfkf, ojitshcjhnVarOxmwwwfdhm2.zynmafqrjb());
        }
        if (vdvldrhtssVar2 == null || (ojitshcjhnVarOxmwwwfdhm = z.gtknphoqwx.oxmwwwfdhm(vdvldrhtssVar2)) == null || (wflxmlrfwpVarWkgbmnqykc = ojitshcjhnVarOxmwwwfdhm.wkgbmnqykc()) == null || !ppxfxbqfkf.wkgbmnqykc(wflxmlrfwpVarWkgbmnqykc)) {
            return;
        }
        int iZynmafqrjb = ojitshcjhnVarOxmwwwfdhm.zynmafqrjb();
        this.f14892wkgbmnqykc.eablkybsjg().draadjrbmk(iZynmafqrjb, new iobyxmoadg(iZynmafqrjb));
    }
}
