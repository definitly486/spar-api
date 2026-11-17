package ru.myspar.proloyalty.legacy.presentation.screen.promotion;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f97135iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f97135iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97135iobyxmoadg, ((iobyxmoadg) obj).f97135iobyxmoadg);
        }

        public int hashCode() {
            return this.f97135iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f97135iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f97135iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97136iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String qrCode) {
            super(null);
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f97136iobyxmoadg = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f97136iobyxmoadg, ((ppxfxbqfkf) obj).f97136iobyxmoadg);
        }

        public int hashCode() {
            return this.f97136iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97136iobyxmoadg;
        }

        public String toString() {
            return "ShowQrCode(qrCode=" + this.f97136iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vz0.iobyxmoadg f97137iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(vz0.iobyxmoadg args) {
            super(null);
            zdlpuopuiu.btonecajqb(args, "args");
            this.f97137iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f97137iobyxmoadg, ((zoijcleaow) obj).f97137iobyxmoadg);
        }

        public int hashCode() {
            return this.f97137iobyxmoadg.hashCode();
        }

        public final vz0.iobyxmoadg iobyxmoadg() {
            return this.f97137iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoItem(args=" + this.f97137iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
