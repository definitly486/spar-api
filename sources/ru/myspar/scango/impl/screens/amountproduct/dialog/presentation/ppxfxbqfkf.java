package ru.myspar.scango.impl.screens.amountproduct.dialog.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.component.domain.model.ScanExciseStickerDialogArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f103163iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2495ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f103164iobyxmoadg;

        public C2495ppxfxbqfkf(String str) {
            super(null);
            this.f103164iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2495ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f103164iobyxmoadg, ((C2495ppxfxbqfkf) obj).f103164iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f103164iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f103164iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f103164iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ScanExciseStickerDialogArgs f103165iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(ScanExciseStickerDialogArgs args) {
            super(null);
            zdlpuopuiu.btonecajqb(args, "args");
            this.f103165iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f103165iobyxmoadg, ((wkgbmnqykc) obj).f103165iobyxmoadg);
        }

        public int hashCode() {
            return this.f103165iobyxmoadg.hashCode();
        }

        public final ScanExciseStickerDialogArgs iobyxmoadg() {
            return this.f103165iobyxmoadg;
        }

        public String toString() {
            return "ShowScanExciseStickerDialog(args=" + this.f103165iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f103166iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f103166iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f103166iobyxmoadg, ((zoijcleaow) obj).f103166iobyxmoadg);
        }

        public int hashCode() {
            return this.f103166iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f103166iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f103166iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
