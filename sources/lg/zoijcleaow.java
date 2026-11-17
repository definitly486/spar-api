package lg;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow implements btonecajqb.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final btonecajqb.ppxfxbqfkf f62512yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final tg.draadjrbmk f62513zdlpuopuiu;

    public zoijcleaow(btonecajqb.ppxfxbqfkf baseKey, tg.draadjrbmk safeCast) {
        zdlpuopuiu.btonecajqb(baseKey, "baseKey");
        zdlpuopuiu.btonecajqb(safeCast, "safeCast");
        this.f62513zdlpuopuiu = safeCast;
        this.f62512yggfygwlhe = baseKey instanceof zoijcleaow ? ((zoijcleaow) baseKey).f62512yggfygwlhe : baseKey;
    }

    public final boolean iobyxmoadg(btonecajqb.ppxfxbqfkf key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return key == this || this.f62512yggfygwlhe == key;
    }

    public final btonecajqb.zoijcleaow zoijcleaow(btonecajqb.zoijcleaow element) {
        zdlpuopuiu.btonecajqb(element, "element");
        return (btonecajqb.zoijcleaow) this.f62513zdlpuopuiu.invoke(element);
    }
}
