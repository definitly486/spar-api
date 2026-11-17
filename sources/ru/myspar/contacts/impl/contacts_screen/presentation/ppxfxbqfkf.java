package ru.myspar.contacts.impl.contacts_screen.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f86484iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 490939176;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.contacts.impl.contacts_screen.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1986ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1986ppxfxbqfkf f86485iobyxmoadg = new C1986ppxfxbqfkf();

        private C1986ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1986ppxfxbqfkf);
        }

        public int hashCode() {
            return 1248145415;
        }

        public String toString() {
            return "ShowPermissionsNotGrantedDialog";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f86486iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f86486iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f86486iobyxmoadg, ((zoijcleaow) obj).f86486iobyxmoadg);
        }

        public int hashCode() {
            return this.f86486iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f86486iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f86486iobyxmoadg + ")";
        }
    }
}
