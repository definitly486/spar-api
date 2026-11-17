package uj;

import pj.a;

/* JADX INFO: loaded from: classes3.dex */
final class wypolnanlu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final lg.btonecajqb f113677iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a[] f113678ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f113679wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object[] f113680zoijcleaow;

    public wypolnanlu(lg.btonecajqb btonecajqbVar, int i13) {
        this.f113677iobyxmoadg = btonecajqbVar;
        this.f113680zoijcleaow = new Object[i13];
        this.f113678ppxfxbqfkf = new a[i13];
    }

    public final void iobyxmoadg(a aVar, Object obj) {
        Object[] objArr = this.f113680zoijcleaow;
        int i13 = this.f113679wkgbmnqykc;
        objArr[i13] = obj;
        a[] aVarArr = this.f113678ppxfxbqfkf;
        this.f113679wkgbmnqykc = i13 + 1;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(aVar, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        aVarArr[i13] = aVar;
    }

    public final void zoijcleaow(lg.btonecajqb btonecajqbVar) {
        int length = this.f113678ppxfxbqfkf.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i13 = length - 1;
            a aVar = this.f113678ppxfxbqfkf[length];
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(aVar);
            aVar.istkbnxepw(btonecajqbVar, this.f113680zoijcleaow[length]);
            if (i13 < 0) {
                return;
            } else {
                length = i13;
            }
        }
    }
}
