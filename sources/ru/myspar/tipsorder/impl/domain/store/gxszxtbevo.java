package ru.myspar.tipsorder.impl.domain.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.tipsorder.impl.domain.model.TipsOrderParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TipsOrderParams f104549iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(TipsOrderParams params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f104549iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f104549iobyxmoadg, ((eablkybsjg) obj).f104549iobyxmoadg);
        }

        public int hashCode() {
            return this.f104549iobyxmoadg.hashCode();
        }

        public final TipsOrderParams iobyxmoadg() {
            return this.f104549iobyxmoadg;
        }

        public String toString() {
            return "SetTipsParams(params=" + this.f104549iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.tipsorder.impl.domain.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2531gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f104550iobyxmoadg;

        public C2531gxszxtbevo(boolean z13) {
            super(null);
            this.f104550iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2531gxszxtbevo) && this.f104550iobyxmoadg == ((C2531gxszxtbevo) obj).f104550iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f104550iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f104550iobyxmoadg;
        }

        public String toString() {
            return "SetTipsSending(flag=" + this.f104550iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104551iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 596290997;
        }

        public String toString() {
            return "Clear";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f104552iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            super(null);
            this.f104552iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f104552iobyxmoadg == ((lqeggnwhkg) obj).f104552iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f104552iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f104552iobyxmoadg;
        }

        public String toString() {
            return "SetVerify(flag=" + this.f104552iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104553iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String paymentId) {
            super(null);
            zdlpuopuiu.btonecajqb(paymentId, "paymentId");
            this.f104553iobyxmoadg = paymentId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104553iobyxmoadg, ((ppxfxbqfkf) obj).f104553iobyxmoadg);
        }

        public int hashCode() {
            return this.f104553iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104553iobyxmoadg;
        }

        public String toString() {
            return "SetPaymentMethod(paymentId=" + this.f104553iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104554iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tzroggbefp f104555zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String purposeCode, tzroggbefp value) {
            super(null);
            zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
            zdlpuopuiu.btonecajqb(value, "value");
            this.f104554iobyxmoadg = purposeCode;
            this.f104555zoijcleaow = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f104554iobyxmoadg, wkgbmnqykcVar.f104554iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104555zoijcleaow, wkgbmnqykcVar.f104555zoijcleaow);
        }

        public int hashCode() {
            return (this.f104554iobyxmoadg.hashCode() * 31) + this.f104555zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104554iobyxmoadg;
        }

        public String toString() {
            return "SetTipValue(purposeCode=" + this.f104554iobyxmoadg + ", value=" + this.f104555zoijcleaow + ")";
        }

        public final tzroggbefp zoijcleaow() {
            return this.f104555zoijcleaow;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TipsOrderStore$TipsMessage f104556iobyxmoadg;

        public zoijcleaow(TipsOrderStore$TipsMessage tipsOrderStore$TipsMessage) {
            super(null);
            this.f104556iobyxmoadg = tipsOrderStore$TipsMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104556iobyxmoadg, ((zoijcleaow) obj).f104556iobyxmoadg);
        }

        public int hashCode() {
            TipsOrderStore$TipsMessage tipsOrderStore$TipsMessage = this.f104556iobyxmoadg;
            if (tipsOrderStore$TipsMessage == null) {
                return 0;
            }
            return tipsOrderStore$TipsMessage.hashCode();
        }

        public final TipsOrderStore$TipsMessage iobyxmoadg() {
            return this.f104556iobyxmoadg;
        }

        public String toString() {
            return "SetMessage(message=" + this.f104556iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
