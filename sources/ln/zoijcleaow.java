package ln;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final hn.iobyxmoadg f63663iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f63664zoijcleaow;

    public zoijcleaow(hn.iobyxmoadg type, String text) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f63663iobyxmoadg = type;
        this.f63664zoijcleaow = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f63663iobyxmoadg == zoijcleaowVar.f63663iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f63664zoijcleaow, zoijcleaowVar.f63664zoijcleaow);
    }

    public int hashCode() {
        return (this.f63663iobyxmoadg.hashCode() * 31) + this.f63664zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f63664zoijcleaow;
    }

    public String toString() {
        return "AddressDetailTypeUiModel(type=" + this.f63663iobyxmoadg + ", text=" + this.f63664zoijcleaow + ")";
    }

    public final hn.iobyxmoadg zoijcleaow() {
        return this.f63663iobyxmoadg;
    }
}
