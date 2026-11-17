package ru.myspar.proloyalty.legacy.presentation.screen.personaldata;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97056iobyxmoadg;

        public iobyxmoadg(String str) {
            super(null);
            this.f97056iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97056iobyxmoadg, ((iobyxmoadg) obj).f97056iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f97056iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97056iobyxmoadg;
        }

        public String toString() {
            return "ShowEmailTakenSnackbar(error=" + this.f97056iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f97057iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f97057iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f97057iobyxmoadg, ((ppxfxbqfkf) obj).f97057iobyxmoadg);
        }

        public int hashCode() {
            return this.f97057iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f97057iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f97057iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97058iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f97058iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f97058iobyxmoadg, ((zoijcleaow) obj).f97058iobyxmoadg);
        }

        public int hashCode() {
            return this.f97058iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97058iobyxmoadg;
        }

        public String toString() {
            return "ShowEmailVerifyDialog(email=" + this.f97058iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
