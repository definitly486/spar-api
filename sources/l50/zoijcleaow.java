package l50;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f61635iobyxmoadg;

    public zoijcleaow(String navigationLink) {
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        this.f61635iobyxmoadg = navigationLink;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61635iobyxmoadg, ((zoijcleaow) obj).f61635iobyxmoadg);
    }

    public int hashCode() {
        return this.f61635iobyxmoadg.hashCode();
    }

    public String toString() {
        return "NavigationLinkProperty(navigationLink=" + this.f61635iobyxmoadg + ")";
    }
}
