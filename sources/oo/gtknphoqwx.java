package oo;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx extends w32.iobyxmoadg {
    public /* synthetic */ gtknphoqwx(String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public static final class iobyxmoadg extends gtknphoqwx {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final Map f73281gxszxtbevo;

        public /* synthetic */ iobyxmoadg(Map map, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? tzroggbefp.dxjokdxxww() : map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f73281gxszxtbevo, ((iobyxmoadg) obj).f73281gxszxtbevo);
        }

        public int hashCode() {
            return this.f73281gxszxtbevo.hashCode();
        }

        @Override // w32.iobyxmoadg
        protected Map wkgbmnqykc() {
            return this.f73281gxszxtbevo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Map specificArgs) {
            super("catalog_sections_load", null);
            zdlpuopuiu.btonecajqb(specificArgs, "specificArgs");
            this.f73281gxszxtbevo = specificArgs;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String shopId, String str, String str2) {
            this(tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("shop_id", shopId), cqumvgiudr.iobyxmoadg("delivery_type", str), cqumvgiudr.iobyxmoadg("section_id", str2)));
            zdlpuopuiu.btonecajqb(shopId, "shopId");
        }
    }

    private gtknphoqwx(String str) {
        super(str, null, 2, null);
    }
}
