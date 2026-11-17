package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f12255iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f12256zoijcleaow = "nav_type";

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final vdvldrhtss f12250ppxfxbqfkf = new vdvldrhtss(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final wflxmlrfwp f12254wkgbmnqykc = new dxjokdxxww();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final wflxmlrfwp f12242eablkybsjg = new C0178wflxmlrfwp();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final wflxmlrfwp f12244gxszxtbevo = new lqeggnwhkg();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final wflxmlrfwp f12246lqeggnwhkg = new nufgyqmvbu();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final wflxmlrfwp f12247nufgyqmvbu = new draadjrbmk();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final wflxmlrfwp f12241dxjokdxxww = new btonecajqb();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final wflxmlrfwp f12239btonecajqb = new gtknphoqwx();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final wflxmlrfwp f12243gtknphoqwx = new gxszxtbevo();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final wflxmlrfwp f12240draadjrbmk = new wkgbmnqykc();

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final wflxmlrfwp f12253wflxmlrfwp = new eablkybsjg();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final wflxmlrfwp f12238agtfadlqog = new ppxfxbqfkf();

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final wflxmlrfwp f12248ojitshcjhn = new iobyxmoadg();

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final wflxmlrfwp f12251rgvfuqvkyq = new zoijcleaow();

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final wflxmlrfwp f12252vdvldrhtss = new rgvfuqvkyq();

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public static final wflxmlrfwp f12249oxmwwwfdhm = new agtfadlqog();

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final wflxmlrfwp f12245kcexrzcfyt = new ojitshcjhn();

    public static final class agtfadlqog extends h5.zoijcleaow {
        agtfadlqog() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public String[] iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(String[] strArr, String[] strArr2) {
            return hg.agtfadlqog.wkgbmnqykc(strArr, strArr2);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public String[] gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return new String[]{value};
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public List draadjrbmk(String[] strArr) {
            if (strArr == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public String[] lqeggnwhkg(String value, String[] strArr) {
            String[] strArr2;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return (strArr == null || (strArr2 = (String[]) hg.agtfadlqog.hcddaimhww(strArr, gxszxtbevo(value))) == null) ? gxszxtbevo(value) : strArr2;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, String[] strArr) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putStringArray(key, strArr);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public String[] gtknphoqwx() {
            return new String[0];
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "string[]";
        }
    }

    public static final class btonecajqb extends h5.zoijcleaow {
        btonecajqb() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public long[] iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(long[] jArr, long[] jArr2) {
            return hg.agtfadlqog.wkgbmnqykc(jArr != null ? hg.agtfadlqog.ulzqkzuiru(jArr) : null, jArr2 != null ? hg.agtfadlqog.ulzqkzuiru(jArr2) : null);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public long[] gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return new long[]{((Number) wflxmlrfwp.f12247nufgyqmvbu.gxszxtbevo(value)).longValue()};
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public List draadjrbmk(long[] jArr) {
            List listH;
            if (jArr == null || (listH = hg.agtfadlqog.h(jArr)) == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listH, 10));
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public long[] lqeggnwhkg(String value, long[] jArr) {
            long[] jArrWwaezpbzkn;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return (jArr == null || (jArrWwaezpbzkn = hg.agtfadlqog.wwaezpbzkn(jArr, gxszxtbevo(value))) == null) ? gxszxtbevo(value) : jArrWwaezpbzkn;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, long[] jArr) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putLongArray(key, jArr);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public long[] gtknphoqwx() {
            return new long[0];
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "long[]";
        }
    }

    public static final class draadjrbmk extends wflxmlrfwp {
        draadjrbmk() {
            super(false);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public Long gxszxtbevo(String value) {
            String strSubstring;
            long j13;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            if (mj.kcexrzcfyt.zynmafqrjb(value, "L", false, 2, null)) {
                strSubstring = value.substring(0, value.length() - 1);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
            } else {
                strSubstring = value;
            }
            if (mj.kcexrzcfyt.stevsuqkhv(value, "0x", false, 2, null)) {
                String strSubstring2 = strSubstring.substring(2);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
                j13 = Long.parseLong(strSubstring2, mj.iobyxmoadg.iobyxmoadg(16));
            } else {
                j13 = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j13);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public Long iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            Object obj = bundle.get(key);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // androidx.navigation.wflxmlrfwp
        public /* bridge */ /* synthetic */ void nufgyqmvbu(Bundle bundle, String str, Object obj) {
            wflxmlrfwp(bundle, str, ((Number) obj).longValue());
        }

        public void wflxmlrfwp(Bundle bundle, String key, long j13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putLong(key, j13);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "long";
        }
    }

    public static final class dxjokdxxww extends wflxmlrfwp {
        dxjokdxxww() {
            super(false);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public Integer gxszxtbevo(String value) {
            int i13;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            if (mj.kcexrzcfyt.stevsuqkhv(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
                i13 = Integer.parseInt(strSubstring, mj.iobyxmoadg.iobyxmoadg(16));
            } else {
                i13 = Integer.parseInt(value);
            }
            return Integer.valueOf(i13);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public Integer iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            Object obj = bundle.get(key);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.wflxmlrfwp
        public /* bridge */ /* synthetic */ void nufgyqmvbu(Bundle bundle, String str, Object obj) {
            wflxmlrfwp(bundle, str, ((Number) obj).intValue());
        }

        public void wflxmlrfwp(Bundle bundle, String key, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putInt(key, i13);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "integer";
        }
    }

    public static final class eablkybsjg extends h5.zoijcleaow {
        eablkybsjg() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public List iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            float[] fArr = (float[]) bundle.get(key);
            if (fArr != null) {
                return hg.agtfadlqog.f(fArr);
            }
            return null;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(List list, List list2) {
            return hg.agtfadlqog.wkgbmnqykc(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public List gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return hg.jyumaefscl.eablkybsjg(wflxmlrfwp.f12243gtknphoqwx.gxszxtbevo(value));
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public List draadjrbmk(List list) {
            if (list == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public List lqeggnwhkg(String value, List list) {
            List listIxidwrxhsl;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return (list == null || (listIxidwrxhsl = hg.jyumaefscl.ixidwrxhsl(list, gxszxtbevo(value))) == null) ? gxszxtbevo(value) : listIxidwrxhsl;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, List list) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putFloatArray(key, list != null ? hg.jyumaefscl.j(list) : null);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public List gtknphoqwx() {
            return hg.jyumaefscl.wflxmlrfwp();
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "List<Float>";
        }
    }

    public static final class gtknphoqwx extends h5.zoijcleaow {
        gtknphoqwx() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public List iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            long[] jArr = (long[]) bundle.get(key);
            if (jArr != null) {
                return hg.agtfadlqog.h(jArr);
            }
            return null;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(List list, List list2) {
            return hg.agtfadlqog.wkgbmnqykc(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public List gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return hg.jyumaefscl.eablkybsjg(wflxmlrfwp.f12247nufgyqmvbu.gxszxtbevo(value));
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public List draadjrbmk(List list) {
            if (list == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public List lqeggnwhkg(String value, List list) {
            List listIxidwrxhsl;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return (list == null || (listIxidwrxhsl = hg.jyumaefscl.ixidwrxhsl(list, gxszxtbevo(value))) == null) ? gxszxtbevo(value) : listIxidwrxhsl;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, List list) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putLongArray(key, list != null ? hg.jyumaefscl.n(list) : null);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public List gtknphoqwx() {
            return hg.jyumaefscl.wflxmlrfwp();
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "List<Long>";
        }
    }

    public static final class gxszxtbevo extends wflxmlrfwp {
        gxszxtbevo() {
            super(false);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public Float gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public Float iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            Object obj = bundle.get(key);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // androidx.navigation.wflxmlrfwp
        public /* bridge */ /* synthetic */ void nufgyqmvbu(Bundle bundle, String str, Object obj) {
            wflxmlrfwp(bundle, str, ((Number) obj).floatValue());
        }

        public void wflxmlrfwp(Bundle bundle, String key, float f13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putFloat(key, f13);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "float";
        }
    }

    public static final class iobyxmoadg extends h5.zoijcleaow {
        iobyxmoadg() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public boolean[] iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(boolean[] zArr, boolean[] zArr2) {
            return hg.agtfadlqog.wkgbmnqykc(zArr != null ? hg.agtfadlqog.tzroggbefp(zArr) : null, zArr2 != null ? hg.agtfadlqog.tzroggbefp(zArr2) : null);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public boolean[] gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return new boolean[]{((Boolean) wflxmlrfwp.f12238agtfadlqog.gxszxtbevo(value)).booleanValue()};
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public List draadjrbmk(boolean[] zArr) {
            List listK;
            if (zArr == null || (listK = hg.agtfadlqog.k(zArr)) == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listK, 10));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public boolean[] lqeggnwhkg(String value, boolean[] zArr) {
            boolean[] zArrJpowsppfya;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return (zArr == null || (zArrJpowsppfya = hg.agtfadlqog.jpowsppfya(zArr, gxszxtbevo(value))) == null) ? gxszxtbevo(value) : zArrJpowsppfya;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, boolean[] zArr) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putBooleanArray(key, zArr);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public boolean[] gtknphoqwx() {
            return new boolean[0];
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "boolean[]";
        }
    }

    public static final class kcexrzcfyt extends wflxmlrfwp {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Class f12258zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kcexrzcfyt(Class type) {
            super(true);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<?> cls = Class.forName("[L" + type.getName() + ';');
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.f12258zdlpuopuiu = cls;
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException(e13);
            }
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(Parcelable[] parcelableArr, Parcelable[] parcelableArr2) {
            return hg.agtfadlqog.wkgbmnqykc(parcelableArr, parcelableArr2);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public Parcelable[] gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kcexrzcfyt.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f12258zdlpuopuiu, ((kcexrzcfyt) obj).f12258zdlpuopuiu);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public Parcelable[] iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return (Parcelable[]) bundle.get(key);
        }

        public int hashCode() {
            return this.f12258zdlpuopuiu.hashCode();
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, Parcelable[] parcelableArr) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            this.f12258zdlpuopuiu.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            String name = this.f12258zdlpuopuiu.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "arrayType.name");
            return name;
        }
    }

    public static final class lqeggnwhkg extends h5.zoijcleaow {
        lqeggnwhkg() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public int[] iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(int[] iArr, int[] iArr2) {
            return hg.agtfadlqog.wkgbmnqykc(iArr != null ? hg.agtfadlqog.ntlheqmsrt(iArr) : null, iArr2 != null ? hg.agtfadlqog.ntlheqmsrt(iArr2) : null);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public int[] gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return new int[]{((Number) wflxmlrfwp.f12254wkgbmnqykc.gxszxtbevo(value)).intValue()};
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public List draadjrbmk(int[] iArr) {
            List listG;
            if (iArr == null || (listG = hg.agtfadlqog.g(iArr)) == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listG, 10));
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public int[] lqeggnwhkg(String value, int[] iArr) {
            int[] iArrLmojexxdyd;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return (iArr == null || (iArrLmojexxdyd = hg.agtfadlqog.lmojexxdyd(iArr, gxszxtbevo(value))) == null) ? gxszxtbevo(value) : iArrLmojexxdyd;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, int[] iArr) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putIntArray(key, iArr);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public int[] gtknphoqwx() {
            return new int[0];
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "integer[]";
        }
    }

    public static final class nufgyqmvbu extends h5.zoijcleaow {
        nufgyqmvbu() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public List iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            int[] iArr = (int[]) bundle.get(key);
            if (iArr != null) {
                return hg.agtfadlqog.g(iArr);
            }
            return null;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(List list, List list2) {
            return hg.agtfadlqog.wkgbmnqykc(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public List gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return hg.jyumaefscl.eablkybsjg(wflxmlrfwp.f12254wkgbmnqykc.gxszxtbevo(value));
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public List draadjrbmk(List list) {
            if (list == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public List lqeggnwhkg(String value, List list) {
            List listIxidwrxhsl;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return (list == null || (listIxidwrxhsl = hg.jyumaefscl.ixidwrxhsl(list, gxszxtbevo(value))) == null) ? gxszxtbevo(value) : listIxidwrxhsl;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, List list) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putIntArray(key, list != null ? hg.jyumaefscl.l(list) : null);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public List gtknphoqwx() {
            return hg.jyumaefscl.wflxmlrfwp();
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "List<Int>";
        }
    }

    public static final class ojitshcjhn extends h5.zoijcleaow {
        ojitshcjhn() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public List iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            String[] strArr = (String[]) bundle.get(key);
            if (strArr != null) {
                return hg.agtfadlqog.i(strArr);
            }
            return null;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(List list, List list2) {
            return hg.agtfadlqog.wkgbmnqykc(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public List gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return hg.jyumaefscl.eablkybsjg(value);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public List draadjrbmk(List list) {
            if (list == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public List lqeggnwhkg(String value, List list) {
            List listIxidwrxhsl;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return (list == null || (listIxidwrxhsl = hg.jyumaefscl.ixidwrxhsl(list, gxszxtbevo(value))) == null) ? gxszxtbevo(value) : listIxidwrxhsl;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, List list) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putStringArray(key, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public List gtknphoqwx() {
            return hg.jyumaefscl.wflxmlrfwp();
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "List<String>";
        }
    }

    public static final class oxmwwwfdhm extends jyumaefscl {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Class f12259yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(Class type) {
            super(false, type);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            if (type.isEnum()) {
                this.f12259yggfygwlhe = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.wflxmlrfwp.jyumaefscl, androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public Enum gxszxtbevo(String value) {
            Object obj;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            Object[] enumConstants = this.f12259yggfygwlhe.getEnumConstants();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i13];
                if (mj.kcexrzcfyt.istkbnxepw(((Enum) obj).name(), value, true)) {
                    break;
                }
                i13++;
            }
            Enum r13 = (Enum) obj;
            if (r13 != null) {
                return r13;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.f12259yggfygwlhe.getName() + '.');
        }

        @Override // androidx.navigation.wflxmlrfwp.jyumaefscl, androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            String name = this.f12259yggfygwlhe.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "type.name");
            return name;
        }
    }

    public static final class ppxfxbqfkf extends wflxmlrfwp {
        ppxfxbqfkf() {
            super(false);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public Boolean gxszxtbevo(String value) {
            boolean z13;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(value, "true")) {
                z13 = true;
            } else {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z13 = false;
            }
            return Boolean.valueOf(z13);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public Boolean iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public /* bridge */ /* synthetic */ void nufgyqmvbu(Bundle bundle, String str, Object obj) {
            wflxmlrfwp(bundle, str, ((Boolean) obj).booleanValue());
        }

        public void wflxmlrfwp(Bundle bundle, String key, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putBoolean(key, z13);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "boolean";
        }
    }

    public static final class rgvfuqvkyq extends wflxmlrfwp {
        rgvfuqvkyq() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public String dxjokdxxww(String str) {
            String strEncode = str != null ? Uri.encode(str) : null;
            return strEncode == null ? "null" : strEncode;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public String gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(value, "null")) {
                return null;
            }
            return value;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public String iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return (String) bundle.get(key);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putString(key, str);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "string";
        }
    }

    public static final class vdvldrhtss {
        public /* synthetic */ vdvldrhtss(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public wflxmlrfwp iobyxmoadg(String str, String str2) {
            String strSubstring;
            wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f12254wkgbmnqykc;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar.zoijcleaow(), str)) {
                return wflxmlrfwpVar;
            }
            wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwp.f12244gxszxtbevo;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar2.zoijcleaow(), str)) {
                return wflxmlrfwpVar2;
            }
            wflxmlrfwp wflxmlrfwpVar3 = wflxmlrfwp.f12246lqeggnwhkg;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar3.zoijcleaow(), str)) {
                return wflxmlrfwpVar3;
            }
            wflxmlrfwp wflxmlrfwpVar4 = wflxmlrfwp.f12247nufgyqmvbu;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar4.zoijcleaow(), str)) {
                return wflxmlrfwpVar4;
            }
            wflxmlrfwp wflxmlrfwpVar5 = wflxmlrfwp.f12241dxjokdxxww;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar5.zoijcleaow(), str)) {
                return wflxmlrfwpVar5;
            }
            wflxmlrfwp wflxmlrfwpVar6 = wflxmlrfwp.f12239btonecajqb;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar6.zoijcleaow(), str)) {
                return wflxmlrfwpVar6;
            }
            wflxmlrfwp wflxmlrfwpVar7 = wflxmlrfwp.f12238agtfadlqog;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar7.zoijcleaow(), str)) {
                return wflxmlrfwpVar7;
            }
            wflxmlrfwp wflxmlrfwpVar8 = wflxmlrfwp.f12248ojitshcjhn;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar8.zoijcleaow(), str)) {
                return wflxmlrfwpVar8;
            }
            wflxmlrfwp wflxmlrfwpVar9 = wflxmlrfwp.f12251rgvfuqvkyq;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar9.zoijcleaow(), str)) {
                return wflxmlrfwpVar9;
            }
            wflxmlrfwp wflxmlrfwpVar10 = wflxmlrfwp.f12252vdvldrhtss;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar10.zoijcleaow(), str)) {
                return wflxmlrfwpVar10;
            }
            wflxmlrfwp wflxmlrfwpVar11 = wflxmlrfwp.f12249oxmwwwfdhm;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar11.zoijcleaow(), str)) {
                return wflxmlrfwpVar11;
            }
            wflxmlrfwp wflxmlrfwpVar12 = wflxmlrfwp.f12245kcexrzcfyt;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar12.zoijcleaow(), str)) {
                return wflxmlrfwpVar12;
            }
            wflxmlrfwp wflxmlrfwpVar13 = wflxmlrfwp.f12243gtknphoqwx;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar13.zoijcleaow(), str)) {
                return wflxmlrfwpVar13;
            }
            wflxmlrfwp wflxmlrfwpVar14 = wflxmlrfwp.f12240draadjrbmk;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar14.zoijcleaow(), str)) {
                return wflxmlrfwpVar14;
            }
            wflxmlrfwp wflxmlrfwpVar15 = wflxmlrfwp.f12253wflxmlrfwp;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar15.zoijcleaow(), str)) {
                return wflxmlrfwpVar15;
            }
            wflxmlrfwp wflxmlrfwpVar16 = wflxmlrfwp.f12242eablkybsjg;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar16.zoijcleaow(), str)) {
                return wflxmlrfwpVar16;
            }
            if (str == null || str.length() == 0) {
                return wflxmlrfwpVar10;
            }
            try {
                if (!mj.kcexrzcfyt.stevsuqkhv(str, ".", false, 2, null) || str2 == null) {
                    strSubstring = str;
                } else {
                    strSubstring = str2 + str;
                }
                boolean zZynmafqrjb = mj.kcexrzcfyt.zynmafqrjb(str, "[]", false, 2, null);
                if (zZynmafqrjb) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
                }
                Class<?> clazz = Class.forName(strSubstring);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(clazz, "clazz");
                wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = wkgbmnqykc(clazz, zZynmafqrjb);
                if (wflxmlrfwpVarWkgbmnqykc != null) {
                    return wflxmlrfwpVarWkgbmnqykc;
                }
                throw new IllegalArgumentException((strSubstring + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException(e13);
            }
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:48:0x00da  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:55:0x0100  */
        /* JADX WARN: Instruction removed from duplicated block: B:55:0x0100, please report this as an issue */
        public final wflxmlrfwp ppxfxbqfkf(Object obj) {
            wflxmlrfwp jyumaefsclVar;
            Class<?> componentType;
            if (obj instanceof Integer) {
                wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f12254wkgbmnqykc;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar;
            }
            if (obj instanceof int[]) {
                wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwp.f12244gxszxtbevo;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar2;
            }
            if (obj instanceof Long) {
                wflxmlrfwp wflxmlrfwpVar3 = wflxmlrfwp.f12247nufgyqmvbu;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar3;
            }
            if (obj instanceof long[]) {
                wflxmlrfwp wflxmlrfwpVar4 = wflxmlrfwp.f12241dxjokdxxww;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar4;
            }
            if (obj instanceof Float) {
                wflxmlrfwp wflxmlrfwpVar5 = wflxmlrfwp.f12243gtknphoqwx;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar5;
            }
            if (obj instanceof float[]) {
                wflxmlrfwp wflxmlrfwpVar6 = wflxmlrfwp.f12240draadjrbmk;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar6;
            }
            if (obj instanceof Boolean) {
                wflxmlrfwp wflxmlrfwpVar7 = wflxmlrfwp.f12238agtfadlqog;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar7;
            }
            if (obj instanceof boolean[]) {
                wflxmlrfwp wflxmlrfwpVar8 = wflxmlrfwp.f12248ojitshcjhn;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar8;
            }
            if ((obj instanceof String) || obj == null) {
                wflxmlrfwp wflxmlrfwpVar9 = wflxmlrfwp.f12252vdvldrhtss;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar9;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                wflxmlrfwp wflxmlrfwpVar10 = wflxmlrfwp.f12249oxmwwwfdhm;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar10;
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType2 = obj.getClass().getComponentType();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(componentType2);
                if (Parcelable.class.isAssignableFrom(componentType2)) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(componentType3, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    jyumaefsclVar = new kcexrzcfyt(componentType3);
                } else if (obj.getClass().isArray()) {
                    componentType = obj.getClass().getComponentType();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(componentType);
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        jyumaefsclVar = new yggfygwlhe(componentType4);
                    } else if (obj instanceof Parcelable) {
                        jyumaefsclVar = new zdlpuopuiu(obj.getClass());
                    } else if (obj instanceof Enum) {
                        jyumaefsclVar = new oxmwwwfdhm(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        jyumaefsclVar = new jyumaefscl(obj.getClass());
                    }
                } else if (obj instanceof Parcelable) {
                    jyumaefsclVar = new zdlpuopuiu(obj.getClass());
                } else if (obj instanceof Enum) {
                    jyumaefsclVar = new oxmwwwfdhm(obj.getClass());
                } else {
                    if (obj instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    jyumaefsclVar = new jyumaefscl(obj.getClass());
                }
            } else if (obj.getClass().isArray()) {
                componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(componentType);
                if (Serializable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType5 = obj.getClass().getComponentType();
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(componentType5, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    jyumaefsclVar = new yggfygwlhe(componentType5);
                } else if (obj instanceof Parcelable) {
                    jyumaefsclVar = new zdlpuopuiu(obj.getClass());
                } else if (obj instanceof Enum) {
                    jyumaefsclVar = new oxmwwwfdhm(obj.getClass());
                } else {
                    if (obj instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    jyumaefsclVar = new jyumaefscl(obj.getClass());
                }
            } else if (obj instanceof Parcelable) {
                jyumaefsclVar = new zdlpuopuiu(obj.getClass());
            } else if (obj instanceof Enum) {
                jyumaefsclVar = new oxmwwwfdhm(obj.getClass());
            } else {
                if (obj instanceof Serializable) {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                jyumaefsclVar = new jyumaefscl(obj.getClass());
            }
            return jyumaefsclVar;
        }

        public final wflxmlrfwp wkgbmnqykc(Class clazz, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                return z13 ? new kcexrzcfyt(clazz) : new zdlpuopuiu(clazz);
            }
            if (Enum.class.isAssignableFrom(clazz) && !z13) {
                return new oxmwwwfdhm(clazz);
            }
            if (Serializable.class.isAssignableFrom(clazz)) {
                return z13 ? new yggfygwlhe(clazz) : new jyumaefscl(clazz);
            }
            return null;
        }

        public final wflxmlrfwp zoijcleaow(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            try {
                try {
                    try {
                        try {
                            wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f12254wkgbmnqykc;
                            wflxmlrfwpVar.gxszxtbevo(value);
                            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return wflxmlrfwpVar;
                        } catch (IllegalArgumentException unused) {
                            wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwp.f12238agtfadlqog;
                            wflxmlrfwpVar2.gxszxtbevo(value);
                            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return wflxmlrfwpVar2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        wflxmlrfwp wflxmlrfwpVar3 = wflxmlrfwp.f12247nufgyqmvbu;
                        wflxmlrfwpVar3.gxszxtbevo(value);
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return wflxmlrfwpVar3;
                    }
                } catch (IllegalArgumentException unused3) {
                    wflxmlrfwp wflxmlrfwpVar4 = wflxmlrfwp.f12252vdvldrhtss;
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return wflxmlrfwpVar4;
                }
            } catch (IllegalArgumentException unused4) {
                wflxmlrfwp wflxmlrfwpVar5 = wflxmlrfwp.f12243gtknphoqwx;
                wflxmlrfwpVar5.gxszxtbevo(value);
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wflxmlrfwpVar5;
            }
        }

        private vdvldrhtss() {
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.wflxmlrfwp$wflxmlrfwp, reason: collision with other inner class name */
    public static final class C0178wflxmlrfwp extends wflxmlrfwp {
        C0178wflxmlrfwp() {
            super(false);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public Integer gxszxtbevo(String value) {
            int i13;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            if (mj.kcexrzcfyt.stevsuqkhv(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
                i13 = Integer.parseInt(strSubstring, mj.iobyxmoadg.iobyxmoadg(16));
            } else {
                i13 = Integer.parseInt(value);
            }
            return Integer.valueOf(i13);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public Integer iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            Object obj = bundle.get(key);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.wflxmlrfwp
        public /* bridge */ /* synthetic */ void nufgyqmvbu(Bundle bundle, String str, Object obj) {
            wflxmlrfwp(bundle, str, ((Number) obj).intValue());
        }

        public void wflxmlrfwp(Bundle bundle, String key, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putInt(key, i13);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "reference";
        }
    }

    public static final class wkgbmnqykc extends h5.zoijcleaow {
        wkgbmnqykc() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public float[] iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(float[] fArr, float[] fArr2) {
            return hg.agtfadlqog.wkgbmnqykc(fArr != null ? hg.agtfadlqog.mbcevpiqjq(fArr) : null, fArr2 != null ? hg.agtfadlqog.mbcevpiqjq(fArr2) : null);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public float[] gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return new float[]{((Number) wflxmlrfwp.f12243gtknphoqwx.gxszxtbevo(value)).floatValue()};
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public List draadjrbmk(float[] fArr) {
            List listF;
            if (fArr == null || (listF = hg.agtfadlqog.f(fArr)) == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listF, 10));
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public float[] lqeggnwhkg(String value, float[] fArr) {
            float[] fArrYadqdtsiqt;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return (fArr == null || (fArrYadqdtsiqt = hg.agtfadlqog.yadqdtsiqt(fArr, gxszxtbevo(value))) == null) ? gxszxtbevo(value) : fArrYadqdtsiqt;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, float[] fArr) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putFloatArray(key, fArr);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public float[] gtknphoqwx() {
            return new float[0];
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "float[]";
        }
    }

    public static final class yggfygwlhe extends wflxmlrfwp {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Class f12260zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public yggfygwlhe(Class type) {
            super(true);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<?> cls = Class.forName("[L" + type.getName() + ';');
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.f12260zdlpuopuiu = cls;
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException(e13);
            }
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(Serializable[] serializableArr, Serializable[] serializableArr2) {
            return hg.agtfadlqog.wkgbmnqykc(serializableArr, serializableArr2);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public Serializable[] gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yggfygwlhe.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f12260zdlpuopuiu, ((yggfygwlhe) obj).f12260zdlpuopuiu);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public Serializable[] iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return (Serializable[]) bundle.get(key);
        }

        public int hashCode() {
            return this.f12260zdlpuopuiu.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, Serializable[] serializableArr) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            this.f12260zdlpuopuiu.cast(serializableArr);
            bundle.putSerializable(key, serializableArr);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            String name = this.f12260zdlpuopuiu.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "arrayType.name");
            return name;
        }
    }

    public static final class zdlpuopuiu extends wflxmlrfwp {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Class f12261zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zdlpuopuiu(Class type) {
            super(true);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.f12261zdlpuopuiu = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zdlpuopuiu.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f12261zdlpuopuiu, ((zdlpuopuiu) obj).f12261zdlpuopuiu);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public Object gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f12261zdlpuopuiu.hashCode();
        }

        @Override // androidx.navigation.wflxmlrfwp
        public Object iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return bundle.get(key);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public void nufgyqmvbu(Bundle bundle, String key, Object obj) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            this.f12261zdlpuopuiu.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
            }
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            String name = this.f12261zdlpuopuiu.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "type.name");
            return name;
        }
    }

    public static final class zoijcleaow extends h5.zoijcleaow {
        zoijcleaow() {
            super(true);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public List iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            boolean[] zArr = (boolean[]) bundle.get(key);
            if (zArr != null) {
                return hg.agtfadlqog.k(zArr);
            }
            return null;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public boolean btonecajqb(List list, List list2) {
            return hg.agtfadlqog.wkgbmnqykc(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public List gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return hg.jyumaefscl.eablkybsjg(wflxmlrfwp.f12238agtfadlqog.gxszxtbevo(value));
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public List draadjrbmk(List list) {
            if (list == null) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public List lqeggnwhkg(String value, List list) {
            List listIxidwrxhsl;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return (list == null || (listIxidwrxhsl = hg.jyumaefscl.ixidwrxhsl(list, gxszxtbevo(value))) == null) ? gxszxtbevo(value) : listIxidwrxhsl;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, List list) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            bundle.putBooleanArray(key, list != null ? hg.jyumaefscl.h(list) : null);
        }

        @Override // h5.zoijcleaow
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public List gtknphoqwx() {
            return hg.jyumaefscl.wflxmlrfwp();
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            return "List<Boolean>";
        }
    }

    public wflxmlrfwp(boolean z13) {
        this.f12255iobyxmoadg = z13;
    }

    public boolean btonecajqb(Object obj, Object obj2) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, obj2);
    }

    public String dxjokdxxww(Object obj) {
        return String.valueOf(obj);
    }

    public final Object eablkybsjg(Bundle bundle, String key, String str, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str == null) {
            return obj;
        }
        Object objLqeggnwhkg = lqeggnwhkg(str, obj);
        nufgyqmvbu(bundle, key, objLqeggnwhkg);
        return objLqeggnwhkg;
    }

    public abstract Object gxszxtbevo(String str);

    public abstract Object iobyxmoadg(Bundle bundle, String str);

    public Object lqeggnwhkg(String value, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        return gxszxtbevo(value);
    }

    public abstract void nufgyqmvbu(Bundle bundle, String str, Object obj);

    public boolean ppxfxbqfkf() {
        return this.f12255iobyxmoadg;
    }

    public String toString() {
        return zoijcleaow();
    }

    public final Object wkgbmnqykc(Bundle bundle, String key, String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        Object objGxszxtbevo = gxszxtbevo(value);
        nufgyqmvbu(bundle, key, objGxszxtbevo);
        return objGxszxtbevo;
    }

    public abstract String zoijcleaow();

    public static class jyumaefscl extends wflxmlrfwp {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Class f12257zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(Class type) {
            super(true);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.f12257zdlpuopuiu = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public Serializable gxszxtbevo(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof jyumaefscl) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f12257zdlpuopuiu, ((jyumaefscl) obj).f12257zdlpuopuiu);
            }
            return false;
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public Serializable iobyxmoadg(Bundle bundle, String key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            return (Serializable) bundle.get(key);
        }

        public int hashCode() {
            return this.f12257zdlpuopuiu.hashCode();
        }

        @Override // androidx.navigation.wflxmlrfwp
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bundle bundle, String key, Serializable value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            this.f12257zdlpuopuiu.cast(value);
            bundle.putSerializable(key, value);
        }

        @Override // androidx.navigation.wflxmlrfwp
        public String zoijcleaow() {
            String name = this.f12257zdlpuopuiu.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "type.name");
            return name;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public jyumaefscl(boolean z13, Class type) {
            super(z13);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f12257zdlpuopuiu = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
