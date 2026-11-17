package hh1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f40351eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f40352iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f40353ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f40354wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f40355zoijcleaow;

    public draadjrbmk(String str, String str2, String str3, String str4, String str5) {
        this.f40352iobyxmoadg = str;
        this.f40355zoijcleaow = str2;
        this.f40353ppxfxbqfkf = str3;
        this.f40354wkgbmnqykc = str4;
        this.f40351eablkybsjg = str5;
    }

    public final String eablkybsjg() {
        return this.f40352iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return zdlpuopuiu.eablkybsjg(this.f40352iobyxmoadg, draadjrbmkVar.f40352iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40355zoijcleaow, draadjrbmkVar.f40355zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f40353ppxfxbqfkf, draadjrbmkVar.f40353ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f40354wkgbmnqykc, draadjrbmkVar.f40354wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f40351eablkybsjg, draadjrbmkVar.f40351eablkybsjg);
    }

    public int hashCode() {
        String str = this.f40352iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f40355zoijcleaow;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f40353ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f40354wkgbmnqykc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f40351eablkybsjg;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f40351eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f40355zoijcleaow;
    }

    public String toString() {
        return "PopupContent(title=" + this.f40352iobyxmoadg + ", subtitle=" + this.f40355zoijcleaow + ", imageUrl=" + this.f40353ppxfxbqfkf + ", text=" + this.f40354wkgbmnqykc + ", buttonText=" + this.f40351eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f40354wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f40353ppxfxbqfkf;
    }
}
