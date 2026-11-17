package ub;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface wkgbmnqykc {
    default tc.iobyxmoadg dxjokdxxww(Class cls) {
        return eablkybsjg(pmvmpeiblj.zoijcleaow(cls));
    }

    tc.iobyxmoadg eablkybsjg(pmvmpeiblj pmvmpeibljVar);

    default tc.zoijcleaow gxszxtbevo(Class cls) {
        return lqeggnwhkg(pmvmpeiblj.zoijcleaow(cls));
    }

    default Object iobyxmoadg(Class cls) {
        return zoijcleaow(pmvmpeiblj.zoijcleaow(cls));
    }

    tc.zoijcleaow lqeggnwhkg(pmvmpeiblj pmvmpeibljVar);

    default Set nufgyqmvbu(pmvmpeiblj pmvmpeibljVar) {
        return (Set) ppxfxbqfkf(pmvmpeibljVar).get();
    }

    tc.zoijcleaow ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar);

    default Set wkgbmnqykc(Class cls) {
        return nufgyqmvbu(pmvmpeiblj.zoijcleaow(cls));
    }

    default Object zoijcleaow(pmvmpeiblj pmvmpeibljVar) {
        tc.zoijcleaow zoijcleaowVarLqeggnwhkg = lqeggnwhkg(pmvmpeibljVar);
        if (zoijcleaowVarLqeggnwhkg == null) {
            return null;
        }
        return zoijcleaowVarLqeggnwhkg.get();
    }
}
