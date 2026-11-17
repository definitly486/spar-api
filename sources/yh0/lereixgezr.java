package yh0;

import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.myspar.user.models.UserCard;

/* JADX INFO: loaded from: classes4.dex */
public final class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lereixgezr f125163iobyxmoadg = new lereixgezr();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f125165zoijcleaow = tzroggbefp.draadjrbmk(iobyxmoadg.gxszxtbevo.wkgbmnqykc.f125116pmvmpeiblj.iobyxmoadg(), iobyxmoadg.gtknphoqwx.f125080cqumvgiudr.iobyxmoadg(), iobyxmoadg.lqeggnwhkg.f125126cqumvgiudr.iobyxmoadg(), iobyxmoadg.AbstractC3181iobyxmoadg.f125122iwizpuwonk.iobyxmoadg(), iobyxmoadg.gxszxtbevo.AbstractC3175iobyxmoadg.f125104zynmafqrjb.iobyxmoadg(), iobyxmoadg.gxszxtbevo.ppxfxbqfkf.f125110zynmafqrjb.iobyxmoadg(), iobyxmoadg.gxszxtbevo.AbstractC3173gxszxtbevo.f125099pmvmpeiblj.iobyxmoadg(), iobyxmoadg.wkgbmnqykc.f125147iwizpuwonk.iobyxmoadg(), iobyxmoadg.eablkybsjg.f125075cqumvgiudr.iobyxmoadg(), iobyxmoadg.gxszxtbevo.eablkybsjg.f125088pmvmpeiblj.iobyxmoadg(), iobyxmoadg.draadjrbmk.f125064cqumvgiudr.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.nufgyqmvbu.f125054pmvmpeiblj.iobyxmoadg(), iobyxmoadg.ppxfxbqfkf.f125137iwizpuwonk.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.lqeggnwhkg.f125052pmvmpeiblj.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.C3161iobyxmoadg.f125050pmvmpeiblj.iobyxmoadg(), iobyxmoadg.dxjokdxxww.f125070iwizpuwonk.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.dxjokdxxww.f125044pmvmpeiblj.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.gxszxtbevo.f125048pmvmpeiblj.iobyxmoadg(), iobyxmoadg.wflxmlrfwp.f125142iwizpuwonk.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.C3156btonecajqb.f125042pmvmpeiblj.iobyxmoadg(), iobyxmoadg.nufgyqmvbu.f125132iwizpuwonk.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.zoijcleaow.f125060pmvmpeiblj.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.ppxfxbqfkf.f125056pmvmpeiblj.iobyxmoadg(), iobyxmoadg.zoijcleaow.f125156iwizpuwonk.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.wkgbmnqykc.f125058pmvmpeiblj.iobyxmoadg(), iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg.eablkybsjg.f125046pmvmpeiblj.iobyxmoadg());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f125164ppxfxbqfkf = 8;

    private lereixgezr() {
    }

    public final Map iobyxmoadg(boolean z13, UserCard userCard) {
        Map map = f125165zoijcleaow;
        LinkedHashMap linkedHashMap = new LinkedHashMap(tzroggbefp.eablkybsjg(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) entry.getValue();
            Object zoijcleaowVar = null;
            if (iobyxmoadgVar instanceof iobyxmoadg.gxszxtbevo.AbstractC3175iobyxmoadg) {
                if (z13) {
                    zoijcleaowVar = userCard == null ? iobyxmoadg.gxszxtbevo.AbstractC3175iobyxmoadg.ppxfxbqfkf.f125108istkbnxepw : new iobyxmoadg.gxszxtbevo.AbstractC3175iobyxmoadg.zoijcleaow(wh0.ppxfxbqfkf.iobyxmoadg(userCard));
                }
            } else if (iobyxmoadgVar instanceof iobyxmoadg.gxszxtbevo) {
                Object value = entry.getValue();
                zoijcleaowVar = (iobyxmoadg) (z13 ? value : null);
            } else if (iobyxmoadgVar instanceof iobyxmoadg.AbstractC3181iobyxmoadg) {
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
