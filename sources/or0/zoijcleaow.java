package or0;

import a8.eablkybsjg;
import a8.lqeggnwhkg;
import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected Object f74123iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f74124zoijcleaow = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow eablkybsjg(a8.zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar;
    }

    public static /* synthetic */ eablkybsjg wkgbmnqykc(zoijcleaow zoijcleaowVar, lqeggnwhkg lqeggnwhkgVar, Object obj, a8.iobyxmoadg iobyxmoadgVar, a8.zoijcleaow zoijcleaowVar2, a8.ppxfxbqfkf ppxfxbqfkfVar, int i13, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = null;
        }
        return zoijcleaowVar.zoijcleaow(lqeggnwhkgVar, obj, iobyxmoadgVar, zoijcleaowVar2, ppxfxbqfkfVar);
    }

    public abstract Object btonecajqb();

    public final void dxjokdxxww(pkzmftpjix savedStateHandle) {
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        Object objZoijcleaow = savedStateHandle.zoijcleaow("BUNDLE_INITIAL_ARGS");
        if (objZoijcleaow != null) {
            gtknphoqwx(objZoijcleaow);
        }
    }

    protected final void gtknphoqwx(Object obj) {
        zdlpuopuiu.btonecajqb(obj, "<set-?>");
        this.f74123iobyxmoadg = obj;
    }

    protected final Object gxszxtbevo() {
        Object obj = this.f74123iobyxmoadg;
        if (obj != null) {
            return obj;
        }
        zdlpuopuiu.pmvmpeiblj("args");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final String lqeggnwhkg() {
        String name = getClass().getName();
        zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        return name;
    }

    public boolean nufgyqmvbu() {
        return this.f74124zoijcleaow;
    }

    public abstract eablkybsjg ppxfxbqfkf(Object obj);

    protected final eablkybsjg zoijcleaow(lqeggnwhkg lqeggnwhkgVar, Object initialState, a8.iobyxmoadg iobyxmoadgVar, final a8.zoijcleaow executor, a8.ppxfxbqfkf reducer) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        zdlpuopuiu.btonecajqb(initialState, "initialState");
        zdlpuopuiu.btonecajqb(executor, "executor");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        return lqeggnwhkgVar.iobyxmoadg(lqeggnwhkg(), false, initialState, iobyxmoadgVar, new tg.iobyxmoadg() { // from class: or0.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zoijcleaow.eablkybsjg(executor);
            }
        }, reducer);
    }
}
