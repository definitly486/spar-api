package u1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public class gxszxtbevo implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object[] f112464iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f112465zoijcleaow;

    public gxszxtbevo(int i13) {
        if (i13 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f112464iobyxmoadg = new Object[i13];
    }

    private final boolean ppxfxbqfkf(Object obj) {
        int i13 = this.f112465zoijcleaow;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f112464iobyxmoadg[i14] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // u1.eablkybsjg
    public boolean iobyxmoadg(Object instance) {
        zdlpuopuiu.btonecajqb(instance, "instance");
        if (ppxfxbqfkf(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i13 = this.f112465zoijcleaow;
        Object[] objArr = this.f112464iobyxmoadg;
        if (i13 >= objArr.length) {
            return false;
        }
        objArr[i13] = instance;
        this.f112465zoijcleaow = i13 + 1;
        return true;
    }

    @Override // u1.eablkybsjg
    public Object zoijcleaow() {
        int i13 = this.f112465zoijcleaow;
        if (i13 <= 0) {
            return null;
        }
        int i14 = i13 - 1;
        Object obj = this.f112464iobyxmoadg[i14];
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f112464iobyxmoadg[i14] = null;
        this.f112465zoijcleaow--;
        return obj;
    }
}
