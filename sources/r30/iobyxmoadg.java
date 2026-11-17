package r30;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends Throwable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f81572yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f81573zdlpuopuiu;

    public iobyxmoadg(String str, String str2) {
        super(str);
        this.f81573zdlpuopuiu = str;
        this.f81572yggfygwlhe = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f81573zdlpuopuiu, iobyxmoadgVar.f81573zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f81572yggfygwlhe, iobyxmoadgVar.f81572yggfygwlhe);
    }

    public int hashCode() {
        String str = this.f81573zdlpuopuiu;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81572yggfygwlhe;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "LoymaxPopupException(errorMessage=" + this.f81573zdlpuopuiu + ", code=" + this.f81572yggfygwlhe + ")";
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : str2);
    }
}
