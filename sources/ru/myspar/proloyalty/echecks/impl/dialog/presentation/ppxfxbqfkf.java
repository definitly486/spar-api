package ru.myspar.proloyalty.echecks.impl.dialog.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96048iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -36939239;
        }

        public String toString() {
            return "Dismiss";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.echecks.impl.dialog.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2265ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96049iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2265ppxfxbqfkf(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f96049iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2265ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f96049iobyxmoadg, ((C2265ppxfxbqfkf) obj).f96049iobyxmoadg);
        }

        public int hashCode() {
            return this.f96049iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96049iobyxmoadg;
        }

        public String toString() {
            return "SuccessDialog(email=" + this.f96049iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f96050iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable throwable) {
            super(null);
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f96050iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f96050iobyxmoadg, ((zoijcleaow) obj).f96050iobyxmoadg);
        }

        public int hashCode() {
            return this.f96050iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f96050iobyxmoadg;
        }

        public String toString() {
            return "ShowError(throwable=" + this.f96050iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
