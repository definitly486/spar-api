package ai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class crxdokpmqz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final czzsidtyhn f1918iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f1919ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final crxdokpmqz f1920wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f1921zoijcleaow;

    public crxdokpmqz(czzsidtyhn czzsidtyhnVar, List parametersInfo, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parametersInfo, "parametersInfo");
        this.f1918iobyxmoadg = czzsidtyhnVar;
        this.f1921zoijcleaow = parametersInfo;
        this.f1919ppxfxbqfkf = str;
        crxdokpmqz crxdokpmqzVar = null;
        if (str != null) {
            czzsidtyhn czzsidtyhnVarIobyxmoadg = czzsidtyhnVar != null ? czzsidtyhnVar.iobyxmoadg() : null;
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(parametersInfo, 10));
            Iterator it = parametersInfo.iterator();
            while (it.hasNext()) {
                czzsidtyhn czzsidtyhnVar2 = (czzsidtyhn) it.next();
                arrayList.add(czzsidtyhnVar2 != null ? czzsidtyhnVar2.iobyxmoadg() : null);
            }
            crxdokpmqzVar = new crxdokpmqz(czzsidtyhnVarIobyxmoadg, arrayList, null);
        }
        this.f1920wkgbmnqykc = crxdokpmqzVar;
    }

    public final String iobyxmoadg() {
        return this.f1919ppxfxbqfkf;
    }

    public final czzsidtyhn ppxfxbqfkf() {
        return this.f1918iobyxmoadg;
    }

    public final crxdokpmqz wkgbmnqykc() {
        return this.f1920wkgbmnqykc;
    }

    public final List zoijcleaow() {
        return this.f1921zoijcleaow;
    }
}
