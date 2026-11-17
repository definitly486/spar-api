package hh1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f40347iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f40348ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final draadjrbmk f40349wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f40350zoijcleaow;

    public btonecajqb(String id2, String navLink, String str, draadjrbmk draadjrbmkVar) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(navLink, "navLink");
        this.f40347iobyxmoadg = id2;
        this.f40350zoijcleaow = navLink;
        this.f40348ppxfxbqfkf = str;
        this.f40349wkgbmnqykc = draadjrbmkVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f40347iobyxmoadg, btonecajqbVar.f40347iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40350zoijcleaow, btonecajqbVar.f40350zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f40348ppxfxbqfkf, btonecajqbVar.f40348ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f40349wkgbmnqykc, btonecajqbVar.f40349wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((this.f40347iobyxmoadg.hashCode() * 31) + this.f40350zoijcleaow.hashCode()) * 31;
        String str = this.f40348ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        draadjrbmk draadjrbmkVar = this.f40349wkgbmnqykc;
        return iHashCode2 + (draadjrbmkVar != null ? draadjrbmkVar.hashCode() : 0);
    }

    public final draadjrbmk iobyxmoadg() {
        return this.f40349wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f40350zoijcleaow;
    }

    public String toString() {
        return "Popup(id=" + this.f40347iobyxmoadg + ", navLink=" + this.f40350zoijcleaow + ", reference=" + this.f40348ppxfxbqfkf + ", content=" + this.f40349wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f40348ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f40347iobyxmoadg;
    }
}
