package s22;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.amountproduct.partial.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f105230iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String warningMessage) {
            super(null);
            zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
            this.f105230iobyxmoadg = warningMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f105230iobyxmoadg, ((eablkybsjg) obj).f105230iobyxmoadg);
        }

        public int hashCode() {
            return this.f105230iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f105230iobyxmoadg;
        }

        public String toString() {
            return "WarningMessageChanged(warningMessage=" + this.f105230iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f105231iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f105231iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f105231iobyxmoadg == ((iobyxmoadg) obj).f105231iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f105231iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f105231iobyxmoadg;
        }

        public String toString() {
            return "AllowChangeQuantityChanged(isAllowed=" + this.f105231iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f105232iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f105232iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f105232iobyxmoadg == ((ppxfxbqfkf) obj).f105232iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f105232iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f105232iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f105232iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f22.iobyxmoadg f105233iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(f22.iobyxmoadg amountMode) {
            super(null);
            zdlpuopuiu.btonecajqb(amountMode, "amountMode");
            this.f105233iobyxmoadg = amountMode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f105233iobyxmoadg == ((wkgbmnqykc) obj).f105233iobyxmoadg;
        }

        public int hashCode() {
            return this.f105233iobyxmoadg.hashCode();
        }

        public final f22.iobyxmoadg iobyxmoadg() {
            return this.f105233iobyxmoadg;
        }

        public String toString() {
            return "ScanGoAmountModeChanged(amountMode=" + this.f105233iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State f105234iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(State newState) {
            super(null);
            zdlpuopuiu.btonecajqb(newState, "newState");
            this.f105234iobyxmoadg = newState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f105234iobyxmoadg, ((zoijcleaow) obj).f105234iobyxmoadg);
        }

        public int hashCode() {
            return this.f105234iobyxmoadg.hashCode();
        }

        public final State iobyxmoadg() {
            return this.f105234iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(newState=" + this.f105234iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
