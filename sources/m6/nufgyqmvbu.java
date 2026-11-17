package m6;

import android.os.Build;
import g6.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import p6.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu extends iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f65293zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(n6.nufgyqmvbu tracker) {
        super(tracker);
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        this.f65293zoijcleaow = 7;
    }

    @Override // m6.iobyxmoadg
    protected int eablkybsjg() {
        return this.f65293zoijcleaow;
    }

    @Override // m6.wkgbmnqykc
    public boolean iobyxmoadg(yggfygwlhe workSpec) {
        zdlpuopuiu.btonecajqb(workSpec, "workSpec");
        jyumaefscl jyumaefsclVarGxszxtbevo = workSpec.f75789btonecajqb.gxszxtbevo();
        return jyumaefsclVarGxszxtbevo == jyumaefscl.UNMETERED || (Build.VERSION.SDK_INT >= 30 && jyumaefsclVarGxszxtbevo == jyumaefscl.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m6.iobyxmoadg
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public boolean gxszxtbevo(l6.wkgbmnqykc value) {
        zdlpuopuiu.btonecajqb(value, "value");
        return !value.iobyxmoadg() || value.zoijcleaow();
    }
}
