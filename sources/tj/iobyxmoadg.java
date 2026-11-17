package tj;

import gg.wwaezpbzkn;
import java.util.Arrays;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private pmvmpeiblj f110683iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f110684jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f110685yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ppxfxbqfkf[] f110686zdlpuopuiu;

    protected final ppxfxbqfkf[] draadjrbmk() {
        return this.f110686zdlpuopuiu;
    }

    protected final void dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar) {
        pmvmpeiblj pmvmpeibljVar;
        int i13;
        lg.gxszxtbevo[] gxszxtbevoVarArrZoijcleaow;
        synchronized (this) {
            try {
                int i14 = this.f110685yggfygwlhe - 1;
                this.f110685yggfygwlhe = i14;
                pmvmpeibljVar = this.f110683iwizpuwonk;
                if (i14 == 0) {
                    this.f110684jyumaefscl = 0;
                }
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                gxszxtbevoVarArrZoijcleaow = ppxfxbqfkfVar.zoijcleaow(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (lg.gxszxtbevo gxszxtbevoVar : gxszxtbevoVarArrZoijcleaow) {
            if (gxszxtbevoVar != null) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                gxszxtbevoVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg));
            }
        }
        if (pmvmpeibljVar != null) {
            pmvmpeibljVar.jlmebxxoox(-1);
        }
    }

    protected final ppxfxbqfkf eablkybsjg() {
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        pmvmpeiblj pmvmpeibljVar;
        synchronized (this) {
            try {
                ppxfxbqfkf[] ppxfxbqfkfVarArrNufgyqmvbu = this.f110686zdlpuopuiu;
                if (ppxfxbqfkfVarArrNufgyqmvbu == null) {
                    ppxfxbqfkfVarArrNufgyqmvbu = nufgyqmvbu(2);
                    this.f110686zdlpuopuiu = ppxfxbqfkfVarArrNufgyqmvbu;
                } else if (this.f110685yggfygwlhe >= ppxfxbqfkfVarArrNufgyqmvbu.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(ppxfxbqfkfVarArrNufgyqmvbu, ppxfxbqfkfVarArrNufgyqmvbu.length * 2);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
                    this.f110686zdlpuopuiu = (ppxfxbqfkf[]) objArrCopyOf;
                    ppxfxbqfkfVarArrNufgyqmvbu = (ppxfxbqfkf[]) objArrCopyOf;
                }
                int i13 = this.f110684jyumaefscl;
                do {
                    ppxfxbqfkfVarGxszxtbevo = ppxfxbqfkfVarArrNufgyqmvbu[i13];
                    if (ppxfxbqfkfVarGxszxtbevo == null) {
                        ppxfxbqfkfVarGxszxtbevo = gxszxtbevo();
                        ppxfxbqfkfVarArrNufgyqmvbu[i13] = ppxfxbqfkfVarGxszxtbevo;
                    }
                    i13++;
                    if (i13 >= ppxfxbqfkfVarArrNufgyqmvbu.length) {
                        i13 = 0;
                    }
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVarGxszxtbevo, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!ppxfxbqfkfVarGxszxtbevo.iobyxmoadg(this));
                this.f110684jyumaefscl = i13;
                this.f110685yggfygwlhe++;
                pmvmpeibljVar = this.f110683iwizpuwonk;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pmvmpeibljVar != null) {
            pmvmpeibljVar.jlmebxxoox(1);
        }
        return ppxfxbqfkfVarGxszxtbevo;
    }

    protected final int gtknphoqwx() {
        return this.f110685yggfygwlhe;
    }

    protected abstract ppxfxbqfkf gxszxtbevo();

    public final wypolnanlu lqeggnwhkg() {
        pmvmpeiblj pmvmpeibljVar;
        synchronized (this) {
            pmvmpeibljVar = this.f110683iwizpuwonk;
            if (pmvmpeibljVar == null) {
                pmvmpeibljVar = new pmvmpeiblj(this.f110685yggfygwlhe);
                this.f110683iwizpuwonk = pmvmpeibljVar;
            }
        }
        return pmvmpeibljVar;
    }

    protected abstract ppxfxbqfkf[] nufgyqmvbu(int i13);
}
