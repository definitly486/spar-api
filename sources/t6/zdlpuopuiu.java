package t6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zdlpuopuiu {
    public Serializable iobyxmoadg(kc2.lqeggnwhkg lqeggnwhkgVar, long j13) {
        q0 q0VarZoijcleaow = zoijcleaow(lqeggnwhkgVar);
        if (q0VarZoijcleaow == null || q0VarZoijcleaow.zoijcleaow() + j13 <= System.currentTimeMillis()) {
            return null;
        }
        return q0VarZoijcleaow.iobyxmoadg();
    }

    public void ppxfxbqfkf(kc2.lqeggnwhkg lqeggnwhkgVar, Serializable serializable) {
        wkgbmnqykc(lqeggnwhkgVar, serializable != null ? new q0(serializable) : null);
    }

    protected abstract void wkgbmnqykc(kc2.lqeggnwhkg lqeggnwhkgVar, q0 q0Var);

    protected abstract q0 zoijcleaow(kc2.lqeggnwhkg lqeggnwhkgVar);
}
