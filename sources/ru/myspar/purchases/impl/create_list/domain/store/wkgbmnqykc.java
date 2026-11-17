package ru.myspar.purchases.impl.create_list.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102256iobyxmoadg;

        public eablkybsjg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102256iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f102256iobyxmoadg, ((eablkybsjg) obj).f102256iobyxmoadg);
        }

        public int hashCode() {
            return this.f102256iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102256iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f102256iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102257iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1582717413;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f102258iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1967244141;
        }

        public String toString() {
            return "EmptyNameMessage";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.create_list.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2466wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102259iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f102260zoijcleaow;

        public C2466wkgbmnqykc(String listId, String listName) {
            zdlpuopuiu.btonecajqb(listId, "listId");
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f102259iobyxmoadg = listId;
            this.f102260zoijcleaow = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2466wkgbmnqykc)) {
                return false;
            }
            C2466wkgbmnqykc c2466wkgbmnqykc = (C2466wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f102259iobyxmoadg, c2466wkgbmnqykc.f102259iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102260zoijcleaow, c2466wkgbmnqykc.f102260zoijcleaow);
        }

        public int hashCode() {
            return (this.f102259iobyxmoadg.hashCode() * 31) + this.f102260zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102259iobyxmoadg;
        }

        public String toString() {
            return "NewPurchaseList(listId=" + this.f102259iobyxmoadg + ", listName=" + this.f102260zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f102260zoijcleaow;
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f102261iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1363995620;
        }

        public String toString() {
            return "BackWithResultProductSuccessAdded";
        }
    }
}
