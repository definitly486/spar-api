package ru.myspar.proloyalty.dynamic_qr.impl.domain.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.card.domain.model.UserBalance;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f95921iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f95921iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f95921iobyxmoadg == ((iobyxmoadg) obj).f95921iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f95921iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f95921iobyxmoadg;
        }

        public String toString() {
            return "ChangeUserActiveDiscounts(hasActiveDiscount=" + this.f95921iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final DynamicQrCodeStore$QrType f95922iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(DynamicQrCodeStore$QrType qrType) {
            super(null);
            zdlpuopuiu.btonecajqb(qrType, "qrType");
            this.f95922iobyxmoadg = qrType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f95922iobyxmoadg, ((ppxfxbqfkf) obj).f95922iobyxmoadg);
        }

        public int hashCode() {
            return this.f95922iobyxmoadg.hashCode();
        }

        public final DynamicQrCodeStore$QrType iobyxmoadg() {
            return this.f95922iobyxmoadg;
        }

        public String toString() {
            return "SetQrType(qrType=" + this.f95922iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserBalance f95923iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(UserBalance userBalance) {
            super(null);
            zdlpuopuiu.btonecajqb(userBalance, "userBalance");
            this.f95923iobyxmoadg = userBalance;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f95923iobyxmoadg, ((wkgbmnqykc) obj).f95923iobyxmoadg);
        }

        public int hashCode() {
            return this.f95923iobyxmoadg.hashCode();
        }

        public final UserBalance iobyxmoadg() {
            return this.f95923iobyxmoadg;
        }

        public String toString() {
            return "SetUserBalance(userBalance=" + this.f95923iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f95924iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f95924iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f95924iobyxmoadg == ((zoijcleaow) obj).f95924iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f95924iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f95924iobyxmoadg;
        }

        public String toString() {
            return "SetLoading(isLoading=" + this.f95924iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
