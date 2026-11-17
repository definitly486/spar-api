package androidx.compose.runtime.snapshots;

import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import yzdjzghtvl.oxmwwwfdhm;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends androidx.compose.runtime.snapshots.zoijcleaow {

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0105iobyxmoadg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f6007yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f6008zdlpuopuiu;

        C0105iobyxmoadg(tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
            this.f6008zdlpuopuiu = draadjrbmkVar;
            this.f6007yggfygwlhe = draadjrbmkVar2;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.snapshots.zoijcleaow invoke(dxjokdxxww dxjokdxxwwVar) {
            long j13;
            synchronized (btonecajqb.dsvhmnatus()) {
                j13 = btonecajqb.f5958gxszxtbevo;
                btonecajqb.f5958gxszxtbevo += (long) 1;
            }
            return new androidx.compose.runtime.snapshots.zoijcleaow(j13, dxjokdxxwwVar, this.f6008zdlpuopuiu, this.f6007yggfygwlhe);
        }
    }

    static final class zoijcleaow implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f6009zdlpuopuiu;

        zoijcleaow(tg.draadjrbmk draadjrbmkVar) {
            this.f6009zdlpuopuiu = draadjrbmkVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final gxszxtbevo invoke(dxjokdxxww dxjokdxxwwVar) {
            long j13;
            synchronized (btonecajqb.dsvhmnatus()) {
                j13 = btonecajqb.f5958gxszxtbevo;
                btonecajqb.f5958gxszxtbevo += (long) 1;
            }
            return new gxszxtbevo(j13, dxjokdxxwwVar, this.f6009zdlpuopuiu);
        }
    }

    public iobyxmoadg(long j13, dxjokdxxww dxjokdxxwwVar) {
        super(j13, dxjokdxxwwVar, null, new tg.draadjrbmk() { // from class: yzdjzghtvl.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return androidx.compose.runtime.snapshots.iobyxmoadg.ulzqkzuiru(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ulzqkzuiru(Object obj) {
        synchronized (btonecajqb.dsvhmnatus()) {
            List list = btonecajqb.f5953btonecajqb;
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((tg.draadjrbmk) list.get(i13)).invoke(obj);
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // androidx.compose.runtime.snapshots.zoijcleaow, androidx.compose.runtime.snapshots.lqeggnwhkg
    public lqeggnwhkg cqumvgiudr(tg.draadjrbmk draadjrbmkVar) {
        Map map;
        grlcpdaxtj.eablkybsjg eablkybsjgVar = eslsurpljm.zoijcleaow.f31923iobyxmoadg;
        if (eablkybsjgVar != null) {
            vdvldrhtss vdvldrhtssVarEablkybsjg = eslsurpljm.zoijcleaow.eablkybsjg(eablkybsjgVar, null, true, draadjrbmkVar, null);
            eslsurpljm.iobyxmoadg iobyxmoadgVar = (eslsurpljm.iobyxmoadg) vdvldrhtssVarEablkybsjg.lqeggnwhkg();
            tg.draadjrbmk draadjrbmkVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            iobyxmoadgVar.zoijcleaow();
            map = (Map) vdvldrhtssVarEablkybsjg.nufgyqmvbu();
            draadjrbmkVar = draadjrbmkVarIobyxmoadg;
        } else {
            map = null;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) btonecajqb.czzsidtyhn(new zoijcleaow(draadjrbmkVar));
        if (eablkybsjgVar != null) {
            eslsurpljm.zoijcleaow.zoijcleaow(eablkybsjgVar, null, gxszxtbevoVar, map);
        }
        return gxszxtbevoVar;
    }

    @Override // androidx.compose.runtime.snapshots.zoijcleaow, androidx.compose.runtime.snapshots.lqeggnwhkg
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public Void agtfadlqog(lqeggnwhkg lqeggnwhkgVar) {
        oxmwwwfdhm.iobyxmoadg();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.zoijcleaow
    public nufgyqmvbu istkbnxepw() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.zoijcleaow
    public androidx.compose.runtime.snapshots.zoijcleaow kegysxyocb(tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        tg.draadjrbmk draadjrbmkVar3;
        Map map;
        grlcpdaxtj.eablkybsjg eablkybsjgVar = eslsurpljm.zoijcleaow.f31923iobyxmoadg;
        if (eablkybsjgVar != null) {
            vdvldrhtss vdvldrhtssVarEablkybsjg = eslsurpljm.zoijcleaow.eablkybsjg(eablkybsjgVar, null, false, draadjrbmkVar, draadjrbmkVar2);
            eslsurpljm.iobyxmoadg iobyxmoadgVar = (eslsurpljm.iobyxmoadg) vdvldrhtssVarEablkybsjg.lqeggnwhkg();
            tg.draadjrbmk draadjrbmkVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            tg.draadjrbmk draadjrbmkVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            map = (Map) vdvldrhtssVarEablkybsjg.nufgyqmvbu();
            draadjrbmkVar = draadjrbmkVarIobyxmoadg;
            draadjrbmkVar3 = draadjrbmkVarZoijcleaow;
        } else {
            draadjrbmkVar3 = draadjrbmkVar2;
            map = null;
        }
        androidx.compose.runtime.snapshots.zoijcleaow zoijcleaowVar = (androidx.compose.runtime.snapshots.zoijcleaow) btonecajqb.czzsidtyhn(new C0105iobyxmoadg(draadjrbmkVar, draadjrbmkVar3));
        if (eablkybsjgVar != null) {
            eslsurpljm.zoijcleaow.zoijcleaow(eablkybsjgVar, null, zoijcleaowVar, map);
        }
        return zoijcleaowVar;
    }

    @Override // androidx.compose.runtime.snapshots.zoijcleaow, androidx.compose.runtime.snapshots.lqeggnwhkg
    public void ojitshcjhn() {
        btonecajqb.lmojexxdyd();
    }

    @Override // androidx.compose.runtime.snapshots.zoijcleaow, androidx.compose.runtime.snapshots.lqeggnwhkg
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Void wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar) {
        oxmwwwfdhm.iobyxmoadg();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.zoijcleaow, androidx.compose.runtime.snapshots.lqeggnwhkg
    public void wkgbmnqykc() {
        synchronized (btonecajqb.dsvhmnatus()) {
            vdvldrhtss();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }
}
