package ru.myspar.proloyalty.activation_card.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class eablkybsjg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91801iobyxmoadg;

        public eablkybsjg(String newCardNumber) {
            zdlpuopuiu.btonecajqb(newCardNumber, "newCardNumber");
            this.f91801iobyxmoadg = newCardNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f91801iobyxmoadg, ((eablkybsjg) obj).f91801iobyxmoadg);
        }

        public int hashCode() {
            return this.f91801iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91801iobyxmoadg;
        }

        public String toString() {
            return "OnConfirmDialog(newCardNumber=" + this.f91801iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f91802iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1307295023;
        }

        public String toString() {
            return "OnScanClick";
        }
    }

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f91803iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1860142997;
        }

        public String toString() {
            return "OnActivateCardClick";
        }
    }

    public static final class lqeggnwhkg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f91804iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 1574179699;
        }

        public String toString() {
            return "OnSupportClick";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f91805iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1144699372;
        }

        public String toString() {
            return "OnCancelConfirmDialog";
        }
    }

    public static final class wkgbmnqykc implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f91806iobyxmoadg;

        public wkgbmnqykc(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f91806iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f91806iobyxmoadg, ((wkgbmnqykc) obj).f91806iobyxmoadg);
        }

        public int hashCode() {
            return this.f91806iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f91806iobyxmoadg;
        }

        public String toString() {
            return "OnChangeCardNumber(value=" + this.f91806iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2134zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2134zoijcleaow f91807iobyxmoadg = new C2134zoijcleaow();

        private C2134zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2134zoijcleaow);
        }

        public int hashCode() {
            return 1853126311;
        }

        public String toString() {
            return "OnBackClick";
        }
    }
}
