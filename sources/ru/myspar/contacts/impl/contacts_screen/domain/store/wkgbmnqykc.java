package ru.myspar.contacts.impl.contacts_screen.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f86462iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -903230537;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f86463iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1339311896;
        }

        public String toString() {
            return "ShowPermissionsNotGrantedDialog";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f86464iobyxmoadg;

        public zoijcleaow(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f86464iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f86464iobyxmoadg, ((zoijcleaow) obj).f86464iobyxmoadg);
        }

        public int hashCode() {
            return this.f86464iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f86464iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(throwable=" + this.f86464iobyxmoadg + ")";
        }
    }
}
