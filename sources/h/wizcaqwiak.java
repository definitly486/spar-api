package h;

import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wizcaqwiak extends a {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f38976btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final long f38977dxjokdxxww;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f38978gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f38979lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final long f38980nufgyqmvbu;

    public /* synthetic */ wizcaqwiak(List list, List list2, long j13, long j14, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(list, list2, j13, j14, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wizcaqwiak)) {
            return false;
        }
        wizcaqwiak wizcaqwiakVar = (wizcaqwiak) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f38978gxszxtbevo, wizcaqwiakVar.f38978gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f38979lqeggnwhkg, wizcaqwiakVar.f38979lqeggnwhkg) && g.eablkybsjg.btonecajqb(this.f38980nufgyqmvbu, wizcaqwiakVar.f38980nufgyqmvbu) && g.eablkybsjg.btonecajqb(this.f38977dxjokdxxww, wizcaqwiakVar.f38977dxjokdxxww) && i.gxszxtbevo(this.f38976btonecajqb, wizcaqwiakVar.f38976btonecajqb);
    }

    public int hashCode() {
        int iHashCode = this.f38978gxszxtbevo.hashCode() * 31;
        List list = this.f38979lqeggnwhkg;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + g.eablkybsjg.ojitshcjhn(this.f38980nufgyqmvbu)) * 31) + g.eablkybsjg.ojitshcjhn(this.f38977dxjokdxxww)) * 31) + i.lqeggnwhkg(this.f38976btonecajqb);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (((((this.f38980nufgyqmvbu & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) g.eablkybsjg.kcexrzcfyt(this.f38980nufgyqmvbu)) + ", ";
        } else {
            str = "";
        }
        if ((((9187343241974906880L ^ (this.f38977dxjokdxxww & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) g.eablkybsjg.kcexrzcfyt(this.f38977dxjokdxxww)) + ", ";
        }
        return "LinearGradient(colors=" + this.f38978gxszxtbevo + ", stops=" + this.f38979lqeggnwhkg + ", " + str + str2 + "tileMode=" + ((Object) i.nufgyqmvbu(this.f38976btonecajqb)) + ')';
    }

    @Override // h.a
    public Shader zoijcleaow(long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f38980nufgyqmvbu >> 32)) == Float.POSITIVE_INFINITY ? j13 >> 32 : this.f38980nufgyqmvbu >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f38980nufgyqmvbu & 4294967295L)) == Float.POSITIVE_INFINITY ? j13 & 4294967295L : this.f38980nufgyqmvbu & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f38977dxjokdxxww >> 32)) == Float.POSITIVE_INFINITY ? j13 >> 32 : this.f38977dxjokdxxww >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f38977dxjokdxxww & 4294967295L)) == Float.POSITIVE_INFINITY ? j13 & 4294967295L : this.f38977dxjokdxxww & 4294967295L));
        List list = this.f38978gxszxtbevo;
        List list2 = this.f38979lqeggnwhkg;
        return b.iobyxmoadg(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)), g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32)), list, list2, this.f38976btonecajqb);
    }

    private wizcaqwiak(List list, List list2, long j13, long j14, int i13) {
        this.f38978gxszxtbevo = list;
        this.f38979lqeggnwhkg = list2;
        this.f38980nufgyqmvbu = j13;
        this.f38977dxjokdxxww = j14;
        this.f38976btonecajqb = i13;
    }
}
