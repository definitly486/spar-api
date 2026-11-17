package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ixidwrxhsl;
import gg.wwaezpbzkn;
import ikoacuggdj.esjtqupxsv;
import ikoacuggdj.tzroggbefp;
import ikoacuggdj.wypolnanlu;
import jztzpxfvev.metgxyhuhe;
import kotlin.jvm.internal.ylkuphrtab;
import z.ageimvtcrz;
import z.fyldjkxazc;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f4604cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ g0.nufgyqmvbu f4605iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f4606jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f4607yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.draadjrbmk f4608zdlpuopuiu;

        iobyxmoadg(metgxyhuhe.draadjrbmk draadjrbmkVar, boolean z13, String str, g0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar) {
            this.f4608zdlpuopuiu = draadjrbmkVar;
            this.f4607yggfygwlhe = z13;
            this.f4606jyumaefscl = str;
            this.f4605iwizpuwonk = nufgyqmvbuVar;
            this.f4604cqumvgiudr = iobyxmoadgVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg((androidx.compose.ui.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
        }

        public final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            draadjrbmkVar.sopmlzcsov(-691633986);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-691633986, i13, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:229)");
            }
            wypolnanlu wypolnanluVar = (wypolnanlu) draadjrbmkVar.ojitshcjhn(vdvldrhtss.ppxfxbqfkf());
            metgxyhuhe.draadjrbmk draadjrbmkVar2 = this.f4608zdlpuopuiu;
            if (draadjrbmkVar2 == null) {
                if (wypolnanluVar instanceof tzroggbefp) {
                    draadjrbmkVar.sopmlzcsov(-1509763983);
                    draadjrbmkVar.stevsuqkhv();
                    draadjrbmkVar2 = null;
                } else {
                    draadjrbmkVar.sopmlzcsov(-1509607061);
                    Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                        draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVar2 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
                    draadjrbmkVar.stevsuqkhv();
                }
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = eablkybsjg.eablkybsjg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, draadjrbmkVar2, wypolnanluVar, this.f4607yggfygwlhe, this.f4606jyumaefscl, this.f4605iwizpuwonk, this.f4604cqumvgiudr);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return wkgbmnqykcVarEablkybsjg;
        }
    }

    public static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f4609cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.draadjrbmk f4610iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ g0.nufgyqmvbu f4611jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f4612yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ boolean f4613zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(boolean z13, String str, g0.nufgyqmvbu nufgyqmvbuVar, metgxyhuhe.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar) {
            super(1);
            this.f4613zdlpuopuiu = z13;
            this.f4612yggfygwlhe = str;
            this.f4611jyumaefscl = nufgyqmvbuVar;
            this.f4610iwizpuwonk = draadjrbmkVar;
            this.f4609cqumvgiudr = iobyxmoadgVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
            iobyxmoadg(null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ixidwrxhsl ixidwrxhslVar) {
            throw null;
        }
    }

    public static final class wkgbmnqykc implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f4614cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ String f4615esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ g0.nufgyqmvbu f4616iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f4617jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f4618lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f4619pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f4620yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wypolnanlu f4621zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ boolean f4622zynmafqrjb;

        public wkgbmnqykc(wypolnanlu wypolnanluVar, boolean z13, String str, g0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar, String str2, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, boolean z14) {
            this.f4621zdlpuopuiu = wypolnanluVar;
            this.f4620yggfygwlhe = z13;
            this.f4617jyumaefscl = str;
            this.f4616iwizpuwonk = nufgyqmvbuVar;
            this.f4614cqumvgiudr = iobyxmoadgVar;
            this.f4615esjtqupxsv = str2;
            this.f4618lereixgezr = iobyxmoadgVar2;
            this.f4619pmvmpeiblj = iobyxmoadgVar3;
            this.f4622zynmafqrjb = z14;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg((androidx.compose.ui.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
        }

        public final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            draadjrbmkVar.sopmlzcsov(-1525724089);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1525724089, i13, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            metgxyhuhe.draadjrbmk draadjrbmkVar2 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = vdvldrhtss.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, draadjrbmkVar2, this.f4621zdlpuopuiu).eablkybsjg(new CombinedClickableElement(draadjrbmkVar2, null, false, this.f4620yggfygwlhe, this.f4617jyumaefscl, this.f4616iwizpuwonk, this.f4614cqumvgiudr, this.f4615esjtqupxsv, this.f4618lereixgezr, this.f4619pmvmpeiblj, this.f4622zynmafqrjb, null));
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return wkgbmnqykcVarEablkybsjg;
        }
    }

    public static final class zoijcleaow implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f4623cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ g0.nufgyqmvbu f4624iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f4625jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f4626yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wypolnanlu f4627zdlpuopuiu;

        public zoijcleaow(wypolnanlu wypolnanluVar, boolean z13, String str, g0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar) {
            this.f4627zdlpuopuiu = wypolnanluVar;
            this.f4626yggfygwlhe = z13;
            this.f4625jyumaefscl = str;
            this.f4624iwizpuwonk = nufgyqmvbuVar;
            this.f4623cqumvgiudr = iobyxmoadgVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg((androidx.compose.ui.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
        }

        public final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            draadjrbmkVar.sopmlzcsov(-1525724089);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1525724089, i13, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            metgxyhuhe.draadjrbmk draadjrbmkVar2 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = vdvldrhtss.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, draadjrbmkVar2, this.f4627zdlpuopuiu).eablkybsjg(new ClickableElement(draadjrbmkVar2, null, false, this.f4626yggfygwlhe, this.f4625jyumaefscl, this.f4624iwizpuwonk, this.f4623cqumvgiudr, null));
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return wkgbmnqykcVarEablkybsjg;
        }
    }

    private static final boolean agtfadlqog(KeyEvent keyEvent) {
        long jIobyxmoadg = r.wkgbmnqykc.iobyxmoadg(keyEvent);
        r.iobyxmoadg.C1811iobyxmoadg c1811iobyxmoadg = r.iobyxmoadg.f81183iobyxmoadg;
        return r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.zoijcleaow()) || r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.lqeggnwhkg()) || r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.gtknphoqwx()) || r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.agtfadlqog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public static final boolean draadjrbmk(ylkuphrtab ylkuphrtabVar, ageimvtcrz ageimvtcrzVar) {
        boolean z13;
        if (ylkuphrtabVar.f60038zdlpuopuiu) {
            z13 = true;
        } else {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ageimvtcrzVar, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
            if (((metgxyhuhe) ageimvtcrzVar).H0()) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        ylkuphrtabVar.f60038zdlpuopuiu = z13;
        return !z13;
    }

    public static final androidx.compose.ui.wkgbmnqykc dxjokdxxww(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, metgxyhuhe.draadjrbmk draadjrbmkVar, wypolnanlu wypolnanluVar, boolean z13, String str, g0.nufgyqmvbu nufgyqmvbuVar, String str2, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, boolean z14, tg.iobyxmoadg iobyxmoadgVar3) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf;
        if (wypolnanluVar instanceof tzroggbefp) {
            wkgbmnqykcVarPpxfxbqfkf = new CombinedClickableElement(draadjrbmkVar, (tzroggbefp) wypolnanluVar, false, z13, str, nufgyqmvbuVar, iobyxmoadgVar3, str2, iobyxmoadgVar, iobyxmoadgVar2, z14, null);
        } else if (wypolnanluVar == null) {
            wkgbmnqykcVarPpxfxbqfkf = new CombinedClickableElement(draadjrbmkVar, null, false, z13, str, nufgyqmvbuVar, iobyxmoadgVar3, str2, iobyxmoadgVar, iobyxmoadgVar2, z14, null);
        } else if (draadjrbmkVar != null) {
            wkgbmnqykcVarPpxfxbqfkf = vdvldrhtss.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, draadjrbmkVar, wypolnanluVar).eablkybsjg(new CombinedClickableElement(draadjrbmkVar, null, false, z13, str, nufgyqmvbuVar, iobyxmoadgVar3, str2, iobyxmoadgVar, iobyxmoadgVar2, z14, null));
        } else {
            wkgbmnqykcVarPpxfxbqfkf = androidx.compose.ui.ppxfxbqfkf.ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, null, new wkgbmnqykc(wypolnanluVar, z13, str, nufgyqmvbuVar, iobyxmoadgVar3, str2, iobyxmoadgVar, iobyxmoadgVar2, z14), 1, null);
        }
        return wkgbmnqykcVar.eablkybsjg(wkgbmnqykcVarPpxfxbqfkf);
    }

    public static final androidx.compose.ui.wkgbmnqykc eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, metgxyhuhe.draadjrbmk draadjrbmkVar, wypolnanlu wypolnanluVar, boolean z13, String str, g0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf;
        if (wypolnanluVar instanceof tzroggbefp) {
            wkgbmnqykcVarPpxfxbqfkf = new ClickableElement(draadjrbmkVar, (tzroggbefp) wypolnanluVar, false, z13, str, nufgyqmvbuVar, iobyxmoadgVar, null);
        } else if (wypolnanluVar == null) {
            wkgbmnqykcVarPpxfxbqfkf = new ClickableElement(draadjrbmkVar, null, false, z13, str, nufgyqmvbuVar, iobyxmoadgVar, null);
        } else if (draadjrbmkVar != null) {
            wkgbmnqykcVarPpxfxbqfkf = vdvldrhtss.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, draadjrbmkVar, wypolnanluVar).eablkybsjg(new ClickableElement(draadjrbmkVar, null, false, z13, str, nufgyqmvbuVar, iobyxmoadgVar, null));
        } else {
            wkgbmnqykcVarPpxfxbqfkf = androidx.compose.ui.ppxfxbqfkf.ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, null, new zoijcleaow(wypolnanluVar, z13, str, nufgyqmvbuVar, iobyxmoadgVar), 1, null);
        }
        return wkgbmnqykcVar.eablkybsjg(wkgbmnqykcVarPpxfxbqfkf);
    }

    public static final boolean gtknphoqwx(ageimvtcrz ageimvtcrzVar) {
        final ylkuphrtab ylkuphrtabVar = new ylkuphrtab();
        fyldjkxazc.ppxfxbqfkf(ageimvtcrzVar, metgxyhuhe.f52805hcddaimhww, new tg.draadjrbmk() { // from class: ikoacuggdj.jyumaefscl
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(androidx.compose.foundation.eablkybsjg.draadjrbmk(ylkuphrtabVar, (z.ageimvtcrz) obj));
            }
        });
        return ylkuphrtabVar.f60038zdlpuopuiu;
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, metgxyhuhe.draadjrbmk draadjrbmkVar, wypolnanlu wypolnanluVar, boolean z13, String str, g0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        return eablkybsjg(wkgbmnqykcVar, draadjrbmkVar, wypolnanluVar, z13, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : nufgyqmvbuVar, iobyxmoadgVar);
    }

    public static final androidx.compose.ui.wkgbmnqykc lqeggnwhkg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, String str, g0.nufgyqmvbu nufgyqmvbuVar, metgxyhuhe.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar) {
        if (esjtqupxsv.f44794nufgyqmvbu) {
            return wkgbmnqykcVar.eablkybsjg(new ClickableElement(draadjrbmkVar, null, true, z13, str, nufgyqmvbuVar, iobyxmoadgVar, null));
        }
        return androidx.compose.ui.ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ppxfxbqfkf(z13, str, nufgyqmvbuVar, draadjrbmkVar, iobyxmoadgVar) : InspectableValueKt.getNoInspectorInfo(), new iobyxmoadg(draadjrbmkVar, z13, str, nufgyqmvbuVar, iobyxmoadgVar));
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc nufgyqmvbu(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, String str, g0.nufgyqmvbu nufgyqmvbuVar, metgxyhuhe.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        return lqeggnwhkg(wkgbmnqykcVar, z13, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : nufgyqmvbuVar, (i13 & 8) != 0 ? null : draadjrbmkVar, iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ojitshcjhn(KeyEvent keyEvent) {
        return r.ppxfxbqfkf.eablkybsjg(r.wkgbmnqykc.zoijcleaow(keyEvent), r.ppxfxbqfkf.f81321iobyxmoadg.iobyxmoadg()) && agtfadlqog(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rgvfuqvkyq(wypolnanlu wypolnanluVar) {
        return "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + wypolnanluVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wflxmlrfwp(KeyEvent keyEvent) {
        return r.ppxfxbqfkf.eablkybsjg(r.wkgbmnqykc.zoijcleaow(keyEvent), r.ppxfxbqfkf.f81321iobyxmoadg.zoijcleaow()) && agtfadlqog(keyEvent);
    }
}
