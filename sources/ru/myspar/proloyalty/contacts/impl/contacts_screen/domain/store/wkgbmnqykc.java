package ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f94195iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 872162484;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f94196iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1385968901;
        }

        public String toString() {
            return "ShowPermissionsNotGrantedDialog";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f94197iobyxmoadg;

        public zoijcleaow(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f94197iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f94197iobyxmoadg, ((zoijcleaow) obj).f94197iobyxmoadg);
        }

        public int hashCode() {
            return this.f94197iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f94197iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(throwable=" + this.f94197iobyxmoadg + ")";
        }
    }
}
