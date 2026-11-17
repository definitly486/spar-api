package tu1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f111541iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f111542zoijcleaow;

    public iobyxmoadg(String iconUrl, String text) {
        zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f111541iobyxmoadg = iconUrl;
        this.f111542zoijcleaow = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f111541iobyxmoadg, iobyxmoadgVar.f111541iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f111542zoijcleaow, iobyxmoadgVar.f111542zoijcleaow);
    }

    public int hashCode() {
        return (this.f111541iobyxmoadg.hashCode() * 31) + this.f111542zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f111541iobyxmoadg;
    }

    public String toString() {
        return "SubscriptionAdditionalInfoUiModel(iconUrl=" + this.f111541iobyxmoadg + ", text=" + this.f111542zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f111542zoijcleaow;
    }
}
