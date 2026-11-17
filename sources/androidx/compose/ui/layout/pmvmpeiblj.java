package androidx.compose.ui.layout;

import android.graphics.Rect;
import androidx.collection.jlmebxxoox;
import androidx.collection.jpowsppfya;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.uawqvzlxes;
import java.util.List;
import x.dsvhmnatus;
import x.ntlheqmsrt;
import z.ageimvtcrz;

/* JADX INFO: loaded from: classes.dex */
final class pmvmpeiblj extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt, ageimvtcrz {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final tg.draadjrbmk f6536hcddaimhww;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private gxszxtbevo f6537pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f6538ylkuphrtab = -1;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kcexrzcfyt f6539zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(kcexrzcfyt kcexrzcfytVar) {
            super(1);
            this.f6539zdlpuopuiu = kcexrzcfytVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, this.f6539zdlpuopuiu, 0, 0, 0.0f, 4, null);
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f6540yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(1);
            this.f6540yggfygwlhe = gxszxtbevoVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((dsvhmnatus) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(dsvhmnatus dsvhmnatusVar) {
            pmvmpeiblj pmvmpeibljVar = pmvmpeiblj.this;
            pmvmpeibljVar.M0(pmvmpeibljVar.J0().gxszxtbevo());
            if (pmvmpeiblj.this.K0() > 0) {
                long jIobyxmoadg = dsvhmnatusVar.pmvmpeiblj().iobyxmoadg();
                jlmebxxoox jlmebxxooxVarBtonecajqb = this.f6540yggfygwlhe.btonecajqb();
                int i13 = (int) (jIobyxmoadg >> 32);
                int i14 = (int) (jIobyxmoadg & 4294967295L);
                for (iozdgvuglv iozdgvuglvVar : wwaezpbzkn.f6556zoijcleaow) {
                    Object objEablkybsjg = jlmebxxooxVarBtonecajqb.eablkybsjg(iozdgvuglvVar);
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objEablkybsjg);
                    ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) objEablkybsjg;
                    wwaezpbzkn.gxszxtbevo(dsvhmnatusVar, iozdgvuglvVar.iobyxmoadg(), ntlheqmsrtVar.iobyxmoadg(), i13, i14);
                    if (ntlheqmsrtVar.lqeggnwhkg()) {
                        wwaezpbzkn.gxszxtbevo(dsvhmnatusVar, ntlheqmsrtVar.ppxfxbqfkf(), ntlheqmsrtVar.wkgbmnqykc(), i13, i14);
                        wwaezpbzkn.gxszxtbevo(dsvhmnatusVar, ntlheqmsrtVar.eablkybsjg(), ntlheqmsrtVar.gxszxtbevo(), i13, i14);
                    }
                    wwaezpbzkn.gxszxtbevo(dsvhmnatusVar, iozdgvuglvVar.zoijcleaow(), ntlheqmsrtVar.zoijcleaow(), i13, i14);
                }
                if (pmvmpeiblj.this.H0().nufgyqmvbu()) {
                    jpowsppfya jpowsppfyaVarH0 = pmvmpeiblj.this.H0();
                    pmvmpeiblj pmvmpeibljVar2 = pmvmpeiblj.this;
                    Object[] objArr = jpowsppfyaVarH0.f4343iobyxmoadg;
                    int i15 = jpowsppfyaVarH0.f4344zoijcleaow;
                    for (int i16 = 0; i16 < i15; i16++) {
                        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objArr[i16];
                        yggfygwlhe yggfygwlheVar = (yggfygwlhe) pmvmpeibljVar2.I0().get(i16);
                        Rect rect = (Rect) iwxlajgrazVar.getValue();
                        dsvhmnatusVar.ixidwrxhsl(yggfygwlheVar.iobyxmoadg(), rect.left);
                        dsvhmnatusVar.ixidwrxhsl(yggfygwlheVar.ppxfxbqfkf(), rect.top);
                        dsvhmnatusVar.ixidwrxhsl(yggfygwlheVar.zoijcleaow(), rect.right);
                        dsvhmnatusVar.ixidwrxhsl(yggfygwlheVar.wkgbmnqykc(), rect.bottom);
                    }
                }
            }
        }
    }

    public pmvmpeiblj(gxszxtbevo gxszxtbevoVar) {
        this.f6537pkzmftpjix = gxszxtbevoVar;
        this.f6536hcddaimhww = new zoijcleaow(gxszxtbevoVar);
    }

    public final jpowsppfya H0() {
        return this.f6537pkzmftpjix.nufgyqmvbu();
    }

    public final List I0() {
        return this.f6537pkzmftpjix.lqeggnwhkg();
    }

    public final uawqvzlxes J0() {
        return this.f6537pkzmftpjix.dxjokdxxww();
    }

    public final int K0() {
        return this.f6538ylkuphrtab;
    }

    public final void L0(gxszxtbevo gxszxtbevoVar) {
        if (this.f6537pkzmftpjix != gxszxtbevoVar) {
            this.f6537pkzmftpjix = gxszxtbevoVar;
            z.wwaezpbzkn.eablkybsjg(this);
        }
    }

    public final void M0(int i13) {
        this.f6538ylkuphrtab = i13;
    }

    @Override // z.ageimvtcrz
    public Object dsvhmnatus() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(j13);
        return draadjrbmk.L(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, this.f6536hcddaimhww, new iobyxmoadg(kcexrzcfytVarSflfametgt), 4, null);
    }
}
