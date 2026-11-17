package ru.myspar.proloyalty.tipsorder.impl.domain.store;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: ru.myspar.proloyalty.tipsorder.impl.domain.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2452eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101906iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2452eablkybsjg(String scheme) {
            super(null);
            zdlpuopuiu.btonecajqb(scheme, "scheme");
            this.f101906iobyxmoadg = scheme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2452eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f101906iobyxmoadg, ((C2452eablkybsjg) obj).f101906iobyxmoadg);
        }

        public int hashCode() {
            return this.f101906iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101906iobyxmoadg;
        }

        public String toString() {
            return "OpenSbpBankApp(scheme=" + this.f101906iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f101907iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(List banks) {
            super(null);
            zdlpuopuiu.btonecajqb(banks, "banks");
            this.f101907iobyxmoadg = banks;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f101907iobyxmoadg, ((gxszxtbevo) obj).f101907iobyxmoadg);
        }

        public int hashCode() {
            return this.f101907iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f101907iobyxmoadg;
        }

        public String toString() {
            return "OpenSbpBanksSelect(banks=" + this.f101907iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f101908iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f101908iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101908iobyxmoadg, ((iobyxmoadg) obj).f101908iobyxmoadg);
        }

        public int hashCode() {
            return this.f101908iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f101908iobyxmoadg;
        }

        public String toString() {
            return "Error(error=" + this.f101908iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f101909iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 135135;
        }

        public String toString() {
            return "OpenMainScreen";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101910iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String url) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f101910iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f101910iobyxmoadg, ((wkgbmnqykc) obj).f101910iobyxmoadg);
        }

        public int hashCode() {
            return this.f101910iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101910iobyxmoadg;
        }

        public String toString() {
            return "OpenPaymentScreen(url=" + this.f101910iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f101911iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 258941838;
        }

        public String toString() {
            return "Exit";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
