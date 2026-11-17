package tbqsvytpvh;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private lqeggnwhkg f110242iobyxmoadg;

    public abstract void eablkybsjg();

    public final lqeggnwhkg iobyxmoadg() {
        return this.f110242iobyxmoadg;
    }

    public final lqeggnwhkg ppxfxbqfkf() {
        lqeggnwhkg lqeggnwhkgVar = this.f110242iobyxmoadg;
        if (lqeggnwhkgVar != null) {
            return lqeggnwhkgVar;
        }
        rlfsiqarku.eablkybsjg.wkgbmnqykc("ToolbarRequester is not initialized.");
        throw new KotlinNothingValueException();
    }

    public final void wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        this.f110242iobyxmoadg = lqeggnwhkgVar;
    }

    public abstract void zoijcleaow();
}
