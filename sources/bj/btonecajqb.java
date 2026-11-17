package bj;

import hg.jyumaefscl;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb implements zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f16404iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f16405ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String[] f16406zoijcleaow;

    public btonecajqb(gtknphoqwx kind, String... formatParams) {
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(formatParams, "formatParams");
        this.f16404iobyxmoadg = kind;
        this.f16406zoijcleaow = formatParams;
        String strWkgbmnqykc = zoijcleaow.ERROR_TYPE.wkgbmnqykc();
        String strWkgbmnqykc2 = kind.wkgbmnqykc();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strWkgbmnqykc2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        String str2 = String.format(strWkgbmnqykc, Arrays.copyOf(new Object[]{str}, 1));
        zdlpuopuiu.dxjokdxxww(str2, "format(...)");
        this.f16405ppxfxbqfkf = str2;
    }

    @Override // zi.zeieaojujs
    public boolean eablkybsjg() {
        return false;
    }

    @Override // zi.zeieaojujs
    public List getParameters() {
        return jyumaefscl.wflxmlrfwp();
    }

    public final gtknphoqwx gxszxtbevo() {
        return this.f16404iobyxmoadg;
    }

    @Override // zi.zeieaojujs
    public zeieaojujs iobyxmoadg(aj.lqeggnwhkg kotlinTypeRefiner) {
        zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public final String lqeggnwhkg(int i13) {
        return this.f16406zoijcleaow[i13];
    }

    public String toString() {
        return this.f16405ppxfxbqfkf;
    }

    @Override // zi.zeieaojujs
    public gh.dxjokdxxww wflxmlrfwp() {
        return gh.lqeggnwhkg.f37238nufgyqmvbu.iobyxmoadg();
    }

    @Override // zi.zeieaojujs
    /* JADX INFO: renamed from: wkgbmnqykc */
    public jh.nufgyqmvbu ylkuphrtab() {
        return draadjrbmk.f16409iobyxmoadg.nufgyqmvbu();
    }

    @Override // zi.zeieaojujs
    public Collection zoijcleaow() {
        return jyumaefscl.wflxmlrfwp();
    }
}
