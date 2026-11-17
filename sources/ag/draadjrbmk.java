package ag;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk implements btonecajqb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f1705ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private volatile btonecajqb f1706iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile Object f1707zoijcleaow = f1705ppxfxbqfkf;

    private draadjrbmk(btonecajqb btonecajqbVar) {
        this.f1706iobyxmoadg = btonecajqbVar;
    }

    public static btonecajqb iobyxmoadg(btonecajqb btonecajqbVar) {
        return ((btonecajqbVar instanceof draadjrbmk) || (btonecajqbVar instanceof ppxfxbqfkf)) ? btonecajqbVar : new draadjrbmk((btonecajqb) dxjokdxxww.zoijcleaow(btonecajqbVar));
    }

    @Override // fg.iobyxmoadg
    public Object get() {
        Object obj = this.f1707zoijcleaow;
        if (obj != f1705ppxfxbqfkf) {
            return obj;
        }
        btonecajqb btonecajqbVar = this.f1706iobyxmoadg;
        if (btonecajqbVar == null) {
            return this.f1707zoijcleaow;
        }
        Object obj2 = btonecajqbVar.get();
        this.f1707zoijcleaow = obj2;
        this.f1706iobyxmoadg = null;
        return obj2;
    }
}
