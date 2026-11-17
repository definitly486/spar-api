package gi0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.networkpanel.impl.domain.model.PayloadHolder;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f37500iobyxmoadg;

        public eablkybsjg(List items) {
            zdlpuopuiu.btonecajqb(items, "items");
            this.f37500iobyxmoadg = items;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f37500iobyxmoadg, ((eablkybsjg) obj).f37500iobyxmoadg);
        }

        public int hashCode() {
            return this.f37500iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f37500iobyxmoadg;
        }

        public String toString() {
            return "SetNetworkItems(items=" + this.f37500iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: gi0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C0847gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ei0.iobyxmoadg f37501iobyxmoadg;

        public C0847gxszxtbevo(ei0.iobyxmoadg type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f37501iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0847gxszxtbevo) && this.f37501iobyxmoadg == ((C0847gxszxtbevo) obj).f37501iobyxmoadg;
        }

        public int hashCode() {
            return this.f37501iobyxmoadg.hashCode();
        }

        public final ei0.iobyxmoadg iobyxmoadg() {
            return this.f37501iobyxmoadg;
        }

        public String toString() {
            return "SetPanelType(type=" + this.f37501iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f37502iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -776405417;
        }

        public String toString() {
            return "Clear";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PayloadHolder f37503iobyxmoadg;

        public lqeggnwhkg(PayloadHolder payloadHolder) {
            this.f37503iobyxmoadg = payloadHolder;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f37503iobyxmoadg, ((lqeggnwhkg) obj).f37503iobyxmoadg);
        }

        public int hashCode() {
            PayloadHolder payloadHolder = this.f37503iobyxmoadg;
            if (payloadHolder == null) {
                return 0;
            }
            return payloadHolder.hashCode();
        }

        public final PayloadHolder iobyxmoadg() {
            return this.f37503iobyxmoadg;
        }

        public String toString() {
            return "SetPayload(payload=" + this.f37503iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f37504iobyxmoadg;

        public ppxfxbqfkf(String groupId) {
            zdlpuopuiu.btonecajqb(groupId, "groupId");
            this.f37504iobyxmoadg = groupId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f37504iobyxmoadg, ((ppxfxbqfkf) obj).f37504iobyxmoadg);
        }

        public int hashCode() {
            return this.f37504iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f37504iobyxmoadg;
        }

        public String toString() {
            return "SetGroup(groupId=" + this.f37504iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f37505iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f37505iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f37505iobyxmoadg == ((wkgbmnqykc) obj).f37505iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f37505iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f37505iobyxmoadg;
        }

        public String toString() {
            return "SetHeadersEnabled(enable=" + this.f37505iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f37506iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f37506iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f37506iobyxmoadg == ((zoijcleaow) obj).f37506iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f37506iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f37506iobyxmoadg;
        }

        public String toString() {
            return "SetBodyEnabled(enable=" + this.f37506iobyxmoadg + ")";
        }
    }
}
