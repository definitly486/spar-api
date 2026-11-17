package e3;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f30255zdlpuopuiu;

    public final void agtfadlqog(int i13) {
        this.f30255zdlpuopuiu = i13;
    }

    public final boolean btonecajqb() {
        return lqeggnwhkg(134217728);
    }

    public final boolean draadjrbmk() {
        return lqeggnwhkg(536870912);
    }

    public final boolean dxjokdxxww() {
        return lqeggnwhkg(4);
    }

    public final void eablkybsjg(int i13) {
        this.f30255zdlpuopuiu = i13 | this.f30255zdlpuopuiu;
    }

    public final boolean gtknphoqwx() {
        return lqeggnwhkg(1);
    }

    public void gxszxtbevo() {
        this.f30255zdlpuopuiu = 0;
    }

    protected final boolean lqeggnwhkg(int i13) {
        return (this.f30255zdlpuopuiu & i13) == i13;
    }

    public final boolean nufgyqmvbu() {
        return lqeggnwhkg(268435456);
    }

    public final boolean wflxmlrfwp() {
        return lqeggnwhkg(67108864);
    }
}
