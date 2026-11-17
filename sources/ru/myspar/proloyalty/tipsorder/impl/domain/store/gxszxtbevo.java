package ru.myspar.proloyalty.tipsorder.impl.domain.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.TipsOrderParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TipsOrderParams f101912iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(TipsOrderParams params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f101912iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f101912iobyxmoadg, ((eablkybsjg) obj).f101912iobyxmoadg);
        }

        public int hashCode() {
            return this.f101912iobyxmoadg.hashCode();
        }

        public final TipsOrderParams iobyxmoadg() {
            return this.f101912iobyxmoadg;
        }

        public String toString() {
            return "SetTipsParams(params=" + this.f101912iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.tipsorder.impl.domain.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2453gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f101913iobyxmoadg;

        public C2453gxszxtbevo(boolean z13) {
            super(null);
            this.f101913iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2453gxszxtbevo) && this.f101913iobyxmoadg == ((C2453gxszxtbevo) obj).f101913iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f101913iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f101913iobyxmoadg;
        }

        public String toString() {
            return "SetTipsSending(flag=" + this.f101913iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f101914iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1004775218;
        }

        public String toString() {
            return "Clear";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f101915iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            super(null);
            this.f101915iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f101915iobyxmoadg == ((lqeggnwhkg) obj).f101915iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f101915iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f101915iobyxmoadg;
        }

        public String toString() {
            return "SetVerify(flag=" + this.f101915iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101916iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String paymentId) {
            super(null);
            zdlpuopuiu.btonecajqb(paymentId, "paymentId");
            this.f101916iobyxmoadg = paymentId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f101916iobyxmoadg, ((ppxfxbqfkf) obj).f101916iobyxmoadg);
        }

        public int hashCode() {
            return this.f101916iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101916iobyxmoadg;
        }

        public String toString() {
            return "SetPaymentMethod(paymentId=" + this.f101916iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101917iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tzroggbefp f101918zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String purposeCode, tzroggbefp value) {
            super(null);
            zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
            zdlpuopuiu.btonecajqb(value, "value");
            this.f101917iobyxmoadg = purposeCode;
            this.f101918zoijcleaow = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f101917iobyxmoadg, wkgbmnqykcVar.f101917iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101918zoijcleaow, wkgbmnqykcVar.f101918zoijcleaow);
        }

        public int hashCode() {
            return (this.f101917iobyxmoadg.hashCode() * 31) + this.f101918zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101917iobyxmoadg;
        }

        public String toString() {
            return "SetTipValue(purposeCode=" + this.f101917iobyxmoadg + ", value=" + this.f101918zoijcleaow + ")";
        }

        public final tzroggbefp zoijcleaow() {
            return this.f101918zoijcleaow;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TipsOrderStore$TipsMessage f101919iobyxmoadg;

        public zoijcleaow(TipsOrderStore$TipsMessage tipsOrderStore$TipsMessage) {
            super(null);
            this.f101919iobyxmoadg = tipsOrderStore$TipsMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f101919iobyxmoadg, ((zoijcleaow) obj).f101919iobyxmoadg);
        }

        public int hashCode() {
            TipsOrderStore$TipsMessage tipsOrderStore$TipsMessage = this.f101919iobyxmoadg;
            if (tipsOrderStore$TipsMessage == null) {
                return 0;
            }
            return tipsOrderStore$TipsMessage.hashCode();
        }

        public final TipsOrderStore$TipsMessage iobyxmoadg() {
            return this.f101919iobyxmoadg;
        }

        public String toString() {
            return "SetMessage(message=" + this.f101919iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
