package ru.myspar.legacy.presentation.screen.personaldata;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89376iobyxmoadg;

        public iobyxmoadg(String str) {
            super(null);
            this.f89376iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89376iobyxmoadg, ((iobyxmoadg) obj).f89376iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f89376iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89376iobyxmoadg;
        }

        public String toString() {
            return "ShowEmailTakenSnackbar(error=" + this.f89376iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f89377iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f89377iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f89377iobyxmoadg, ((ppxfxbqfkf) obj).f89377iobyxmoadg);
        }

        public int hashCode() {
            return this.f89377iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f89377iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f89377iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.personaldata.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2047wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2047wkgbmnqykc f89378iobyxmoadg = new C2047wkgbmnqykc();

        private C2047wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89379iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f89379iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89379iobyxmoadg, ((zoijcleaow) obj).f89379iobyxmoadg);
        }

        public int hashCode() {
            return this.f89379iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89379iobyxmoadg;
        }

        public String toString() {
            return "ShowEmailVerifyDialog(email=" + this.f89379iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
