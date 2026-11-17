package kq;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class agtfadlqog implements btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f60338eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f60339gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f60340iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f60341lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f60342nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f60343ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f40.zoijcleaow f60344wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f60345zoijcleaow;

    public agtfadlqog(String str, String str2, String str3, f40.zoijcleaow zoijcleaowVar, String str4, String str5, String str6, String str7) {
        this.f60340iobyxmoadg = str;
        this.f60345zoijcleaow = str2;
        this.f60343ppxfxbqfkf = str3;
        this.f60344wkgbmnqykc = zoijcleaowVar;
        this.f60338eablkybsjg = str4;
        this.f60339gxszxtbevo = str5;
        this.f60341lqeggnwhkg = str6;
        this.f60342nufgyqmvbu = str7;
    }

    public final String eablkybsjg() {
        return this.f60343ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return zdlpuopuiu.eablkybsjg(this.f60340iobyxmoadg, agtfadlqogVar.f60340iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f60345zoijcleaow, agtfadlqogVar.f60345zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f60343ppxfxbqfkf, agtfadlqogVar.f60343ppxfxbqfkf) && this.f60344wkgbmnqykc == agtfadlqogVar.f60344wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f60338eablkybsjg, agtfadlqogVar.f60338eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f60339gxszxtbevo, agtfadlqogVar.f60339gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f60341lqeggnwhkg, agtfadlqogVar.f60341lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f60342nufgyqmvbu, agtfadlqogVar.f60342nufgyqmvbu);
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return "CartLoadInfoUiModel";
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.LOAD_INFO;
    }

    public final f40.zoijcleaow gxszxtbevo() {
        return this.f60344wkgbmnqykc;
    }

    public int hashCode() {
        String str = this.f60340iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60345zoijcleaow;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60343ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        f40.zoijcleaow zoijcleaowVar = this.f60344wkgbmnqykc;
        int iHashCode4 = (iHashCode3 + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        String str4 = this.f60338eablkybsjg;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f60339gxszxtbevo;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f60341lqeggnwhkg;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f60342nufgyqmvbu;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f60339gxszxtbevo;
    }

    public final String lqeggnwhkg() {
        return this.f60338eablkybsjg;
    }

    public final String nufgyqmvbu() {
        return this.f60340iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f60341lqeggnwhkg;
    }

    public String toString() {
        return "LoadInfoUiModel(title=" + this.f60340iobyxmoadg + ", description=" + this.f60345zoijcleaow + ", imageUrl=" + this.f60343ppxfxbqfkf + ", navlink=" + this.f60344wkgbmnqykc + ", reference=" + this.f60338eablkybsjg + ", adv=" + this.f60339gxszxtbevo + ", backgroundColorLight=" + this.f60341lqeggnwhkg + ", backgroundColorDark=" + this.f60342nufgyqmvbu + ")";
    }

    public final String wkgbmnqykc() {
        return this.f60345zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f60342nufgyqmvbu;
    }
}
