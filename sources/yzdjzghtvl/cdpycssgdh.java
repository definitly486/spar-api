package yzdjzghtvl;

import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public final class cdpycssgdh extends zynmafqrjb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private grlcpdaxtj.gxszxtbevo f126906ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f126907wkgbmnqykc;

    public cdpycssgdh(long j13, grlcpdaxtj.gxszxtbevo gxszxtbevoVar) {
        super(j13);
        this.f126906ppxfxbqfkf = gxszxtbevoVar;
    }

    public final grlcpdaxtj.gxszxtbevo btonecajqb() {
        return this.f126906ppxfxbqfkf;
    }

    public final void draadjrbmk(grlcpdaxtj.gxszxtbevo gxszxtbevoVar) {
        this.f126906ppxfxbqfkf = gxszxtbevoVar;
    }

    public final int dxjokdxxww() {
        return this.f126907wkgbmnqykc;
    }

    public final void gtknphoqwx(int i13) {
        this.f126907wkgbmnqykc = i13;
    }

    @Override // yzdjzghtvl.zynmafqrjb
    public void ppxfxbqfkf(zynmafqrjb zynmafqrjbVar) {
        synchronized (androidx.compose.runtime.snapshots.draadjrbmk.f5966iobyxmoadg) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            this.f126906ppxfxbqfkf = ((cdpycssgdh) zynmafqrjbVar).f126906ppxfxbqfkf;
            this.f126907wkgbmnqykc = ((cdpycssgdh) zynmafqrjbVar).f126907wkgbmnqykc;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    @Override // yzdjzghtvl.zynmafqrjb
    public zynmafqrjb wkgbmnqykc(long j13) {
        return new cdpycssgdh(j13, this.f126906ppxfxbqfkf);
    }
}
