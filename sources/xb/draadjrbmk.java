package xb;

import cc.ojitshcjhn;

/* JADX INFO: loaded from: classes2.dex */
public class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tc.iobyxmoadg f121952iobyxmoadg;

    public draadjrbmk(tc.iobyxmoadg iobyxmoadgVar) {
        this.f121952iobyxmoadg = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zoijcleaow(eablkybsjg eablkybsjgVar, tc.zoijcleaow zoijcleaowVar) {
        ((rd.iobyxmoadg) zoijcleaowVar.get()).iobyxmoadg("firebase", eablkybsjgVar);
        lqeggnwhkg.gxszxtbevo().zoijcleaow("Registering RemoteConfig Rollouts subscriber");
    }

    public void ppxfxbqfkf(ojitshcjhn ojitshcjhnVar) {
        if (ojitshcjhnVar == null) {
            lqeggnwhkg.gxszxtbevo().gtknphoqwx("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final eablkybsjg eablkybsjgVar = new eablkybsjg(ojitshcjhnVar);
            this.f121952iobyxmoadg.iobyxmoadg(new tc.iobyxmoadg.InterfaceC2704iobyxmoadg() { // from class: xb.gtknphoqwx
                @Override // tc.iobyxmoadg.InterfaceC2704iobyxmoadg
                public final void iobyxmoadg(tc.zoijcleaow zoijcleaowVar) {
                    draadjrbmk.zoijcleaow(eablkybsjgVar, zoijcleaowVar);
                }
            });
        }
    }
}
