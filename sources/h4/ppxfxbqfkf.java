package h4;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf extends dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final long f39368eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final long f39369gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final dxjokdxxww[] f39370lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f39371ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f39372wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f39373zoijcleaow;

    public ppxfxbqfkf(String str, int i13, int i14, long j13, long j14, dxjokdxxww[] dxjokdxxwwVarArr) {
        super("CHAP");
        this.f39373zoijcleaow = str;
        this.f39371ppxfxbqfkf = i13;
        this.f39372wkgbmnqykc = i14;
        this.f39368eablkybsjg = j13;
        this.f39369gxszxtbevo = j14;
        this.f39370lqeggnwhkg = dxjokdxxwwVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ppxfxbqfkf.class != obj.getClass()) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f39371ppxfxbqfkf == ppxfxbqfkfVar.f39371ppxfxbqfkf && this.f39372wkgbmnqykc == ppxfxbqfkfVar.f39372wkgbmnqykc && this.f39368eablkybsjg == ppxfxbqfkfVar.f39368eablkybsjg && this.f39369gxszxtbevo == ppxfxbqfkfVar.f39369gxszxtbevo && Objects.equals(this.f39373zoijcleaow, ppxfxbqfkfVar.f39373zoijcleaow) && Arrays.equals(this.f39370lqeggnwhkg, ppxfxbqfkfVar.f39370lqeggnwhkg);
    }

    public int hashCode() {
        int i13 = (((((((527 + this.f39371ppxfxbqfkf) * 31) + this.f39372wkgbmnqykc) * 31) + ((int) this.f39368eablkybsjg)) * 31) + ((int) this.f39369gxszxtbevo)) * 31;
        String str = this.f39373zoijcleaow;
        return i13 + (str != null ? str.hashCode() : 0);
    }
}
