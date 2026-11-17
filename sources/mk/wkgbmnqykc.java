package mk;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {
    public static final boolean iobyxmoadg(lk.nufgyqmvbu nufgyqmvbuVar, Object obj) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        if (obj instanceof lk.nufgyqmvbu) {
            lk.nufgyqmvbu nufgyqmvbuVar2 = (lk.nufgyqmvbu) obj;
            if (zdlpuopuiu.eablkybsjg(nufgyqmvbuVar2.wkgbmnqykc(), nufgyqmvbuVar.wkgbmnqykc()) && zdlpuopuiu.eablkybsjg(nufgyqmvbuVar2.iobyxmoadg(), nufgyqmvbuVar.iobyxmoadg())) {
                return true;
            }
        }
        return false;
    }

    public static final String ppxfxbqfkf(lk.nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        return nufgyqmvbuVar.wkgbmnqykc() + " authParams=" + nufgyqmvbuVar.iobyxmoadg();
    }

    public static final int zoijcleaow(lk.nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        return ((899 + nufgyqmvbuVar.wkgbmnqykc().hashCode()) * 31) + nufgyqmvbuVar.iobyxmoadg().hashCode();
    }
}
