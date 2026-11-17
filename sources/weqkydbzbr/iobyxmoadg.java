package weqkydbzbr;

import androidx.collection.jpowsppfya;
import kotlin.jvm.internal.gtknphoqwx;
import lrnfpwlwnk.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jpowsppfya f119473iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f119474zoijcleaow;

    public iobyxmoadg() {
        int i13 = 0;
        int i14 = 1;
        gtknphoqwx gtknphoqwxVar = null;
        this.f119473iobyxmoadg = new jpowsppfya(i13, i14, gtknphoqwxVar);
        this.f119474zoijcleaow = new jpowsppfya(i13, i14, gtknphoqwxVar);
    }

    public final void iobyxmoadg(lrnfpwlwnk.zoijcleaow zoijcleaowVar) {
        this.f119473iobyxmoadg.agtfadlqog(zoijcleaowVar);
    }

    public final lrnfpwlwnk.ppxfxbqfkf ppxfxbqfkf() {
        jpowsppfya jpowsppfyaVar = new jpowsppfya(0, 1, false ? 1 : 0);
        jpowsppfya jpowsppfyaVar2 = this.f119473iobyxmoadg;
        Object[] objArr = jpowsppfyaVar2.f4343iobyxmoadg;
        int i13 = jpowsppfyaVar2.f4344zoijcleaow;
        int i14 = 0;
        boolean z13 = true;
        lrnfpwlwnk.zoijcleaow zoijcleaowVar = null;
        while (i14 < i13) {
            lrnfpwlwnk.zoijcleaow zoijcleaowVar2 = (lrnfpwlwnk.zoijcleaow) objArr[i14];
            if (!z13 || zoijcleaowVar2 != gxszxtbevo.f63955zoijcleaow) {
                if (zoijcleaow.iobyxmoadg(zoijcleaowVar2) && zoijcleaow.iobyxmoadg(zoijcleaowVar)) {
                    z13 = false;
                } else {
                    if (!zoijcleaow.iobyxmoadg(zoijcleaowVar2)) {
                        jpowsppfya jpowsppfyaVar3 = this.f119474zoijcleaow;
                        Object[] objArr2 = jpowsppfyaVar3.f4343iobyxmoadg;
                        int i15 = jpowsppfyaVar3.f4344zoijcleaow;
                        int i16 = 0;
                        while (true) {
                            if (i16 < i15) {
                                if (((Boolean) ((draadjrbmk) objArr2[i16]).invoke(zoijcleaowVar2)).booleanValue()) {
                                    i16++;
                                } else {
                                    z13 = false;
                                }
                            }
                        }
                    }
                    jpowsppfyaVar.agtfadlqog(zoijcleaowVar2);
                    z13 = false;
                    zoijcleaowVar = zoijcleaowVar2;
                }
            }
            i14++;
            z13 = z13;
        }
        if (zoijcleaow.iobyxmoadg((lrnfpwlwnk.zoijcleaow) (jpowsppfyaVar.lqeggnwhkg() ? null : jpowsppfyaVar.f4343iobyxmoadg[jpowsppfyaVar.f4344zoijcleaow - 1]))) {
            jpowsppfyaVar.zynmafqrjb(jpowsppfyaVar.f4344zoijcleaow - 1);
        }
        return new lrnfpwlwnk.ppxfxbqfkf(jpowsppfyaVar.kcexrzcfyt());
    }

    public final void wkgbmnqykc() {
        this.f119473iobyxmoadg.agtfadlqog(gxszxtbevo.f63955zoijcleaow);
    }

    public final void zoijcleaow(draadjrbmk draadjrbmkVar) {
        this.f119474zoijcleaow.agtfadlqog(draadjrbmkVar);
    }
}
