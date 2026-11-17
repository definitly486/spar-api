package androidx.compose.ui.window;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;
import x.istkbnxepw;
import x.pmvmpeiblj;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f7439iobyxmoadg = new wkgbmnqykc();

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f7440zdlpuopuiu = new iobyxmoadg();

        public iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f7441zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(List list) {
            super(1);
            this.f7441zdlpuopuiu = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(this.f7441zdlpuopuiu);
            if (iOjitshcjhn < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, (androidx.compose.ui.layout.kcexrzcfyt) this.f7441zdlpuopuiu.get(i13), 0, 0, 0.0f, 4, null);
                if (i13 == iOjitshcjhn) {
                    return;
                } else {
                    i13++;
                }
            }
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.kcexrzcfyt f7442zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar) {
            super(1);
            this.f7442zdlpuopuiu = kcexrzcfytVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, this.f7442zdlpuopuiu, 0, 0, 0.0f, 4, null);
        }
    }

    @Override // x.zynmafqrjb
    public final istkbnxepw lqeggnwhkg(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, long j13) {
        int size = list.size();
        if (size == 0) {
            return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, 0, 0, null, iobyxmoadg.f7440zdlpuopuiu, 4, null);
        }
        if (size == 1) {
            androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = ((pmvmpeiblj) list.get(0)).sflfametgt(j13);
            return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new zoijcleaow(kcexrzcfytVarSflfametgt), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt2 = ((pmvmpeiblj) list.get(i13)).sflfametgt(j13);
            iMax = Math.max(iMax, kcexrzcfytVarSflfametgt2.eslsurpljm());
            iMax2 = Math.max(iMax2, kcexrzcfytVarSflfametgt2.ipoelvxyzq());
            arrayList.add(kcexrzcfytVarSflfametgt2);
        }
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iMax, iMax2, null, new ppxfxbqfkf(arrayList), 4, null);
    }
}
