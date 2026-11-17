package ni;

import jh.lmojexxdyd;
import zi.ikoacuggdj;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx extends lqeggnwhkg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ii.gxszxtbevo f70092ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ii.zoijcleaow f70093zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(ii.zoijcleaow enumClassId, ii.gxszxtbevo enumEntryName) {
        super(gg.cqumvgiudr.iobyxmoadg(enumClassId, enumEntryName));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumClassId, "enumClassId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumEntryName, "enumEntryName");
        this.f70093zoijcleaow = enumClassId;
        this.f70092ppxfxbqfkf = enumEntryName;
    }

    @Override // ni.lqeggnwhkg
    public kegysxyocb iobyxmoadg(lmojexxdyd module) {
        ikoacuggdj ikoacuggdjVarOjitshcjhn;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        jh.eablkybsjg eablkybsjgVarZoijcleaow = jh.esjtqupxsv.zoijcleaow(module, this.f70093zoijcleaow);
        if (eablkybsjgVarZoijcleaow != null) {
            if (!li.dxjokdxxww.pmvmpeiblj(eablkybsjgVarZoijcleaow)) {
                eablkybsjgVarZoijcleaow = null;
            }
            if (eablkybsjgVarZoijcleaow != null && (ikoacuggdjVarOjitshcjhn = eablkybsjgVarZoijcleaow.ojitshcjhn()) != null) {
                return ikoacuggdjVarOjitshcjhn;
            }
        }
        return bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16486rhgxfdycjh, this.f70093zoijcleaow.toString(), this.f70092ppxfxbqfkf.toString());
    }

    public final ii.gxszxtbevo ppxfxbqfkf() {
        return this.f70092ppxfxbqfkf;
    }

    @Override // ni.lqeggnwhkg
    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f70093zoijcleaow.nufgyqmvbu());
        sb3.append('.');
        sb3.append(this.f70092ppxfxbqfkf);
        return sb3.toString();
    }
}
