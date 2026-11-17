package ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.component.domain.model.ScanExciseStickerDialogArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f100507iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2416ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f100508iobyxmoadg;

        public C2416ppxfxbqfkf(String str) {
            super(null);
            this.f100508iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2416ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f100508iobyxmoadg, ((C2416ppxfxbqfkf) obj).f100508iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f100508iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f100508iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f100508iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ScanExciseStickerDialogArgs f100509iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(ScanExciseStickerDialogArgs args) {
            super(null);
            zdlpuopuiu.btonecajqb(args, "args");
            this.f100509iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f100509iobyxmoadg, ((wkgbmnqykc) obj).f100509iobyxmoadg);
        }

        public int hashCode() {
            return this.f100509iobyxmoadg.hashCode();
        }

        public final ScanExciseStickerDialogArgs iobyxmoadg() {
            return this.f100509iobyxmoadg;
        }

        public String toString() {
            return "ShowScanExciseStickerDialog(args=" + this.f100509iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f100510iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f100510iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f100510iobyxmoadg, ((zoijcleaow) obj).f100510iobyxmoadg);
        }

        public int hashCode() {
            return this.f100510iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f100510iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f100510iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
