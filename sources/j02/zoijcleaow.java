package j02;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f50449jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f50450yggfygwlhe;

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
        return zdlpuopuiu.eablkybsjg(this.f50450yggfygwlhe, zoijcleaowVar.f50450yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f50449jyumaefscl, zoijcleaowVar.f50449jyumaefscl);
    }

    public int hashCode() {
        return (this.f50450yggfygwlhe.hashCode() * 31) + this.f50449jyumaefscl.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f50450yggfygwlhe;
    }

    public String toString() {
        return "CommentItemUiModel(code=" + this.f50450yggfygwlhe + ", comment=" + this.f50449jyumaefscl + ")";
    }

    public final String wkgbmnqykc() {
        return this.f50449jyumaefscl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(String code, String comment) {
        super(code, null);
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(comment, "comment");
        this.f50450yggfygwlhe = code;
        this.f50449jyumaefscl = comment;
    }
}
