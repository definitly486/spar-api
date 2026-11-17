package ru.myspar.proloyalty.legacy.presentation.screen.sharepromo;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f97329iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(CharSequence text) {
            super(null);
            zdlpuopuiu.btonecajqb(text, "text");
            this.f97329iobyxmoadg = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97329iobyxmoadg, ((iobyxmoadg) obj).f97329iobyxmoadg);
        }

        public int hashCode() {
            return this.f97329iobyxmoadg.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f97329iobyxmoadg;
        }

        public String toString() {
            return "CopyPromo(text=" + ((Object) this.f97329iobyxmoadg) + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f97330iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f97330iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f97330iobyxmoadg, ((zoijcleaow) obj).f97330iobyxmoadg);
        }

        public int hashCode() {
            return this.f97330iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f97330iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f97330iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
