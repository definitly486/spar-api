package fi;

import di.iwizpuwonk;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f33905iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f33904zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final nufgyqmvbu f33903ppxfxbqfkf = new nufgyqmvbu(jyumaefscl.wflxmlrfwp());

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final nufgyqmvbu iobyxmoadg(iwizpuwonk table) {
            zdlpuopuiu.btonecajqb(table, "table");
            if (table.cqumvgiudr() == 0) {
                return zoijcleaow();
            }
            List listLereixgezr = table.lereixgezr();
            zdlpuopuiu.dxjokdxxww(listLereixgezr, "getRequirementList(...)");
            return new nufgyqmvbu(listLereixgezr, null);
        }

        public final nufgyqmvbu zoijcleaow() {
            return nufgyqmvbu.f33903ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ nufgyqmvbu(List list, gtknphoqwx gtknphoqwxVar) {
        this(list);
    }

    private nufgyqmvbu(List list) {
        this.f33905iobyxmoadg = list;
    }
}
