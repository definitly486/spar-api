package ue;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f113506iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f113507zoijcleaow;

    public ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        this.f113506iobyxmoadg = iobyxmoadgVar;
        ArrayList arrayList = new ArrayList();
        this.f113507zoijcleaow = arrayList;
        arrayList.add(new zoijcleaow(iobyxmoadgVar, new int[]{1}));
    }

    private zoijcleaow iobyxmoadg(int i13) {
        if (i13 >= this.f113507zoijcleaow.size()) {
            List list = this.f113507zoijcleaow;
            zoijcleaow zoijcleaowVarLqeggnwhkg = (zoijcleaow) list.get(list.size() - 1);
            for (int size = this.f113507zoijcleaow.size(); size <= i13; size++) {
                iobyxmoadg iobyxmoadgVar = this.f113506iobyxmoadg;
                zoijcleaowVarLqeggnwhkg = zoijcleaowVarLqeggnwhkg.lqeggnwhkg(new zoijcleaow(iobyxmoadgVar, new int[]{1, iobyxmoadgVar.ppxfxbqfkf((size - 1) + iobyxmoadgVar.wkgbmnqykc())}));
                this.f113507zoijcleaow.add(zoijcleaowVarLqeggnwhkg);
            }
        }
        return (zoijcleaow) this.f113507zoijcleaow.get(i13);
    }

    public void zoijcleaow(int[] iArr, int i13) {
        if (i13 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i13;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadg(i13);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrWkgbmnqykc = new zoijcleaow(this.f113506iobyxmoadg, iArr2).nufgyqmvbu(i13, 1).zoijcleaow(zoijcleaowVarIobyxmoadg)[1].wkgbmnqykc();
        int length2 = i13 - iArrWkgbmnqykc.length;
        for (int i14 = 0; i14 < length2; i14++) {
            iArr[length + i14] = 0;
        }
        System.arraycopy(iArrWkgbmnqykc, 0, iArr, length + length2, iArrWkgbmnqykc.length);
    }
}
