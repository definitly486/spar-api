package l90;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f61929iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f61930zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(boolean z13, String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f61929iobyxmoadg = z13;
            this.f61930zoijcleaow = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f61929iobyxmoadg == iobyxmoadgVar.f61929iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f61930zoijcleaow, iobyxmoadgVar.f61930zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f61929iobyxmoadg) * 31) + this.f61930zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f61930zoijcleaow;
        }

        public String toString() {
            return "EchecksEnabled(isEchecksChecked=" + this.f61929iobyxmoadg + ", email=" + this.f61930zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f61929iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f61931iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f61931iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f61931iobyxmoadg == ((ppxfxbqfkf) obj).f61931iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f61931iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f61931iobyxmoadg;
        }

        public String toString() {
            return "PrepareUi(isLoaderVisible=" + this.f61931iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f61932iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f61933zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String email, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f61932iobyxmoadg = email;
            this.f61933zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f61932iobyxmoadg, zoijcleaowVar.f61932iobyxmoadg) && this.f61933zoijcleaow == zoijcleaowVar.f61933zoijcleaow;
        }

        public int hashCode() {
            return (this.f61932iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f61933zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f61933zoijcleaow;
        }

        public String toString() {
            return "InfoUpdated(email=" + this.f61932iobyxmoadg + ", digitalChecks=" + this.f61933zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f61932iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
