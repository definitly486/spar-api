package f6;

import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
final class lqeggnwhkg extends gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final eablkybsjg f32918eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f32919ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo.zoijcleaow f32920wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f32921zoijcleaow;

    public lqeggnwhkg(Object value, String tag, gxszxtbevo.zoijcleaow verificationMode, eablkybsjg logger) {
        zdlpuopuiu.btonecajqb(value, "value");
        zdlpuopuiu.btonecajqb(tag, "tag");
        zdlpuopuiu.btonecajqb(verificationMode, "verificationMode");
        zdlpuopuiu.btonecajqb(logger, "logger");
        this.f32921zoijcleaow = value;
        this.f32919ppxfxbqfkf = tag;
        this.f32920wkgbmnqykc = verificationMode;
        this.f32918eablkybsjg = logger;
    }

    @Override // f6.gxszxtbevo
    public Object iobyxmoadg() {
        return this.f32921zoijcleaow;
    }

    @Override // f6.gxszxtbevo
    public gxszxtbevo ppxfxbqfkf(String message, draadjrbmk condition) {
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(condition, "condition");
        return ((Boolean) condition.invoke(this.f32921zoijcleaow)).booleanValue() ? this : new wkgbmnqykc(this.f32921zoijcleaow, this.f32919ppxfxbqfkf, message, this.f32918eablkybsjg, this.f32920wkgbmnqykc);
    }
}
