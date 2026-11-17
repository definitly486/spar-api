package y;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private btonecajqb f123490iobyxmoadg;

    public iobyxmoadg(btonecajqb btonecajqbVar) {
        super(null);
        this.f123490iobyxmoadg = btonecajqbVar;
    }

    @Override // y.lqeggnwhkg
    public boolean iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        return ppxfxbqfkfVar == this.f123490iobyxmoadg.getKey();
    }

    public final void ppxfxbqfkf(btonecajqb btonecajqbVar) {
        this.f123490iobyxmoadg = btonecajqbVar;
    }

    @Override // y.lqeggnwhkg
    public Object zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
        if (!(ppxfxbqfkfVar == this.f123490iobyxmoadg.getKey())) {
            w.iobyxmoadg.zoijcleaow("Check failed.");
        }
        return this.f123490iobyxmoadg.getValue();
    }
}
