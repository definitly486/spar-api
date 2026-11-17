package j8;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo extends wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f50839iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Drawable f50840zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f50841iobyxmoadg;

        static {
            int[] iArr = new int[btonecajqb.values().length];
            try {
                iArr[btonecajqb.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[btonecajqb.CLEARED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[btonecajqb.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[btonecajqb.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f50841iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(btonecajqb status, Drawable drawable) {
        super(null);
        zdlpuopuiu.btonecajqb(status, "status");
        this.f50839iobyxmoadg = status;
        this.f50840zoijcleaow = drawable;
        int i13 = iobyxmoadg.f50841iobyxmoadg[iobyxmoadg().ordinal()];
        if (i13 == 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 != 2 && i13 != 3 && i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f50839iobyxmoadg == gxszxtbevoVar.f50839iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f50840zoijcleaow, gxszxtbevoVar.f50840zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f50839iobyxmoadg.hashCode() * 31;
        Drawable drawable = this.f50840zoijcleaow;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    @Override // j8.wkgbmnqykc
    public btonecajqb iobyxmoadg() {
        return this.f50839iobyxmoadg;
    }

    public String toString() {
        return "Placeholder(status=" + this.f50839iobyxmoadg + ", placeholder=" + this.f50840zoijcleaow + ')';
    }

    public final Drawable zoijcleaow() {
        return this.f50840zoijcleaow;
    }
}
