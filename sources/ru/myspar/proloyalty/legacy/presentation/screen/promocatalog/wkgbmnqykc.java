package ru.myspar.proloyalty.legacy.presentation.screen.promocatalog;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f97087iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f97087iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97087iobyxmoadg, ((iobyxmoadg) obj).f97087iobyxmoadg);
        }

        public int hashCode() {
            return this.f97087iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f97087iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f97087iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97088iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String qrCode) {
            super(null);
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f97088iobyxmoadg = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f97088iobyxmoadg, ((ppxfxbqfkf) obj).f97088iobyxmoadg);
        }

        public int hashCode() {
            return this.f97088iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97088iobyxmoadg;
        }

        public String toString() {
            return "ShowQrDialog(qrCode=" + this.f97088iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vz0.iobyxmoadg f97089iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(vz0.iobyxmoadg args) {
            super(null);
            zdlpuopuiu.btonecajqb(args, "args");
            this.f97089iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f97089iobyxmoadg, ((zoijcleaow) obj).f97089iobyxmoadg);
        }

        public int hashCode() {
            return this.f97089iobyxmoadg.hashCode();
        }

        public final vz0.iobyxmoadg iobyxmoadg() {
            return this.f97089iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoItem(args=" + this.f97089iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
