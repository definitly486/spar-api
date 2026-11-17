package wo0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ojitshcjhn implements gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f120322eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f120323gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f120324iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f120325lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f120326nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f120327ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final k21.ojitshcjhn f120328wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f120329zoijcleaow;

    public ojitshcjhn(String str, String str2, String str3, k21.ojitshcjhn ojitshcjhnVar, String str4, String str5, String str6, String str7) {
        this.f120324iobyxmoadg = str;
        this.f120329zoijcleaow = str2;
        this.f120327ppxfxbqfkf = str3;
        this.f120328wkgbmnqykc = ojitshcjhnVar;
        this.f120322eablkybsjg = str4;
        this.f120323gxszxtbevo = str5;
        this.f120325lqeggnwhkg = str6;
        this.f120326nufgyqmvbu = str7;
    }

    public final String eablkybsjg() {
        return this.f120327ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojitshcjhn)) {
            return false;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
        return zdlpuopuiu.eablkybsjg(this.f120324iobyxmoadg, ojitshcjhnVar.f120324iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f120329zoijcleaow, ojitshcjhnVar.f120329zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f120327ppxfxbqfkf, ojitshcjhnVar.f120327ppxfxbqfkf) && this.f120328wkgbmnqykc == ojitshcjhnVar.f120328wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f120322eablkybsjg, ojitshcjhnVar.f120322eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f120323gxszxtbevo, ojitshcjhnVar.f120323gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f120325lqeggnwhkg, ojitshcjhnVar.f120325lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f120326nufgyqmvbu, ojitshcjhnVar.f120326nufgyqmvbu);
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return "CartLoadInfoUiModel";
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.LOAD_INFO;
    }

    public final k21.ojitshcjhn gxszxtbevo() {
        return this.f120328wkgbmnqykc;
    }

    public int hashCode() {
        String str = this.f120324iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120329zoijcleaow;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120327ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        k21.ojitshcjhn ojitshcjhnVar = this.f120328wkgbmnqykc;
        int iHashCode4 = (iHashCode3 + (ojitshcjhnVar == null ? 0 : ojitshcjhnVar.hashCode())) * 31;
        String str4 = this.f120322eablkybsjg;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f120323gxszxtbevo;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f120325lqeggnwhkg;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f120326nufgyqmvbu;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f120323gxszxtbevo;
    }

    public final String lqeggnwhkg() {
        return this.f120322eablkybsjg;
    }

    public final String nufgyqmvbu() {
        return this.f120324iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f120325lqeggnwhkg;
    }

    public String toString() {
        return "LoadInfoUiModel(title=" + this.f120324iobyxmoadg + ", description=" + this.f120329zoijcleaow + ", imageUrl=" + this.f120327ppxfxbqfkf + ", navlink=" + this.f120328wkgbmnqykc + ", reference=" + this.f120322eablkybsjg + ", adv=" + this.f120323gxszxtbevo + ", backgroundColorLight=" + this.f120325lqeggnwhkg + ", backgroundColorDark=" + this.f120326nufgyqmvbu + ")";
    }

    public final String wkgbmnqykc() {
        return this.f120329zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f120326nufgyqmvbu;
    }
}
