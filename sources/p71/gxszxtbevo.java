package p71;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f75915iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f75916zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(boolean z13, String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f75915iobyxmoadg = z13;
            this.f75916zoijcleaow = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f75915iobyxmoadg == iobyxmoadgVar.f75915iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f75916zoijcleaow, iobyxmoadgVar.f75916zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f75915iobyxmoadg) * 31) + this.f75916zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75916zoijcleaow;
        }

        public String toString() {
            return "EchecksEnabled(isEchecksChecked=" + this.f75915iobyxmoadg + ", email=" + this.f75916zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f75915iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f75917iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f75917iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f75917iobyxmoadg == ((ppxfxbqfkf) obj).f75917iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f75917iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f75917iobyxmoadg;
        }

        public String toString() {
            return "PrepareUi(isLoaderVisible=" + this.f75917iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75918iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f75919zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String email, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f75918iobyxmoadg = email;
            this.f75919zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f75918iobyxmoadg, zoijcleaowVar.f75918iobyxmoadg) && this.f75919zoijcleaow == zoijcleaowVar.f75919zoijcleaow;
        }

        public int hashCode() {
            return (this.f75918iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f75919zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f75919zoijcleaow;
        }

        public String toString() {
            return "InfoUpdated(email=" + this.f75918iobyxmoadg + ", digitalChecks=" + this.f75919zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f75918iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
