package hg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wypolnanlu implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f40282yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Iterator f40283zdlpuopuiu;

    public wypolnanlu(Iterator iterator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterator, "iterator");
        this.f40283zdlpuopuiu = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40283zdlpuopuiu.hasNext();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public final cllcsxoeiz next() {
        int i13 = this.f40282yggfygwlhe;
        this.f40282yggfygwlhe = i13 + 1;
        if (i13 < 0) {
            jyumaefscl.iwizpuwonk();
        }
        return new cllcsxoeiz(i13, this.f40283zdlpuopuiu.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
