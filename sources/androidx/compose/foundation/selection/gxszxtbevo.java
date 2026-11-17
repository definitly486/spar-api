package androidx.compose.foundation.selection;

import g0.nufgyqmvbu;
import g0.yadqdtsiqt;
import g0.zynmafqrjb;
import gg.wwaezpbzkn;
import ikoacuggdj.tzroggbefp;
import kotlin.jvm.internal.gtknphoqwx;
import tg.draadjrbmk;
import z.dvvnrvtcbc;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo extends androidx.compose.foundation.lqeggnwhkg {

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private boolean f5322czzsidtyhn;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private draadjrbmk f5323uwvvkdfqfp;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private final tg.iobyxmoadg f5324yfnezrywwk;

    public /* synthetic */ gxszxtbevo(boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z14, boolean z15, nufgyqmvbu nufgyqmvbuVar, draadjrbmk draadjrbmkVar2, gtknphoqwx gtknphoqwxVar) {
        this(z13, draadjrbmkVar, tzroggbefpVar, z14, z15, nufgyqmvbuVar, draadjrbmkVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn y1(draadjrbmk draadjrbmkVar, boolean z13) {
        draadjrbmkVar.invoke(Boolean.valueOf(!z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn z1(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.f5323uwvvkdfqfp.invoke(Boolean.valueOf(!gxszxtbevoVar.f5322czzsidtyhn));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void A1(boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z14, boolean z15, nufgyqmvbu nufgyqmvbuVar, draadjrbmk draadjrbmkVar2) {
        if (this.f5322czzsidtyhn != z13) {
            this.f5322czzsidtyhn = z13;
            dvvnrvtcbc.zoijcleaow(this);
        }
        this.f5323uwvvkdfqfp = draadjrbmkVar2;
        super.v1(draadjrbmkVar, tzroggbefpVar, z14, z15, null, nufgyqmvbuVar, this.f5324yfnezrywwk);
    }

    @Override // androidx.compose.foundation.iobyxmoadg
    public void X0(yadqdtsiqt yadqdtsiqtVar) {
        zynmafqrjb.roivzttewh(yadqdtsiqtVar, i0.zoijcleaow.iobyxmoadg(this.f5322czzsidtyhn));
    }

    private gxszxtbevo(final boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z14, boolean z15, nufgyqmvbu nufgyqmvbuVar, final draadjrbmk draadjrbmkVar2) {
        super(draadjrbmkVar, tzroggbefpVar, z14, z15, null, nufgyqmvbuVar, new tg.iobyxmoadg() { // from class: androidx.compose.foundation.selection.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gxszxtbevo.y1(draadjrbmkVar2, z13);
            }
        }, null);
        this.f5322czzsidtyhn = z13;
        this.f5323uwvvkdfqfp = draadjrbmkVar2;
        this.f5324yfnezrywwk = new tg.iobyxmoadg() { // from class: androidx.compose.foundation.selection.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gxszxtbevo.z1(this.f5321zdlpuopuiu);
            }
        };
    }
}
