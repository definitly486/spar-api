package mv1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f68022iobyxmoadg;

    public iobyxmoadg(String link) {
        zdlpuopuiu.btonecajqb(link, "link");
        this.f68022iobyxmoadg = link;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f68022iobyxmoadg, ((iobyxmoadg) obj).f68022iobyxmoadg);
    }

    public int hashCode() {
        return this.f68022iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f68022iobyxmoadg;
    }

    public String toString() {
        return "PaymentLink(link=" + this.f68022iobyxmoadg + ")";
    }
}
