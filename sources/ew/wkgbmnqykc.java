package ew;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f32238iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f32239zoijcleaow;

        public iobyxmoadg(String paymentCode, String change) {
            zdlpuopuiu.btonecajqb(paymentCode, "paymentCode");
            zdlpuopuiu.btonecajqb(change, "change");
            this.f32238iobyxmoadg = paymentCode;
            this.f32239zoijcleaow = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f32238iobyxmoadg, iobyxmoadgVar.f32238iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32239zoijcleaow, iobyxmoadgVar.f32239zoijcleaow);
        }

        public int hashCode() {
            return (this.f32238iobyxmoadg.hashCode() * 31) + this.f32239zoijcleaow.hashCode();
        }

        public String iobyxmoadg() {
            return this.f32239zoijcleaow;
        }

        public String toString() {
            return "Basket(paymentCode=" + this.f32238iobyxmoadg + ", change=" + this.f32239zoijcleaow + ")";
        }

        public String zoijcleaow() {
            return this.f32238iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f32240iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f32241ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f32242zoijcleaow;

        public ppxfxbqfkf(String orderId, String paymentCode, String change) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(paymentCode, "paymentCode");
            zdlpuopuiu.btonecajqb(change, "change");
            this.f32240iobyxmoadg = orderId;
            this.f32242zoijcleaow = paymentCode;
            this.f32241ppxfxbqfkf = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f32240iobyxmoadg, ppxfxbqfkfVar.f32240iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32242zoijcleaow, ppxfxbqfkfVar.f32242zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f32241ppxfxbqfkf, ppxfxbqfkfVar.f32241ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f32240iobyxmoadg.hashCode() * 31) + this.f32242zoijcleaow.hashCode()) * 31) + this.f32241ppxfxbqfkf.hashCode();
        }

        public String iobyxmoadg() {
            return this.f32241ppxfxbqfkf;
        }

        public String ppxfxbqfkf() {
            return this.f32242zoijcleaow;
        }

        public String toString() {
            return "SpecificOrder(orderId=" + this.f32240iobyxmoadg + ", paymentCode=" + this.f32242zoijcleaow + ", change=" + this.f32241ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f32240iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ew.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0696wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f32243iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f32244ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f32245wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f32246zoijcleaow;

        public C0696wkgbmnqykc(String subscriptionId, String str, String paymentCode) {
            zdlpuopuiu.btonecajqb(subscriptionId, "subscriptionId");
            zdlpuopuiu.btonecajqb(paymentCode, "paymentCode");
            this.f32243iobyxmoadg = subscriptionId;
            this.f32246zoijcleaow = str;
            this.f32244ppxfxbqfkf = paymentCode;
            this.f32245wkgbmnqykc = "";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0696wkgbmnqykc)) {
                return false;
            }
            C0696wkgbmnqykc c0696wkgbmnqykc = (C0696wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f32243iobyxmoadg, c0696wkgbmnqykc.f32243iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32246zoijcleaow, c0696wkgbmnqykc.f32246zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f32244ppxfxbqfkf, c0696wkgbmnqykc.f32244ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f32243iobyxmoadg.hashCode() * 31;
            String str = this.f32246zoijcleaow;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f32244ppxfxbqfkf.hashCode();
        }

        public String iobyxmoadg() {
            return this.f32244ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f32243iobyxmoadg;
        }

        public String toString() {
            return "Subscriptions(subscriptionId=" + this.f32243iobyxmoadg + ", promoCode=" + this.f32246zoijcleaow + ", paymentCode=" + this.f32244ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f32246zoijcleaow;
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f32247iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f32248ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f32249zoijcleaow;

        public zoijcleaow(String orderId, String paymentCode, String change) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(paymentCode, "paymentCode");
            zdlpuopuiu.btonecajqb(change, "change");
            this.f32247iobyxmoadg = orderId;
            this.f32249zoijcleaow = paymentCode;
            this.f32248ppxfxbqfkf = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f32247iobyxmoadg, zoijcleaowVar.f32247iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32249zoijcleaow, zoijcleaowVar.f32249zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f32248ppxfxbqfkf, zoijcleaowVar.f32248ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f32247iobyxmoadg.hashCode() * 31) + this.f32249zoijcleaow.hashCode()) * 31) + this.f32248ppxfxbqfkf.hashCode();
        }

        public String iobyxmoadg() {
            return this.f32248ppxfxbqfkf;
        }

        public String ppxfxbqfkf() {
            return this.f32249zoijcleaow;
        }

        public String toString() {
            return "EditedOrder(orderId=" + this.f32247iobyxmoadg + ", paymentCode=" + this.f32249zoijcleaow + ", change=" + this.f32248ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f32247iobyxmoadg;
        }
    }
}
