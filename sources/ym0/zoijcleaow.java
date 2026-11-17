package ym0;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow extends sp1.iobyxmoadg {
    public /* synthetic */ zoijcleaow(String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final Map f125952gxszxtbevo;

        public /* synthetic */ iobyxmoadg(Map map, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? tzroggbefp.dxjokdxxww() : map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125952gxszxtbevo, ((iobyxmoadg) obj).f125952gxszxtbevo);
        }

        public int hashCode() {
            return this.f125952gxszxtbevo.hashCode();
        }

        @Override // sp1.iobyxmoadg
        protected Map wkgbmnqykc() {
            return this.f125952gxszxtbevo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Map specificArgs) {
            super("catalog_sections_load", null);
            zdlpuopuiu.btonecajqb(specificArgs, "specificArgs");
            this.f125952gxszxtbevo = specificArgs;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String shopId, String str) {
            this(tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("shop_id", shopId), cqumvgiudr.iobyxmoadg("delivery_type", str)));
            zdlpuopuiu.btonecajqb(shopId, "shopId");
        }
    }

    private zoijcleaow(String str) {
        super(str, null, 2, null);
    }
}
