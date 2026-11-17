package hg;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class jlmebxxoox extends wkgbmnqykc implements RandomAccess {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f40241iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f40242jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f40243yggfygwlhe;

    public jlmebxxoox(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "list");
        this.f40243yggfygwlhe = list;
    }

    public final void btonecajqb(int i13, int i14) {
        wkgbmnqykc.f40274zdlpuopuiu.wkgbmnqykc(i13, i14, this.f40243yggfygwlhe.size());
        this.f40242jyumaefscl = i13;
        this.f40241iwizpuwonk = i14 - i13;
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public Object get(int i13) {
        wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, this.f40241iwizpuwonk);
        return this.f40243yggfygwlhe.get(this.f40242jyumaefscl + i13);
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f40241iwizpuwonk;
    }
}
