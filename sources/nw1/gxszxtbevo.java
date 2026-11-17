package nw1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final zoijcleaow f71280btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f71281dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lr0.zoijcleaow f71282eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f71283gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f71284iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Boolean f71285lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Boolean f71286nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f71287ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f71288wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f71289zoijcleaow;

    public gxszxtbevo(String phone, String name, String str, String dateOfBirth, lr0.zoijcleaow gender, String str2, Boolean bool, Boolean bool2, String str3, zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(dateOfBirth, "dateOfBirth");
        zdlpuopuiu.btonecajqb(gender, "gender");
        this.f71284iobyxmoadg = phone;
        this.f71289zoijcleaow = name;
        this.f71287ppxfxbqfkf = str;
        this.f71288wkgbmnqykc = dateOfBirth;
        this.f71282eablkybsjg = gender;
        this.f71283gxszxtbevo = str2;
        this.f71285lqeggnwhkg = bool;
        this.f71286nufgyqmvbu = bool2;
        this.f71281dxjokdxxww = str3;
        this.f71280btonecajqb = zoijcleaowVar;
    }

    public final String eablkybsjg() {
        return this.f71287ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f71284iobyxmoadg, gxszxtbevoVar.f71284iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71289zoijcleaow, gxszxtbevoVar.f71289zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f71287ppxfxbqfkf, gxszxtbevoVar.f71287ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f71288wkgbmnqykc, gxszxtbevoVar.f71288wkgbmnqykc) && this.f71282eablkybsjg == gxszxtbevoVar.f71282eablkybsjg && zdlpuopuiu.eablkybsjg(this.f71283gxszxtbevo, gxszxtbevoVar.f71283gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f71285lqeggnwhkg, gxszxtbevoVar.f71285lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f71286nufgyqmvbu, gxszxtbevoVar.f71286nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f71281dxjokdxxww, gxszxtbevoVar.f71281dxjokdxxww) && this.f71280btonecajqb == gxszxtbevoVar.f71280btonecajqb;
    }

    public final String gxszxtbevo() {
        return this.f71289zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = ((this.f71284iobyxmoadg.hashCode() * 31) + this.f71289zoijcleaow.hashCode()) * 31;
        String str = this.f71287ppxfxbqfkf;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f71288wkgbmnqykc.hashCode()) * 31) + this.f71282eablkybsjg.hashCode()) * 31;
        String str2 = this.f71283gxszxtbevo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f71285lqeggnwhkg;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f71286nufgyqmvbu;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f71281dxjokdxxww;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        zoijcleaow zoijcleaowVar = this.f71280btonecajqb;
        return iHashCode6 + (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f71281dxjokdxxww;
    }

    public final String lqeggnwhkg() {
        return this.f71284iobyxmoadg;
    }

    public final Boolean nufgyqmvbu() {
        return this.f71285lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f71283gxszxtbevo;
    }

    public String toString() {
        return "UserPersonalData(phone=" + this.f71284iobyxmoadg + ", name=" + this.f71289zoijcleaow + ", lastName=" + this.f71287ppxfxbqfkf + ", dateOfBirth=" + this.f71288wkgbmnqykc + ", gender=" + this.f71282eablkybsjg + ", email=" + this.f71283gxszxtbevo + ", isEmailConfirmed=" + this.f71285lqeggnwhkg + ", isEReceiptAccepted=" + this.f71286nufgyqmvbu + ", cardNumber=" + this.f71281dxjokdxxww + ", cardType=" + this.f71280btonecajqb + ")";
    }

    public final lr0.zoijcleaow wkgbmnqykc() {
        return this.f71282eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f71288wkgbmnqykc;
    }
}
