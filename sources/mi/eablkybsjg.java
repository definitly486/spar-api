package mi;

import gg.vdvldrhtss;
import hg.agtfadlqog;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import jh.nufgyqmvbu;
import jh.yfnezrywwk;
import kotlin.jvm.internal.zdlpuopuiu;
import yi.gxszxtbevo;
import zi.crxdokpmqz;
import zi.hkdspvbjdz;
import zi.igdgnonuha;
import zi.iwxlajgraz;
import zi.kegysxyocb;
import zi.lereixgezr;
import zi.mhtqkkgtqm;
import zi.skhdrjzrfn;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends lereixgezr {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ boolean f67237wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(igdgnonuha igdgnonuhaVar, boolean z13) {
            super(igdgnonuhaVar);
            this.f67237wkgbmnqykc = z13;
        }

        @Override // zi.lereixgezr, zi.igdgnonuha
        public iwxlajgraz eablkybsjg(kegysxyocb key) {
            zdlpuopuiu.btonecajqb(key, "key");
            iwxlajgraz iwxlajgrazVarEablkybsjg = super.eablkybsjg(key);
            if (iwxlajgrazVarEablkybsjg == null) {
                return null;
            }
            nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = key.grlcpdaxtj().wkgbmnqykc();
            return eablkybsjg.ppxfxbqfkf(iwxlajgrazVarEablkybsjg, nufgyqmvbuVarWkgbmnqykc instanceof yfnezrywwk ? (yfnezrywwk) nufgyqmvbuVarWkgbmnqykc : null);
        }

        @Override // zi.igdgnonuha
        public boolean zoijcleaow() {
            return this.f67237wkgbmnqykc;
        }
    }

    public static final kegysxyocb eablkybsjg(iwxlajgraz typeProjection) {
        zdlpuopuiu.btonecajqb(typeProjection, "typeProjection");
        return new mi.iobyxmoadg(typeProjection, null, false, null, 14, null);
    }

    public static final boolean gxszxtbevo(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        return kegysxyocbVar.grlcpdaxtj() instanceof zoijcleaow;
    }

    public static final igdgnonuha lqeggnwhkg(igdgnonuha igdgnonuhaVar, boolean z13) {
        zdlpuopuiu.btonecajqb(igdgnonuhaVar, "<this>");
        if (!(igdgnonuhaVar instanceof hkdspvbjdz)) {
            return new iobyxmoadg(igdgnonuhaVar, z13);
        }
        hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) igdgnonuhaVar;
        yfnezrywwk[] yfnezrywwkVarArrBtonecajqb = hkdspvbjdzVar.btonecajqb();
        List<vdvldrhtss> listZ = agtfadlqog.z(hkdspvbjdzVar.dxjokdxxww(), hkdspvbjdzVar.btonecajqb());
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listZ, 10));
        for (vdvldrhtss vdvldrhtssVar : listZ) {
            arrayList.add(ppxfxbqfkf((iwxlajgraz) vdvldrhtssVar.lqeggnwhkg(), (yfnezrywwk) vdvldrhtssVar.nufgyqmvbu()));
        }
        return new hkdspvbjdz(yfnezrywwkVarArrBtonecajqb, (iwxlajgraz[]) arrayList.toArray(new iwxlajgraz[0]), z13);
    }

    public static /* synthetic */ igdgnonuha nufgyqmvbu(igdgnonuha igdgnonuhaVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        return lqeggnwhkg(igdgnonuhaVar, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iwxlajgraz ppxfxbqfkf(iwxlajgraz iwxlajgrazVar, yfnezrywwk yfnezrywwkVar) {
        if (yfnezrywwkVar == null || iwxlajgrazVar.ppxfxbqfkf() == mhtqkkgtqm.INVARIANT) {
            return iwxlajgrazVar;
        }
        if (yfnezrywwkVar.draadjrbmk() != iwxlajgrazVar.ppxfxbqfkf()) {
            return new skhdrjzrfn(eablkybsjg(iwxlajgrazVar));
        }
        if (!iwxlajgrazVar.zoijcleaow()) {
            return new skhdrjzrfn(iwxlajgrazVar.getType());
        }
        yi.agtfadlqog NO_LOCKS = gxszxtbevo.f125306eablkybsjg;
        zdlpuopuiu.dxjokdxxww(NO_LOCKS, "NO_LOCKS");
        return new skhdrjzrfn(new crxdokpmqz(NO_LOCKS, new wkgbmnqykc(iwxlajgrazVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kegysxyocb wkgbmnqykc(iwxlajgraz iwxlajgrazVar) {
        kegysxyocb type = iwxlajgrazVar.getType();
        zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        return type;
    }
}
