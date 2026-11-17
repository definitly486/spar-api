package zf1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: zf1.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C3304eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f129859iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f129860zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3304eablkybsjg(String url, AnalyticsPage analyticsPage) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(analyticsPage, "analyticsPage");
            this.f129859iobyxmoadg = url;
            this.f129860zoijcleaow = analyticsPage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3304eablkybsjg)) {
                return false;
            }
            C3304eablkybsjg c3304eablkybsjg = (C3304eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f129859iobyxmoadg, c3304eablkybsjg.f129859iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129860zoijcleaow, c3304eablkybsjg.f129860zoijcleaow);
        }

        public int hashCode() {
            return (this.f129859iobyxmoadg.hashCode() * 31) + this.f129860zoijcleaow.hashCode();
        }

        public final AnalyticsPage iobyxmoadg() {
            return this.f129860zoijcleaow;
        }

        public String toString() {
            return "NavigateToWebViewWithUrl(url=" + this.f129859iobyxmoadg + ", analyticsPage=" + this.f129860zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f129859iobyxmoadg;
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f129861iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f129861iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f129861iobyxmoadg, ((gxszxtbevo) obj).f129861iobyxmoadg);
        }

        public int hashCode() {
            return this.f129861iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f129861iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f129861iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f129862iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 389557625;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f129863iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String phone) {
            super(null);
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f129863iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f129863iobyxmoadg, ((ppxfxbqfkf) obj).f129863iobyxmoadg);
        }

        public int hashCode() {
            return this.f129863iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f129863iobyxmoadg;
        }

        public String toString() {
            return "NavigateToCall(phone=" + this.f129863iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dg1.wkgbmnqykc f129864iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final sz0.eablkybsjg f129865zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(dg1.wkgbmnqykc order, sz0.eablkybsjg ordersStatus) {
            super(null);
            zdlpuopuiu.btonecajqb(order, "order");
            zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
            this.f129864iobyxmoadg = order;
            this.f129865zoijcleaow = ordersStatus;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f129864iobyxmoadg, wkgbmnqykcVar.f129864iobyxmoadg) && this.f129865zoijcleaow == wkgbmnqykcVar.f129865zoijcleaow;
        }

        public int hashCode() {
            return (this.f129864iobyxmoadg.hashCode() * 31) + this.f129865zoijcleaow.hashCode();
        }

        public final dg1.wkgbmnqykc iobyxmoadg() {
            return this.f129864iobyxmoadg;
        }

        public String toString() {
            return "NavigateToOrder(order=" + this.f129864iobyxmoadg + ", ordersStatus=" + this.f129865zoijcleaow + ")";
        }

        public final sz0.eablkybsjg zoijcleaow() {
            return this.f129865zoijcleaow;
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f129866iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String orderNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            this.f129866iobyxmoadg = orderNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f129866iobyxmoadg, ((zoijcleaow) obj).f129866iobyxmoadg);
        }

        public int hashCode() {
            return this.f129866iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f129866iobyxmoadg;
        }

        public String toString() {
            return "CopyOrderNumber(orderNumber=" + this.f129866iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
