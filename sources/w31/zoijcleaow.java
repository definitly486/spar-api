package w31;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f118644iobyxmoadg;

    public zoijcleaow(String navigationLink) {
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        this.f118644iobyxmoadg = navigationLink;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118644iobyxmoadg, ((zoijcleaow) obj).f118644iobyxmoadg);
    }

    public int hashCode() {
        return this.f118644iobyxmoadg.hashCode();
    }

    public String toString() {
        return "NavigationLinkProperty(navigationLink=" + this.f118644iobyxmoadg + ")";
    }
}
