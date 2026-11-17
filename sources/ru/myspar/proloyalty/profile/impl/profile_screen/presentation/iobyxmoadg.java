package ru.myspar.proloyalty.profile.impl.profile_screen.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: ru.myspar.proloyalty.profile.impl.profile_screen.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2377iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2377iobyxmoadg f99425iobyxmoadg = new C2377iobyxmoadg();

        private C2377iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2377iobyxmoadg);
        }

        public int hashCode() {
            return 523193097;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f99426iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -2111820190;
        }

        public String toString() {
            return "OnOptionsClick";
        }
    }

    public static final class wkgbmnqykc implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ki1.iobyxmoadg f99427iobyxmoadg;

        public wkgbmnqykc(ki1.iobyxmoadg item) {
            zdlpuopuiu.btonecajqb(item, "item");
            this.f99427iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f99427iobyxmoadg, ((wkgbmnqykc) obj).f99427iobyxmoadg);
        }

        public int hashCode() {
            return this.f99427iobyxmoadg.hashCode();
        }

        public final ki1.iobyxmoadg iobyxmoadg() {
            return this.f99427iobyxmoadg;
        }

        public String toString() {
            return "OnProfileMenuItemClick(item=" + this.f99427iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f99428iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1902297530;
        }

        public String toString() {
            return "OnLogoutClick";
        }
    }
}
