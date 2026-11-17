package eq0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f31770iobyxmoadg;

    public eablkybsjg(String str) {
        this.f31770iobyxmoadg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f31770iobyxmoadg, ((eablkybsjg) obj).f31770iobyxmoadg);
    }

    public int hashCode() {
        String str = this.f31770iobyxmoadg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f31770iobyxmoadg;
    }

    public String toString() {
        return "ProductNotFound(message=" + this.f31770iobyxmoadg + ")";
    }
}
