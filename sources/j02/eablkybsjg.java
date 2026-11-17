package j02;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f50438cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f50439iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f50440jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f50441yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(String title, int i13, String subtitle, boolean z13) {
        super(title, null);
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        this.f50441yggfygwlhe = title;
        this.f50440jyumaefscl = i13;
        this.f50439iwizpuwonk = subtitle;
        this.f50438cqumvgiudr = z13;
    }

    public static /* synthetic */ eablkybsjg wkgbmnqykc(eablkybsjg eablkybsjgVar, String str, int i13, String str2, boolean z13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = eablkybsjgVar.f50441yggfygwlhe;
        }
        if ((i14 & 2) != 0) {
            i13 = eablkybsjgVar.f50440jyumaefscl;
        }
        if ((i14 & 4) != 0) {
            str2 = eablkybsjgVar.f50439iwizpuwonk;
        }
        if ((i14 & 8) != 0) {
            z13 = eablkybsjgVar.f50438cqumvgiudr;
        }
        return eablkybsjgVar.iobyxmoadg(str, i13, str2, z13);
    }

    public final boolean dxjokdxxww() {
        return this.f50438cqumvgiudr;
    }

    public final int eablkybsjg() {
        return this.f50440jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f50441yggfygwlhe, eablkybsjgVar.f50441yggfygwlhe) && this.f50440jyumaefscl == eablkybsjgVar.f50440jyumaefscl && zdlpuopuiu.eablkybsjg(this.f50439iwizpuwonk, eablkybsjgVar.f50439iwizpuwonk) && this.f50438cqumvgiudr == eablkybsjgVar.f50438cqumvgiudr;
    }

    public int hashCode() {
        return (((((this.f50441yggfygwlhe.hashCode() * 31) + Integer.hashCode(this.f50440jyumaefscl)) * 31) + this.f50439iwizpuwonk.hashCode()) * 31) + Boolean.hashCode(this.f50438cqumvgiudr);
    }

    public final eablkybsjg iobyxmoadg(String title, int i13, String subtitle, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        return new eablkybsjg(title, i13, subtitle, z13);
    }

    public final String lqeggnwhkg() {
        return this.f50439iwizpuwonk;
    }

    public final String nufgyqmvbu() {
        return this.f50441yggfygwlhe;
    }

    public String toString() {
        return "RatingItemUiModel(title=" + this.f50441yggfygwlhe + ", rating=" + this.f50440jyumaefscl + ", subtitle=" + this.f50439iwizpuwonk + ", isSubtitleVisible=" + this.f50438cqumvgiudr + ")";
    }
}
