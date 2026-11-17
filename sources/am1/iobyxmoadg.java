package am1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f2256jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f2257yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(String title, String subtitle) {
        super(title, null);
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        this.f2257yggfygwlhe = title;
        this.f2256jyumaefscl = subtitle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f2257yggfygwlhe, iobyxmoadgVar.f2257yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f2256jyumaefscl, iobyxmoadgVar.f2256jyumaefscl);
    }

    public int hashCode() {
        return (this.f2257yggfygwlhe.hashCode() * 31) + this.f2256jyumaefscl.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f2256jyumaefscl;
    }

    public String toString() {
        return "CancelTitleItemUiModel(title=" + this.f2257yggfygwlhe + ", subtitle=" + this.f2256jyumaefscl + ")";
    }

    public final String wkgbmnqykc() {
        return this.f2257yggfygwlhe;
    }
}
