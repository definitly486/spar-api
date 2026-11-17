package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public final class uawqvzlxes implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f5137iobyxmoadg = new ipoelvxyzq.ppxfxbqfkf(new gxszxtbevo.iobyxmoadg[16], 0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private gxszxtbevo.iobyxmoadg f5138ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f5139zoijcleaow;

    private final boolean ppxfxbqfkf(gxszxtbevo.iobyxmoadg iobyxmoadgVar, int i13) {
        return i13 < iobyxmoadgVar.zoijcleaow() + iobyxmoadgVar.iobyxmoadg() && iobyxmoadgVar.zoijcleaow() <= i13;
    }

    private final gxszxtbevo.iobyxmoadg wkgbmnqykc(int i13) {
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = this.f5138ppxfxbqfkf;
        if (iobyxmoadgVar != null && ppxfxbqfkf(iobyxmoadgVar, i13)) {
            return iobyxmoadgVar;
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f5137iobyxmoadg;
        gxszxtbevo.iobyxmoadg iobyxmoadgVar2 = (gxszxtbevo.iobyxmoadg) ppxfxbqfkfVar.f49169zdlpuopuiu[lqeggnwhkg.zoijcleaow(ppxfxbqfkfVar, i13)];
        this.f5138ppxfxbqfkf = iobyxmoadgVar2;
        return iobyxmoadgVar2;
    }

    @Override // androidx.compose.foundation.lazy.layout.gxszxtbevo
    public gxszxtbevo.iobyxmoadg get(int i13) {
        if (i13 < 0 || i13 >= getSize()) {
            rlfsiqarku.eablkybsjg.eablkybsjg("Index " + i13 + ", size " + getSize());
        }
        return wkgbmnqykc(i13);
    }

    @Override // androidx.compose.foundation.lazy.layout.gxszxtbevo
    public int getSize() {
        return this.f5139zoijcleaow;
    }

    @Override // androidx.compose.foundation.lazy.layout.gxszxtbevo
    public void iobyxmoadg(int i13, int i14, tg.draadjrbmk draadjrbmkVar) {
        if (i13 < 0 || i13 >= getSize()) {
            rlfsiqarku.eablkybsjg.eablkybsjg("Index " + i13 + ", size " + getSize());
        }
        if (i14 < 0 || i14 >= getSize()) {
            rlfsiqarku.eablkybsjg.eablkybsjg("Index " + i14 + ", size " + getSize());
        }
        if (!(i14 >= i13)) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("toIndex (" + i14 + ") should be not smaller than fromIndex (" + i13 + ')');
        }
        int iZoijcleaow = lqeggnwhkg.zoijcleaow(this.f5137iobyxmoadg, i13);
        int iZoijcleaow2 = ((gxszxtbevo.iobyxmoadg) this.f5137iobyxmoadg.f49169zdlpuopuiu[iZoijcleaow]).zoijcleaow();
        while (iZoijcleaow2 <= i14) {
            gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) this.f5137iobyxmoadg.f49169zdlpuopuiu[iZoijcleaow];
            draadjrbmkVar.invoke(iobyxmoadgVar);
            iZoijcleaow2 += iobyxmoadgVar.iobyxmoadg();
            iZoijcleaow++;
        }
    }

    public final void zoijcleaow(int i13, Object obj) {
        if (!(i13 >= 0)) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("size should be >=0");
        }
        if (i13 == 0) {
            return;
        }
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = new gxszxtbevo.iobyxmoadg(getSize(), i13, obj);
        this.f5139zoijcleaow = getSize() + i13;
        this.f5137iobyxmoadg.zoijcleaow(iobyxmoadgVar);
    }
}
