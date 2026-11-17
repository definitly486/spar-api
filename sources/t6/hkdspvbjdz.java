package t6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class hkdspvbjdz extends zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f109817iobyxmoadg = Collections.synchronizedMap(new HashMap());

    hkdspvbjdz() {
    }

    @Override // t6.zdlpuopuiu
    protected void wkgbmnqykc(kc2.lqeggnwhkg lqeggnwhkgVar, q0 q0Var) {
        if (q0Var == null) {
            this.f109817iobyxmoadg.remove(lqeggnwhkgVar);
        } else {
            this.f109817iobyxmoadg.put(lqeggnwhkgVar, q0Var);
        }
    }

    @Override // t6.zdlpuopuiu
    protected q0 zoijcleaow(kc2.lqeggnwhkg lqeggnwhkgVar) {
        return (q0) this.f109817iobyxmoadg.get(lqeggnwhkgVar);
    }
}
