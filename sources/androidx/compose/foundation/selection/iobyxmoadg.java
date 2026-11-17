package androidx.compose.foundation.selection;

import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.jyumaefscl;
import g0.nufgyqmvbu;
import ikoacuggdj.tzroggbefp;
import ikoacuggdj.wypolnanlu;
import metgxyhuhe.gtknphoqwx;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0092iobyxmoadg implements vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f5325cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f5326iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f5327jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f5328yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wypolnanlu f5329zdlpuopuiu;

        public C0092iobyxmoadg(wypolnanlu wypolnanluVar, boolean z13, boolean z14, nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar) {
            this.f5329zdlpuopuiu = wypolnanluVar;
            this.f5328yggfygwlhe = z13;
            this.f5327jyumaefscl = z14;
            this.f5326iwizpuwonk = nufgyqmvbuVar;
            this.f5325cqumvgiudr = iobyxmoadgVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg((androidx.compose.ui.wkgbmnqykc) obj, (draadjrbmk) obj2, ((Number) obj3).intValue());
        }

        public final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, int i13) {
            draadjrbmkVar.sopmlzcsov(-1525724089);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1525724089, i13, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = gtknphoqwx.iobyxmoadg();
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            metgxyhuhe.draadjrbmk draadjrbmkVar2 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.foundation.vdvldrhtss.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, draadjrbmkVar2, this.f5329zdlpuopuiu).eablkybsjg(new SelectableElement(this.f5328yggfygwlhe, draadjrbmkVar2, null, false, this.f5327jyumaefscl, this.f5326iwizpuwonk, this.f5325cqumvgiudr, null));
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return wkgbmnqykcVarEablkybsjg;
        }
    }

    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, wypolnanlu wypolnanluVar, boolean z14, nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg;
        if (wypolnanluVar instanceof tzroggbefp) {
            wkgbmnqykcVarEablkybsjg = new SelectableElement(z13, draadjrbmkVar, (tzroggbefp) wypolnanluVar, false, z14, nufgyqmvbuVar, iobyxmoadgVar, null);
        } else if (wypolnanluVar == null) {
            wkgbmnqykcVarEablkybsjg = new SelectableElement(z13, draadjrbmkVar, null, false, z14, nufgyqmvbuVar, iobyxmoadgVar, null);
        } else {
            wkgbmnqykcVarEablkybsjg = draadjrbmkVar != null ? androidx.compose.foundation.vdvldrhtss.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, draadjrbmkVar, wypolnanluVar).eablkybsjg(new SelectableElement(z13, draadjrbmkVar, null, false, z14, nufgyqmvbuVar, iobyxmoadgVar, null)) : androidx.compose.ui.ppxfxbqfkf.ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, null, new C0092iobyxmoadg(wypolnanluVar, z13, z14, nufgyqmvbuVar, iobyxmoadgVar), 1, null);
        }
        return wkgbmnqykcVar.eablkybsjg(wkgbmnqykcVarEablkybsjg);
    }
}
