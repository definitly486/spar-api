package ru.myspar.legacy.presentation.screen.promocatalog;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f89408iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f89408iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89408iobyxmoadg, ((iobyxmoadg) obj).f89408iobyxmoadg);
        }

        public int hashCode() {
            return this.f89408iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f89408iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f89408iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89409iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String qrCode) {
            super(null);
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f89409iobyxmoadg = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f89409iobyxmoadg, ((ppxfxbqfkf) obj).f89409iobyxmoadg);
        }

        public int hashCode() {
            return this.f89409iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89409iobyxmoadg;
        }

        public String toString() {
            return "ShowQrDialog(qrCode=" + this.f89409iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f10.iobyxmoadg f89410iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(f10.iobyxmoadg args) {
            super(null);
            zdlpuopuiu.btonecajqb(args, "args");
            this.f89410iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89410iobyxmoadg, ((zoijcleaow) obj).f89410iobyxmoadg);
        }

        public int hashCode() {
            return this.f89410iobyxmoadg.hashCode();
        }

        public final f10.iobyxmoadg iobyxmoadg() {
            return this.f89410iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoItem(args=" + this.f89410iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
