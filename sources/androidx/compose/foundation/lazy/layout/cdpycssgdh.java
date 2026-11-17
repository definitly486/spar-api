package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
final class cdpycssgdh implements androidx.compose.ui.layout.cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final esjtqupxsv f4961iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.collection.hcddaimhww f4962zoijcleaow = androidx.collection.tzroggbefp.zoijcleaow();

    public cdpycssgdh(esjtqupxsv esjtqupxsvVar) {
        this.f4961iobyxmoadg = esjtqupxsvVar;
    }

    @Override // androidx.compose.ui.layout.cdpycssgdh
    public void iobyxmoadg(androidx.compose.ui.layout.cdpycssgdh.iobyxmoadg iobyxmoadgVar) {
        this.f4962zoijcleaow.btonecajqb();
        androidx.collection.hkdspvbjdz hkdspvbjdzVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        Object[] objArr = hkdspvbjdzVarZoijcleaow.f4389zoijcleaow;
        long[] jArr = hkdspvbjdzVarZoijcleaow.f4387ppxfxbqfkf;
        int i13 = hkdspvbjdzVarZoijcleaow.f4383eablkybsjg;
        while (i13 != Integer.MAX_VALUE) {
            int i14 = (int) ((jArr[i13] >> 31) & 2147483647L);
            Object obj = objArr[i13];
            Object objPpxfxbqfkf = this.f4961iobyxmoadg.ppxfxbqfkf(obj);
            int iEablkybsjg = this.f4962zoijcleaow.eablkybsjg(objPpxfxbqfkf, 0);
            if (iEablkybsjg == 7) {
                iobyxmoadgVar.remove(obj);
            } else {
                this.f4962zoijcleaow.yggfygwlhe(objPpxfxbqfkf, iEablkybsjg + 1);
            }
            i13 = i14;
        }
    }

    @Override // androidx.compose.ui.layout.cdpycssgdh
    public boolean zoijcleaow(Object obj, Object obj2) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4961iobyxmoadg.ppxfxbqfkf(obj), this.f4961iobyxmoadg.ppxfxbqfkf(obj2));
    }
}
