package ru.myspar.proloyalty.payment.impl.methods.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.components.payment.api.models.PaymentModel;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99184iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -21590098;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.payment.impl.methods.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2371ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2371ppxfxbqfkf f99185iobyxmoadg = new C2371ppxfxbqfkf();

        private C2371ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2371ppxfxbqfkf);
        }

        public int hashCode() {
            return 1260647985;
        }

        public String toString() {
            return "OnPayClicked";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PaymentModel f99186iobyxmoadg;

        public wkgbmnqykc(PaymentModel value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f99186iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f99186iobyxmoadg, ((wkgbmnqykc) obj).f99186iobyxmoadg);
        }

        public int hashCode() {
            return this.f99186iobyxmoadg.hashCode();
        }

        public final PaymentModel iobyxmoadg() {
            return this.f99186iobyxmoadg;
        }

        public String toString() {
            return "OnSelectMethod(value=" + this.f99186iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f99187iobyxmoadg;

        public zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f99187iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99187iobyxmoadg, ((zoijcleaow) obj).f99187iobyxmoadg);
        }

        public int hashCode() {
            return this.f99187iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f99187iobyxmoadg;
        }

        public String toString() {
            return "OnChangeNominal(value=" + this.f99187iobyxmoadg + ")";
        }
    }
}
