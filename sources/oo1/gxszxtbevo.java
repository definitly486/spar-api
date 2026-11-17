package oo1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f73311iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String warningMessage) {
            super(null);
            zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
            this.f73311iobyxmoadg = warningMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f73311iobyxmoadg, ((eablkybsjg) obj).f73311iobyxmoadg);
        }

        public int hashCode() {
            return this.f73311iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f73311iobyxmoadg;
        }

        public String toString() {
            return "WarningMessageChanged(warningMessage=" + this.f73311iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f73312iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f73312iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f73312iobyxmoadg == ((iobyxmoadg) obj).f73312iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f73312iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f73312iobyxmoadg;
        }

        public String toString() {
            return "AllowChangeQuantityChanged(isAllowed=" + this.f73312iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f73313iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f73313iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f73313iobyxmoadg == ((ppxfxbqfkf) obj).f73313iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f73313iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f73313iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f73313iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bo1.iobyxmoadg f73314iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(bo1.iobyxmoadg amountMode) {
            super(null);
            zdlpuopuiu.btonecajqb(amountMode, "amountMode");
            this.f73314iobyxmoadg = amountMode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f73314iobyxmoadg == ((wkgbmnqykc) obj).f73314iobyxmoadg;
        }

        public int hashCode() {
            return this.f73314iobyxmoadg.hashCode();
        }

        public final bo1.iobyxmoadg iobyxmoadg() {
            return this.f73314iobyxmoadg;
        }

        public String toString() {
            return "ScanGoAmountModeChanged(amountMode=" + this.f73314iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State f73315iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(State newState) {
            super(null);
            zdlpuopuiu.btonecajqb(newState, "newState");
            this.f73315iobyxmoadg = newState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f73315iobyxmoadg, ((zoijcleaow) obj).f73315iobyxmoadg);
        }

        public int hashCode() {
            return this.f73315iobyxmoadg.hashCode();
        }

        public final State iobyxmoadg() {
            return this.f73315iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(newState=" + this.f73315iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
