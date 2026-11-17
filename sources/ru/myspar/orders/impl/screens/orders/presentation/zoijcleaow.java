package ru.myspar.orders.impl.screens.orders.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91003iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String orderNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            this.f91003iobyxmoadg = orderNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f91003iobyxmoadg, ((eablkybsjg) obj).f91003iobyxmoadg);
        }

        public int hashCode() {
            return this.f91003iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91003iobyxmoadg;
        }

        public String toString() {
            return "OnOrderNumberCopyClicked(orderNumber=" + this.f91003iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f91004iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f91005iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f91006iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1652279097;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dj0.wkgbmnqykc f91007iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(dj0.wkgbmnqykc order) {
            super(null);
            zdlpuopuiu.btonecajqb(order, "order");
            this.f91007iobyxmoadg = order;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f91007iobyxmoadg, ((wkgbmnqykc) obj).f91007iobyxmoadg);
        }

        public int hashCode() {
            return this.f91007iobyxmoadg.hashCode();
        }

        public final dj0.wkgbmnqykc iobyxmoadg() {
            return this.f91007iobyxmoadg;
        }

        public String toString() {
            return "OnOrderClicked(order=" + this.f91007iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.orders.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2111zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91008iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2111zoijcleaow(String phone) {
            super(null);
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f91008iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2111zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f91008iobyxmoadg, ((C2111zoijcleaow) obj).f91008iobyxmoadg);
        }

        public int hashCode() {
            return this.f91008iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91008iobyxmoadg;
        }

        public String toString() {
            return "OnCallClicked(phone=" + this.f91008iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
