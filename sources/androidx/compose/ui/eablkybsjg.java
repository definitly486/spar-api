package androidx.compose.ui;

import androidx.compose.ui.layout.kcexrzcfyt;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import tg.draadjrbmk;
import x.istkbnxepw;
import x.pmvmpeiblj;
import z.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends wkgbmnqykc.ppxfxbqfkf implements yadqdtsiqt {

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f6179ylkuphrtab;

    static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f6180yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kcexrzcfyt f6181zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(kcexrzcfyt kcexrzcfytVar, eablkybsjg eablkybsjgVar) {
            super(1);
            this.f6181zdlpuopuiu = kcexrzcfytVar;
            this.f6180yggfygwlhe = eablkybsjgVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadgVar.zynmafqrjb(this.f6181zdlpuopuiu, 0, 0, this.f6180yggfygwlhe.H0());
        }
    }

    public eablkybsjg(float f13) {
        this.f6179ylkuphrtab = f13;
    }

    public final float H0() {
        return this.f6179ylkuphrtab;
    }

    public final void I0(float f13) {
        this.f6179ylkuphrtab = f13;
    }

    @Override // z.yadqdtsiqt
    public istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, pmvmpeiblj pmvmpeibljVar, long j13) {
        kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(j13);
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new iobyxmoadg(kcexrzcfytVarSflfametgt, this), 4, null);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.f6179ylkuphrtab + ')';
    }
}
