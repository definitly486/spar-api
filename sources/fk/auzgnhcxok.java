package fk;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class auzgnhcxok extends vdvldrhtss {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dk.gxszxtbevo f34102ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ah.wkgbmnqykc f34103zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auzgnhcxok(ah.wkgbmnqykc kClass, bk.zoijcleaow eSerializer) {
        super(eSerializer, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kClass, "kClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eSerializer, "eSerializer");
        this.f34103zoijcleaow = kClass;
        this.f34102ppxfxbqfkf = new wkgbmnqykc(eSerializer.iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: cqumvgiudr, reason: merged with bridge method [inline-methods] */
    public int btonecajqb(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.vdvldrhtss
    /* JADX INFO: renamed from: esjtqupxsv, reason: merged with bridge method [inline-methods] */
    public void kcexrzcfyt(ArrayList arrayList, int i13, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arrayList, "<this>");
        arrayList.add(i13, obj);
    }

    @Override // fk.vdvldrhtss, bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return this.f34102ppxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
    public Iterator dxjokdxxww(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public void nufgyqmvbu(ArrayList arrayList, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arrayList, "<this>");
        arrayList.ensureCapacity(i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public ArrayList rgvfuqvkyq(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return new ArrayList(hg.agtfadlqog.gxszxtbevo(objArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public Object[] vdvldrhtss(ArrayList arrayList) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arrayList, "<this>");
        return yfnezrywwk.ojitshcjhn(arrayList, this.f34103zoijcleaow);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: yggfygwlhe, reason: merged with bridge method [inline-methods] */
    public int lqeggnwhkg(ArrayList arrayList) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
    public ArrayList gxszxtbevo() {
        return new ArrayList();
    }
}
