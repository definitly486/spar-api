package ru.myspar.scango.impl.screens.amountproduct.partial.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f103221iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2497ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f103222iobyxmoadg;

        public C2497ppxfxbqfkf(CharSequence charSequence) {
            super(null);
            this.f103222iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2497ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f103222iobyxmoadg, ((C2497ppxfxbqfkf) obj).f103222iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f103222iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f103222iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f103222iobyxmoadg) + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f103223iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f103223iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f103223iobyxmoadg == ((wkgbmnqykc) obj).f103223iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f103223iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f103223iobyxmoadg;
        }

        public String toString() {
            return "ShowScanExciseStickerDialog(isRemove=" + this.f103223iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f103224iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f103224iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f103224iobyxmoadg, ((zoijcleaow) obj).f103224iobyxmoadg);
        }

        public int hashCode() {
            return this.f103224iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f103224iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f103224iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
