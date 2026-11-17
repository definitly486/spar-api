package df1;

import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.myspar.proloyalty.card.domain.model.UserBalance;

/* JADX INFO: loaded from: classes5.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final esjtqupxsv f27931iobyxmoadg = new esjtqupxsv();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f27933zoijcleaow = tzroggbefp.draadjrbmk(iobyxmoadg.AbstractC0556iobyxmoadg.f28023iwizpuwonk.iobyxmoadg(), iobyxmoadg.gxszxtbevo.wkgbmnqykc.f28017pmvmpeiblj.iobyxmoadg(), iobyxmoadg.gtknphoqwx.f27981cqumvgiudr.iobyxmoadg(), iobyxmoadg.lqeggnwhkg.f28027cqumvgiudr.iobyxmoadg(), iobyxmoadg.gxszxtbevo.AbstractC0550iobyxmoadg.f28005zynmafqrjb.iobyxmoadg(), iobyxmoadg.gxszxtbevo.ppxfxbqfkf.f28011zynmafqrjb.iobyxmoadg(), iobyxmoadg.gxszxtbevo.AbstractC0548gxszxtbevo.f28000pmvmpeiblj.iobyxmoadg(), iobyxmoadg.wkgbmnqykc.f28048iwizpuwonk.iobyxmoadg(), iobyxmoadg.eablkybsjg.f27975cqumvgiudr.iobyxmoadg(), iobyxmoadg.gxszxtbevo.eablkybsjg.f27989pmvmpeiblj.iobyxmoadg(), iobyxmoadg.draadjrbmk.f27964cqumvgiudr.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg.nufgyqmvbu.f27954pmvmpeiblj.iobyxmoadg(), iobyxmoadg.ppxfxbqfkf.f28038iwizpuwonk.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg.lqeggnwhkg.f27952pmvmpeiblj.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg.C0536iobyxmoadg.f27950pmvmpeiblj.iobyxmoadg(), iobyxmoadg.dxjokdxxww.f27970iwizpuwonk.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg.dxjokdxxww.f27944pmvmpeiblj.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg.gxszxtbevo.f27948pmvmpeiblj.iobyxmoadg(), iobyxmoadg.wflxmlrfwp.f28043iwizpuwonk.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg.C0531btonecajqb.f27942pmvmpeiblj.iobyxmoadg(), iobyxmoadg.nufgyqmvbu.f28033iwizpuwonk.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg.zoijcleaow.f27960pmvmpeiblj.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg.ppxfxbqfkf.f27956pmvmpeiblj.iobyxmoadg(), iobyxmoadg.zoijcleaow.f28055iwizpuwonk.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg.wkgbmnqykc.f27958pmvmpeiblj.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg.eablkybsjg.f27946pmvmpeiblj.iobyxmoadg());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f27932ppxfxbqfkf = 8;

    private esjtqupxsv() {
    }

    public final Map iobyxmoadg(boolean z13, UserBalance userBalance) {
        Map map = f27933zoijcleaow;
        LinkedHashMap linkedHashMap = new LinkedHashMap(tzroggbefp.eablkybsjg(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) entry.getValue();
            Object zoijcleaowVar = null;
            if (iobyxmoadgVar instanceof iobyxmoadg.gxszxtbevo.AbstractC0550iobyxmoadg) {
                if (z13) {
                    zoijcleaowVar = userBalance == null ? iobyxmoadg.gxszxtbevo.AbstractC0550iobyxmoadg.ppxfxbqfkf.f28009istkbnxepw : new iobyxmoadg.gxszxtbevo.AbstractC0550iobyxmoadg.zoijcleaow(bf1.gxszxtbevo.iobyxmoadg(userBalance));
                }
            } else if (iobyxmoadgVar instanceof iobyxmoadg.gxszxtbevo) {
                Object value = entry.getValue();
                zoijcleaowVar = (iobyxmoadg) (z13 ? value : null);
            } else if (iobyxmoadgVar instanceof iobyxmoadg.AbstractC0556iobyxmoadg) {
                Object value2 = entry.getValue();
                zoijcleaowVar = (iobyxmoadg) (z13 ? null : value2);
            } else {
                zoijcleaowVar = (iobyxmoadg) entry.getValue();
            }
            linkedHashMap.put(key, zoijcleaowVar);
        }
        return linkedHashMap;
    }
}
