package fk;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dsvhmnatus extends jlmebxxoox {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dk.gxszxtbevo f34124ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsvhmnatus(bk.zoijcleaow kSerializer, bk.zoijcleaow vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kSerializer, "kSerializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vSerializer, "vSerializer");
        this.f34124ppxfxbqfkf = new cllcsxoeiz(kSerializer.iobyxmoadg(), vSerializer.iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: cqumvgiudr, reason: merged with bridge method [inline-methods] */
    public void nufgyqmvbu(LinkedHashMap linkedHashMap, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: esjtqupxsv, reason: merged with bridge method [inline-methods] */
    public Iterator dxjokdxxww(Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // fk.jlmebxxoox, bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return this.f34124ppxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
    public int lqeggnwhkg(LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap gxszxtbevo() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public int btonecajqb(Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap rgvfuqvkyq(Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: zynmafqrjb, reason: merged with bridge method [inline-methods] */
    public Map vdvldrhtss(LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
