package xl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow implements Iterable, Cloneable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f122745zdlpuopuiu = 0;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    String[] f122744yggfygwlhe = new String[3];

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    Object[] f122743jyumaefscl = new Object[3];

    class iobyxmoadg implements Iterator {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f122747yggfygwlhe = 0;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f122748zdlpuopuiu;

        iobyxmoadg() {
            this.f122748zdlpuopuiu = zoijcleaow.this.f122745zdlpuopuiu;
        }

        private void iobyxmoadg() {
            if (zoijcleaow.this.f122745zdlpuopuiu != this.f122748zdlpuopuiu) {
                throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            iobyxmoadg();
            while (this.f122747yggfygwlhe < zoijcleaow.this.f122745zdlpuopuiu && zoijcleaow.esjtqupxsv(zoijcleaow.this.f122744yggfygwlhe[this.f122747yggfygwlhe])) {
                this.f122747yggfygwlhe++;
            }
            return this.f122747yggfygwlhe < zoijcleaow.this.f122745zdlpuopuiu;
        }

        @Override // java.util.Iterator
        public void remove() {
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            int i13 = this.f122747yggfygwlhe - 1;
            this.f122747yggfygwlhe = i13;
            zoijcleaowVar.cdpycssgdh(i13);
            this.f122748zdlpuopuiu--;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public xl.iobyxmoadg next() {
            iobyxmoadg();
            if (this.f122747yggfygwlhe >= zoijcleaow.this.f122745zdlpuopuiu) {
                throw new NoSuchElementException();
            }
            String str = zoijcleaow.this.f122744yggfygwlhe[this.f122747yggfygwlhe];
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            xl.iobyxmoadg iobyxmoadgVar = new xl.iobyxmoadg(str, (String) zoijcleaowVar.f122743jyumaefscl[this.f122747yggfygwlhe], zoijcleaowVar);
            this.f122747yggfygwlhe++;
            return iobyxmoadgVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdpycssgdh(int i13) {
        vl.zoijcleaow.zoijcleaow(i13 >= this.f122745zdlpuopuiu);
        int i14 = (this.f122745zdlpuopuiu - i13) - 1;
        if (i14 > 0) {
            String[] strArr = this.f122744yggfygwlhe;
            int i15 = i13 + 1;
            System.arraycopy(strArr, i15, strArr, i13, i14);
            Object[] objArr = this.f122743jyumaefscl;
            System.arraycopy(objArr, i15, objArr, i13, i14);
        }
        int i16 = this.f122745zdlpuopuiu - 1;
        this.f122745zdlpuopuiu = i16;
        this.f122744yggfygwlhe[i16] = null;
        this.f122743jyumaefscl[i16] = null;
    }

    static String cqumvgiudr(String str) {
        return '/' + str;
    }

    static String draadjrbmk(Object obj) {
        return obj == null ? "" : (String) obj;
    }

    private void eablkybsjg(String str, Object obj) {
        gtknphoqwx(this.f122745zdlpuopuiu + 1);
        String[] strArr = this.f122744yggfygwlhe;
        int i13 = this.f122745zdlpuopuiu;
        strArr[i13] = str;
        this.f122743jyumaefscl[i13] = obj;
        this.f122745zdlpuopuiu = i13 + 1;
    }

    static boolean esjtqupxsv(String str) {
        return str.length() > 1 && str.charAt(0) == '/';
    }

    private void gtknphoqwx(int i13) {
        vl.zoijcleaow.ppxfxbqfkf(i13 >= this.f122745zdlpuopuiu);
        String[] strArr = this.f122744yggfygwlhe;
        int length = strArr.length;
        if (length >= i13) {
            return;
        }
        int i14 = length >= 3 ? this.f122745zdlpuopuiu * 2 : 3;
        if (i13 <= i14) {
            i13 = i14;
        }
        this.f122744yggfygwlhe = (String[]) Arrays.copyOf(strArr, i13);
        this.f122743jyumaefscl = Arrays.copyOf(this.f122743jyumaefscl, i13);
    }

    private int iwizpuwonk(String str) {
        vl.zoijcleaow.btonecajqb(str);
        for (int i13 = 0; i13 < this.f122745zdlpuopuiu; i13++) {
            if (str.equalsIgnoreCase(this.f122744yggfygwlhe[i13])) {
                return i13;
            }
        }
        return -1;
    }

    public int agtfadlqog(yl.vdvldrhtss vdvldrhtssVar) {
        int i13 = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean zEablkybsjg = vdvldrhtssVar.eablkybsjg();
        int i14 = 0;
        while (i13 < this.f122745zdlpuopuiu) {
            String str = this.f122744yggfygwlhe[i13];
            i13++;
            int i15 = i13;
            while (i15 < this.f122745zdlpuopuiu) {
                if ((zEablkybsjg && str.equals(this.f122744yggfygwlhe[i15])) || (!zEablkybsjg && str.equalsIgnoreCase(this.f122744yggfygwlhe[i15]))) {
                    i14++;
                    cdpycssgdh(i15);
                    i15--;
                }
                i15++;
            }
        }
        return i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        if (this.f122745zdlpuopuiu != zoijcleaowVar.f122745zdlpuopuiu) {
            return false;
        }
        for (int i13 = 0; i13 < this.f122745zdlpuopuiu; i13++) {
            int iJyumaefscl = zoijcleaowVar.jyumaefscl(this.f122744yggfygwlhe[i13]);
            if (iJyumaefscl == -1 || !Objects.equals(this.f122743jyumaefscl[i13], zoijcleaowVar.f122743jyumaefscl[iJyumaefscl])) {
                return false;
            }
        }
        return true;
    }

    public List gxszxtbevo() {
        ArrayList arrayList = new ArrayList(this.f122745zdlpuopuiu);
        for (int i13 = 0; i13 < this.f122745zdlpuopuiu; i13++) {
            String str = this.f122744yggfygwlhe[i13];
            if (!esjtqupxsv(str)) {
                arrayList.add(new xl.iobyxmoadg(str, (String) this.f122743jyumaefscl[i13], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int hashCode() {
        return (((this.f122745zdlpuopuiu * 31) + Arrays.hashCode(this.f122744yggfygwlhe)) * 31) + Arrays.hashCode(this.f122743jyumaefscl);
    }

    public esjtqupxsv.iobyxmoadg iozdgvuglv(String str) {
        Map mapVdvldrhtss;
        esjtqupxsv.iobyxmoadg iobyxmoadgVar;
        return (!oxmwwwfdhm(str) || (mapVdvldrhtss = vdvldrhtss()) == null || (iobyxmoadgVar = (esjtqupxsv.iobyxmoadg) mapVdvldrhtss.get(str)) == null) ? esjtqupxsv.iobyxmoadg.f122664ppxfxbqfkf : iobyxmoadgVar;
    }

    public boolean isEmpty() {
        return this.f122745zdlpuopuiu == 0;
    }

    void istkbnxepw(String str, String str2) {
        int iIwizpuwonk = iwizpuwonk(str);
        if (iIwizpuwonk == -1) {
            ppxfxbqfkf(str, str2);
            return;
        }
        this.f122743jyumaefscl[iIwizpuwonk] = str2;
        if (this.f122744yggfygwlhe[iIwizpuwonk].equals(str)) {
            return;
        }
        this.f122744yggfygwlhe[iIwizpuwonk] = str;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new iobyxmoadg();
    }

    int jyumaefscl(String str) {
        vl.zoijcleaow.btonecajqb(str);
        for (int i13 = 0; i13 < this.f122745zdlpuopuiu; i13++) {
            if (str.equals(this.f122744yggfygwlhe[i13])) {
                return i13;
            }
        }
        return -1;
    }

    public boolean kcexrzcfyt(String str) {
        return iwizpuwonk(str) != -1;
    }

    public void lereixgezr() {
        for (int i13 = 0; i13 < this.f122745zdlpuopuiu; i13++) {
            String str = this.f122744yggfygwlhe[i13];
            if (!esjtqupxsv(str)) {
                this.f122744yggfygwlhe[i13] = wl.gxszxtbevo.iobyxmoadg(str);
            }
        }
    }

    public Object lmojexxdyd(String str) {
        vl.zoijcleaow.btonecajqb(str);
        if (oxmwwwfdhm("/jsoup.userdata")) {
            return ylkuphrtab().get(str);
        }
        return null;
    }

    public String ojitshcjhn(String str) {
        int iJyumaefscl = jyumaefscl(str);
        return iJyumaefscl == -1 ? "" : draadjrbmk(this.f122743jyumaefscl[iJyumaefscl]);
    }

    public boolean oxmwwwfdhm(String str) {
        return jyumaefscl(str) != -1;
    }

    public zoijcleaow pkzmftpjix(String str, Object obj) {
        vl.zoijcleaow.btonecajqb(str);
        ylkuphrtab().put(str, obj);
        return this;
    }

    public zoijcleaow pmvmpeiblj(String str, String str2) {
        vl.zoijcleaow.btonecajqb(str);
        int iJyumaefscl = jyumaefscl(str);
        if (iJyumaefscl != -1) {
            this.f122743jyumaefscl[iJyumaefscl] = str2;
        } else {
            ppxfxbqfkf(str, str2);
        }
        return this;
    }

    public zoijcleaow ppxfxbqfkf(String str, String str2) {
        eablkybsjg(str, str2);
        return this;
    }

    public String rgvfuqvkyq(String str) {
        int iIwizpuwonk = iwizpuwonk(str);
        return iIwizpuwonk == -1 ? "" : draadjrbmk(this.f122743jyumaefscl[iIwizpuwonk]);
    }

    public int size() {
        return this.f122745zdlpuopuiu;
    }

    public String toString() {
        return zdlpuopuiu();
    }

    Map vdvldrhtss() {
        return (Map) lmojexxdyd("jsoup.attrs");
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public zoijcleaow clone() {
        try {
            zoijcleaow zoijcleaowVar = (zoijcleaow) super.clone();
            zoijcleaowVar.f122745zdlpuopuiu = this.f122745zdlpuopuiu;
            zoijcleaowVar.f122744yggfygwlhe = (String[]) Arrays.copyOf(this.f122744yggfygwlhe, this.f122745zdlpuopuiu);
            zoijcleaowVar.f122743jyumaefscl = Arrays.copyOf(this.f122743jyumaefscl, this.f122745zdlpuopuiu);
            int iJyumaefscl = jyumaefscl("/jsoup.userdata");
            if (iJyumaefscl != -1) {
                this.f122743jyumaefscl[iJyumaefscl] = new HashMap((Map) this.f122743jyumaefscl[iJyumaefscl]);
            }
            return zoijcleaowVar;
        } catch (CloneNotSupportedException e13) {
            throw new RuntimeException(e13);
        }
    }

    public void wkgbmnqykc(zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar.size() == 0) {
            return;
        }
        gtknphoqwx(this.f122745zdlpuopuiu + zoijcleaowVar.f122745zdlpuopuiu);
        boolean z13 = this.f122745zdlpuopuiu != 0;
        Iterator it = zoijcleaowVar.iterator();
        while (it.hasNext()) {
            xl.iobyxmoadg iobyxmoadgVar = (xl.iobyxmoadg) it.next();
            if (z13) {
                zynmafqrjb(iobyxmoadgVar);
            } else {
                ppxfxbqfkf(iobyxmoadgVar.getKey(), iobyxmoadgVar.getValue());
            }
        }
    }

    public zoijcleaow yadqdtsiqt(String str, esjtqupxsv.iobyxmoadg iobyxmoadgVar) {
        vl.zoijcleaow.btonecajqb(str);
        vl.zoijcleaow.btonecajqb(iobyxmoadgVar);
        Map mapVdvldrhtss = vdvldrhtss();
        if (mapVdvldrhtss == null) {
            mapVdvldrhtss = new HashMap();
            pkzmftpjix("jsoup.attrs", mapVdvldrhtss);
        }
        mapVdvldrhtss.put(str, iobyxmoadgVar);
        return this;
    }

    final void yggfygwlhe(wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        String strPpxfxbqfkf;
        int i13 = this.f122745zdlpuopuiu;
        for (int i14 = 0; i14 < i13; i14++) {
            String str = this.f122744yggfygwlhe[i14];
            if (!esjtqupxsv(str) && (strPpxfxbqfkf = xl.iobyxmoadg.ppxfxbqfkf(str, iobyxmoadgVar.agtfadlqog())) != null) {
                xl.iobyxmoadg.nufgyqmvbu(strPpxfxbqfkf, (String) this.f122743jyumaefscl[i14], lqeggnwhkgVar.iobyxmoadg(' '), iobyxmoadgVar);
            }
        }
    }

    Map ylkuphrtab() {
        int iJyumaefscl = jyumaefscl("/jsoup.userdata");
        if (iJyumaefscl != -1) {
            return (Map) this.f122743jyumaefscl[iJyumaefscl];
        }
        HashMap map = new HashMap();
        eablkybsjg("/jsoup.userdata", map);
        return map;
    }

    public String zdlpuopuiu() {
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        yggfygwlhe(wl.lqeggnwhkg.wkgbmnqykc(sbEablkybsjg), new gxszxtbevo.iobyxmoadg());
        return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
    }

    public zoijcleaow zynmafqrjb(xl.iobyxmoadg iobyxmoadgVar) {
        vl.zoijcleaow.btonecajqb(iobyxmoadgVar);
        pmvmpeiblj(iobyxmoadgVar.getKey(), iobyxmoadgVar.getValue());
        iobyxmoadgVar.f122693jyumaefscl = this;
        return this;
    }
}
