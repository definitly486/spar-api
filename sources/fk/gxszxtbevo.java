package fk;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends oxmwwwfdhm {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dk.gxszxtbevo f34141zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(bk.zoijcleaow element) {
        super(element);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        this.f34141zoijcleaow = new eablkybsjg(element.iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: cqumvgiudr, reason: merged with bridge method [inline-methods] */
    public void nufgyqmvbu(ArrayList arrayList, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arrayList, "<this>");
        arrayList.ensureCapacity(i13);
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
        return this.f34141zoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
    public int lqeggnwhkg(ArrayList arrayList) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public ArrayList gxszxtbevo() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public ArrayList rgvfuqvkyq(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public List vdvldrhtss(ArrayList arrayList) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arrayList, "<this>");
        return arrayList;
    }
}
