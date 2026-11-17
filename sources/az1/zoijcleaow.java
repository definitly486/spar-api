package az1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14824iobyxmoadg;

    public zoijcleaow(String listId) {
        zdlpuopuiu.btonecajqb(listId, "listId");
        this.f14824iobyxmoadg = listId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f14824iobyxmoadg, ((zoijcleaow) obj).f14824iobyxmoadg);
    }

    public int hashCode() {
        return this.f14824iobyxmoadg.hashCode();
    }

    public String toString() {
        return "PurchasesListAddFromSet(listId=" + this.f14824iobyxmoadg + ")";
    }
}
