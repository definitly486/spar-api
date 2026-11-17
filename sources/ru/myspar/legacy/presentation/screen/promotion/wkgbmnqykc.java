package ru.myspar.legacy.presentation.screen.promotion;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f89456iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f89456iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89456iobyxmoadg, ((iobyxmoadg) obj).f89456iobyxmoadg);
        }

        public int hashCode() {
            return this.f89456iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f89456iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f89456iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89457iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String qrCode) {
            super(null);
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f89457iobyxmoadg = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f89457iobyxmoadg, ((ppxfxbqfkf) obj).f89457iobyxmoadg);
        }

        public int hashCode() {
            return this.f89457iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89457iobyxmoadg;
        }

        public String toString() {
            return "ShowQrCode(qrCode=" + this.f89457iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f10.iobyxmoadg f89458iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(f10.iobyxmoadg args) {
            super(null);
            zdlpuopuiu.btonecajqb(args, "args");
            this.f89458iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89458iobyxmoadg, ((zoijcleaow) obj).f89458iobyxmoadg);
        }

        public int hashCode() {
            return this.f89458iobyxmoadg.hashCode();
        }

        public final f10.iobyxmoadg iobyxmoadg() {
            return this.f89458iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoItem(args=" + this.f89458iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
