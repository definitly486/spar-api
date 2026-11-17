package j8;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu extends wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f50843iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f50844ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final l8.iobyxmoadg f50845wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f50846zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f50847iobyxmoadg;

        static {
            int[] iArr = new int[btonecajqb.values().length];
            try {
                iArr[btonecajqb.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[btonecajqb.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[btonecajqb.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[btonecajqb.CLEARED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f50847iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(btonecajqb status, Object obj, boolean z13, l8.iobyxmoadg dataSource) {
        super(null);
        zdlpuopuiu.btonecajqb(status, "status");
        zdlpuopuiu.btonecajqb(dataSource, "dataSource");
        this.f50843iobyxmoadg = status;
        this.f50846zoijcleaow = obj;
        this.f50844ppxfxbqfkf = z13;
        this.f50845wkgbmnqykc = dataSource;
        int i13 = iobyxmoadg.f50847iobyxmoadg[iobyxmoadg().ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            return;
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f50843iobyxmoadg == nufgyqmvbuVar.f50843iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f50846zoijcleaow, nufgyqmvbuVar.f50846zoijcleaow) && this.f50844ppxfxbqfkf == nufgyqmvbuVar.f50844ppxfxbqfkf && this.f50845wkgbmnqykc == nufgyqmvbuVar.f50845wkgbmnqykc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = this.f50843iobyxmoadg.hashCode() * 31;
        Object obj = this.f50846zoijcleaow;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        boolean z13 = this.f50844ppxfxbqfkf;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return ((iHashCode2 + r13) * 31) + this.f50845wkgbmnqykc.hashCode();
    }

    @Override // j8.wkgbmnqykc
    public btonecajqb iobyxmoadg() {
        return this.f50843iobyxmoadg;
    }

    public final l8.iobyxmoadg ppxfxbqfkf() {
        return this.f50845wkgbmnqykc;
    }

    public String toString() {
        return "Resource(status=" + this.f50843iobyxmoadg + ", resource=" + this.f50846zoijcleaow + ", isFirstResource=" + this.f50844ppxfxbqfkf + ", dataSource=" + this.f50845wkgbmnqykc + ')';
    }

    public final Object wkgbmnqykc() {
        return this.f50846zoijcleaow;
    }

    public final nufgyqmvbu zoijcleaow() {
        return new nufgyqmvbu(btonecajqb.FAILED, this.f50846zoijcleaow, this.f50844ppxfxbqfkf, this.f50845wkgbmnqykc);
    }
}
