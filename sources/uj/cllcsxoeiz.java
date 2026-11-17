package uj;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class cllcsxoeiz {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f113639zoijcleaow = AtomicIntegerFieldUpdater.newUpdater(cllcsxoeiz.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private dsvhmnatus[] f113640iobyxmoadg;

    private final void agtfadlqog(int i13, int i14) {
        dsvhmnatus[] dsvhmnatusVarArr = this.f113640iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVarArr);
        dsvhmnatus dsvhmnatusVar = dsvhmnatusVarArr[i14];
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar);
        dsvhmnatus dsvhmnatusVar2 = dsvhmnatusVarArr[i13];
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar2);
        dsvhmnatusVarArr[i13] = dsvhmnatusVar;
        dsvhmnatusVarArr[i14] = dsvhmnatusVar2;
        dsvhmnatusVar.setIndex(i13);
        dsvhmnatusVar2.setIndex(i14);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    private final void draadjrbmk(int i13) {
        while (true) {
            int i14 = i13 * 2;
            int i15 = i14 + 1;
            if (i15 >= ppxfxbqfkf()) {
                return;
            }
            dsvhmnatus[] dsvhmnatusVarArr = this.f113640iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVarArr);
            int i16 = i14 + 2;
            if (i16 < ppxfxbqfkf()) {
                dsvhmnatus dsvhmnatusVar = dsvhmnatusVarArr[i16];
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar);
                dsvhmnatus dsvhmnatusVar2 = dsvhmnatusVarArr[i15];
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar2);
                if (((Comparable) dsvhmnatusVar).compareTo(dsvhmnatusVar2) >= 0) {
                    i16 = i15;
                }
            } else {
                i16 = i15;
            }
            dsvhmnatus dsvhmnatusVar3 = dsvhmnatusVarArr[i13];
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar3);
            dsvhmnatus dsvhmnatusVar4 = dsvhmnatusVarArr[i16];
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar4);
            if (((Comparable) dsvhmnatusVar3).compareTo(dsvhmnatusVar4) <= 0) {
                return;
            }
            agtfadlqog(i13, i16);
            i13 = i16;
        }
    }

    private final void gtknphoqwx(int i13) {
        f113639zoijcleaow.set(this, i13);
    }

    private final dsvhmnatus[] lqeggnwhkg() {
        dsvhmnatus[] dsvhmnatusVarArr = this.f113640iobyxmoadg;
        if (dsvhmnatusVarArr == null) {
            dsvhmnatus[] dsvhmnatusVarArr2 = new dsvhmnatus[4];
            this.f113640iobyxmoadg = dsvhmnatusVarArr2;
            return dsvhmnatusVarArr2;
        }
        if (ppxfxbqfkf() < dsvhmnatusVarArr.length) {
            return dsvhmnatusVarArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(dsvhmnatusVarArr, ppxfxbqfkf() * 2);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        dsvhmnatus[] dsvhmnatusVarArr3 = (dsvhmnatus[]) objArrCopyOf;
        this.f113640iobyxmoadg = dsvhmnatusVarArr3;
        return dsvhmnatusVarArr3;
    }

    private final void wflxmlrfwp(int i13) {
        while (i13 > 0) {
            dsvhmnatus[] dsvhmnatusVarArr = this.f113640iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVarArr);
            int i14 = (i13 - 1) / 2;
            dsvhmnatus dsvhmnatusVar = dsvhmnatusVarArr[i14];
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar);
            dsvhmnatus dsvhmnatusVar2 = dsvhmnatusVarArr[i13];
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar2);
            if (((Comparable) dsvhmnatusVar).compareTo(dsvhmnatusVar2) <= 0) {
                return;
            }
            agtfadlqog(i13, i14);
            i13 = i14;
        }
    }

    public final dsvhmnatus btonecajqb() {
        dsvhmnatus dsvhmnatusVarDxjokdxxww;
        synchronized (this) {
            dsvhmnatusVarDxjokdxxww = ppxfxbqfkf() > 0 ? dxjokdxxww(0) : null;
        }
        return dsvhmnatusVarDxjokdxxww;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final dsvhmnatus dxjokdxxww(int i13) {
        dsvhmnatus[] dsvhmnatusVarArr = this.f113640iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVarArr);
        gtknphoqwx(ppxfxbqfkf() - 1);
        if (i13 < ppxfxbqfkf()) {
            agtfadlqog(i13, ppxfxbqfkf());
            int i14 = (i13 - 1) / 2;
            if (i13 > 0) {
                dsvhmnatus dsvhmnatusVar = dsvhmnatusVarArr[i13];
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar);
                dsvhmnatus dsvhmnatusVar2 = dsvhmnatusVarArr[i14];
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar2);
                if (((Comparable) dsvhmnatusVar).compareTo(dsvhmnatusVar2) < 0) {
                    agtfadlqog(i13, i14);
                    wflxmlrfwp(i14);
                } else {
                    draadjrbmk(i13);
                }
            } else {
                draadjrbmk(i13);
            }
        }
        dsvhmnatus dsvhmnatusVar3 = dsvhmnatusVarArr[ppxfxbqfkf()];
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dsvhmnatusVar3);
        dsvhmnatusVar3.wkgbmnqykc(null);
        dsvhmnatusVar3.setIndex(-1);
        dsvhmnatusVarArr[ppxfxbqfkf()] = null;
        return dsvhmnatusVar3;
    }

    public final boolean eablkybsjg() {
        return ppxfxbqfkf() == 0;
    }

    public final dsvhmnatus gxszxtbevo() {
        dsvhmnatus dsvhmnatusVarZoijcleaow;
        synchronized (this) {
            dsvhmnatusVarZoijcleaow = zoijcleaow();
        }
        return dsvhmnatusVarZoijcleaow;
    }

    public final void iobyxmoadg(dsvhmnatus dsvhmnatusVar) {
        dsvhmnatusVar.wkgbmnqykc(this);
        dsvhmnatus[] dsvhmnatusVarArrLqeggnwhkg = lqeggnwhkg();
        int iPpxfxbqfkf = ppxfxbqfkf();
        gtknphoqwx(iPpxfxbqfkf + 1);
        dsvhmnatusVarArrLqeggnwhkg[iPpxfxbqfkf] = dsvhmnatusVar;
        dsvhmnatusVar.setIndex(iPpxfxbqfkf);
        wflxmlrfwp(iPpxfxbqfkf);
    }

    public final boolean nufgyqmvbu(dsvhmnatus dsvhmnatusVar) {
        boolean z13;
        synchronized (this) {
            if (dsvhmnatusVar.ppxfxbqfkf() == null) {
                z13 = false;
            } else {
                dxjokdxxww(dsvhmnatusVar.getIndex());
                z13 = true;
            }
        }
        return z13;
    }

    public final int ppxfxbqfkf() {
        return f113639zoijcleaow.get(this);
    }

    public final dsvhmnatus zoijcleaow() {
        dsvhmnatus[] dsvhmnatusVarArr = this.f113640iobyxmoadg;
        if (dsvhmnatusVarArr != null) {
            return dsvhmnatusVarArr[0];
        }
        return null;
    }
}
