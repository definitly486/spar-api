package yzdjzghtvl;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public abstract class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f126943iobyxmoadg = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void btonecajqb() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final zynmafqrjb draadjrbmk(SnapshotStateList snapshotStateList, grlcpdaxtj.eablkybsjg eablkybsjgVar) {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarHkdspvbjdz = androidx.compose.runtime.snapshots.btonecajqb.hkdspvbjdz();
        esjtqupxsv esjtqupxsvVar = new esjtqupxsv(lqeggnwhkgVarHkdspvbjdz.dxjokdxxww(), eablkybsjgVar);
        if (!(lqeggnwhkgVarHkdspvbjdz instanceof androidx.compose.runtime.snapshots.iobyxmoadg)) {
            esjtqupxsvVar.lqeggnwhkg(new esjtqupxsv(nufgyqmvbu.ppxfxbqfkf(1), eablkybsjgVar));
        }
        return esjtqupxsvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void dxjokdxxww() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    public static final boolean gtknphoqwx(SnapshotStateList snapshotStateList, tg.draadjrbmk draadjrbmkVar) {
        int iBtonecajqb;
        grlcpdaxtj.eablkybsjg eablkybsjgVarDxjokdxxww;
        Object objInvoke;
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        boolean zGxszxtbevo;
        do {
            synchronized (f126943iobyxmoadg) {
                zynmafqrjb firstStateRecord = snapshotStateList.getFirstStateRecord();
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord);
                iBtonecajqb = esjtqupxsvVar.btonecajqb();
                eablkybsjgVarDxjokdxxww = esjtqupxsvVar.dxjokdxxww();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDxjokdxxww);
            grlcpdaxtj.eablkybsjg.iobyxmoadg iobyxmoadgVarNufgyqmvbu = eablkybsjgVarDxjokdxxww.nufgyqmvbu();
            objInvoke = draadjrbmkVar.invoke(iobyxmoadgVarNufgyqmvbu);
            grlcpdaxtj.eablkybsjg eablkybsjgVarBuild = iobyxmoadgVarNufgyqmvbu.build();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVarBuild, eablkybsjgVarDxjokdxxww)) {
                break;
            }
            zynmafqrjb firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                zGxszxtbevo = gxszxtbevo((esjtqupxsv) androidx.compose.runtime.snapshots.btonecajqb.bfopjjpdmp(esjtqupxsvVar2, snapshotStateList, lqeggnwhkgVarPpxfxbqfkf), iBtonecajqb, eablkybsjgVarBuild, true);
            }
            androidx.compose.runtime.snapshots.btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, snapshotStateList);
        } while (!zGxszxtbevo);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final boolean gxszxtbevo(esjtqupxsv esjtqupxsvVar, int i13, grlcpdaxtj.eablkybsjg eablkybsjgVar, boolean z13) {
        boolean z14;
        synchronized (f126943iobyxmoadg) {
            try {
                if (esjtqupxsvVar.btonecajqb() == i13) {
                    esjtqupxsvVar.draadjrbmk(eablkybsjgVar);
                    z14 = true;
                    if (z13) {
                        esjtqupxsvVar.agtfadlqog(esjtqupxsvVar.gtknphoqwx() + 1);
                    }
                    esjtqupxsvVar.wflxmlrfwp(esjtqupxsvVar.btonecajqb() + 1);
                } else {
                    z14 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z14;
    }

    public static final SnapshotStateList iobyxmoadg(int i13, tg.draadjrbmk draadjrbmkVar) {
        if (i13 == 0) {
            return new SnapshotStateList();
        }
        grlcpdaxtj.eablkybsjg.iobyxmoadg iobyxmoadgVarNufgyqmvbu = grlcpdaxtj.iobyxmoadg.iobyxmoadg().nufgyqmvbu();
        for (int i14 = 0; i14 < i13; i14++) {
            iobyxmoadgVarNufgyqmvbu.add(draadjrbmkVar.invoke(Integer.valueOf(i14)));
        }
        return new SnapshotStateList(iobyxmoadgVarNufgyqmvbu.build());
    }

    public static final esjtqupxsv lqeggnwhkg(SnapshotStateList snapshotStateList) {
        zynmafqrjb firstStateRecord = snapshotStateList.getFirstStateRecord();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (esjtqupxsv) androidx.compose.runtime.snapshots.btonecajqb.jztzpxfvev((esjtqupxsv) firstStateRecord, snapshotStateList);
    }

    public static final int nufgyqmvbu(SnapshotStateList snapshotStateList) {
        zynmafqrjb firstStateRecord = snapshotStateList.getFirstStateRecord();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((esjtqupxsv) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww((esjtqupxsv) firstStateRecord)).gtknphoqwx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(int i13, int i14) {
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException("index (" + i13 + ") is out of bound of [0, " + i14 + ')');
        }
    }
}
