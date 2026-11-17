package eq0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Throwable f31774iobyxmoadg;

    public ppxfxbqfkf(Throwable error) {
        zdlpuopuiu.btonecajqb(error, "error");
        this.f31774iobyxmoadg = error;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f31774iobyxmoadg, ((ppxfxbqfkf) obj).f31774iobyxmoadg);
    }

    public int hashCode() {
        return this.f31774iobyxmoadg.hashCode();
    }

    public final Throwable iobyxmoadg() {
        return this.f31774iobyxmoadg;
    }

    public String toString() {
        return "Error(error=" + this.f31774iobyxmoadg + ")";
    }
}
