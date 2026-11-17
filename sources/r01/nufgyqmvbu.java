package r01;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l01.ppxfxbqfkf f81381zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f81382iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final zoijcleaow f81383ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f81384zoijcleaow;

        public iobyxmoadg(String shopId, DeliveryCode deliveryCode, zoijcleaow type) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(type, "type");
            this.f81382iobyxmoadg = shopId;
            this.f81384zoijcleaow = deliveryCode;
            this.f81383ppxfxbqfkf = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f81382iobyxmoadg, iobyxmoadgVar.f81382iobyxmoadg) && this.f81384zoijcleaow == iobyxmoadgVar.f81384zoijcleaow && zdlpuopuiu.eablkybsjg(this.f81383ppxfxbqfkf, iobyxmoadgVar.f81383ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f81382iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f81384zoijcleaow;
            return ((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f81383ppxfxbqfkf.hashCode();
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f81384zoijcleaow;
        }

        public final zoijcleaow ppxfxbqfkf() {
            return this.f81383ppxfxbqfkf;
        }

        public String toString() {
            return "Params(shopId=" + this.f81382iobyxmoadg + ", deliveryType=" + this.f81384zoijcleaow + ", type=" + this.f81383ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f81382iobyxmoadg;
        }
    }

    public static abstract class zoijcleaow {

        public static final class iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f81385iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(String value) {
                super(null);
                zdlpuopuiu.btonecajqb(value, "value");
                this.f81385iobyxmoadg = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f81385iobyxmoadg, ((iobyxmoadg) obj).f81385iobyxmoadg);
            }

            public int hashCode() {
                return this.f81385iobyxmoadg.hashCode();
            }

            public String iobyxmoadg() {
                return this.f81385iobyxmoadg;
            }

            public String toString() {
                return "Article(value=" + this.f81385iobyxmoadg + ")";
            }
        }

        public static final class ppxfxbqfkf extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f81386iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ppxfxbqfkf(String value) {
                super(null);
                zdlpuopuiu.btonecajqb(value, "value");
                this.f81386iobyxmoadg = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f81386iobyxmoadg, ((ppxfxbqfkf) obj).f81386iobyxmoadg);
            }

            public int hashCode() {
                return this.f81386iobyxmoadg.hashCode();
            }

            public String iobyxmoadg() {
                return this.f81386iobyxmoadg;
            }

            public String toString() {
                return "ProductId(value=" + this.f81386iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: r01.nufgyqmvbu$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C1812zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f81387iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1812zoijcleaow(String value) {
                super(null);
                zdlpuopuiu.btonecajqb(value, "value");
                this.f81387iobyxmoadg = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1812zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f81387iobyxmoadg, ((C1812zoijcleaow) obj).f81387iobyxmoadg);
            }

            public int hashCode() {
                return this.f81387iobyxmoadg.hashCode();
            }

            public String iobyxmoadg() {
                return this.f81387iobyxmoadg;
            }

            public String toString() {
                return "Barcode(value=" + this.f81387iobyxmoadg + ")";
            }
        }

        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(l01.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f81381zoijcleaow = catalogRemoteSource;
    }

    public final Object ppxfxbqfkf(String str, String str2, DeliveryCode deliveryCode, lg.gxszxtbevo gxszxtbevoVar) {
        return iobyxmoadg(new iobyxmoadg(str2, deliveryCode, new zoijcleaow.ppxfxbqfkf(str)), gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVarPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        if (zoijcleaowVarPpxfxbqfkf instanceof zoijcleaow.iobyxmoadg) {
            return this.f81381zoijcleaow.gxszxtbevo(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), ((zoijcleaow.iobyxmoadg) iobyxmoadgVar.ppxfxbqfkf()).iobyxmoadg(), gxszxtbevoVar);
        }
        if (zoijcleaowVarPpxfxbqfkf instanceof zoijcleaow.C1812zoijcleaow) {
            return this.f81381zoijcleaow.wkgbmnqykc(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), ((zoijcleaow.C1812zoijcleaow) iobyxmoadgVar.ppxfxbqfkf()).iobyxmoadg(), gxszxtbevoVar);
        }
        if (zoijcleaowVarPpxfxbqfkf instanceof zoijcleaow.ppxfxbqfkf) {
            return this.f81381zoijcleaow.eablkybsjg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), ((zoijcleaow.ppxfxbqfkf) iobyxmoadgVar.ppxfxbqfkf()).iobyxmoadg(), gxszxtbevoVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
