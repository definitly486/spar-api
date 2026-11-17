package lj;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zoijcleaow extends hg.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final HashSet f62690cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final tg.draadjrbmk f62691iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Iterator f62692jyumaefscl;

    public zoijcleaow(Iterator source, tg.draadjrbmk keySelector) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keySelector, "keySelector");
        this.f62692jyumaefscl = source;
        this.f62691iwizpuwonk = keySelector;
        this.f62690cqumvgiudr = new HashSet();
    }

    @Override // hg.ppxfxbqfkf
    protected void iobyxmoadg() {
        while (this.f62692jyumaefscl.hasNext()) {
            Object next = this.f62692jyumaefscl.next();
            if (this.f62690cqumvgiudr.add(this.f62691iwizpuwonk.invoke(next))) {
                ppxfxbqfkf(next);
                return;
            }
        }
        zoijcleaow();
    }
}
