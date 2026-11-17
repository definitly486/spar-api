package androidx.compose.runtime.snapshots;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import yzdjzghtvl.cdpycssgdh;
import yzdjzghtvl.zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f5966iobyxmoadg = new Object();

    public static final boolean eablkybsjg(SnapshotStateSet snapshotStateSet, tg.draadjrbmk draadjrbmkVar) {
        int iDxjokdxxww;
        grlcpdaxtj.gxszxtbevo gxszxtbevoVarBtonecajqb;
        grlcpdaxtj.gxszxtbevo.iobyxmoadg iobyxmoadgVarNufgyqmvbu;
        Object objInvoke;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zZoijcleaow;
        do {
            synchronized (f5966iobyxmoadg) {
                zynmafqrjb zynmafqrjbVarIozdgvuglv = snapshotStateSet.iozdgvuglv();
                zdlpuopuiu.nufgyqmvbu(zynmafqrjbVarIozdgvuglv, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                cdpycssgdh cdpycssgdhVar = (cdpycssgdh) btonecajqb.hcddaimhww((cdpycssgdh) zynmafqrjbVarIozdgvuglv);
                iDxjokdxxww = cdpycssgdhVar.dxjokdxxww();
                gxszxtbevoVarBtonecajqb = cdpycssgdhVar.btonecajqb();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            if (gxszxtbevoVarBtonecajqb != null && (iobyxmoadgVarNufgyqmvbu = gxszxtbevoVarBtonecajqb.nufgyqmvbu()) != null) {
                objInvoke = draadjrbmkVar.invoke(iobyxmoadgVarNufgyqmvbu);
                grlcpdaxtj.gxszxtbevo gxszxtbevoVarBuild = iobyxmoadgVarNufgyqmvbu.build();
                if (zdlpuopuiu.eablkybsjg(gxszxtbevoVarBuild, gxszxtbevoVarBtonecajqb)) {
                    break;
                }
                zynmafqrjb zynmafqrjbVarIozdgvuglv2 = snapshotStateSet.iozdgvuglv();
                zdlpuopuiu.nufgyqmvbu(zynmafqrjbVarIozdgvuglv2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
                cdpycssgdh cdpycssgdhVar2 = (cdpycssgdh) zynmafqrjbVarIozdgvuglv2;
                synchronized (btonecajqb.dsvhmnatus()) {
                    lqeggnwhkgVarPpxfxbqfkf = lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                    zZoijcleaow = zoijcleaow((cdpycssgdh) btonecajqb.bfopjjpdmp(cdpycssgdhVar2, snapshotStateSet, lqeggnwhkgVarPpxfxbqfkf), iDxjokdxxww, gxszxtbevoVarBuild);
                }
                btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, snapshotStateSet);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zZoijcleaow);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final zynmafqrjb gxszxtbevo(SnapshotStateSet snapshotStateSet, grlcpdaxtj.gxszxtbevo gxszxtbevoVar) {
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh(btonecajqb.hkdspvbjdz().dxjokdxxww(), gxszxtbevoVar);
        if (lqeggnwhkg.f6010eablkybsjg.eablkybsjg()) {
            cdpycssgdhVar.lqeggnwhkg(new cdpycssgdh(yzdjzghtvl.nufgyqmvbu.ppxfxbqfkf(1), gxszxtbevoVar));
        }
        return cdpycssgdhVar;
    }

    public static final int ppxfxbqfkf(SnapshotStateSet snapshotStateSet) {
        zynmafqrjb zynmafqrjbVarIozdgvuglv = snapshotStateSet.iozdgvuglv();
        zdlpuopuiu.nufgyqmvbu(zynmafqrjbVarIozdgvuglv, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((cdpycssgdh) btonecajqb.hcddaimhww((cdpycssgdh) zynmafqrjbVarIozdgvuglv)).dxjokdxxww();
    }

    public static final cdpycssgdh wkgbmnqykc(SnapshotStateSet snapshotStateSet) {
        zynmafqrjb zynmafqrjbVarIozdgvuglv = snapshotStateSet.iozdgvuglv();
        zdlpuopuiu.nufgyqmvbu(zynmafqrjbVarIozdgvuglv, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (cdpycssgdh) btonecajqb.jztzpxfvev((cdpycssgdh) zynmafqrjbVarIozdgvuglv, snapshotStateSet);
    }

    public static final boolean zoijcleaow(cdpycssgdh cdpycssgdhVar, int i13, grlcpdaxtj.gxszxtbevo gxszxtbevoVar) {
        boolean z13;
        synchronized (f5966iobyxmoadg) {
            if (cdpycssgdhVar.dxjokdxxww() == i13) {
                cdpycssgdhVar.draadjrbmk(gxszxtbevoVar);
                z13 = true;
                cdpycssgdhVar.gtknphoqwx(cdpycssgdhVar.dxjokdxxww() + 1);
            } else {
                z13 = false;
            }
        }
        return z13;
    }
}
