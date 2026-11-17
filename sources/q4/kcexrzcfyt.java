package q4;

import android.util.SparseArray;
import t3.dsvhmnatus;
import t3.pkzmftpjix;

/* JADX INFO: loaded from: classes.dex */
public final class kcexrzcfyt implements t3.oxmwwwfdhm {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f77823iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final SparseArray f77824jyumaefscl = new SparseArray();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final oxmwwwfdhm.iobyxmoadg f77825yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final t3.oxmwwwfdhm f77826zdlpuopuiu;

    public kcexrzcfyt(t3.oxmwwwfdhm oxmwwwfdhmVar, oxmwwwfdhm.iobyxmoadg iobyxmoadgVar) {
        this.f77826zdlpuopuiu = oxmwwwfdhmVar;
        this.f77825yggfygwlhe = iobyxmoadgVar;
    }

    @Override // t3.oxmwwwfdhm
    public void agtfadlqog() {
        this.f77826zdlpuopuiu.agtfadlqog();
        if (this.f77823iwizpuwonk) {
            for (int i13 = 0; i13 < this.f77824jyumaefscl.size(); i13++) {
                ((yggfygwlhe) this.f77824jyumaefscl.valueAt(i13)).draadjrbmk(true);
            }
        }
    }

    @Override // t3.oxmwwwfdhm
    public void gxszxtbevo(pkzmftpjix pkzmftpjixVar) {
        this.f77826zdlpuopuiu.gxszxtbevo(pkzmftpjixVar);
    }

    @Override // t3.oxmwwwfdhm
    public dsvhmnatus kcexrzcfyt(int i13, int i14) {
        if (i14 != 3) {
            this.f77823iwizpuwonk = true;
            return this.f77826zdlpuopuiu.kcexrzcfyt(i13, i14);
        }
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) this.f77824jyumaefscl.get(i13);
        if (yggfygwlheVar != null) {
            return yggfygwlheVar;
        }
        yggfygwlhe yggfygwlheVar2 = new yggfygwlhe(this.f77826zdlpuopuiu.kcexrzcfyt(i13, i14), this.f77825yggfygwlhe);
        this.f77824jyumaefscl.put(i13, yggfygwlheVar2);
        return yggfygwlheVar2;
    }
}
