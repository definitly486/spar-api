package ru.myspar.proloyalty.tipsorder.impl.domain.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f101933iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1301011940;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f101934iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -507106244;
        }

        public String toString() {
            return "SendTips";
        }
    }

    public static abstract class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.tipsorder.impl.domain.store.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2455iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f101935iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2455iobyxmoadg(String paymentId) {
                super(null);
                zdlpuopuiu.btonecajqb(paymentId, "paymentId");
                this.f101935iobyxmoadg = paymentId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2455iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101935iobyxmoadg, ((C2455iobyxmoadg) obj).f101935iobyxmoadg);
            }

            public int hashCode() {
                return this.f101935iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f101935iobyxmoadg;
            }

            public String toString() {
                return "PaymentMethodValue(paymentId=" + this.f101935iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f101936iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final tzroggbefp f101937zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zoijcleaow(String purposeCode, tzroggbefp value) {
                super(null);
                zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
                zdlpuopuiu.btonecajqb(value, "value");
                this.f101936iobyxmoadg = purposeCode;
                this.f101937zoijcleaow = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f101936iobyxmoadg, zoijcleaowVar.f101936iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101937zoijcleaow, zoijcleaowVar.f101937zoijcleaow);
            }

            public int hashCode() {
                return (this.f101936iobyxmoadg.hashCode() * 31) + this.f101937zoijcleaow.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f101936iobyxmoadg;
            }

            public String toString() {
                return "TipsValue(purposeCode=" + this.f101936iobyxmoadg + ", value=" + this.f101937zoijcleaow + ")";
            }

            public final tzroggbefp zoijcleaow() {
                return this.f101937zoijcleaow;
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f101938iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 1060112385;
        }

        public String toString() {
            return "SuccessPay";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101939iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String scheme) {
            super(null);
            zdlpuopuiu.btonecajqb(scheme, "scheme");
            this.f101939iobyxmoadg = scheme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f101939iobyxmoadg, ((ppxfxbqfkf) obj).f101939iobyxmoadg);
        }

        public int hashCode() {
            return this.f101939iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101939iobyxmoadg;
        }

        public String toString() {
            return "ChooseSbpBank(scheme=" + this.f101939iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.tipsorder.impl.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2456wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2456wkgbmnqykc f101940iobyxmoadg = new C2456wkgbmnqykc();

        private C2456wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2456wkgbmnqykc);
        }

        public int hashCode() {
            return -1836635050;
        }

        public String toString() {
            return "ClearMessage";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f101941iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 612830405;
        }

        public String toString() {
            return "CheckVerify";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
