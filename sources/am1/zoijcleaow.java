package am1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f2260jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f2261yggfygwlhe;

    public /* synthetic */ zoijcleaow(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f2261yggfygwlhe, zoijcleaowVar.f2261yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f2260jyumaefscl, zoijcleaowVar.f2260jyumaefscl);
    }

    public int hashCode() {
        return (this.f2261yggfygwlhe.hashCode() * 31) + this.f2260jyumaefscl.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f2261yggfygwlhe;
    }

    public String toString() {
        return "CommentItemUiModel(code=" + this.f2261yggfygwlhe + ", comment=" + this.f2260jyumaefscl + ")";
    }

    public final String wkgbmnqykc() {
        return this.f2260jyumaefscl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(String code, String comment) {
        super(code, null);
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(comment, "comment");
        this.f2261yggfygwlhe = code;
        this.f2260jyumaefscl = comment;
    }
}
