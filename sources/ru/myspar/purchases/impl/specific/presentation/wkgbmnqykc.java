package ru.myspar.purchases.impl.specific.presentation;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f102627iobyxmoadg;

        public eablkybsjg(CharSequence charSequence) {
            super(null);
            this.f102627iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f102627iobyxmoadg, ((eablkybsjg) obj).f102627iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f102627iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f102627iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f102627iobyxmoadg) + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {
        public abstract qy1.iobyxmoadg iobyxmoadg();
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qy1.iobyxmoadg f102628iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f102629zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(qy1.iobyxmoadg params, String message) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f102628iobyxmoadg = params;
            this.f102629zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f102628iobyxmoadg, iobyxmoadgVar.f102628iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102629zoijcleaow, iobyxmoadgVar.f102629zoijcleaow);
        }

        public int hashCode() {
            return (this.f102628iobyxmoadg.hashCode() * 31) + this.f102629zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102629zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f102628iobyxmoadg + ", message=" + this.f102629zoijcleaow + ")";
        }

        public final qy1.iobyxmoadg zoijcleaow() {
            return this.f102628iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102630iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f102631ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f102632zoijcleaow;

        public /* synthetic */ lqeggnwhkg(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f102630iobyxmoadg, lqeggnwhkgVar.f102630iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102632zoijcleaow, lqeggnwhkgVar.f102632zoijcleaow) && this.f102631ppxfxbqfkf == lqeggnwhkgVar.f102631ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f102630iobyxmoadg.hashCode() * 31) + this.f102632zoijcleaow.hashCode()) * 31) + pmvmpeiblj.wkgbmnqykc(this.f102631ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f102630iobyxmoadg;
        }

        public final int ppxfxbqfkf() {
            return this.f102631ppxfxbqfkf;
        }

        public String toString() {
            return "ShowRateProductDialog(productArticle=" + this.f102630iobyxmoadg + ", productName=" + this.f102632zoijcleaow + ", rating=" + pmvmpeiblj.eablkybsjg(this.f102631ppxfxbqfkf) + ")";
        }

        public final String zoijcleaow() {
            return this.f102632zoijcleaow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private lqeggnwhkg(String productArticle, String productName, int i13) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f102630iobyxmoadg = productArticle;
            this.f102632zoijcleaow = productName;
            this.f102631ppxfxbqfkf = i13;
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102633iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102633iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f102633iobyxmoadg, ((ppxfxbqfkf) obj).f102633iobyxmoadg);
        }

        public int hashCode() {
            return this.f102633iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102633iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f102633iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2482wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102634iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2482wkgbmnqykc(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f102634iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2482wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f102634iobyxmoadg, ((C2482wkgbmnqykc) obj).f102634iobyxmoadg);
        }

        public int hashCode() {
            return this.f102634iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102634iobyxmoadg;
        }

        public String toString() {
            return "ShowLimitAddedMessage(message=" + this.f102634iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {
        public abstract qy1.iobyxmoadg iobyxmoadg();
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
