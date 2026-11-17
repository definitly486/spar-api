package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class tbqsvytpvh {

    static final class iobyxmoadg implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ lrnfpwlwnk f5128yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f5129zdlpuopuiu;

        iobyxmoadg(tg.vdvldrhtss vdvldrhtssVar, lrnfpwlwnk lrnfpwlwnkVar) {
            this.f5129zdlpuopuiu = vdvldrhtssVar;
            this.f5128yggfygwlhe = lrnfpwlwnkVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if (!draadjrbmkVar.vdvldrhtss((i13 & 3) != 2, i13 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-412824043, i13, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f5129zdlpuopuiu.invoke(this.f5128yggfygwlhe, draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(tg.vdvldrhtss vdvldrhtssVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        ppxfxbqfkf(vdvldrhtssVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final tg.vdvldrhtss vdvldrhtssVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-709502251);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 3) != 2, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-709502251, i14, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)");
            }
            final rhgxfdycjh.rgvfuqvkyq rgvfuqvkyqVar = (rhgxfdycjh.rgvfuqvkyq) draadjrbmkVarBtonecajqb.ojitshcjhn(rhgxfdycjh.kcexrzcfyt.lqeggnwhkg());
            final rhgxfdycjh.lqeggnwhkg lqeggnwhkgVarZoijcleaow = rhgxfdycjh.ojitshcjhn.zoijcleaow(draadjrbmkVarBtonecajqb, 0);
            Object[] objArr = {rgvfuqvkyqVar};
            rhgxfdycjh.jyumaefscl jyumaefsclVarPpxfxbqfkf = lrnfpwlwnk.f5061iwizpuwonk.ppxfxbqfkf(rgvfuqvkyqVar, lqeggnwhkgVarZoijcleaow);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(lqeggnwhkgVarZoijcleaow);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: androidx.compose.foundation.lazy.layout.zeieaojujs
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return tbqsvytpvh.wkgbmnqykc(rgvfuqvkyqVar, lqeggnwhkgVarZoijcleaow);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            lrnfpwlwnk lrnfpwlwnkVar = (lrnfpwlwnk) rhgxfdycjh.wkgbmnqykc.eablkybsjg(objArr, jyumaefsclVarPpxfxbqfkf, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.runtime.lmojexxdyd.ppxfxbqfkf(rhgxfdycjh.kcexrzcfyt.lqeggnwhkg().wkgbmnqykc(lrnfpwlwnkVar), ezmngbhpjk.nufgyqmvbu.eablkybsjg(-412824043, true, new iobyxmoadg(vdvldrhtssVar, lrnfpwlwnkVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, b.f5523dxjokdxxww | 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: androidx.compose.foundation.lazy.layout.nuxfzjnpeb
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return tbqsvytpvh.eablkybsjg(vdvldrhtssVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lrnfpwlwnk wkgbmnqykc(rhgxfdycjh.rgvfuqvkyq rgvfuqvkyqVar, rhgxfdycjh.lqeggnwhkg lqeggnwhkgVar) {
        return new lrnfpwlwnk(rgvfuqvkyqVar, hg.tzroggbefp.dxjokdxxww(), lqeggnwhkgVar);
    }
}
