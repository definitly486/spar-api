package wd;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Long f119343eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Boolean f119344iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Integer f119345ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f119346wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Double f119347zoijcleaow;

    public eablkybsjg(Boolean bool, Double d13, Integer num, Integer num2, Long l13) {
        this.f119344iobyxmoadg = bool;
        this.f119347zoijcleaow = d13;
        this.f119345ppxfxbqfkf = num;
        this.f119346wkgbmnqykc = num2;
        this.f119343eablkybsjg = l13;
    }

    public final Double eablkybsjg() {
        return this.f119347zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f119344iobyxmoadg, eablkybsjgVar.f119344iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f119347zoijcleaow, eablkybsjgVar.f119347zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f119345ppxfxbqfkf, eablkybsjgVar.f119345ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f119346wkgbmnqykc, eablkybsjgVar.f119346wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f119343eablkybsjg, eablkybsjgVar.f119343eablkybsjg);
    }

    public int hashCode() {
        Boolean bool = this.f119344iobyxmoadg;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d13 = this.f119347zoijcleaow;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Integer num = this.f119345ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f119346wkgbmnqykc;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l13 = this.f119343eablkybsjg;
        return iHashCode4 + (l13 != null ? l13.hashCode() : 0);
    }

    public final Integer iobyxmoadg() {
        return this.f119346wkgbmnqykc;
    }

    public final Boolean ppxfxbqfkf() {
        return this.f119344iobyxmoadg;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f119344iobyxmoadg + ", sessionSamplingRate=" + this.f119347zoijcleaow + ", sessionRestartTimeout=" + this.f119345ppxfxbqfkf + ", cacheDuration=" + this.f119346wkgbmnqykc + ", cacheUpdatedTime=" + this.f119343eablkybsjg + ')';
    }

    public final Integer wkgbmnqykc() {
        return this.f119345ppxfxbqfkf;
    }

    public final Long zoijcleaow() {
        return this.f119343eablkybsjg;
    }
}
