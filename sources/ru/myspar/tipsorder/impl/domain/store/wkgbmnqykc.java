package ru.myspar.tipsorder.impl.domain.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f104570iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1709496161;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f104571iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -2018184487;
        }

        public String toString() {
            return "SendTips";
        }
    }

    public static abstract class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: ru.myspar.tipsorder.impl.domain.store.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2533iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f104572iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2533iobyxmoadg(String paymentId) {
                super(null);
                zdlpuopuiu.btonecajqb(paymentId, "paymentId");
                this.f104572iobyxmoadg = paymentId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2533iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104572iobyxmoadg, ((C2533iobyxmoadg) obj).f104572iobyxmoadg);
            }

            public int hashCode() {
                return this.f104572iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f104572iobyxmoadg;
            }

            public String toString() {
                return "PaymentMethodValue(paymentId=" + this.f104572iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f104573iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final tzroggbefp f104574zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zoijcleaow(String purposeCode, tzroggbefp value) {
                super(null);
                zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
                zdlpuopuiu.btonecajqb(value, "value");
                this.f104573iobyxmoadg = purposeCode;
                this.f104574zoijcleaow = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f104573iobyxmoadg, zoijcleaowVar.f104573iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104574zoijcleaow, zoijcleaowVar.f104574zoijcleaow);
            }

            public int hashCode() {
                return (this.f104573iobyxmoadg.hashCode() * 31) + this.f104574zoijcleaow.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f104573iobyxmoadg;
            }

            public String toString() {
                return "TipsValue(purposeCode=" + this.f104573iobyxmoadg + ", value=" + this.f104574zoijcleaow + ")";
            }

            public final tzroggbefp zoijcleaow() {
                return this.f104574zoijcleaow;
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
        public static final lqeggnwhkg f104575iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 612866910;
        }

        public String toString() {
            return "SuccessPay";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104576iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String scheme) {
            super(null);
            zdlpuopuiu.btonecajqb(scheme, "scheme");
            this.f104576iobyxmoadg = scheme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104576iobyxmoadg, ((ppxfxbqfkf) obj).f104576iobyxmoadg);
        }

        public int hashCode() {
            return this.f104576iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104576iobyxmoadg;
        }

        public String toString() {
            return "ChooseSbpBank(scheme=" + this.f104576iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.tipsorder.impl.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2534wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2534wkgbmnqykc f104577iobyxmoadg = new C2534wkgbmnqykc();

        private C2534wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2534wkgbmnqykc);
        }

        public int hashCode() {
            return -2142806925;
        }

        public String toString() {
            return "ClearMessage";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f104578iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -366877432;
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
