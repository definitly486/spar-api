package ru.myspar.payment.impl.methods.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.components.payment.api.models.PaymentModel;

/* JADX INFO: loaded from: classes3.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f91539iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 2078474123;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f91540iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1189844660;
        }

        public String toString() {
            return "OnPayClicked";
        }
    }

    public static final class wkgbmnqykc implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentModel f91541iobyxmoadg;

        public wkgbmnqykc(PaymentModel value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f91541iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f91541iobyxmoadg, ((wkgbmnqykc) obj).f91541iobyxmoadg);
        }

        public int hashCode() {
            return this.f91541iobyxmoadg.hashCode();
        }

        public final PaymentModel iobyxmoadg() {
            return this.f91541iobyxmoadg;
        }

        public String toString() {
            return "OnSelectMethod(value=" + this.f91541iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.payment.impl.methods.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2124zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f91542iobyxmoadg;

        public C2124zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f91542iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2124zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f91542iobyxmoadg, ((C2124zoijcleaow) obj).f91542iobyxmoadg);
        }

        public int hashCode() {
            return this.f91542iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f91542iobyxmoadg;
        }

        public String toString() {
            return "OnChangeNominal(value=" + this.f91542iobyxmoadg + ")";
        }
    }
}
