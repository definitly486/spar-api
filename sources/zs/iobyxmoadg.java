package zs;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg extends d8.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final tg.iobyxmoadg f131108yggfygwlhe;

    public iobyxmoadg(tg.iobyxmoadg binding) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f131108yggfygwlhe = binding;
    }

    public abstract void eablkybsjg(a6.iobyxmoadg iobyxmoadgVar, Object obj);

    protected final Context wkgbmnqykc() {
        Context context = ((a6.iobyxmoadg) this.f131108yggfygwlhe.invoke()).getRoot().getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        return context;
    }

    @Override // d8.wkgbmnqykc
    public void zoijcleaow(Object model) {
        zdlpuopuiu.btonecajqb(model, "model");
        eablkybsjg((a6.iobyxmoadg) this.f131108yggfygwlhe.invoke(), model);
    }
}
