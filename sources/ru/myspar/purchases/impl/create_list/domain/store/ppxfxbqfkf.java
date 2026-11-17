package ru.myspar.purchases.impl.create_list.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102253iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 2031622931;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2465ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f102254iobyxmoadg;

        public C2465ppxfxbqfkf(tzroggbefp listName) {
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f102254iobyxmoadg = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2465ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f102254iobyxmoadg, ((C2465ppxfxbqfkf) obj).f102254iobyxmoadg);
        }

        public int hashCode() {
            return this.f102254iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f102254iobyxmoadg;
        }

        public String toString() {
            return "OnListNameChanged(listName=" + this.f102254iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f102255iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1449665418;
        }

        public String toString() {
            return "OnCreateNewPurchaseList";
        }
    }
}
