package lj;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicReference f62657iobyxmoadg;

    public iobyxmoadg(btonecajqb sequence) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sequence, "sequence");
        this.f62657iobyxmoadg = new AtomicReference(sequence);
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        btonecajqb btonecajqbVar = (btonecajqb) this.f62657iobyxmoadg.getAndSet(null);
        if (btonecajqbVar != null) {
            return btonecajqbVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
