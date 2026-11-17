package gi0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f37527iobyxmoadg;

        public btonecajqb(String groupId) {
            zdlpuopuiu.btonecajqb(groupId, "groupId");
            this.f37527iobyxmoadg = groupId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f37527iobyxmoadg, ((btonecajqb) obj).f37527iobyxmoadg);
        }

        public int hashCode() {
            return this.f37527iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f37527iobyxmoadg;
        }

        public String toString() {
            return "SelectGroup(groupId=" + this.f37527iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f37528iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ei0.zoijcleaow f37529zoijcleaow;

        public dxjokdxxww(String itemId, ei0.zoijcleaow type) {
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            zdlpuopuiu.btonecajqb(type, "type");
            this.f37528iobyxmoadg = itemId;
            this.f37529zoijcleaow = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f37528iobyxmoadg, dxjokdxxwwVar.f37528iobyxmoadg) && this.f37529zoijcleaow == dxjokdxxwwVar.f37529zoijcleaow;
        }

        public int hashCode() {
            return (this.f37528iobyxmoadg.hashCode() * 31) + this.f37529zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f37528iobyxmoadg;
        }

        public String toString() {
            return "LoadPayload(itemId=" + this.f37528iobyxmoadg + ", type=" + this.f37529zoijcleaow + ")";
        }

        public final ei0.zoijcleaow zoijcleaow() {
            return this.f37529zoijcleaow;
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f37530iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1173146678;
        }

        public String toString() {
            return "ClearItems";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f37531iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -720481512;
        }

        public String toString() {
            return "ClearPayload";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ei0.iobyxmoadg f37532iobyxmoadg;

        public iobyxmoadg(ei0.iobyxmoadg type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f37532iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f37532iobyxmoadg == ((iobyxmoadg) obj).f37532iobyxmoadg;
        }

        public int hashCode() {
            return this.f37532iobyxmoadg.hashCode();
        }

        public final ei0.iobyxmoadg iobyxmoadg() {
            return this.f37532iobyxmoadg;
        }

        public String toString() {
            return "ChangePanelType(type=" + this.f37532iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f37533iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 1212774721;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f37534iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -1398369578;
        }

        public String toString() {
            return "CreateLogForPayload";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f37535iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -2099971400;
        }

        public String toString() {
            return "ChangePayloadBodyEnabled";
        }
    }

    /* JADX INFO: renamed from: gi0.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0849wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0849wkgbmnqykc f37536iobyxmoadg = new C0849wkgbmnqykc();

        private C0849wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0849wkgbmnqykc);
        }

        public int hashCode() {
            return -401365310;
        }

        public String toString() {
            return "ChangePayloadHeadersEnabled";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ei0.zoijcleaow f37537iobyxmoadg;

        public zoijcleaow(ei0.zoijcleaow type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f37537iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f37537iobyxmoadg == ((zoijcleaow) obj).f37537iobyxmoadg;
        }

        public int hashCode() {
            return this.f37537iobyxmoadg.hashCode();
        }

        public final ei0.zoijcleaow iobyxmoadg() {
            return this.f37537iobyxmoadg;
        }

        public String toString() {
            return "ChangePayload(type=" + this.f37537iobyxmoadg + ")";
        }
    }
}
