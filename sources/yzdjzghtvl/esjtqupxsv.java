package yzdjzghtvl;

import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public final class esjtqupxsv extends zynmafqrjb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f126916eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private grlcpdaxtj.eablkybsjg f126917ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f126918wkgbmnqykc;

    public esjtqupxsv(long j13, grlcpdaxtj.eablkybsjg eablkybsjgVar) {
        super(j13);
        this.f126917ppxfxbqfkf = eablkybsjgVar;
    }

    public final void agtfadlqog(int i13) {
        this.f126916eablkybsjg = i13;
    }

    public final int btonecajqb() {
        return this.f126918wkgbmnqykc;
    }

    public final void draadjrbmk(grlcpdaxtj.eablkybsjg eablkybsjgVar) {
        this.f126917ppxfxbqfkf = eablkybsjgVar;
    }

    public final grlcpdaxtj.eablkybsjg dxjokdxxww() {
        return this.f126917ppxfxbqfkf;
    }

    public final int gtknphoqwx() {
        return this.f126916eablkybsjg;
    }

    @Override // yzdjzghtvl.zynmafqrjb
    public void ppxfxbqfkf(zynmafqrjb zynmafqrjbVar) {
        synchronized (vdvldrhtss.f126943iobyxmoadg) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f126917ppxfxbqfkf = ((esjtqupxsv) zynmafqrjbVar).f126917ppxfxbqfkf;
            this.f126918wkgbmnqykc = ((esjtqupxsv) zynmafqrjbVar).f126918wkgbmnqykc;
            this.f126916eablkybsjg = ((esjtqupxsv) zynmafqrjbVar).f126916eablkybsjg;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public final void wflxmlrfwp(int i13) {
        this.f126918wkgbmnqykc = i13;
    }

    @Override // yzdjzghtvl.zynmafqrjb
    public zynmafqrjb wkgbmnqykc(long j13) {
        return new esjtqupxsv(j13, this.f126917ppxfxbqfkf);
    }
}
