package hg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dsvhmnatus implements Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final tg.iobyxmoadg f40227zdlpuopuiu;

    public dsvhmnatus(tg.iobyxmoadg iteratorFactory) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iteratorFactory, "iteratorFactory");
        this.f40227zdlpuopuiu = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new wypolnanlu((Iterator) this.f40227zdlpuopuiu.invoke());
    }
}
