package t;

/* JADX INFO: loaded from: classes.dex */
public class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f109190iobyxmoadg = new ipoelvxyzq.ppxfxbqfkf(new draadjrbmk[16], 0);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.collection.jpowsppfya f109191zoijcleaow = new androidx.collection.jpowsppfya(10);

    public void dxjokdxxww(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f109191zoijcleaow.yggfygwlhe();
        this.f109191zoijcleaow.agtfadlqog(this);
        while (this.f109191zoijcleaow.nufgyqmvbu()) {
            androidx.collection.jpowsppfya jpowsppfyaVar = this.f109191zoijcleaow;
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) jpowsppfyaVar.zynmafqrjb(jpowsppfyaVar.eablkybsjg() - 1);
            int i13 = 0;
            while (i13 < wflxmlrfwpVar.f109190iobyxmoadg.draadjrbmk()) {
                draadjrbmk draadjrbmkVar = (draadjrbmk) wflxmlrfwpVar.f109190iobyxmoadg.f49169zdlpuopuiu[i13];
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVar.gtknphoqwx(), ppxfxbqfkfVar)) {
                    wflxmlrfwpVar.f109190iobyxmoadg.rgvfuqvkyq(draadjrbmkVar);
                    draadjrbmkVar.wkgbmnqykc();
                } else {
                    this.f109191zoijcleaow.agtfadlqog(draadjrbmkVar);
                    i13++;
                }
            }
        }
    }

    public boolean eablkybsjg(gxszxtbevo gxszxtbevoVar) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f109190iobyxmoadg;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        boolean z13 = false;
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            z13 = ((draadjrbmk) objArr[i13]).eablkybsjg(gxszxtbevoVar) || z13;
        }
        zoijcleaow(gxszxtbevoVar);
        return z13;
    }

    public boolean gxszxtbevo(androidx.collection.esjtqupxsv esjtqupxsvVar, x.rgvfuqvkyq rgvfuqvkyqVar, gxszxtbevo gxszxtbevoVar, boolean z13) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f109190iobyxmoadg;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        boolean z14 = false;
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            z14 = ((draadjrbmk) objArr[i13]).gxszxtbevo(esjtqupxsvVar, rgvfuqvkyqVar, gxszxtbevoVar, z13) || z14;
        }
        return z14;
    }

    public boolean iobyxmoadg(androidx.collection.esjtqupxsv esjtqupxsvVar, x.rgvfuqvkyq rgvfuqvkyqVar, gxszxtbevo gxszxtbevoVar, boolean z13) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f109190iobyxmoadg;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        boolean z14 = false;
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            z14 = ((draadjrbmk) objArr[i13]).iobyxmoadg(esjtqupxsvVar, rgvfuqvkyqVar, gxszxtbevoVar, z13) || z14;
        }
        return z14;
    }

    public final ipoelvxyzq.ppxfxbqfkf lqeggnwhkg() {
        return this.f109190iobyxmoadg;
    }

    public void nufgyqmvbu(long j13, androidx.collection.jpowsppfya jpowsppfyaVar) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f109190iobyxmoadg;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            ((draadjrbmk) objArr[i13]).nufgyqmvbu(j13, jpowsppfyaVar);
        }
    }

    public final void ppxfxbqfkf() {
        this.f109190iobyxmoadg.nufgyqmvbu();
    }

    public void wkgbmnqykc() {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f109190iobyxmoadg;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            ((draadjrbmk) objArr[i13]).wkgbmnqykc();
        }
    }

    public void zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        int iDraadjrbmk = this.f109190iobyxmoadg.draadjrbmk();
        while (true) {
            iDraadjrbmk--;
            if (-1 >= iDraadjrbmk) {
                return;
            }
            if (((draadjrbmk) this.f109190iobyxmoadg.f49169zdlpuopuiu[iDraadjrbmk]).draadjrbmk().gxszxtbevo()) {
                this.f109190iobyxmoadg.oxmwwwfdhm(iDraadjrbmk);
            }
        }
    }
}
