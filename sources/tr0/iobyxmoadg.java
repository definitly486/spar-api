package tr0;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg extends d8.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final tg.iobyxmoadg f111416yggfygwlhe;

    public iobyxmoadg(tg.iobyxmoadg binding) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f111416yggfygwlhe = binding;
    }

    public abstract void eablkybsjg(a6.iobyxmoadg iobyxmoadgVar, Object obj);

    protected final Context wkgbmnqykc() {
        Context context = ((a6.iobyxmoadg) this.f111416yggfygwlhe.invoke()).getRoot().getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        return context;
    }

    @Override // d8.wkgbmnqykc
    public void zoijcleaow(Object model) {
        zdlpuopuiu.btonecajqb(model, "model");
        eablkybsjg((a6.iobyxmoadg) this.f111416yggfygwlhe.invoke(), model);
    }
}
