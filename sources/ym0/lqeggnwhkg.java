package ym0;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg extends sp1.iobyxmoadg {
    public /* synthetic */ lqeggnwhkg(String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final Map f125947gxszxtbevo;

        public /* synthetic */ iobyxmoadg(Map map, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? tzroggbefp.dxjokdxxww() : map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125947gxszxtbevo, ((iobyxmoadg) obj).f125947gxszxtbevo);
        }

        public int hashCode() {
            return this.f125947gxszxtbevo.hashCode();
        }

        @Override // sp1.iobyxmoadg
        protected Map wkgbmnqykc() {
            return this.f125947gxszxtbevo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Map specificArgs) {
            super("catalog_items_load", null);
            zdlpuopuiu.btonecajqb(specificArgs, "specificArgs");
            this.f125947gxszxtbevo = specificArgs;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String shopId, String page, String str, String str2, String str3, String str4, String str5) {
            this(tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("shop_id", shopId), cqumvgiudr.iobyxmoadg("page", page), cqumvgiudr.iobyxmoadg("section", str), cqumvgiudr.iobyxmoadg("delivery_type", str2), cqumvgiudr.iobyxmoadg("brand", str3), cqumvgiudr.iobyxmoadg("sort", str4), cqumvgiudr.iobyxmoadg("filter", str5)));
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(page, "page");
        }
    }

    private lqeggnwhkg(String str) {
        super(str, null, 2, null);
    }
}
