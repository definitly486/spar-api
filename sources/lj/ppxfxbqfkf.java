package lj;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f62681iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f62682zoijcleaow;

    public ppxfxbqfkf(btonecajqb source, tg.draadjrbmk keySelector) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keySelector, "keySelector");
        this.f62681iobyxmoadg = source;
        this.f62682zoijcleaow = keySelector;
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        return new zoijcleaow(this.f62681iobyxmoadg.iterator(), this.f62682zoijcleaow);
    }
}
