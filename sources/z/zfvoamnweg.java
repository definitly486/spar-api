package z;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class zfvoamnweg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f127404ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f127405wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f127406iobyxmoadg = new ipoelvxyzq.ppxfxbqfkf(new pkzmftpjix[16], 0);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private pkzmftpjix[] f127407zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: z.zfvoamnweg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static final class C3252iobyxmoadg implements Comparator {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C3252iobyxmoadg f127408zdlpuopuiu = new C3252iobyxmoadg();

            private C3252iobyxmoadg() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public int compare(pkzmftpjix pkzmftpjixVar, pkzmftpjix pkzmftpjixVar2) {
                int iDraadjrbmk = kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(pkzmftpjixVar2.tzroggbefp(), pkzmftpjixVar.tzroggbefp());
                return iDraadjrbmk != 0 ? iDraadjrbmk : kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(pkzmftpjixVar.hashCode(), pkzmftpjixVar2.hashCode());
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private final void zoijcleaow(pkzmftpjix pkzmftpjixVar) {
        if (pkzmftpjixVar.ntlheqmsrt() > 0) {
            pkzmftpjixVar.wwaezpbzkn();
            pkzmftpjixVar.a0(false);
            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarFiwbwshyhd = pkzmftpjixVar.fiwbwshyhd();
            Object[] objArr = ppxfxbqfkfVarFiwbwshyhd.f49169zdlpuopuiu;
            int iDraadjrbmk = ppxfxbqfkfVarFiwbwshyhd.draadjrbmk();
            for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
                zoijcleaow((pkzmftpjix) objArr[i13]);
            }
        }
    }

    public final void eablkybsjg(pkzmftpjix pkzmftpjixVar) {
        if (pkzmftpjixVar.ntlheqmsrt() > 0) {
            this.f127406iobyxmoadg.nufgyqmvbu();
            this.f127406iobyxmoadg.zoijcleaow(pkzmftpjixVar);
            pkzmftpjixVar.a0(true);
        }
    }

    public final void gxszxtbevo(pkzmftpjix pkzmftpjixVar) {
        this.f127406iobyxmoadg.rgvfuqvkyq(pkzmftpjixVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void iobyxmoadg() {
        pkzmftpjix[] pkzmftpjixVarArr;
        this.f127406iobyxmoadg.cqumvgiudr(iobyxmoadg.C3252iobyxmoadg.f127408zdlpuopuiu);
        int iDraadjrbmk = this.f127406iobyxmoadg.draadjrbmk();
        pkzmftpjix[] pkzmftpjixVarArr2 = this.f127407zoijcleaow;
        if (pkzmftpjixVarArr2 == null || pkzmftpjixVarArr2.length < iDraadjrbmk) {
            pkzmftpjixVarArr = pkzmftpjixVarArr2;
            pkzmftpjixVarArr = new pkzmftpjix[Math.max(16, this.f127406iobyxmoadg.draadjrbmk())];
        }
        pkzmftpjixVarArr = pkzmftpjixVarArr2;
        this.f127407zoijcleaow = null;
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            pkzmftpjixVarArr[i13] = this.f127406iobyxmoadg.f49169zdlpuopuiu[i13];
        }
        this.f127406iobyxmoadg.nufgyqmvbu();
        while (true) {
            iDraadjrbmk--;
            if (-1 >= iDraadjrbmk) {
                this.f127407zoijcleaow = pkzmftpjixVarArr;
                return;
            }
            pkzmftpjix pkzmftpjixVar = pkzmftpjixVarArr[iDraadjrbmk];
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(pkzmftpjixVar);
            if (pkzmftpjixVar.iyctptxqzt()) {
                zoijcleaow(pkzmftpjixVar);
            }
            pkzmftpjixVarArr[iDraadjrbmk] = 0;
        }
    }

    public final boolean ppxfxbqfkf() {
        return this.f127406iobyxmoadg.draadjrbmk() != 0;
    }

    public final void wkgbmnqykc(pkzmftpjix pkzmftpjixVar) {
        if (pkzmftpjixVar.ntlheqmsrt() > 0) {
            this.f127406iobyxmoadg.zoijcleaow(pkzmftpjixVar);
            pkzmftpjixVar.a0(true);
        }
    }
}
