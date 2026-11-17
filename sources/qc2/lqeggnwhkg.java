package qc2;

import android.content.Context;
import t6.kcexrzcfyt;
import t6.pmvmpeiblj;

/* JADX INFO: loaded from: classes6.dex */
abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kcexrzcfyt f78578iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f78579ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private eablkybsjg f78580zoijcleaow;

    protected lqeggnwhkg(Context context) {
        this.f78578iobyxmoadg = new kcexrzcfyt(context);
    }

    private void wkgbmnqykc() {
        if (this.f78580zoijcleaow != null) {
            if (pmvmpeiblj.gxszxtbevo(this.f78579ppxfxbqfkf)) {
                this.f78580zoijcleaow.zoijcleaow();
            } else {
                this.f78580zoijcleaow.iobyxmoadg(this.f78579ppxfxbqfkf);
            }
        }
    }

    protected abstract void eablkybsjg();

    protected kcexrzcfyt gxszxtbevo() {
        return this.f78578iobyxmoadg;
    }

    public void lqeggnwhkg(eablkybsjg eablkybsjgVar) {
        this.f78580zoijcleaow = eablkybsjgVar;
        zoijcleaow();
        eablkybsjg();
        ppxfxbqfkf();
    }

    protected void ppxfxbqfkf() {
        wkgbmnqykc();
        this.f78580zoijcleaow = null;
    }

    protected void zoijcleaow() {
        this.f78579ppxfxbqfkf = null;
    }
}
