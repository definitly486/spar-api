package fk;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class stevsuqkhv extends oxmwwwfdhm {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dk.gxszxtbevo f34236zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stevsuqkhv(bk.zoijcleaow eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eSerializer, "eSerializer");
        this.f34236zoijcleaow = new wypolnanlu(eSerializer.iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: cqumvgiudr, reason: merged with bridge method [inline-methods] */
    public void nufgyqmvbu(LinkedHashSet linkedHashSet, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.vdvldrhtss
    /* JADX INFO: renamed from: esjtqupxsv, reason: merged with bridge method [inline-methods] */
    public void kcexrzcfyt(LinkedHashSet linkedHashSet, int i13, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    @Override // fk.vdvldrhtss, bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return this.f34236zoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
    public int lqeggnwhkg(LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet gxszxtbevo() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet rgvfuqvkyq(Set set) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public Set vdvldrhtss(LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
