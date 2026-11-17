package tk;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f110757ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f110758iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int[] f110759zoijcleaow = new int[10];

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public final int dxjokdxxww() {
        return Integer.bitCount(this.f110758iobyxmoadg);
    }

    public final int eablkybsjg(int i13) {
        return (this.f110758iobyxmoadg & 32) != 0 ? this.f110759zoijcleaow[5] : i13;
    }

    public final boolean gxszxtbevo(int i13) {
        return ((1 << i13) & this.f110758iobyxmoadg) != 0;
    }

    public final int iobyxmoadg(int i13) {
        return this.f110759zoijcleaow[i13];
    }

    public final void lqeggnwhkg(draadjrbmk other) {
        zdlpuopuiu.btonecajqb(other, "other");
        for (int i13 = 0; i13 < 10; i13++) {
            if (other.gxszxtbevo(i13)) {
                nufgyqmvbu(i13, other.iobyxmoadg(i13));
            }
        }
    }

    public final draadjrbmk nufgyqmvbu(int i13, int i14) {
        if (i13 >= 0) {
            int[] iArr = this.f110759zoijcleaow;
            if (i13 < iArr.length) {
                this.f110758iobyxmoadg = (1 << i13) | this.f110758iobyxmoadg;
                iArr[i13] = i14;
            }
        }
        return this;
    }

    public final int ppxfxbqfkf() {
        if ((this.f110758iobyxmoadg & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            return this.f110759zoijcleaow[7];
        }
        return 65535;
    }

    public final int wkgbmnqykc() {
        if ((this.f110758iobyxmoadg & 16) != 0) {
            return this.f110759zoijcleaow[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int zoijcleaow() {
        if ((this.f110758iobyxmoadg & 2) != 0) {
            return this.f110759zoijcleaow[1];
        }
        return -1;
    }
}
