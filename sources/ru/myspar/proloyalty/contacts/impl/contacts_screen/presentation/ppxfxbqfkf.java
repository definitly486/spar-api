package ru.myspar.proloyalty.contacts.impl.contacts_screen.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f94217iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1392332709;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.contacts.impl.contacts_screen.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2221ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2221ppxfxbqfkf f94218iobyxmoadg = new C2221ppxfxbqfkf();

        private C2221ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2221ppxfxbqfkf);
        }

        public int hashCode() {
            return -1589038998;
        }

        public String toString() {
            return "ShowPermissionsNotGrantedDialog";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f94219iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f94219iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f94219iobyxmoadg, ((zoijcleaow) obj).f94219iobyxmoadg);
        }

        public int hashCode() {
            return this.f94219iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f94219iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f94219iobyxmoadg + ")";
        }
    }
}
