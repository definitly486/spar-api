package ru.myspar.proloyalty.purchases.impl.specific.presentation;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {
        public abstract wj1.iobyxmoadg iobyxmoadg();
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99911iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f99912ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f99913zoijcleaow;

        public /* synthetic */ gxszxtbevo(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f99911iobyxmoadg, gxszxtbevoVar.f99911iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99913zoijcleaow, gxszxtbevoVar.f99913zoijcleaow) && this.f99912ppxfxbqfkf == gxszxtbevoVar.f99912ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f99911iobyxmoadg.hashCode() * 31) + this.f99913zoijcleaow.hashCode()) * 31) + pmvmpeiblj.wkgbmnqykc(this.f99912ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f99911iobyxmoadg;
        }

        public final int ppxfxbqfkf() {
            return this.f99912ppxfxbqfkf;
        }

        public String toString() {
            return "ShowRateProductDialog(productArticle=" + this.f99911iobyxmoadg + ", productName=" + this.f99913zoijcleaow + ", rating=" + pmvmpeiblj.eablkybsjg(this.f99912ppxfxbqfkf) + ")";
        }

        public final String zoijcleaow() {
            return this.f99913zoijcleaow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private gxszxtbevo(String productArticle, String productName, int i13) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f99911iobyxmoadg = productArticle;
            this.f99913zoijcleaow = productName;
            this.f99912ppxfxbqfkf = i13;
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {
        public abstract wj1.iobyxmoadg iobyxmoadg();
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99914iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f99914iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99914iobyxmoadg, ((ppxfxbqfkf) obj).f99914iobyxmoadg);
        }

        public int hashCode() {
            return this.f99914iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99914iobyxmoadg;
        }

        public String toString() {
            return "ShowLimitAddedMessage(message=" + this.f99914iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2400wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f99915iobyxmoadg;

        public C2400wkgbmnqykc(CharSequence charSequence) {
            super(null);
            this.f99915iobyxmoadg = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2400wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f99915iobyxmoadg, ((C2400wkgbmnqykc) obj).f99915iobyxmoadg);
        }

        public int hashCode() {
            CharSequence charSequence = this.f99915iobyxmoadg;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f99915iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + ((Object) this.f99915iobyxmoadg) + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99916iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99916iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99916iobyxmoadg, ((zoijcleaow) obj).f99916iobyxmoadg);
        }

        public int hashCode() {
            return this.f99916iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99916iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f99916iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
