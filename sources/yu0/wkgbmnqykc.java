package yu0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f126681iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f126682zoijcleaow;

        public iobyxmoadg(String paymentCode, String change) {
            zdlpuopuiu.btonecajqb(paymentCode, "paymentCode");
            zdlpuopuiu.btonecajqb(change, "change");
            this.f126681iobyxmoadg = paymentCode;
            this.f126682zoijcleaow = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f126681iobyxmoadg, iobyxmoadgVar.f126681iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f126682zoijcleaow, iobyxmoadgVar.f126682zoijcleaow);
        }

        public int hashCode() {
            return (this.f126681iobyxmoadg.hashCode() * 31) + this.f126682zoijcleaow.hashCode();
        }

        public String iobyxmoadg() {
            return this.f126682zoijcleaow;
        }

        public String toString() {
            return "Basket(paymentCode=" + this.f126681iobyxmoadg + ", change=" + this.f126682zoijcleaow + ")";
        }

        public String zoijcleaow() {
            return this.f126681iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f126683iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f126684ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f126685zoijcleaow;

        public ppxfxbqfkf(String orderId, String paymentCode, String change) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(paymentCode, "paymentCode");
            zdlpuopuiu.btonecajqb(change, "change");
            this.f126683iobyxmoadg = orderId;
            this.f126685zoijcleaow = paymentCode;
            this.f126684ppxfxbqfkf = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f126683iobyxmoadg, ppxfxbqfkfVar.f126683iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f126685zoijcleaow, ppxfxbqfkfVar.f126685zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f126684ppxfxbqfkf, ppxfxbqfkfVar.f126684ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f126683iobyxmoadg.hashCode() * 31) + this.f126685zoijcleaow.hashCode()) * 31) + this.f126684ppxfxbqfkf.hashCode();
        }

        public String iobyxmoadg() {
            return this.f126684ppxfxbqfkf;
        }

        public String ppxfxbqfkf() {
            return this.f126685zoijcleaow;
        }

        public String toString() {
            return "SpecificOrder(orderId=" + this.f126683iobyxmoadg + ", paymentCode=" + this.f126685zoijcleaow + ", change=" + this.f126684ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f126683iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: yu0.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C3230wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f126686iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f126687ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f126688wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f126689zoijcleaow;

        public C3230wkgbmnqykc(String subscriptionId, String str, String paymentCode) {
            zdlpuopuiu.btonecajqb(subscriptionId, "subscriptionId");
            zdlpuopuiu.btonecajqb(paymentCode, "paymentCode");
            this.f126686iobyxmoadg = subscriptionId;
            this.f126689zoijcleaow = str;
            this.f126687ppxfxbqfkf = paymentCode;
            this.f126688wkgbmnqykc = "";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3230wkgbmnqykc)) {
                return false;
            }
            C3230wkgbmnqykc c3230wkgbmnqykc = (C3230wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f126686iobyxmoadg, c3230wkgbmnqykc.f126686iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f126689zoijcleaow, c3230wkgbmnqykc.f126689zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f126687ppxfxbqfkf, c3230wkgbmnqykc.f126687ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f126686iobyxmoadg.hashCode() * 31;
            String str = this.f126689zoijcleaow;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f126687ppxfxbqfkf.hashCode();
        }

        public String iobyxmoadg() {
            return this.f126687ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f126686iobyxmoadg;
        }

        public String toString() {
            return "Subscriptions(subscriptionId=" + this.f126686iobyxmoadg + ", promoCode=" + this.f126689zoijcleaow + ", paymentCode=" + this.f126687ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f126689zoijcleaow;
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f126690iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f126691ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f126692zoijcleaow;

        public zoijcleaow(String orderId, String paymentCode, String change) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(paymentCode, "paymentCode");
            zdlpuopuiu.btonecajqb(change, "change");
            this.f126690iobyxmoadg = orderId;
            this.f126692zoijcleaow = paymentCode;
            this.f126691ppxfxbqfkf = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f126690iobyxmoadg, zoijcleaowVar.f126690iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f126692zoijcleaow, zoijcleaowVar.f126692zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f126691ppxfxbqfkf, zoijcleaowVar.f126691ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f126690iobyxmoadg.hashCode() * 31) + this.f126692zoijcleaow.hashCode()) * 31) + this.f126691ppxfxbqfkf.hashCode();
        }

        public String iobyxmoadg() {
            return this.f126691ppxfxbqfkf;
        }

        public String ppxfxbqfkf() {
            return this.f126692zoijcleaow;
        }

        public String toString() {
            return "EditedOrder(orderId=" + this.f126690iobyxmoadg + ", paymentCode=" + this.f126692zoijcleaow + ", change=" + this.f126691ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f126690iobyxmoadg;
        }
    }
}
