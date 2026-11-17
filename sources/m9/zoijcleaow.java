package m9;

import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.jyumaefscl;
import androidx.fragment.app.oxmwwwfdhm;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import l9.dxjokdxxww;
import l9.eablkybsjg;
import l9.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow implements dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f66579eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f66580iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final FragmentManager f66581ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jyumaefscl f66582wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f66583zoijcleaow;

    public zoijcleaow(oxmwwwfdhm activity, int i13, FragmentManager fragmentManager, jyumaefscl fragmentFactory) {
        zdlpuopuiu.btonecajqb(activity, "activity");
        zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
        zdlpuopuiu.btonecajqb(fragmentFactory, "fragmentFactory");
        this.f66580iobyxmoadg = activity;
        this.f66583zoijcleaow = i13;
        this.f66581ppxfxbqfkf = fragmentManager;
        this.f66582wkgbmnqykc = fragmentFactory;
        this.f66579eablkybsjg = new ArrayList();
    }

    private final void ppxfxbqfkf() {
        this.f66579eablkybsjg.clear();
        this.f66581ppxfxbqfkf.u(null, 1);
    }

    protected final List btonecajqb() {
        return this.f66579eablkybsjg;
    }

    protected final FragmentManager dxjokdxxww() {
        return this.f66581ppxfxbqfkf;
    }

    protected void eablkybsjg(eablkybsjg command, RuntimeException error) {
        zdlpuopuiu.btonecajqb(command, "command");
        zdlpuopuiu.btonecajqb(error, "error");
        throw error;
    }

    protected void gtknphoqwx(iobyxmoadg screen, Intent activityIntent) {
        zdlpuopuiu.btonecajqb(screen, "screen");
        zdlpuopuiu.btonecajqb(activityIntent, "activityIntent");
    }

    protected final oxmwwwfdhm gxszxtbevo() {
        return this.f66580iobyxmoadg;
    }

    protected final int lqeggnwhkg() {
        return this.f66583zoijcleaow;
    }

    protected final jyumaefscl nufgyqmvbu() {
        return this.f66582wkgbmnqykc;
    }

    protected void wkgbmnqykc(vdvldrhtss screen) {
        zdlpuopuiu.btonecajqb(screen, "screen");
        ppxfxbqfkf();
    }

    protected void zoijcleaow() {
        this.f66580iobyxmoadg.finish();
    }
}
