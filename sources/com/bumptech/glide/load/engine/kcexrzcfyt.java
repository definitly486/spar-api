package com.bumptech.glide.load.engine;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class kcexrzcfyt implements gxszxtbevo, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private l8.eablkybsjg f20898cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private List f20899esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private zdlpuopuiu f20900istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f20901iwizpuwonk = -1;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f20902jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f20903lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private volatile r8.agtfadlqog.iobyxmoadg f20904pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lqeggnwhkg f20905yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gxszxtbevo.iobyxmoadg f20906zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private File f20907zynmafqrjb;

    kcexrzcfyt(lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        this.f20905yggfygwlhe = lqeggnwhkgVar;
        this.f20906zdlpuopuiu = iobyxmoadgVar;
    }

    private boolean iobyxmoadg() {
        return this.f20903lereixgezr < this.f20899esjtqupxsv.size();
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo
    public void cancel() {
        r8.agtfadlqog.iobyxmoadg iobyxmoadgVar = this.f20904pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.f82021ppxfxbqfkf.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg
    public void gxszxtbevo(Object obj) {
        this.f20906zdlpuopuiu.wkgbmnqykc(this.f20898cqumvgiudr, obj, this.f20904pmvmpeiblj.f82021ppxfxbqfkf, l8.iobyxmoadg.RESOURCE_DISK_CACHE, this.f20900istkbnxepw);
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg
    public void ppxfxbqfkf(Exception exc) {
        this.f20906zdlpuopuiu.iobyxmoadg(this.f20900istkbnxepw, exc, this.f20904pmvmpeiblj.f82021ppxfxbqfkf, l8.iobyxmoadg.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo
    public boolean zoijcleaow() {
        h9.zoijcleaow.iobyxmoadg("ResourceCacheGenerator.startNext");
        try {
            List listPpxfxbqfkf = this.f20905yggfygwlhe.ppxfxbqfkf();
            boolean z13 = false;
            if (listPpxfxbqfkf.isEmpty()) {
                h9.zoijcleaow.eablkybsjg();
                return false;
            }
            List listWflxmlrfwp = this.f20905yggfygwlhe.wflxmlrfwp();
            if (listWflxmlrfwp.isEmpty()) {
                if (File.class.equals(this.f20905yggfygwlhe.oxmwwwfdhm())) {
                    h9.zoijcleaow.eablkybsjg();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f20905yggfygwlhe.dxjokdxxww() + " to " + this.f20905yggfygwlhe.oxmwwwfdhm());
            }
            while (true) {
                if (this.f20899esjtqupxsv != null && iobyxmoadg()) {
                    this.f20904pmvmpeiblj = null;
                    while (!z13 && iobyxmoadg()) {
                        List list = this.f20899esjtqupxsv;
                        int i13 = this.f20903lereixgezr;
                        this.f20903lereixgezr = i13 + 1;
                        this.f20904pmvmpeiblj = ((r8.agtfadlqog) list.get(i13)).zoijcleaow(this.f20907zynmafqrjb, this.f20905yggfygwlhe.zdlpuopuiu(), this.f20905yggfygwlhe.gxszxtbevo(), this.f20905yggfygwlhe.gtknphoqwx());
                        if (this.f20904pmvmpeiblj != null && this.f20905yggfygwlhe.yggfygwlhe(this.f20904pmvmpeiblj.f82021ppxfxbqfkf.iobyxmoadg())) {
                            this.f20904pmvmpeiblj.f82021ppxfxbqfkf.eablkybsjg(this.f20905yggfygwlhe.draadjrbmk(), this);
                            z13 = true;
                        }
                    }
                    h9.zoijcleaow.eablkybsjg();
                    return z13;
                }
                int i14 = this.f20901iwizpuwonk + 1;
                this.f20901iwizpuwonk = i14;
                if (i14 >= listWflxmlrfwp.size()) {
                    int i15 = this.f20902jyumaefscl + 1;
                    this.f20902jyumaefscl = i15;
                    if (i15 >= listPpxfxbqfkf.size()) {
                        h9.zoijcleaow.eablkybsjg();
                        return false;
                    }
                    this.f20901iwizpuwonk = 0;
                }
                l8.eablkybsjg eablkybsjgVar = (l8.eablkybsjg) listPpxfxbqfkf.get(this.f20902jyumaefscl);
                Class cls = (Class) listWflxmlrfwp.get(this.f20901iwizpuwonk);
                this.f20900istkbnxepw = new zdlpuopuiu(this.f20905yggfygwlhe.zoijcleaow(), eablkybsjgVar, this.f20905yggfygwlhe.rgvfuqvkyq(), this.f20905yggfygwlhe.zdlpuopuiu(), this.f20905yggfygwlhe.gxszxtbevo(), this.f20905yggfygwlhe.kcexrzcfyt(cls), cls, this.f20905yggfygwlhe.gtknphoqwx());
                File fileIobyxmoadg = this.f20905yggfygwlhe.wkgbmnqykc().iobyxmoadg(this.f20900istkbnxepw);
                this.f20907zynmafqrjb = fileIobyxmoadg;
                if (fileIobyxmoadg != null) {
                    this.f20898cqumvgiudr = eablkybsjgVar;
                    this.f20899esjtqupxsv = this.f20905yggfygwlhe.btonecajqb(fileIobyxmoadg);
                    this.f20903lereixgezr = 0;
                }
            }
        } catch (Throwable th2) {
            h9.zoijcleaow.eablkybsjg();
            throw th2;
        }
    }
}
