package h20;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x10.ppxfxbqfkf f39156zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39157iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final zoijcleaow f39158ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f39159zoijcleaow;

        public iobyxmoadg(String shopId, DeliveryCode deliveryCode, zoijcleaow type) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(type, "type");
            this.f39157iobyxmoadg = shopId;
            this.f39159zoijcleaow = deliveryCode;
            this.f39158ppxfxbqfkf = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f39157iobyxmoadg, iobyxmoadgVar.f39157iobyxmoadg) && this.f39159zoijcleaow == iobyxmoadgVar.f39159zoijcleaow && zdlpuopuiu.eablkybsjg(this.f39158ppxfxbqfkf, iobyxmoadgVar.f39158ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f39157iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f39159zoijcleaow;
            return ((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f39158ppxfxbqfkf.hashCode();
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f39159zoijcleaow;
        }

        public final zoijcleaow ppxfxbqfkf() {
            return this.f39158ppxfxbqfkf;
        }

        public String toString() {
            return "Params(shopId=" + this.f39157iobyxmoadg + ", deliveryType=" + this.f39159zoijcleaow + ", type=" + this.f39158ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f39157iobyxmoadg;
        }
    }

    public static abstract class zoijcleaow {

        public static final class iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f39160iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(String value) {
                super(null);
                zdlpuopuiu.btonecajqb(value, "value");
                this.f39160iobyxmoadg = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39160iobyxmoadg, ((iobyxmoadg) obj).f39160iobyxmoadg);
            }

            public int hashCode() {
                return this.f39160iobyxmoadg.hashCode();
            }

            public String iobyxmoadg() {
                return this.f39160iobyxmoadg;
            }

            public String toString() {
                return "Article(value=" + this.f39160iobyxmoadg + ")";
            }
        }

        public static final class ppxfxbqfkf extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f39161iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ppxfxbqfkf(String value) {
                super(null);
                zdlpuopuiu.btonecajqb(value, "value");
                this.f39161iobyxmoadg = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f39161iobyxmoadg, ((ppxfxbqfkf) obj).f39161iobyxmoadg);
            }

            public int hashCode() {
                return this.f39161iobyxmoadg.hashCode();
            }

            public String iobyxmoadg() {
                return this.f39161iobyxmoadg;
            }

            public String toString() {
                return "ProductId(value=" + this.f39161iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: h20.gtknphoqwx$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C0901zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f39162iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0901zoijcleaow(String value) {
                super(null);
                zdlpuopuiu.btonecajqb(value, "value");
                this.f39162iobyxmoadg = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0901zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f39162iobyxmoadg, ((C0901zoijcleaow) obj).f39162iobyxmoadg);
            }

            public int hashCode() {
                return this.f39162iobyxmoadg.hashCode();
            }

            public String iobyxmoadg() {
                return this.f39162iobyxmoadg;
            }

            public String toString() {
                return "Barcode(value=" + this.f39162iobyxmoadg + ")";
            }
        }

        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(x10.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39156zoijcleaow = catalogRemoteSource;
    }

    public final Object ppxfxbqfkf(String str, String str2, DeliveryCode deliveryCode, lg.gxszxtbevo gxszxtbevoVar) {
        return iobyxmoadg(new iobyxmoadg(str2, deliveryCode, new zoijcleaow.ppxfxbqfkf(str)), gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVarPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        if (zoijcleaowVarPpxfxbqfkf instanceof zoijcleaow.iobyxmoadg) {
            return this.f39156zoijcleaow.dxjokdxxww(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), ((zoijcleaow.iobyxmoadg) iobyxmoadgVar.ppxfxbqfkf()).iobyxmoadg(), gxszxtbevoVar);
        }
        if (zoijcleaowVarPpxfxbqfkf instanceof zoijcleaow.C0901zoijcleaow) {
            return this.f39156zoijcleaow.gxszxtbevo(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), ((zoijcleaow.C0901zoijcleaow) iobyxmoadgVar.ppxfxbqfkf()).iobyxmoadg(), gxszxtbevoVar);
        }
        if (zoijcleaowVarPpxfxbqfkf instanceof zoijcleaow.ppxfxbqfkf) {
            return this.f39156zoijcleaow.btonecajqb(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), ((zoijcleaow.ppxfxbqfkf) iobyxmoadgVar.ppxfxbqfkf()).iobyxmoadg(), gxszxtbevoVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
