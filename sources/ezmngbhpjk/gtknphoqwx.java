package ezmngbhpjk;

import androidx.compose.runtime.u;
import androidx.compose.runtime.v;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx implements u {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f32428yggfygwlhe = new ipoelvxyzq.ppxfxbqfkf(new v[16], 0);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Set f32429zdlpuopuiu;

    public gtknphoqwx(Set set) {
        this.f32429zdlpuopuiu = set;
    }

    @Override // androidx.compose.runtime.u
    public void eablkybsjg() {
    }

    public final ipoelvxyzq.ppxfxbqfkf iobyxmoadg() {
        return this.f32428yggfygwlhe;
    }

    @Override // androidx.compose.runtime.u
    public void ppxfxbqfkf() {
    }

    @Override // androidx.compose.runtime.u
    public void zoijcleaow() {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f32428yggfygwlhe;
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            u uVarZoijcleaow = ((v) objArr[i13]).zoijcleaow();
            this.f32429zdlpuopuiu.remove(uVarZoijcleaow);
            uVarZoijcleaow.zoijcleaow();
        }
    }
}
