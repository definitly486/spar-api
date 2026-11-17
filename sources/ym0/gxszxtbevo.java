package ym0;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo extends sp1.iobyxmoadg {
    public /* synthetic */ gxszxtbevo(String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final Map f125944gxszxtbevo;

        public /* synthetic */ iobyxmoadg(Map map, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? tzroggbefp.dxjokdxxww() : map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125944gxszxtbevo, ((iobyxmoadg) obj).f125944gxszxtbevo);
        }

        public int hashCode() {
            return this.f125944gxszxtbevo.hashCode();
        }

        @Override // sp1.iobyxmoadg
        protected Map wkgbmnqykc() {
            return this.f125944gxszxtbevo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Map specificArgs) {
            super("catalog_product_load", null);
            zdlpuopuiu.btonecajqb(specificArgs, "specificArgs");
            this.f125944gxszxtbevo = specificArgs;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String shopId, String productId, String article, String str, String str2) {
            this(tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("shop_id", shopId), cqumvgiudr.iobyxmoadg("id", productId), cqumvgiudr.iobyxmoadg("article", article), cqumvgiudr.iobyxmoadg("delivery_type", str), cqumvgiudr.iobyxmoadg("barcode", str2)));
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(article, "article");
        }
    }

    private gxszxtbevo(String str) {
        super(str, null, 2, null);
    }
}
