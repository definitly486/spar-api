package cm0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f20183iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f20184zoijcleaow;

    public gxszxtbevo(String title, String description) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        this.f20183iobyxmoadg = title;
        this.f20184zoijcleaow = description;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f20183iobyxmoadg, gxszxtbevoVar.f20183iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f20184zoijcleaow, gxszxtbevoVar.f20184zoijcleaow);
    }

    public int hashCode() {
        return (this.f20183iobyxmoadg.hashCode() * 31) + this.f20184zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f20184zoijcleaow;
    }

    public String toString() {
        return "SearchWarningUiModel(title=" + this.f20183iobyxmoadg + ", description=" + this.f20184zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f20183iobyxmoadg;
    }
}
