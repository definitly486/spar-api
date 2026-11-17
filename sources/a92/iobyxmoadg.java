package a92;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f1169iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1170zoijcleaow;

    public iobyxmoadg(String iconUrl, String text) {
        zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f1169iobyxmoadg = iconUrl;
        this.f1170zoijcleaow = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f1169iobyxmoadg, iobyxmoadgVar.f1169iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f1170zoijcleaow, iobyxmoadgVar.f1170zoijcleaow);
    }

    public int hashCode() {
        return (this.f1169iobyxmoadg.hashCode() * 31) + this.f1170zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f1169iobyxmoadg;
    }

    public String toString() {
        return "SubscriptionAdditionalInfoUiModel(iconUrl=" + this.f1169iobyxmoadg + ", text=" + this.f1170zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f1170zoijcleaow;
    }
}
