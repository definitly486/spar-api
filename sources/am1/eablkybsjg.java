package am1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f2249cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f2250iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f2251jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f2252yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(String title, int i13, String subtitle, boolean z13) {
        super(title, null);
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        this.f2252yggfygwlhe = title;
        this.f2251jyumaefscl = i13;
        this.f2250iwizpuwonk = subtitle;
        this.f2249cqumvgiudr = z13;
    }

    public static /* synthetic */ eablkybsjg wkgbmnqykc(eablkybsjg eablkybsjgVar, String str, int i13, String str2, boolean z13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = eablkybsjgVar.f2252yggfygwlhe;
        }
        if ((i14 & 2) != 0) {
            i13 = eablkybsjgVar.f2251jyumaefscl;
        }
        if ((i14 & 4) != 0) {
            str2 = eablkybsjgVar.f2250iwizpuwonk;
        }
        if ((i14 & 8) != 0) {
            z13 = eablkybsjgVar.f2249cqumvgiudr;
        }
        return eablkybsjgVar.iobyxmoadg(str, i13, str2, z13);
    }

    public final boolean dxjokdxxww() {
        return this.f2249cqumvgiudr;
    }

    public final int eablkybsjg() {
        return this.f2251jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f2252yggfygwlhe, eablkybsjgVar.f2252yggfygwlhe) && this.f2251jyumaefscl == eablkybsjgVar.f2251jyumaefscl && zdlpuopuiu.eablkybsjg(this.f2250iwizpuwonk, eablkybsjgVar.f2250iwizpuwonk) && this.f2249cqumvgiudr == eablkybsjgVar.f2249cqumvgiudr;
    }

    public int hashCode() {
        return (((((this.f2252yggfygwlhe.hashCode() * 31) + Integer.hashCode(this.f2251jyumaefscl)) * 31) + this.f2250iwizpuwonk.hashCode()) * 31) + Boolean.hashCode(this.f2249cqumvgiudr);
    }

    public final eablkybsjg iobyxmoadg(String title, int i13, String subtitle, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        return new eablkybsjg(title, i13, subtitle, z13);
    }

    public final String lqeggnwhkg() {
        return this.f2250iwizpuwonk;
    }

    public final String nufgyqmvbu() {
        return this.f2252yggfygwlhe;
    }

    public String toString() {
        return "RatingItemUiModel(title=" + this.f2252yggfygwlhe + ", rating=" + this.f2251jyumaefscl + ", subtitle=" + this.f2250iwizpuwonk + ", isSubtitleVisible=" + this.f2249cqumvgiudr + ")";
    }
}
