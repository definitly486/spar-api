package ru.myspar.dynamic_qr.impl.domain.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.dynamic_qr.impl.domain.models.DynamicQrCode;
import ru.myspar.user.models.UserCard;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final r80.iobyxmoadg f88145iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(r80.iobyxmoadg errorType) {
            super(null);
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            this.f88145iobyxmoadg = errorType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f88145iobyxmoadg == ((eablkybsjg) obj).f88145iobyxmoadg;
        }

        public int hashCode() {
            return this.f88145iobyxmoadg.hashCode();
        }

        public final r80.iobyxmoadg iobyxmoadg() {
            return this.f88145iobyxmoadg;
        }

        public String toString() {
            return "SetStaticQrCode(errorType=" + this.f88145iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserCard f88146iobyxmoadg;

        public iobyxmoadg(UserCard userCard) {
            super(null);
            this.f88146iobyxmoadg = userCard;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88146iobyxmoadg, ((iobyxmoadg) obj).f88146iobyxmoadg);
        }

        public int hashCode() {
            UserCard userCard = this.f88146iobyxmoadg;
            if (userCard == null) {
                return 0;
            }
            return userCard.hashCode();
        }

        public final UserCard iobyxmoadg() {
            return this.f88146iobyxmoadg;
        }

        public String toString() {
            return "SetCardInfo(userCard=" + this.f88146iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88147iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String qrcode) {
            super(null);
            zdlpuopuiu.btonecajqb(qrcode, "qrcode");
            this.f88147iobyxmoadg = qrcode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f88147iobyxmoadg, ((ppxfxbqfkf) obj).f88147iobyxmoadg);
        }

        public int hashCode() {
            return this.f88147iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88147iobyxmoadg;
        }

        public String toString() {
            return "SetExpiredQrCode(qrcode=" + this.f88147iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f88148iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f88148iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f88148iobyxmoadg == ((wkgbmnqykc) obj).f88148iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88148iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f88148iobyxmoadg;
        }

        public String toString() {
            return "SetLoading(isLoading=" + this.f88148iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final DynamicQrCode f88149iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(DynamicQrCode model) {
            super(null);
            zdlpuopuiu.btonecajqb(model, "model");
            this.f88149iobyxmoadg = model;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f88149iobyxmoadg, ((zoijcleaow) obj).f88149iobyxmoadg);
        }

        public int hashCode() {
            return this.f88149iobyxmoadg.hashCode();
        }

        public final DynamicQrCode iobyxmoadg() {
            return this.f88149iobyxmoadg;
        }

        public String toString() {
            return "SetDynamicQrCode(model=" + this.f88149iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
