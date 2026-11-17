package u1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public class lqeggnwhkg extends gxszxtbevo {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f112466ppxfxbqfkf;

    public lqeggnwhkg(int i13) {
        super(i13);
        this.f112466ppxfxbqfkf = new Object();
    }

    @Override // u1.gxszxtbevo, u1.eablkybsjg
    public boolean iobyxmoadg(Object instance) {
        boolean zIobyxmoadg;
        zdlpuopuiu.btonecajqb(instance, "instance");
        synchronized (this.f112466ppxfxbqfkf) {
            zIobyxmoadg = super.iobyxmoadg(instance);
        }
        return zIobyxmoadg;
    }

    @Override // u1.gxszxtbevo, u1.eablkybsjg
    public Object zoijcleaow() {
        Object objZoijcleaow;
        synchronized (this.f112466ppxfxbqfkf) {
            objZoijcleaow = super.zoijcleaow();
        }
        return objZoijcleaow;
    }
}
