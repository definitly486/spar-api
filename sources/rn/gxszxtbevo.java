package rn;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f83144iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f83145zoijcleaow;

    public gxszxtbevo(String title, String description) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        this.f83144iobyxmoadg = title;
        this.f83145zoijcleaow = description;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f83144iobyxmoadg, gxszxtbevoVar.f83144iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83145zoijcleaow, gxszxtbevoVar.f83145zoijcleaow);
    }

    public int hashCode() {
        return (this.f83144iobyxmoadg.hashCode() * 31) + this.f83145zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f83145zoijcleaow;
    }

    public String toString() {
        return "SearchWarningUiModel(title=" + this.f83144iobyxmoadg + ", description=" + this.f83145zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f83144iobyxmoadg;
    }
}
