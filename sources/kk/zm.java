package kk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f59602iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f59603ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Integer f59604wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final List f59605zoijcleaow;

    public zm(String str, List list, String str2, Integer num) {
        this.f59602iobyxmoadg = str;
        this.f59605zoijcleaow = list;
        this.f59603ppxfxbqfkf = str2;
        this.f59604wkgbmnqykc = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm)) {
            return false;
        }
        zm zmVar = (zm) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59602iobyxmoadg, zmVar.f59602iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59605zoijcleaow, zmVar.f59605zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59603ppxfxbqfkf, zmVar.f59603ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59604wkgbmnqykc, zmVar.f59604wkgbmnqykc);
    }

    public final int hashCode() {
        String str = this.f59602iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f59605zoijcleaow;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f59603ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f59604wkgbmnqykc;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ExchangeTokenResponse(exchangeToken=" + this.f59602iobyxmoadg + ", scope=" + this.f59605zoijcleaow + ", tokenType=" + this.f59603ppxfxbqfkf + ", expiresIn=" + this.f59604wkgbmnqykc + ")";
    }
}
