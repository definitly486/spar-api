package sp0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f107808iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f107809ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f107810zoijcleaow;

    public iobyxmoadg(String str, String text, String str2) {
        zdlpuopuiu.btonecajqb(text, "text");
        this.f107808iobyxmoadg = str;
        this.f107810zoijcleaow = text;
        this.f107809ppxfxbqfkf = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f107808iobyxmoadg, iobyxmoadgVar.f107808iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f107810zoijcleaow, iobyxmoadgVar.f107810zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f107809ppxfxbqfkf, iobyxmoadgVar.f107809ppxfxbqfkf);
    }

    public int hashCode() {
        String str = this.f107808iobyxmoadg;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f107810zoijcleaow.hashCode()) * 31;
        String str2 = this.f107809ppxfxbqfkf;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f107808iobyxmoadg;
    }

    public String toString() {
        return "InfoAlertMessage(header=" + this.f107808iobyxmoadg + ", text=" + this.f107810zoijcleaow + ", action=" + this.f107809ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f107810zoijcleaow;
    }
}
