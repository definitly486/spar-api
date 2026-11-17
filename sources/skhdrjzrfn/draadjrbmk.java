package skhdrjzrfn;

import androidx.compose.ui.platform.w;

/* JADX INFO: loaded from: classes.dex */
final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final w f107401iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private t.pmvmpeiblj f107402ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f107403zoijcleaow;

    public draadjrbmk(w wVar) {
        this.f107401iobyxmoadg = wVar;
    }

    public final int iobyxmoadg() {
        return this.f107403zoijcleaow;
    }

    public final boolean ppxfxbqfkf(t.pmvmpeiblj pmvmpeibljVar, t.pmvmpeiblj pmvmpeibljVar2) {
        return pmvmpeibljVar2.ojitshcjhn() - pmvmpeibljVar.ojitshcjhn() < this.f107401iobyxmoadg.iobyxmoadg();
    }

    public final void wkgbmnqykc(t.rgvfuqvkyq rgvfuqvkyqVar) {
        t.pmvmpeiblj pmvmpeibljVar = this.f107402ppxfxbqfkf;
        t.pmvmpeiblj pmvmpeibljVar2 = (t.pmvmpeiblj) rgvfuqvkyqVar.ppxfxbqfkf().get(0);
        if (pmvmpeibljVar != null && ppxfxbqfkf(pmvmpeibljVar, pmvmpeibljVar2) && zoijcleaow(pmvmpeibljVar, pmvmpeibljVar2)) {
            this.f107403zoijcleaow++;
        } else {
            this.f107403zoijcleaow = 1;
        }
        this.f107402ppxfxbqfkf = pmvmpeibljVar2;
    }

    public final boolean zoijcleaow(t.pmvmpeiblj pmvmpeibljVar, t.pmvmpeiblj pmvmpeibljVar2) {
        return jlmebxxoox.dxjokdxxww(this.f107401iobyxmoadg, pmvmpeibljVar, pmvmpeibljVar2);
    }
}
