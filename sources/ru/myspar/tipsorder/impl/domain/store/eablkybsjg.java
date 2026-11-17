package ru.myspar.tipsorder.impl.domain.store;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: ru.myspar.tipsorder.impl.domain.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2530eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104543iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2530eablkybsjg(String scheme) {
            super(null);
            zdlpuopuiu.btonecajqb(scheme, "scheme");
            this.f104543iobyxmoadg = scheme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2530eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f104543iobyxmoadg, ((C2530eablkybsjg) obj).f104543iobyxmoadg);
        }

        public int hashCode() {
            return this.f104543iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104543iobyxmoadg;
        }

        public String toString() {
            return "OpenSbpBankApp(scheme=" + this.f104543iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f104544iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(List banks) {
            super(null);
            zdlpuopuiu.btonecajqb(banks, "banks");
            this.f104544iobyxmoadg = banks;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f104544iobyxmoadg, ((gxszxtbevo) obj).f104544iobyxmoadg);
        }

        public int hashCode() {
            return this.f104544iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f104544iobyxmoadg;
        }

        public String toString() {
            return "OpenSbpBanksSelect(banks=" + this.f104544iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f104545iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f104545iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104545iobyxmoadg, ((iobyxmoadg) obj).f104545iobyxmoadg);
        }

        public int hashCode() {
            return this.f104545iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f104545iobyxmoadg;
        }

        public String toString() {
            return "Error(error=" + this.f104545iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f104546iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -901258398;
        }

        public String toString() {
            return "OpenMainScreen";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104547iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String url) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f104547iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f104547iobyxmoadg, ((wkgbmnqykc) obj).f104547iobyxmoadg);
        }

        public int hashCode() {
            return this.f104547iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104547iobyxmoadg;
        }

        public String toString() {
            return "OpenPaymentScreen(url=" + this.f104547iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f104548iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 790359761;
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
