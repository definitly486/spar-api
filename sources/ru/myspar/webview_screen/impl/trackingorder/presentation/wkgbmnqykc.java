package ru.myspar.webview_screen.impl.trackingorder.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104801iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f104802iobyxmoadg;

        public ppxfxbqfkf(CharSequence charSequence) {
            super(null);
            this.f104802iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104802iobyxmoadg, ((ppxfxbqfkf) obj).f104802iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f104802iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f104802iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f104802iobyxmoadg) + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f104803iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f104803iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104803iobyxmoadg, ((zoijcleaow) obj).f104803iobyxmoadg);
        }

        public int hashCode() {
            return this.f104803iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f104803iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f104803iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
