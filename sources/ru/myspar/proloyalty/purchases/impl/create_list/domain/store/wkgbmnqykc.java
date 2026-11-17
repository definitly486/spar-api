package ru.myspar.proloyalty.purchases.impl.create_list.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99548iobyxmoadg;

        public eablkybsjg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99548iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f99548iobyxmoadg, ((eablkybsjg) obj).f99548iobyxmoadg);
        }

        public int hashCode() {
            return this.f99548iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99548iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f99548iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99549iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -936856862;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f99550iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1976404202;
        }

        public String toString() {
            return "EmptyNameMessage";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.create_list.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2384wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99551iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f99552zoijcleaow;

        public C2384wkgbmnqykc(String listId, String listName) {
            zdlpuopuiu.btonecajqb(listId, "listId");
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f99551iobyxmoadg = listId;
            this.f99552zoijcleaow = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2384wkgbmnqykc)) {
                return false;
            }
            C2384wkgbmnqykc c2384wkgbmnqykc = (C2384wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f99551iobyxmoadg, c2384wkgbmnqykc.f99551iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99552zoijcleaow, c2384wkgbmnqykc.f99552zoijcleaow);
        }

        public int hashCode() {
            return (this.f99551iobyxmoadg.hashCode() * 31) + this.f99552zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99551iobyxmoadg;
        }

        public String toString() {
            return "NewPurchaseList(listId=" + this.f99551iobyxmoadg + ", listName=" + this.f99552zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f99552zoijcleaow;
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f99553iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1449078791;
        }

        public String toString() {
            return "BackWithResultProductSuccessAdded";
        }
    }
}
