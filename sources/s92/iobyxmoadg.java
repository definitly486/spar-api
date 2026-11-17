package s92;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f105846iobyxmoadg;

    public iobyxmoadg(String link) {
        zdlpuopuiu.btonecajqb(link, "link");
        this.f105846iobyxmoadg = link;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105846iobyxmoadg, ((iobyxmoadg) obj).f105846iobyxmoadg);
    }

    public int hashCode() {
        return this.f105846iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f105846iobyxmoadg;
    }

    public String toString() {
        return "PaymentLink(link=" + this.f105846iobyxmoadg + ")";
    }
}
