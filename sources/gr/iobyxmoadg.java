package gr;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f38348iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f38349ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f38350zoijcleaow;

    public iobyxmoadg(String str, String text, String str2) {
        zdlpuopuiu.btonecajqb(text, "text");
        this.f38348iobyxmoadg = str;
        this.f38350zoijcleaow = text;
        this.f38349ppxfxbqfkf = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f38348iobyxmoadg, iobyxmoadgVar.f38348iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f38350zoijcleaow, iobyxmoadgVar.f38350zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f38349ppxfxbqfkf, iobyxmoadgVar.f38349ppxfxbqfkf);
    }

    public int hashCode() {
        String str = this.f38348iobyxmoadg;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f38350zoijcleaow.hashCode()) * 31;
        String str2 = this.f38349ppxfxbqfkf;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f38348iobyxmoadg;
    }

    public String toString() {
        return "InfoAlertMessage(header=" + this.f38348iobyxmoadg + ", text=" + this.f38350zoijcleaow + ", action=" + this.f38349ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f38350zoijcleaow;
    }
}
