package zi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hkdspvbjdz extends igdgnonuha {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f130039eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jh.yfnezrywwk[] f130040ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iwxlajgraz[] f130041wkgbmnqykc;

    public /* synthetic */ hkdspvbjdz(jh.yfnezrywwk[] yfnezrywwkVarArr, iwxlajgraz[] iwxlajgrazVarArr, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(yfnezrywwkVarArr, iwxlajgrazVarArr, (i13 & 4) != 0 ? false : z13);
    }

    public final jh.yfnezrywwk[] btonecajqb() {
        return this.f130040ppxfxbqfkf;
    }

    public final iwxlajgraz[] dxjokdxxww() {
        return this.f130041wkgbmnqykc;
    }

    @Override // zi.igdgnonuha
    public iwxlajgraz eablkybsjg(kegysxyocb key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = key.grlcpdaxtj().wkgbmnqykc();
        jh.yfnezrywwk yfnezrywwkVar = nufgyqmvbuVarWkgbmnqykc instanceof jh.yfnezrywwk ? (jh.yfnezrywwk) nufgyqmvbuVarWkgbmnqykc : null;
        if (yfnezrywwkVar == null) {
            return null;
        }
        int index = yfnezrywwkVar.getIndex();
        jh.yfnezrywwk[] yfnezrywwkVarArr = this.f130040ppxfxbqfkf;
        if (index >= yfnezrywwkVarArr.length || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yfnezrywwkVarArr[index].btonecajqb(), yfnezrywwkVar.btonecajqb())) {
            return null;
        }
        return this.f130041wkgbmnqykc[index];
    }

    @Override // zi.igdgnonuha
    public boolean gxszxtbevo() {
        return this.f130041wkgbmnqykc.length == 0;
    }

    @Override // zi.igdgnonuha
    public boolean zoijcleaow() {
        return this.f130039eablkybsjg;
    }

    public hkdspvbjdz(jh.yfnezrywwk[] parameters, iwxlajgraz[] arguments, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arguments, "arguments");
        this.f130040ppxfxbqfkf = parameters;
        this.f130041wkgbmnqykc = arguments;
        this.f130039eablkybsjg = z13;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hkdspvbjdz(List parameters, List argumentsList) {
        this((jh.yfnezrywwk[]) parameters.toArray(new jh.yfnezrywwk[0]), (iwxlajgraz[]) argumentsList.toArray(new iwxlajgraz[0]), false, 4, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(argumentsList, "argumentsList");
    }
}
