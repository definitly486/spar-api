package j02;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f50445jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f50446yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(String title, String subtitle) {
        super(title, null);
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        this.f50446yggfygwlhe = title;
        this.f50445jyumaefscl = subtitle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f50446yggfygwlhe, iobyxmoadgVar.f50446yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f50445jyumaefscl, iobyxmoadgVar.f50445jyumaefscl);
    }

    public int hashCode() {
        return (this.f50446yggfygwlhe.hashCode() * 31) + this.f50445jyumaefscl.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f50445jyumaefscl;
    }

    public String toString() {
        return "CancelTitleItemUiModel(title=" + this.f50446yggfygwlhe + ", subtitle=" + this.f50445jyumaefscl + ")";
    }

    public final String wkgbmnqykc() {
        return this.f50446yggfygwlhe;
    }
}
