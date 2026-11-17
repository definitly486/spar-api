package ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102162iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f102163iobyxmoadg;

        public ppxfxbqfkf(CharSequence charSequence) {
            super(null);
            this.f102163iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f102163iobyxmoadg, ((ppxfxbqfkf) obj).f102163iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f102163iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f102163iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f102163iobyxmoadg) + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102164iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102164iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102164iobyxmoadg, ((zoijcleaow) obj).f102164iobyxmoadg);
        }

        public int hashCode() {
            return this.f102164iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102164iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f102164iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
