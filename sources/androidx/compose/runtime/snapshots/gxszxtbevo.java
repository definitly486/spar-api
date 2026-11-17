package androidx.compose.runtime.snapshots;

import gg.vdvldrhtss;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import yzdjzghtvl.lereixgezr;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo extends lqeggnwhkg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final tg.draadjrbmk f6005lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f6006nufgyqmvbu;

    public gxszxtbevo(long j13, dxjokdxxww dxjokdxxwwVar, tg.draadjrbmk draadjrbmkVar) {
        super(j13, dxjokdxxwwVar, null);
        this.f6005lqeggnwhkg = draadjrbmkVar;
        this.f6006nufgyqmvbu = 1;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void agtfadlqog(lqeggnwhkg lqeggnwhkgVar) {
        int i13 = this.f6006nufgyqmvbu - 1;
        this.f6006nufgyqmvbu = i13;
        if (i13 == 0) {
            zoijcleaow();
        }
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public lqeggnwhkg cqumvgiudr(tg.draadjrbmk draadjrbmkVar) {
        Map map;
        btonecajqb.oipsdeybqn(this);
        grlcpdaxtj.eablkybsjg eablkybsjgVar = eslsurpljm.zoijcleaow.f31923iobyxmoadg;
        if (eablkybsjgVar != null) {
            vdvldrhtss vdvldrhtssVarEablkybsjg = eslsurpljm.zoijcleaow.eablkybsjg(eablkybsjgVar, this, true, draadjrbmkVar, null);
            eslsurpljm.iobyxmoadg iobyxmoadgVar = (eslsurpljm.iobyxmoadg) vdvldrhtssVarEablkybsjg.lqeggnwhkg();
            tg.draadjrbmk draadjrbmkVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            iobyxmoadgVar.zoijcleaow();
            map = (Map) vdvldrhtssVarEablkybsjg.nufgyqmvbu();
            draadjrbmkVar = draadjrbmkVarIobyxmoadg;
        } else {
            map = null;
        }
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(dxjokdxxww(), gxszxtbevo(), btonecajqb.stevsuqkhv(draadjrbmkVar, lqeggnwhkg(), false, 4, null), this);
        if (eablkybsjgVar != null) {
            eslsurpljm.zoijcleaow.zoijcleaow(eablkybsjgVar, this, wkgbmnqykcVar, map);
        }
        return wkgbmnqykcVar;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public tg.draadjrbmk gtknphoqwx() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public boolean nufgyqmvbu() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void ojitshcjhn() {
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public tg.draadjrbmk lqeggnwhkg() {
        return this.f6005lqeggnwhkg;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void rgvfuqvkyq(lereixgezr lereixgezrVar) {
        btonecajqb.metgxyhuhe();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar) {
        this.f6006nufgyqmvbu++;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void wkgbmnqykc() {
        if (eablkybsjg()) {
            return;
        }
        agtfadlqog(this);
        super.wkgbmnqykc();
        eslsurpljm.zoijcleaow.wkgbmnqykc(this);
    }
}
