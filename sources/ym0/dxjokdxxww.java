package ym0;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dxjokdxxww extends sp1.iobyxmoadg {
    public /* synthetic */ dxjokdxxww(String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public static final class iobyxmoadg extends dxjokdxxww {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final Map f125929gxszxtbevo;

        public /* synthetic */ iobyxmoadg(Map map, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? tzroggbefp.dxjokdxxww() : map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125929gxszxtbevo, ((iobyxmoadg) obj).f125929gxszxtbevo);
        }

        public int hashCode() {
            return this.f125929gxszxtbevo.hashCode();
        }

        @Override // sp1.iobyxmoadg
        protected Map wkgbmnqykc() {
            return this.f125929gxszxtbevo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Map specificArgs) {
            super("banner_load", null);
            zdlpuopuiu.btonecajqb(specificArgs, "specificArgs");
            this.f125929gxszxtbevo = specificArgs;
        }

        public /* synthetic */ iobyxmoadg(String str, String str2, String str3, String str4, String str5, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, str4, str5);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String id2, String str, String str2, String shopId, String str3) {
            this(tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("id", id2), cqumvgiudr.iobyxmoadg("shop_id", shopId), cqumvgiudr.iobyxmoadg("region", str), cqumvgiudr.iobyxmoadg("city", str2), cqumvgiudr.iobyxmoadg("delivery_type", str3)));
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(shopId, "shopId");
        }
    }

    private dxjokdxxww(String str) {
        super(str, null, 2, null);
    }
}
