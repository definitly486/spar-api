package okpsazkaxt;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.v0;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SnapshotStateList f73103iobyxmoadg = v0.gxszxtbevo();

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f73104cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f73105iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.wkgbmnqykc f73106jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f73107yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f73108zdlpuopuiu;

        iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar, boolean z13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.vdvldrhtss vdvldrhtssVar, tg.iobyxmoadg iobyxmoadgVar) {
            this.f73108zdlpuopuiu = rgvfuqvkyqVar;
            this.f73107yggfygwlhe = z13;
            this.f73106jyumaefscl = wkgbmnqykcVar;
            this.f73105iwizpuwonk = vdvldrhtssVar;
            this.f73104cqumvgiudr = iobyxmoadgVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((nufgyqmvbu) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 6) == 0) {
                i13 |= draadjrbmkVar.ulzqkzuiru(nufgyqmvbuVar) ? 4 : 2;
            }
            if (!draadjrbmkVar.vdvldrhtss((i13 & 19) != 18, i13 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(424163756, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:290)");
            }
            String str = (String) this.f73108zdlpuopuiu.invoke(draadjrbmkVar, 0);
            if (mj.kcexrzcfyt.zfvoamnweg(str)) {
                rlfsiqarku.eablkybsjg.ppxfxbqfkf("Label must not be blank");
            }
            esjtqupxsv.gtknphoqwx(str, this.f73107yggfygwlhe, nufgyqmvbuVar, this.f73106jyumaefscl, this.f73105iwizpuwonk, this.f73104cqumvgiudr, draadjrbmkVar, (i13 << 6) & 896, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static /* synthetic */ void gxszxtbevo(ojitshcjhn ojitshcjhnVar, tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, tg.vdvldrhtss vdvldrhtssVar, tg.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
        }
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        boolean z14 = z13;
        if ((i13 & 8) != 0) {
            vdvldrhtssVar = null;
        }
        ojitshcjhnVar.eablkybsjg(rgvfuqvkyqVar, wkgbmnqykcVar2, z14, vdvldrhtssVar, iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(ojitshcjhn ojitshcjhnVar, nufgyqmvbu nufgyqmvbuVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        ojitshcjhnVar.zoijcleaow(nufgyqmvbuVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void eablkybsjg(tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, tg.vdvldrhtss vdvldrhtssVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.f73103iobyxmoadg.add(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(424163756, true, new iobyxmoadg(rgvfuqvkyqVar, z13, wkgbmnqykcVar, vdvldrhtssVar, iobyxmoadgVar)));
    }

    public final void lqeggnwhkg() {
        this.f73103iobyxmoadg.add(okpsazkaxt.iobyxmoadg.f73082iobyxmoadg.iobyxmoadg());
    }

    public final void wkgbmnqykc() {
        this.f73103iobyxmoadg.clear();
    }

    public final void zoijcleaow(final nufgyqmvbu nufgyqmvbuVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1320309496);
        int i14 = (i13 & 6) == 0 ? (draadjrbmkVarBtonecajqb.ulzqkzuiru(nufgyqmvbuVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(this) ? 32 : 16;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 19) != 18, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1320309496, i14, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:248)");
            }
            SnapshotStateList snapshotStateList = this.f73103iobyxmoadg;
            int size = snapshotStateList.size();
            for (int i15 = 0; i15 < size; i15++) {
                ((tg.vdvldrhtss) snapshotStateList.get(i15)).invoke(nufgyqmvbuVar, draadjrbmkVarBtonecajqb, Integer.valueOf(i14 & 14));
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: okpsazkaxt.agtfadlqog
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ojitshcjhn.ppxfxbqfkf(this.f73049zdlpuopuiu, nufgyqmvbuVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
