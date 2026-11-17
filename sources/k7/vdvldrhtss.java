package k7;

import android.graphics.PointF;
import com.airbnb.lottie.hcddaimhww;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vdvldrhtss implements kcexrzcfyt, l7.iobyxmoadg.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final hcddaimhww f54074iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final l7.iobyxmoadg f54075ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private q7.ojitshcjhn f54076wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f54077zoijcleaow;

    public vdvldrhtss(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, q7.agtfadlqog agtfadlqogVar) {
        this.f54074iobyxmoadg = hcddaimhwwVar;
        this.f54077zoijcleaow = agtfadlqogVar.ppxfxbqfkf();
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg = agtfadlqogVar.zoijcleaow().eablkybsjg();
        this.f54075ppxfxbqfkf = iobyxmoadgVarEablkybsjg;
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg);
        iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
    }

    private q7.ojitshcjhn btonecajqb(q7.ojitshcjhn ojitshcjhnVar) {
        List listIobyxmoadg = ojitshcjhnVar.iobyxmoadg();
        boolean zWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
        int size = listIobyxmoadg.size() - 1;
        int i13 = 0;
        while (size >= 0) {
            o7.iobyxmoadg iobyxmoadgVar = (o7.iobyxmoadg) listIobyxmoadg.get(size);
            o7.iobyxmoadg iobyxmoadgVar2 = (o7.iobyxmoadg) listIobyxmoadg.get(lqeggnwhkg(size - 1, listIobyxmoadg.size()));
            PointF pointFPpxfxbqfkf = (size != 0 || zWkgbmnqykc) ? iobyxmoadgVar2.ppxfxbqfkf() : ojitshcjhnVar.zoijcleaow();
            i13 = (((size != 0 || zWkgbmnqykc) ? iobyxmoadgVar2.zoijcleaow() : pointFPpxfxbqfkf).equals(pointFPpxfxbqfkf) && iobyxmoadgVar.iobyxmoadg().equals(pointFPpxfxbqfkf) && !(!ojitshcjhnVar.wkgbmnqykc() && (size == 0 || size == listIobyxmoadg.size() - 1))) ? i13 + 2 : i13 + 1;
            size--;
        }
        q7.ojitshcjhn ojitshcjhnVar2 = this.f54076wkgbmnqykc;
        if (ojitshcjhnVar2 == null || ojitshcjhnVar2.iobyxmoadg().size() != i13) {
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList.add(new o7.iobyxmoadg());
            }
            this.f54076wkgbmnqykc = new q7.ojitshcjhn(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f54076wkgbmnqykc.eablkybsjg(zWkgbmnqykc);
        return this.f54076wkgbmnqykc;
    }

    private static int lqeggnwhkg(int i13, int i14) {
        return i13 - (ppxfxbqfkf(i13, i14) * i14);
    }

    private static int ppxfxbqfkf(int i13, int i14) {
        int i15 = i13 / i14;
        return ((i13 ^ i14) >= 0 || i14 * i15 == i13) ? i15 : i15 - 1;
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        this.f54074iobyxmoadg.invalidateSelf();
    }

    public l7.iobyxmoadg nufgyqmvbu() {
        return this.f54075ppxfxbqfkf;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    @Override // k7.kcexrzcfyt
    public q7.ojitshcjhn wkgbmnqykc(q7.ojitshcjhn ojitshcjhnVar) {
        boolean z13;
        List listIobyxmoadg = ojitshcjhnVar.iobyxmoadg();
        if (listIobyxmoadg.size() <= 2) {
            return ojitshcjhnVar;
        }
        float fFloatValue = ((Float) this.f54075ppxfxbqfkf.nufgyqmvbu()).floatValue();
        if (fFloatValue == 0.0f) {
            return ojitshcjhnVar;
        }
        q7.ojitshcjhn ojitshcjhnVarBtonecajqb = btonecajqb(ojitshcjhnVar);
        ojitshcjhnVarBtonecajqb.gxszxtbevo(ojitshcjhnVar.zoijcleaow().x, ojitshcjhnVar.zoijcleaow().y);
        List listIobyxmoadg2 = ojitshcjhnVarBtonecajqb.iobyxmoadg();
        boolean zWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
        int i13 = 0;
        int i14 = 0;
        while (i13 < listIobyxmoadg.size()) {
            o7.iobyxmoadg iobyxmoadgVar = (o7.iobyxmoadg) listIobyxmoadg.get(i13);
            o7.iobyxmoadg iobyxmoadgVar2 = (o7.iobyxmoadg) listIobyxmoadg.get(lqeggnwhkg(i13 - 1, listIobyxmoadg.size()));
            o7.iobyxmoadg iobyxmoadgVar3 = (o7.iobyxmoadg) listIobyxmoadg.get(lqeggnwhkg(i13 - 2, listIobyxmoadg.size()));
            PointF pointFPpxfxbqfkf = (i13 != 0 || zWkgbmnqykc) ? iobyxmoadgVar2.ppxfxbqfkf() : ojitshcjhnVar.zoijcleaow();
            PointF pointFZoijcleaow = (i13 != 0 || zWkgbmnqykc) ? iobyxmoadgVar2.zoijcleaow() : pointFPpxfxbqfkf;
            PointF pointFIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            PointF pointFPpxfxbqfkf2 = iobyxmoadgVar3.ppxfxbqfkf();
            PointF pointFPpxfxbqfkf3 = iobyxmoadgVar.ppxfxbqfkf();
            if (ojitshcjhnVar.wkgbmnqykc()) {
                z13 = false;
            } else {
                z13 = true;
                if (i13 != 0 && i13 != listIobyxmoadg.size() - 1) {
                    z13 = false;
                }
            }
            if (pointFZoijcleaow.equals(pointFPpxfxbqfkf) && pointFIobyxmoadg.equals(pointFPpxfxbqfkf) && !z13) {
                float f13 = pointFPpxfxbqfkf.x;
                float f14 = f13 - pointFPpxfxbqfkf2.x;
                float f15 = pointFPpxfxbqfkf.y;
                float f16 = f15 - pointFPpxfxbqfkf2.y;
                float f17 = pointFPpxfxbqfkf3.x - f13;
                float f18 = pointFPpxfxbqfkf3.y - f15;
                float fHypot = (float) Math.hypot(f14, f16);
                float fHypot2 = (float) Math.hypot(f17, f18);
                float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                float f19 = pointFPpxfxbqfkf.x;
                float f23 = ((pointFPpxfxbqfkf2.x - f19) * fMin) + f19;
                float f24 = pointFPpxfxbqfkf.y;
                float f25 = ((pointFPpxfxbqfkf2.y - f24) * fMin) + f24;
                float f26 = ((pointFPpxfxbqfkf3.x - f19) * fMin2) + f19;
                float f27 = ((pointFPpxfxbqfkf3.y - f24) * fMin2) + f24;
                float f28 = f23 - ((f23 - f19) * 0.5519f);
                float f29 = f25 - ((f25 - f24) * 0.5519f);
                float f33 = f26 - ((f26 - f19) * 0.5519f);
                float f34 = f27 - ((f27 - f24) * 0.5519f);
                o7.iobyxmoadg iobyxmoadgVar4 = (o7.iobyxmoadg) listIobyxmoadg2.get(lqeggnwhkg(i14 - 1, listIobyxmoadg2.size()));
                o7.iobyxmoadg iobyxmoadgVar5 = (o7.iobyxmoadg) listIobyxmoadg2.get(i14);
                iobyxmoadgVar4.eablkybsjg(f23, f25);
                iobyxmoadgVar4.gxszxtbevo(f23, f25);
                if (i13 == 0) {
                    ojitshcjhnVarBtonecajqb.gxszxtbevo(f23, f25);
                }
                iobyxmoadgVar5.wkgbmnqykc(f28, f29);
                o7.iobyxmoadg iobyxmoadgVar6 = (o7.iobyxmoadg) listIobyxmoadg2.get(i14 + 1);
                iobyxmoadgVar5.eablkybsjg(f33, f34);
                iobyxmoadgVar5.gxszxtbevo(f26, f27);
                iobyxmoadgVar6.wkgbmnqykc(f26, f27);
                i14 += 2;
            } else {
                o7.iobyxmoadg iobyxmoadgVar7 = (o7.iobyxmoadg) listIobyxmoadg2.get(lqeggnwhkg(i14 - 1, listIobyxmoadg2.size()));
                o7.iobyxmoadg iobyxmoadgVar8 = (o7.iobyxmoadg) listIobyxmoadg2.get(i14);
                iobyxmoadgVar7.eablkybsjg(iobyxmoadgVar2.zoijcleaow().x, iobyxmoadgVar2.zoijcleaow().y);
                iobyxmoadgVar7.gxszxtbevo(iobyxmoadgVar2.ppxfxbqfkf().x, iobyxmoadgVar2.ppxfxbqfkf().y);
                iobyxmoadgVar8.wkgbmnqykc(iobyxmoadgVar.iobyxmoadg().x, iobyxmoadgVar.iobyxmoadg().y);
                i14++;
            }
            i13++;
            listIobyxmoadg = listIobyxmoadg;
        }
        return ojitshcjhnVarBtonecajqb;
    }

    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
    }
}
