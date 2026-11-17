package ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f100565iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2418ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f100566iobyxmoadg;

        public C2418ppxfxbqfkf(CharSequence charSequence) {
            super(null);
            this.f100566iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2418ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f100566iobyxmoadg, ((C2418ppxfxbqfkf) obj).f100566iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f100566iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f100566iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f100566iobyxmoadg) + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f100567iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f100567iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f100567iobyxmoadg == ((wkgbmnqykc) obj).f100567iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f100567iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f100567iobyxmoadg;
        }

        public String toString() {
            return "ShowScanExciseStickerDialog(isRemove=" + this.f100567iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f100568iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f100568iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f100568iobyxmoadg, ((zoijcleaow) obj).f100568iobyxmoadg);
        }

        public int hashCode() {
            return this.f100568iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f100568iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f100568iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
