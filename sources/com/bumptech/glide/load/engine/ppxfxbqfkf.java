package com.bumptech.glide.load.engine;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class ppxfxbqfkf implements gxszxtbevo, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private l8.eablkybsjg f20992cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private List f20993esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f20994iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gxszxtbevo.iobyxmoadg f20995jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f20996lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private volatile r8.agtfadlqog.iobyxmoadg f20997pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lqeggnwhkg f20998yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f20999zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private File f21000zynmafqrjb;

    ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        this(lqeggnwhkgVar.ppxfxbqfkf(), lqeggnwhkgVar, iobyxmoadgVar);
    }

    private boolean iobyxmoadg() {
        return this.f20996lereixgezr < this.f20993esjtqupxsv.size();
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo
    public void cancel() {
        r8.agtfadlqog.iobyxmoadg iobyxmoadgVar = this.f20997pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.f82021ppxfxbqfkf.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg
    public void gxszxtbevo(Object obj) {
        this.f20995jyumaefscl.wkgbmnqykc(this.f20992cqumvgiudr, obj, this.f20997pmvmpeiblj.f82021ppxfxbqfkf, l8.iobyxmoadg.DATA_DISK_CACHE, this.f20992cqumvgiudr);
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg
    public void ppxfxbqfkf(Exception exc) {
        this.f20995jyumaefscl.iobyxmoadg(this.f20992cqumvgiudr, exc, this.f20997pmvmpeiblj.f82021ppxfxbqfkf, l8.iobyxmoadg.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo
    public boolean zoijcleaow() {
        h9.zoijcleaow.iobyxmoadg("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z13 = false;
                if (this.f20993esjtqupxsv != null && iobyxmoadg()) {
                    this.f20997pmvmpeiblj = null;
                    while (!z13 && iobyxmoadg()) {
                        List list = this.f20993esjtqupxsv;
                        int i13 = this.f20996lereixgezr;
                        this.f20996lereixgezr = i13 + 1;
                        this.f20997pmvmpeiblj = ((r8.agtfadlqog) list.get(i13)).zoijcleaow(this.f21000zynmafqrjb, this.f20998yggfygwlhe.zdlpuopuiu(), this.f20998yggfygwlhe.gxszxtbevo(), this.f20998yggfygwlhe.gtknphoqwx());
                        if (this.f20997pmvmpeiblj != null && this.f20998yggfygwlhe.yggfygwlhe(this.f20997pmvmpeiblj.f82021ppxfxbqfkf.iobyxmoadg())) {
                            this.f20997pmvmpeiblj.f82021ppxfxbqfkf.eablkybsjg(this.f20998yggfygwlhe.draadjrbmk(), this);
                            z13 = true;
                        }
                    }
                    h9.zoijcleaow.eablkybsjg();
                    return z13;
                }
                int i14 = this.f20994iwizpuwonk + 1;
                this.f20994iwizpuwonk = i14;
                if (i14 >= this.f20999zdlpuopuiu.size()) {
                    h9.zoijcleaow.eablkybsjg();
                    return false;
                }
                l8.eablkybsjg eablkybsjgVar = (l8.eablkybsjg) this.f20999zdlpuopuiu.get(this.f20994iwizpuwonk);
                File fileIobyxmoadg = this.f20998yggfygwlhe.wkgbmnqykc().iobyxmoadg(new wkgbmnqykc(eablkybsjgVar, this.f20998yggfygwlhe.rgvfuqvkyq()));
                this.f21000zynmafqrjb = fileIobyxmoadg;
                if (fileIobyxmoadg != null) {
                    this.f20992cqumvgiudr = eablkybsjgVar;
                    this.f20993esjtqupxsv = this.f20998yggfygwlhe.btonecajqb(fileIobyxmoadg);
                    this.f20996lereixgezr = 0;
                }
            } catch (Throwable th2) {
                h9.zoijcleaow.eablkybsjg();
                throw th2;
            }
        }
    }

    ppxfxbqfkf(List list, lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        this.f20994iwizpuwonk = -1;
        this.f20999zdlpuopuiu = list;
        this.f20998yggfygwlhe = lqeggnwhkgVar;
        this.f20995jyumaefscl = iobyxmoadgVar;
    }
}
