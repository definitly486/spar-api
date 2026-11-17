package ru.myspar.legacy.presentation.screen.sharepromo;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f89699iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(CharSequence text) {
            super(null);
            zdlpuopuiu.btonecajqb(text, "text");
            this.f89699iobyxmoadg = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89699iobyxmoadg, ((iobyxmoadg) obj).f89699iobyxmoadg);
        }

        public int hashCode() {
            return this.f89699iobyxmoadg.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f89699iobyxmoadg;
        }

        public String toString() {
            return "CopyPromo(text=" + ((Object) this.f89699iobyxmoadg) + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f89700iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f89700iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89700iobyxmoadg, ((zoijcleaow) obj).f89700iobyxmoadg);
        }

        public int hashCode() {
            return this.f89700iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f89700iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f89700iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
