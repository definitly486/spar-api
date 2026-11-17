package w4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final ppxfxbqfkf f118686btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final HashMap f118687draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final String f118688dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final long f118689eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final HashMap f118690gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final lqeggnwhkg f118691gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f118692iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String[] f118693lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final String f118694nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f118695ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private List f118696wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final long f118697wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f118698zoijcleaow;

    private ppxfxbqfkf(String str, String str2, long j13, long j14, lqeggnwhkg lqeggnwhkgVar, String[] strArr, String str3, String str4, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f118692iobyxmoadg = str;
        this.f118698zoijcleaow = str2;
        this.f118688dxjokdxxww = str4;
        this.f118691gxszxtbevo = lqeggnwhkgVar;
        this.f118693lqeggnwhkg = strArr;
        this.f118695ppxfxbqfkf = str2 != null;
        this.f118697wkgbmnqykc = j13;
        this.f118689eablkybsjg = j14;
        this.f118694nufgyqmvbu = (String) y2.iobyxmoadg.eablkybsjg(str3);
        this.f118686btonecajqb = ppxfxbqfkfVar;
        this.f118690gtknphoqwx = new HashMap();
        this.f118687draadjrbmk = new HashMap();
    }

    private void agtfadlqog(long j13, String str, List list) {
        if (!"".equals(this.f118694nufgyqmvbu)) {
            str = this.f118694nufgyqmvbu;
        }
        if (wflxmlrfwp(j13) && "div".equals(this.f118692iobyxmoadg) && this.f118688dxjokdxxww != null) {
            list.add(new Pair(str, this.f118688dxjokdxxww));
            return;
        }
        for (int i13 = 0; i13 < lqeggnwhkg(); i13++) {
            gxszxtbevo(i13).agtfadlqog(j13, str, list);
        }
    }

    private void dxjokdxxww(TreeSet treeSet, boolean z13) {
        boolean zEquals = "p".equals(this.f118692iobyxmoadg);
        boolean zEquals2 = "div".equals(this.f118692iobyxmoadg);
        if (z13 || zEquals || (zEquals2 && this.f118688dxjokdxxww != null)) {
            long j13 = this.f118697wkgbmnqykc;
            if (j13 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j13));
            }
            long j14 = this.f118689eablkybsjg;
            if (j14 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j14));
            }
        }
        if (this.f118696wflxmlrfwp == null) {
            return;
        }
        for (int i13 = 0; i13 < this.f118696wflxmlrfwp.size(); i13++) {
            ((ppxfxbqfkf) this.f118696wflxmlrfwp.get(i13)).dxjokdxxww(treeSet, z13 || zEquals);
        }
    }

    private static void eablkybsjg(SpannableStringBuilder spannableStringBuilder) {
        for (iobyxmoadg iobyxmoadgVar : (iobyxmoadg[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), iobyxmoadg.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(iobyxmoadgVar), spannableStringBuilder.getSpanEnd(iobyxmoadgVar), "");
        }
        for (int i13 = 0; i13 < spannableStringBuilder.length(); i13++) {
            if (spannableStringBuilder.charAt(i13) == ' ') {
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i15) == ' ') {
                    i15++;
                }
                int i16 = i15 - i14;
                if (i16 > 0) {
                    spannableStringBuilder.delete(i13, i16 + i13);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i17 = 0; i17 < spannableStringBuilder.length() - 1; i17++) {
            if (spannableStringBuilder.charAt(i17) == '\n') {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i18) == ' ') {
                    spannableStringBuilder.delete(i18, i17 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i19 = 0; i19 < spannableStringBuilder.length() - 1; i19++) {
            if (spannableStringBuilder.charAt(i19) == ' ') {
                int i23 = i19 + 1;
                if (spannableStringBuilder.charAt(i23) == '\n') {
                    spannableStringBuilder.delete(i19, i23);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private static SpannableStringBuilder gtknphoqwx(String str, Map map) {
        if (!map.containsKey(str)) {
            x2.iobyxmoadg.zoijcleaow zoijcleaowVar = new x2.iobyxmoadg.zoijcleaow();
            zoijcleaowVar.ojitshcjhn(new SpannableStringBuilder());
            map.put(str, zoijcleaowVar);
        }
        return (SpannableStringBuilder) y2.iobyxmoadg.eablkybsjg(((x2.iobyxmoadg.zoijcleaow) map.get(str)).eablkybsjg());
    }

    private void ojitshcjhn(long j13, Map map, Map map2, String str, Map map3) {
        int i13;
        if (wflxmlrfwp(j13)) {
            String str2 = "".equals(this.f118694nufgyqmvbu) ? str : this.f118694nufgyqmvbu;
            Iterator it = this.f118687draadjrbmk.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.f118690gtknphoqwx.containsKey(str3) ? ((Integer) this.f118690gtknphoqwx.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zoijcleaow(map, (x2.iobyxmoadg.zoijcleaow) y2.iobyxmoadg.eablkybsjg((x2.iobyxmoadg.zoijcleaow) map3.get(str3)), iIntValue, iIntValue2, ((eablkybsjg) y2.iobyxmoadg.eablkybsjg((eablkybsjg) map2.get(str2))).f118650btonecajqb);
                }
            }
            for (i13 = 0; i13 < lqeggnwhkg(); i13++) {
                gxszxtbevo(i13).ojitshcjhn(j13, map, map2, str2, map3);
            }
        }
    }

    public static ppxfxbqfkf ppxfxbqfkf(String str, long j13, long j14, lqeggnwhkg lqeggnwhkgVar, String[] strArr, String str2, String str3, ppxfxbqfkf ppxfxbqfkfVar) {
        return new ppxfxbqfkf(str, null, j13, j14, lqeggnwhkgVar, strArr, str2, str3, ppxfxbqfkfVar);
    }

    private void rgvfuqvkyq(long j13, boolean z13, String str, Map map) {
        this.f118690gtknphoqwx.clear();
        this.f118687draadjrbmk.clear();
        if ("metadata".equals(this.f118692iobyxmoadg)) {
            return;
        }
        if (!"".equals(this.f118694nufgyqmvbu)) {
            str = this.f118694nufgyqmvbu;
        }
        if (this.f118695ppxfxbqfkf && z13) {
            gtknphoqwx(str, map).append((CharSequence) y2.iobyxmoadg.eablkybsjg(this.f118698zoijcleaow));
            return;
        }
        if ("br".equals(this.f118692iobyxmoadg) && z13) {
            gtknphoqwx(str, map).append('\n');
            return;
        }
        if (wflxmlrfwp(j13)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f118690gtknphoqwx.put((String) entry.getKey(), Integer.valueOf(((CharSequence) y2.iobyxmoadg.eablkybsjg(((x2.iobyxmoadg.zoijcleaow) entry.getValue()).eablkybsjg())).length()));
            }
            boolean zEquals = "p".equals(this.f118692iobyxmoadg);
            for (int i13 = 0; i13 < lqeggnwhkg(); i13++) {
                gxszxtbevo(i13).rgvfuqvkyq(j13, z13 || zEquals, str, map);
            }
            if (zEquals) {
                gxszxtbevo.ppxfxbqfkf(gtknphoqwx(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.f118687draadjrbmk.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) y2.iobyxmoadg.eablkybsjg(((x2.iobyxmoadg.zoijcleaow) entry2.getValue()).eablkybsjg())).length()));
            }
        }
    }

    public static ppxfxbqfkf wkgbmnqykc(String str) {
        return new ppxfxbqfkf(null, gxszxtbevo.zoijcleaow(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private void zoijcleaow(Map map, x2.iobyxmoadg.zoijcleaow zoijcleaowVar, int i13, int i14, int i15) {
        lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevo.gxszxtbevo(this.f118691gxszxtbevo, this.f118693lqeggnwhkg, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zoijcleaowVar.eablkybsjg();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            zoijcleaowVar.ojitshcjhn(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (lqeggnwhkgVarGxszxtbevo != null) {
            gxszxtbevo.iobyxmoadg(spannableStringBuilder2, i13, i14, lqeggnwhkgVarGxszxtbevo, this.f118686btonecajqb, map, i15);
            if ("p".equals(this.f118692iobyxmoadg)) {
                if (lqeggnwhkgVarGxszxtbevo.wflxmlrfwp() != Float.MAX_VALUE) {
                    zoijcleaowVar.wflxmlrfwp((lqeggnwhkgVarGxszxtbevo.wflxmlrfwp() * (-90.0f)) / 100.0f);
                }
                if (lqeggnwhkgVarGxszxtbevo.ojitshcjhn() != null) {
                    zoijcleaowVar.rgvfuqvkyq(lqeggnwhkgVarGxszxtbevo.ojitshcjhn());
                }
                if (lqeggnwhkgVarGxszxtbevo.dxjokdxxww() != null) {
                    zoijcleaowVar.btonecajqb(lqeggnwhkgVarGxszxtbevo.dxjokdxxww());
                }
            }
        }
    }

    public long[] btonecajqb() {
        TreeSet treeSet = new TreeSet();
        int i13 = 0;
        dxjokdxxww(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i13] = ((Long) it.next()).longValue();
            i13++;
        }
        return jArr;
    }

    public String[] draadjrbmk() {
        return this.f118693lqeggnwhkg;
    }

    public ppxfxbqfkf gxszxtbevo(int i13) {
        List list = this.f118696wflxmlrfwp;
        if (list != null) {
            return (ppxfxbqfkf) list.get(i13);
        }
        throw new IndexOutOfBoundsException();
    }

    public void iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        if (this.f118696wflxmlrfwp == null) {
            this.f118696wflxmlrfwp = new ArrayList();
        }
        this.f118696wflxmlrfwp.add(ppxfxbqfkfVar);
    }

    public int lqeggnwhkg() {
        List list = this.f118696wflxmlrfwp;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List nufgyqmvbu(long j13, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        agtfadlqog(j13, this.f118694nufgyqmvbu, arrayList);
        TreeMap treeMap = new TreeMap();
        rgvfuqvkyq(j13, false, this.f118694nufgyqmvbu, treeMap);
        ojitshcjhn(j13, map, map2, this.f118694nufgyqmvbu, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                eablkybsjg eablkybsjgVar = (eablkybsjg) y2.iobyxmoadg.eablkybsjg((eablkybsjg) map2.get(pair.first));
                arrayList2.add(new x2.iobyxmoadg.zoijcleaow().gxszxtbevo(bitmapDecodeByteArray).gtknphoqwx(eablkybsjgVar.f118659zoijcleaow).draadjrbmk(0).nufgyqmvbu(eablkybsjgVar.f118657ppxfxbqfkf, 0).dxjokdxxww(eablkybsjgVar.f118652eablkybsjg).agtfadlqog(eablkybsjgVar.f118653gxszxtbevo).lqeggnwhkg(eablkybsjgVar.f118655lqeggnwhkg).oxmwwwfdhm(eablkybsjgVar.f118650btonecajqb).iobyxmoadg());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            eablkybsjg eablkybsjgVar2 = (eablkybsjg) y2.iobyxmoadg.eablkybsjg((eablkybsjg) map2.get(entry.getKey()));
            x2.iobyxmoadg.zoijcleaow zoijcleaowVar = (x2.iobyxmoadg.zoijcleaow) entry.getValue();
            eablkybsjg((SpannableStringBuilder) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.eablkybsjg()));
            zoijcleaowVar.nufgyqmvbu(eablkybsjgVar2.f118657ppxfxbqfkf, eablkybsjgVar2.f118658wkgbmnqykc);
            zoijcleaowVar.dxjokdxxww(eablkybsjgVar2.f118652eablkybsjg);
            zoijcleaowVar.gtknphoqwx(eablkybsjgVar2.f118659zoijcleaow);
            zoijcleaowVar.agtfadlqog(eablkybsjgVar2.f118653gxszxtbevo);
            zoijcleaowVar.vdvldrhtss(eablkybsjgVar2.f118651dxjokdxxww, eablkybsjgVar2.f118656nufgyqmvbu);
            zoijcleaowVar.oxmwwwfdhm(eablkybsjgVar2.f118650btonecajqb);
            arrayList2.add(zoijcleaowVar.iobyxmoadg());
        }
        return arrayList2;
    }

    public boolean wflxmlrfwp(long j13) {
        long j14 = this.f118697wkgbmnqykc;
        return (j14 == -9223372036854775807L && this.f118689eablkybsjg == -9223372036854775807L) || (j14 <= j13 && this.f118689eablkybsjg == -9223372036854775807L) || ((j14 == -9223372036854775807L && j13 < this.f118689eablkybsjg) || (j14 <= j13 && j13 < this.f118689eablkybsjg));
    }
}
