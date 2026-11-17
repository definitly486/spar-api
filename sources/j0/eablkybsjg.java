package j0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg implements CharSequence {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final ppxfxbqfkf f50167cqumvgiudr = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final rhgxfdycjh.jyumaefscl f50168esjtqupxsv = hszhottldk.grlcpdaxtj();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final List f50169iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f50170jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f50171yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f50172zdlpuopuiu;

    /* JADX INFO: renamed from: j0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1071eablkybsjg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((wkgbmnqykc) obj).nufgyqmvbu()), Integer.valueOf(((wkgbmnqykc) obj2).nufgyqmvbu()));
        }
    }

    public interface iobyxmoadg {
    }

    public static final class ppxfxbqfkf {
        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private ppxfxbqfkf() {
        }
    }

    public eablkybsjg(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f50172zdlpuopuiu = list;
        this.f50171yggfygwlhe = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i13 = 0; i13 < size; i13++) {
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) list.get(i13);
                if (wkgbmnqykcVar.lqeggnwhkg() instanceof jrbgnlbqoe) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(wkgbmnqykcVar);
                } else if (wkgbmnqykcVar.lqeggnwhkg() instanceof ylkuphrtab) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(wkgbmnqykcVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f50170jyumaefscl = arrayList;
        this.f50169iwizpuwonk = arrayList2;
        List listD = arrayList2 != null ? hg.jyumaefscl.d(arrayList2, new C1071eablkybsjg()) : null;
        if (listD == null || listD.isEmpty()) {
            return;
        }
        androidx.collection.yadqdtsiqt yadqdtsiqtVarWkgbmnqykc = androidx.collection.agtfadlqog.wkgbmnqykc(((wkgbmnqykc) hg.jyumaefscl.opjhrmiecq(listD)).gxszxtbevo());
        int size2 = listD.size();
        for (int i14 = 1; i14 < size2; i14++) {
            wkgbmnqykc wkgbmnqykcVar2 = (wkgbmnqykc) listD.get(i14);
            while (yadqdtsiqtVarWkgbmnqykc.f4401zoijcleaow != 0) {
                int iNufgyqmvbu = yadqdtsiqtVarWkgbmnqykc.nufgyqmvbu();
                if (wkgbmnqykcVar2.nufgyqmvbu() < iNufgyqmvbu) {
                    if (!(wkgbmnqykcVar2.gxszxtbevo() <= iNufgyqmvbu)) {
                        q0.iobyxmoadg.iobyxmoadg("Paragraph overlap not allowed, end " + wkgbmnqykcVar2.gxszxtbevo() + " should be less than or equal to " + iNufgyqmvbu);
                        break;
                    }
                    break;
                }
                yadqdtsiqtVarWkgbmnqykc.agtfadlqog(yadqdtsiqtVarWkgbmnqykc.f4401zoijcleaow - 1);
            }
            yadqdtsiqtVarWkgbmnqykc.btonecajqb(wkgbmnqykcVar2.gxszxtbevo());
        }
    }

    public final boolean agtfadlqog(int i13, int i14) {
        List list = this.f50172zdlpuopuiu;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) list.get(i15);
            if ((wkgbmnqykcVar.lqeggnwhkg() instanceof vdvldrhtss) && lqeggnwhkg.btonecajqb(i13, i14, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo())) {
                return true;
            }
        }
        return false;
    }

    public final String btonecajqb() {
        return this.f50171yggfygwlhe;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i13) {
        return zoijcleaow(i13);
    }

    public final List draadjrbmk(int i13, int i14) {
        List listWflxmlrfwp;
        List list = this.f50172zdlpuopuiu;
        if (list != null) {
            listWflxmlrfwp = new ArrayList(list.size());
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                Object obj = list.get(i15);
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
                if ((wkgbmnqykcVar.lqeggnwhkg() instanceof q) && lqeggnwhkg.btonecajqb(i13, i14, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo())) {
                    listWflxmlrfwp.add(obj);
                }
            }
        } else {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(listWflxmlrfwp, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listWflxmlrfwp;
    }

    public final List dxjokdxxww(String str, int i13, int i14) {
        List list = this.f50172zdlpuopuiu;
        if (list == null) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) list.get(i15);
            if ((wkgbmnqykcVar.lqeggnwhkg() instanceof rhgxfdycjh) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, wkgbmnqykcVar.dxjokdxxww()) && lqeggnwhkg.btonecajqb(i13, i14, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo())) {
                arrayList.add(yzdjzghtvl.iobyxmoadg(wkgbmnqykcVar));
            }
        }
        return arrayList;
    }

    public final List eablkybsjg(int i13, int i14) {
        List listWflxmlrfwp;
        List list = this.f50172zdlpuopuiu;
        if (list != null) {
            listWflxmlrfwp = new ArrayList(list.size());
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                Object obj = list.get(i15);
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
                if ((wkgbmnqykcVar.lqeggnwhkg() instanceof vdvldrhtss) && lqeggnwhkg.btonecajqb(i13, i14, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo())) {
                    listWflxmlrfwp.add(obj);
                }
            }
        } else {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(listWflxmlrfwp, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listWflxmlrfwp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50171yggfygwlhe, eablkybsjgVar.f50171yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50172zdlpuopuiu, eablkybsjgVar.f50172zdlpuopuiu);
    }

    public final List gtknphoqwx(int i13, int i14) {
        List listWflxmlrfwp;
        List list = this.f50172zdlpuopuiu;
        if (list != null) {
            listWflxmlrfwp = new ArrayList(list.size());
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                Object obj = list.get(i15);
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
                if ((wkgbmnqykcVar.lqeggnwhkg() instanceof p) && lqeggnwhkg.btonecajqb(i13, i14, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo())) {
                    listWflxmlrfwp.add(obj);
                }
            }
        } else {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(listWflxmlrfwp, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listWflxmlrfwp;
    }

    public final List gxszxtbevo() {
        return this.f50169iwizpuwonk;
    }

    public int hashCode() {
        int iHashCode = this.f50171yggfygwlhe.hashCode() * 31;
        List list = this.f50172zdlpuopuiu;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final eablkybsjg iobyxmoadg(tg.draadjrbmk draadjrbmkVar) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(this);
        zoijcleaowVar.draadjrbmk(draadjrbmkVar);
        return zoijcleaowVar.yggfygwlhe();
    }

    public final eablkybsjg kcexrzcfyt(long j13) {
        return subSequence(l.draadjrbmk(j13), l.gtknphoqwx(j13));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return wkgbmnqykc();
    }

    public final List lqeggnwhkg() {
        List list = this.f50170jyumaefscl;
        return list == null ? hg.jyumaefscl.wflxmlrfwp() : list;
    }

    public final List nufgyqmvbu() {
        return this.f50170jyumaefscl;
    }

    public final boolean ojitshcjhn(String str, int i13, int i14) {
        List list = this.f50172zdlpuopuiu;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) list.get(i15);
            if ((wkgbmnqykcVar.lqeggnwhkg() instanceof rhgxfdycjh) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, wkgbmnqykcVar.dxjokdxxww()) && lqeggnwhkg.btonecajqb(i13, i14, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public eablkybsjg subSequence(int i13, int i14) {
        if (!(i13 <= i14)) {
            q0.iobyxmoadg.iobyxmoadg("start (" + i13 + ") should be less or equal to end (" + i14 + ')');
        }
        if (i13 == 0 && i14 == this.f50171yggfygwlhe.length()) {
            return this;
        }
        String strSubstring = this.f50171yggfygwlhe.substring(i13, i14);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return new eablkybsjg(lqeggnwhkg.lqeggnwhkg(this.f50172zdlpuopuiu, i13, i14), strSubstring);
    }

    public final List ppxfxbqfkf() {
        return this.f50172zdlpuopuiu;
    }

    public final eablkybsjg rgvfuqvkyq(tg.draadjrbmk draadjrbmkVar) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(this);
        zoijcleaowVar.agtfadlqog(draadjrbmkVar);
        return zoijcleaowVar.yggfygwlhe();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f50171yggfygwlhe;
    }

    public final eablkybsjg vdvldrhtss(eablkybsjg eablkybsjgVar) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(this);
        zoijcleaowVar.dxjokdxxww(eablkybsjgVar);
        return zoijcleaowVar.yggfygwlhe();
    }

    public final boolean wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50172zdlpuopuiu, eablkybsjgVar.f50172zdlpuopuiu);
    }

    public int wkgbmnqykc() {
        return this.f50171yggfygwlhe.length();
    }

    public char zoijcleaow(int i13) {
        return this.f50171yggfygwlhe.charAt(i13);
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f50173iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f50174ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f50175wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f50176zoijcleaow;

        public wkgbmnqykc(Object obj, int i13, int i14, String str) {
            this.f50173iobyxmoadg = obj;
            this.f50176zoijcleaow = i13;
            this.f50174ppxfxbqfkf = i14;
            this.f50175wkgbmnqykc = str;
            if (i13 <= i14) {
                return;
            }
            q0.iobyxmoadg.iobyxmoadg("Reversed range is not supported");
        }

        public static /* synthetic */ wkgbmnqykc eablkybsjg(wkgbmnqykc wkgbmnqykcVar, Object obj, int i13, int i14, String str, int i15, Object obj2) {
            if ((i15 & 1) != 0) {
                obj = wkgbmnqykcVar.f50173iobyxmoadg;
            }
            if ((i15 & 2) != 0) {
                i13 = wkgbmnqykcVar.f50176zoijcleaow;
            }
            if ((i15 & 4) != 0) {
                i14 = wkgbmnqykcVar.f50174ppxfxbqfkf;
            }
            if ((i15 & 8) != 0) {
                str = wkgbmnqykcVar.f50175wkgbmnqykc;
            }
            return wkgbmnqykcVar.wkgbmnqykc(obj, i13, i14, str);
        }

        public final String dxjokdxxww() {
            return this.f50175wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50173iobyxmoadg, wkgbmnqykcVar.f50173iobyxmoadg) && this.f50176zoijcleaow == wkgbmnqykcVar.f50176zoijcleaow && this.f50174ppxfxbqfkf == wkgbmnqykcVar.f50174ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50175wkgbmnqykc, wkgbmnqykcVar.f50175wkgbmnqykc);
        }

        public final int gxszxtbevo() {
            return this.f50174ppxfxbqfkf;
        }

        public int hashCode() {
            Object obj = this.f50173iobyxmoadg;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f50176zoijcleaow)) * 31) + Integer.hashCode(this.f50174ppxfxbqfkf)) * 31) + this.f50175wkgbmnqykc.hashCode();
        }

        public final Object iobyxmoadg() {
            return this.f50173iobyxmoadg;
        }

        public final Object lqeggnwhkg() {
            return this.f50173iobyxmoadg;
        }

        public final int nufgyqmvbu() {
            return this.f50176zoijcleaow;
        }

        public final int ppxfxbqfkf() {
            return this.f50174ppxfxbqfkf;
        }

        public String toString() {
            return "Range(item=" + this.f50173iobyxmoadg + ", start=" + this.f50176zoijcleaow + ", end=" + this.f50174ppxfxbqfkf + ", tag=" + this.f50175wkgbmnqykc + ')';
        }

        public final wkgbmnqykc wkgbmnqykc(Object obj, int i13, int i14, String str) {
            return new wkgbmnqykc(obj, i13, i14, str);
        }

        public final int zoijcleaow() {
            return this.f50176zoijcleaow;
        }

        public wkgbmnqykc(Object obj, int i13, int i14) {
            this(obj, i13, i14, "");
        }
    }

    public static final class zoijcleaow implements Appendable {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final iobyxmoadg f50177iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final List f50178jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final List f50179yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final StringBuilder f50180zdlpuopuiu;

        public static final class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final zoijcleaow f50181iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final List f50182zoijcleaow = new ArrayList();

            public iobyxmoadg(zoijcleaow zoijcleaowVar) {
                this.f50181iobyxmoadg = zoijcleaowVar;
            }
        }

        public zoijcleaow(int i13) {
            this.f50180zdlpuopuiu = new StringBuilder(i13);
            this.f50179yggfygwlhe = new ArrayList();
            this.f50178jyumaefscl = new ArrayList();
            this.f50177iwizpuwonk = new iobyxmoadg(this);
        }

        public final void agtfadlqog(tg.draadjrbmk draadjrbmkVar) {
            int size = this.f50178jyumaefscl.size();
            for (int i13 = 0; i13 < size; i13++) {
                this.f50178jyumaefscl.set(i13, C1072zoijcleaow.f50183eablkybsjg.iobyxmoadg((wkgbmnqykc) draadjrbmkVar.invoke(C1072zoijcleaow.ppxfxbqfkf((C1072zoijcleaow) this.f50178jyumaefscl.get(i13), 0, 1, null))));
            }
        }

        public final void btonecajqb(eablkybsjg eablkybsjgVar, int i13, int i14) {
            int length = this.f50180zdlpuopuiu.length();
            this.f50180zdlpuopuiu.append((CharSequence) eablkybsjgVar.btonecajqb(), i13, i14);
            List listDxjokdxxww = lqeggnwhkg.dxjokdxxww(eablkybsjgVar, i13, i14, null, 4, null);
            if (listDxjokdxxww != null) {
                int size = listDxjokdxxww.size();
                for (int i15 = 0; i15 < size; i15++) {
                    wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) listDxjokdxxww.get(i15);
                    this.f50178jyumaefscl.add(new C1072zoijcleaow(wkgbmnqykcVar.lqeggnwhkg(), wkgbmnqykcVar.nufgyqmvbu() + length, wkgbmnqykcVar.gxszxtbevo() + length, wkgbmnqykcVar.dxjokdxxww()));
                }
            }
        }

        public final void draadjrbmk(tg.draadjrbmk draadjrbmkVar) {
            List list = this.f50178jyumaefscl;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                List list2 = (List) draadjrbmkVar.invoke(C1072zoijcleaow.ppxfxbqfkf((C1072zoijcleaow) list.get(i13), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    arrayList2.add(C1072zoijcleaow.f50183eablkybsjg.iobyxmoadg((wkgbmnqykc) list2.get(i14)));
                }
                hg.jyumaefscl.istkbnxepw(arrayList, arrayList2);
            }
            this.f50178jyumaefscl.clear();
            this.f50178jyumaefscl.addAll(arrayList);
        }

        public final void dxjokdxxww(eablkybsjg eablkybsjgVar) {
            int length = this.f50180zdlpuopuiu.length();
            this.f50180zdlpuopuiu.append(eablkybsjgVar.btonecajqb());
            List listPpxfxbqfkf = eablkybsjgVar.ppxfxbqfkf();
            if (listPpxfxbqfkf != null) {
                int size = listPpxfxbqfkf.size();
                for (int i13 = 0; i13 < size; i13++) {
                    wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) listPpxfxbqfkf.get(i13);
                    this.f50178jyumaefscl.add(new C1072zoijcleaow(wkgbmnqykcVar.lqeggnwhkg(), wkgbmnqykcVar.nufgyqmvbu() + length, wkgbmnqykcVar.gxszxtbevo() + length, wkgbmnqykcVar.dxjokdxxww()));
                }
            }
        }

        public final void eablkybsjg(jrbgnlbqoe jrbgnlbqoeVar, int i13, int i14) {
            this.f50178jyumaefscl.add(new C1072zoijcleaow(jrbgnlbqoeVar, i13, i14, null, 8, null));
        }

        public final void gtknphoqwx(String str) {
            this.f50180zdlpuopuiu.append(str);
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public zoijcleaow append(char c13) {
            this.f50180zdlpuopuiu.append(c13);
            return this;
        }

        public final void iobyxmoadg(gtknphoqwx gtknphoqwxVar, long j13, int i13, int i14) {
            this.f50178jyumaefscl.add(new C1072zoijcleaow(new ylkuphrtab(0, 0, 0L, new v0.kcexrzcfyt(j13, j13, null), null, null, 0, 0, null, OkHttpErrorHandlerImpl.HTTP_UNAVAILABLE, null), i13, i14, null, 8, null));
            this.f50178jyumaefscl.add(new C1072zoijcleaow(gtknphoqwxVar, i13, i14, null, 8, null));
        }

        public final int kcexrzcfyt(ylkuphrtab ylkuphrtabVar) {
            C1072zoijcleaow c1072zoijcleaow = new C1072zoijcleaow(ylkuphrtabVar, this.f50180zdlpuopuiu.length(), 0, null, 12, null);
            this.f50179yggfygwlhe.add(c1072zoijcleaow);
            this.f50178jyumaefscl.add(c1072zoijcleaow);
            return this.f50179yggfygwlhe.size() - 1;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public zoijcleaow append(CharSequence charSequence) {
            if (charSequence instanceof eablkybsjg) {
                dxjokdxxww((eablkybsjg) charSequence);
            } else {
                this.f50180zdlpuopuiu.append(charSequence);
            }
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public zoijcleaow append(CharSequence charSequence, int i13, int i14) {
            if (charSequence instanceof eablkybsjg) {
                btonecajqb((eablkybsjg) charSequence, i13, i14);
            } else {
                this.f50180zdlpuopuiu.append(charSequence, i13, i14);
            }
            return this;
        }

        public final void ojitshcjhn() {
            if (this.f50179yggfygwlhe.isEmpty()) {
                q0.iobyxmoadg.ppxfxbqfkf("Nothing to pop.");
            }
            List list = this.f50179yggfygwlhe;
            ((C1072zoijcleaow) list.remove(list.size() - 1)).iobyxmoadg(this.f50180zdlpuopuiu.length());
        }

        public final int oxmwwwfdhm(String str, String str2) {
            C1072zoijcleaow c1072zoijcleaow = new C1072zoijcleaow(rhgxfdycjh.iobyxmoadg(rhgxfdycjh.zoijcleaow(str2)), this.f50180zdlpuopuiu.length(), 0, str, 4, null);
            this.f50179yggfygwlhe.add(c1072zoijcleaow);
            this.f50178jyumaefscl.add(c1072zoijcleaow);
            return this.f50179yggfygwlhe.size() - 1;
        }

        public final void ppxfxbqfkf(String str, String str2, int i13, int i14) {
            this.f50178jyumaefscl.add(new C1072zoijcleaow(rhgxfdycjh.iobyxmoadg(rhgxfdycjh.zoijcleaow(str2)), i13, i14, str));
        }

        public final void rgvfuqvkyq(int i13) {
            if (!(i13 < this.f50179yggfygwlhe.size())) {
                q0.iobyxmoadg.ppxfxbqfkf(i13 + " should be less than " + this.f50179yggfygwlhe.size());
            }
            while (this.f50179yggfygwlhe.size() - 1 >= i13) {
                ojitshcjhn();
            }
        }

        public final int vdvldrhtss(vdvldrhtss vdvldrhtssVar) {
            C1072zoijcleaow c1072zoijcleaow = new C1072zoijcleaow(vdvldrhtssVar, this.f50180zdlpuopuiu.length(), 0, null, 12, null);
            this.f50179yggfygwlhe.add(c1072zoijcleaow);
            this.f50178jyumaefscl.add(c1072zoijcleaow);
            return this.f50179yggfygwlhe.size() - 1;
        }

        public final int wflxmlrfwp() {
            return this.f50180zdlpuopuiu.length();
        }

        public final void wkgbmnqykc(ylkuphrtab ylkuphrtabVar, int i13, int i14) {
            this.f50178jyumaefscl.add(new C1072zoijcleaow(ylkuphrtabVar, i13, i14, null, 8, null));
        }

        public final eablkybsjg yggfygwlhe() {
            String string = this.f50180zdlpuopuiu.toString();
            List list = this.f50178jyumaefscl;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.add(((C1072zoijcleaow) list.get(i13)).zoijcleaow(this.f50180zdlpuopuiu.length()));
            }
            return new eablkybsjg(string, arrayList);
        }

        public final int zdlpuopuiu(jrbgnlbqoe jrbgnlbqoeVar) {
            C1072zoijcleaow c1072zoijcleaow = new C1072zoijcleaow(jrbgnlbqoeVar, this.f50180zdlpuopuiu.length(), 0, null, 12, null);
            this.f50179yggfygwlhe.add(c1072zoijcleaow);
            this.f50178jyumaefscl.add(c1072zoijcleaow);
            return this.f50179yggfygwlhe.size() - 1;
        }

        public final void zoijcleaow(vdvldrhtss.zoijcleaow zoijcleaowVar, int i13, int i14) {
            this.f50178jyumaefscl.add(new C1072zoijcleaow(zoijcleaowVar, i13, i14, null, 8, null));
        }

        /* JADX INFO: renamed from: j0.eablkybsjg$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        private static final class C1072zoijcleaow {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            public static final iobyxmoadg f50183eablkybsjg = new iobyxmoadg(null);

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final Object f50184iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private int f50185ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final String f50186wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final int f50187zoijcleaow;

            /* JADX INFO: renamed from: j0.eablkybsjg$zoijcleaow$zoijcleaow$iobyxmoadg */
            public static final class iobyxmoadg {
                public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                    this();
                }

                public final C1072zoijcleaow iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
                    return new C1072zoijcleaow(wkgbmnqykcVar.lqeggnwhkg(), wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo(), wkgbmnqykcVar.dxjokdxxww());
                }

                private iobyxmoadg() {
                }
            }

            public C1072zoijcleaow(Object obj, int i13, int i14, String str) {
                this.f50184iobyxmoadg = obj;
                this.f50187zoijcleaow = i13;
                this.f50185ppxfxbqfkf = i14;
                this.f50186wkgbmnqykc = str;
            }

            public static /* synthetic */ wkgbmnqykc ppxfxbqfkf(C1072zoijcleaow c1072zoijcleaow, int i13, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    i13 = Integer.MIN_VALUE;
                }
                return c1072zoijcleaow.zoijcleaow(i13);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1072zoijcleaow)) {
                    return false;
                }
                C1072zoijcleaow c1072zoijcleaow = (C1072zoijcleaow) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50184iobyxmoadg, c1072zoijcleaow.f50184iobyxmoadg) && this.f50187zoijcleaow == c1072zoijcleaow.f50187zoijcleaow && this.f50185ppxfxbqfkf == c1072zoijcleaow.f50185ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50186wkgbmnqykc, c1072zoijcleaow.f50186wkgbmnqykc);
            }

            public int hashCode() {
                Object obj = this.f50184iobyxmoadg;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f50187zoijcleaow)) * 31) + Integer.hashCode(this.f50185ppxfxbqfkf)) * 31) + this.f50186wkgbmnqykc.hashCode();
            }

            public final void iobyxmoadg(int i13) {
                this.f50185ppxfxbqfkf = i13;
            }

            public String toString() {
                return "MutableRange(item=" + this.f50184iobyxmoadg + ", start=" + this.f50187zoijcleaow + ", end=" + this.f50185ppxfxbqfkf + ", tag=" + this.f50186wkgbmnqykc + ')';
            }

            public final wkgbmnqykc zoijcleaow(int i13) {
                int i14 = this.f50185ppxfxbqfkf;
                if (i14 != Integer.MIN_VALUE) {
                    i13 = i14;
                }
                if (!(i13 != Integer.MIN_VALUE)) {
                    q0.iobyxmoadg.ppxfxbqfkf("Item.end should be set first");
                }
                return new wkgbmnqykc(this.f50184iobyxmoadg, this.f50187zoijcleaow, i13, this.f50186wkgbmnqykc);
            }

            public /* synthetic */ C1072zoijcleaow(Object obj, int i13, int i14, String str, int i15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this(obj, i13, (i15 & 4) != 0 ? Integer.MIN_VALUE : i14, (i15 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ zoijcleaow(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i14 & 1) != 0 ? 16 : i13);
        }

        public zoijcleaow(eablkybsjg eablkybsjgVar) {
            this(0, 1, null);
            dxjokdxxww(eablkybsjgVar);
        }
    }

    public /* synthetic */ eablkybsjg(String str, List list, List list2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list, (i13 & 4) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list2);
    }

    public eablkybsjg(String str, List list, List list2) {
        this(lqeggnwhkg.eablkybsjg(list, list2), str);
    }

    public /* synthetic */ eablkybsjg(String str, List list, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list);
    }

    public eablkybsjg(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
