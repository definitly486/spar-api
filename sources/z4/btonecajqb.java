package z4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import q4.gtknphoqwx;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class btonecajqb implements gtknphoqwx {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final long[] f127733jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long[] f127734yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f127735zdlpuopuiu;

    public btonecajqb(List list) {
        this.f127735zdlpuopuiu = Collections.unmodifiableList(new ArrayList(list));
        this.f127734yggfygwlhe = new long[list.size() * 2];
        for (int i13 = 0; i13 < list.size(); i13++) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) list.get(i13);
            int i14 = i13 * 2;
            long[] jArr = this.f127734yggfygwlhe;
            jArr[i14] = wkgbmnqykcVar.f127783zoijcleaow;
            jArr[i14 + 1] = wkgbmnqykcVar.f127782ppxfxbqfkf;
        }
        long[] jArr2 = this.f127734yggfygwlhe;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f127733jyumaefscl = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int gxszxtbevo(wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2) {
        return Long.compare(wkgbmnqykcVar.f127783zoijcleaow, wkgbmnqykcVar2.f127783zoijcleaow);
    }

    @Override // q4.gtknphoqwx
    public int iobyxmoadg(long j13) {
        int iWkgbmnqykc = stevsuqkhv.wkgbmnqykc(this.f127733jyumaefscl, j13, false, false);
        if (iWkgbmnqykc < this.f127733jyumaefscl.length) {
            return iWkgbmnqykc;
        }
        return -1;
    }

    @Override // q4.gtknphoqwx
    public long ppxfxbqfkf(int i13) {
        y2.iobyxmoadg.iobyxmoadg(i13 >= 0);
        y2.iobyxmoadg.iobyxmoadg(i13 < this.f127733jyumaefscl.length);
        return this.f127733jyumaefscl[i13];
    }

    @Override // q4.gtknphoqwx
    public int wkgbmnqykc() {
        return this.f127733jyumaefscl.length;
    }

    @Override // q4.gtknphoqwx
    public List zoijcleaow(long j13) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < this.f127735zdlpuopuiu.size(); i13++) {
            long[] jArr = this.f127734yggfygwlhe;
            int i14 = i13 * 2;
            if (jArr[i14] <= j13 && j13 < jArr[i14 + 1]) {
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f127735zdlpuopuiu.get(i13);
                x2.iobyxmoadg iobyxmoadgVar = wkgbmnqykcVar.f127781iobyxmoadg;
                if (iobyxmoadgVar.f120959eablkybsjg == -3.4028235E38f) {
                    arrayList2.add(wkgbmnqykcVar);
                } else {
                    arrayList.add(iobyxmoadgVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: z4.dxjokdxxww
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return btonecajqb.gxszxtbevo((wkgbmnqykc) obj, (wkgbmnqykc) obj2);
            }
        });
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            arrayList.add(((wkgbmnqykc) arrayList2.get(i15)).f127781iobyxmoadg.iobyxmoadg().nufgyqmvbu((-1) - i15, 1).iobyxmoadg());
        }
        return arrayList;
    }
}
