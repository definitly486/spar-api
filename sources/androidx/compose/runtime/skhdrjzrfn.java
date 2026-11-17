package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
final class skhdrjzrfn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.dsvhmnatus f5939iobyxmoadg = ipoelvxyzq.zoijcleaow.eablkybsjg(null, 1, null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.collection.dsvhmnatus f5940zoijcleaow = ipoelvxyzq.zoijcleaow.eablkybsjg(null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gxszxtbevo(nuxfzjnpeb nuxfzjnpebVar, igdgnonuha igdgnonuhaVar) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(igdgnonuhaVar.iobyxmoadg(), nuxfzjnpebVar);
    }

    public final void eablkybsjg(final nuxfzjnpeb nuxfzjnpebVar) {
        Object objEablkybsjg = this.f5940zoijcleaow.eablkybsjg(nuxfzjnpebVar);
        if (objEablkybsjg != null) {
            if (!(objEablkybsjg instanceof androidx.collection.jpowsppfya)) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objEablkybsjg, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(objEablkybsjg);
                ipoelvxyzq.zoijcleaow.wflxmlrfwp(this.f5939iobyxmoadg, null, new tg.draadjrbmk() { // from class: androidx.compose.runtime.dvvnrvtcbc
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(skhdrjzrfn.gxszxtbevo(nuxfzjnpebVar, (igdgnonuha) obj));
                    }
                });
                return;
            }
            androidx.collection.mbcevpiqjq mbcevpiqjqVar = (androidx.collection.mbcevpiqjq) objEablkybsjg;
            Object[] objArr = mbcevpiqjqVar.f4343iobyxmoadg;
            int i13 = mbcevpiqjqVar.f4344zoijcleaow;
            for (int i14 = 0; i14 < i13; i14++) {
                Object obj = objArr[i14];
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
                ipoelvxyzq.zoijcleaow.wflxmlrfwp(this.f5939iobyxmoadg, null, new tg.draadjrbmk() { // from class: androidx.compose.runtime.dvvnrvtcbc
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(skhdrjzrfn.gxszxtbevo(nuxfzjnpebVar, (igdgnonuha) obj2));
                    }
                });
            }
        }
    }

    public final boolean ppxfxbqfkf(lrnfpwlwnk lrnfpwlwnkVar) {
        return ipoelvxyzq.zoijcleaow.gxszxtbevo(this.f5939iobyxmoadg, lrnfpwlwnkVar);
    }

    public final igdgnonuha wkgbmnqykc(lrnfpwlwnk lrnfpwlwnkVar) {
        igdgnonuha igdgnonuhaVar = (igdgnonuha) ipoelvxyzq.zoijcleaow.draadjrbmk(this.f5939iobyxmoadg, lrnfpwlwnkVar);
        if (ipoelvxyzq.zoijcleaow.dxjokdxxww(this.f5939iobyxmoadg)) {
            ipoelvxyzq.zoijcleaow.ppxfxbqfkf(this.f5940zoijcleaow);
        }
        return igdgnonuhaVar;
    }

    public final void zoijcleaow() {
        ipoelvxyzq.zoijcleaow.ppxfxbqfkf(this.f5939iobyxmoadg);
        ipoelvxyzq.zoijcleaow.ppxfxbqfkf(this.f5940zoijcleaow);
    }
}
