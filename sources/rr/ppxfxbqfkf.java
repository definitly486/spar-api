package rr;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Throwable f83678iobyxmoadg;

    public ppxfxbqfkf(Throwable error) {
        zdlpuopuiu.btonecajqb(error, "error");
        this.f83678iobyxmoadg = error;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f83678iobyxmoadg, ((ppxfxbqfkf) obj).f83678iobyxmoadg);
    }

    public int hashCode() {
        return this.f83678iobyxmoadg.hashCode();
    }

    public final Throwable iobyxmoadg() {
        return this.f83678iobyxmoadg;
    }

    public String toString() {
        return "Error(error=" + this.f83678iobyxmoadg + ")";
    }
}
