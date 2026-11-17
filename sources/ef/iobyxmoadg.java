package ef;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg extends RecyclerView.iozdgvuglv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private tg.iobyxmoadg f31233eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private tg.iobyxmoadg f31234gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final a6.iobyxmoadg f31235iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private tg.iobyxmoadg f31236lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private tg.iobyxmoadg f31237nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Context f31238ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private draadjrbmk f31239wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Object f31240zoijcleaow;

    /* JADX INFO: renamed from: ef.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0661iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0661iobyxmoadg f31241iobyxmoadg = new C0661iobyxmoadg();

        private C0661iobyxmoadg() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ iobyxmoadg(a6.iobyxmoadg iobyxmoadgVar, View view, int i13, gtknphoqwx gtknphoqwxVar) {
        if ((i13 & 2) != 0) {
            view = iobyxmoadgVar.getRoot();
            zdlpuopuiu.dxjokdxxww(view, "class AdapterDelegateVie…romWindow = block\n    }\n}");
        }
        this(iobyxmoadgVar, view);
    }

    public final tg.iobyxmoadg btonecajqb() {
        return this.f31237nufgyqmvbu;
    }

    public final void draadjrbmk(Object obj) {
        zdlpuopuiu.btonecajqb(obj, "<set-?>");
        this.f31240zoijcleaow = obj;
    }

    public final tg.iobyxmoadg dxjokdxxww() {
        return this.f31236lqeggnwhkg;
    }

    public final Object eablkybsjg() {
        Object obj = this.f31240zoijcleaow;
        if (obj != C0661iobyxmoadg.f31241iobyxmoadg) {
            return obj;
        }
        throw new IllegalArgumentException("Item has not been set yet. That is an internal issue. Please report at https://github.com/sockeqwe/AdapterDelegates");
    }

    public final tg.iobyxmoadg gtknphoqwx() {
        return this.f31233eablkybsjg;
    }

    public final String gxszxtbevo(int i13, Object... formatArgs) {
        zdlpuopuiu.btonecajqb(formatArgs, "formatArgs");
        String string = this.f31238ppxfxbqfkf.getString(i13, Arrays.copyOf(formatArgs, formatArgs.length));
        zdlpuopuiu.dxjokdxxww(string, "context.getString(resId, *formatArgs)");
        return string;
    }

    public final draadjrbmk lqeggnwhkg() {
        return this.f31239wkgbmnqykc;
    }

    public final tg.iobyxmoadg nufgyqmvbu() {
        return this.f31234gxszxtbevo;
    }

    public final a6.iobyxmoadg ppxfxbqfkf() {
        return this.f31235iobyxmoadg;
    }

    public final Context wkgbmnqykc() {
        return this.f31238ppxfxbqfkf;
    }

    public final void zoijcleaow(draadjrbmk bindingBlock) {
        zdlpuopuiu.btonecajqb(bindingBlock, "bindingBlock");
        if (this.f31239wkgbmnqykc != null) {
            throw new IllegalStateException("bind { ... } is already defined. Only one bind { ... } is allowed.");
        }
        this.f31239wkgbmnqykc = bindingBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(a6.iobyxmoadg binding, View view) {
        super(view);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(view, "view");
        this.f31235iobyxmoadg = binding;
        this.f31240zoijcleaow = C0661iobyxmoadg.f31241iobyxmoadg;
        Context context = view.getContext();
        zdlpuopuiu.dxjokdxxww(context, "view.context");
        this.f31238ppxfxbqfkf = context;
    }
}
