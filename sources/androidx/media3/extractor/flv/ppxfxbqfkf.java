package androidx.media3.extractor.flv;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t3.wflxmlrfwp;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends TagPayloadReader {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long[] f11688ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long[] f11689wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f11690zoijcleaow;

    public ppxfxbqfkf() {
        super(new wflxmlrfwp());
        this.f11690zoijcleaow = -9223372036854775807L;
        this.f11688ppxfxbqfkf = new long[0];
        this.f11689wkgbmnqykc = new long[0];
    }

    private static String agtfadlqog(yadqdtsiqt yadqdtsiqtVar) {
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        yadqdtsiqtVar.crxdokpmqz(iWypolnanlu);
        return new String(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo, iWypolnanlu);
    }

    private static Double btonecajqb(yadqdtsiqt yadqdtsiqtVar) {
        return Double.valueOf(Double.longBitsToDouble(yadqdtsiqtVar.pmvmpeiblj()));
    }

    private static HashMap draadjrbmk(yadqdtsiqt yadqdtsiqtVar) {
        HashMap map = new HashMap();
        while (true) {
            String strAgtfadlqog = agtfadlqog(yadqdtsiqtVar);
            int iOjitshcjhn = ojitshcjhn(yadqdtsiqtVar);
            if (iOjitshcjhn == 9) {
                return map;
            }
            Object objNufgyqmvbu = nufgyqmvbu(yadqdtsiqtVar, iOjitshcjhn);
            if (objNufgyqmvbu != null) {
                map.put(strAgtfadlqog, objNufgyqmvbu);
            }
        }
    }

    private static Date dxjokdxxww(yadqdtsiqt yadqdtsiqtVar) {
        Date date = new Date((long) btonecajqb(yadqdtsiqtVar).doubleValue());
        yadqdtsiqtVar.crxdokpmqz(2);
        return date;
    }

    private static HashMap gtknphoqwx(yadqdtsiqt yadqdtsiqtVar) {
        int iJpowsppfya = yadqdtsiqtVar.jpowsppfya();
        HashMap map = new HashMap(iJpowsppfya);
        for (int i13 = 0; i13 < iJpowsppfya; i13++) {
            String strAgtfadlqog = agtfadlqog(yadqdtsiqtVar);
            Object objNufgyqmvbu = nufgyqmvbu(yadqdtsiqtVar, ojitshcjhn(yadqdtsiqtVar));
            if (objNufgyqmvbu != null) {
                map.put(strAgtfadlqog, objNufgyqmvbu);
            }
        }
        return map;
    }

    private static Boolean lqeggnwhkg(yadqdtsiqt yadqdtsiqtVar) {
        return Boolean.valueOf(yadqdtsiqtVar.wwaezpbzkn() == 1);
    }

    private static Object nufgyqmvbu(yadqdtsiqt yadqdtsiqtVar, int i13) {
        if (i13 == 0) {
            return btonecajqb(yadqdtsiqtVar);
        }
        if (i13 == 1) {
            return lqeggnwhkg(yadqdtsiqtVar);
        }
        if (i13 == 2) {
            return agtfadlqog(yadqdtsiqtVar);
        }
        if (i13 == 3) {
            return draadjrbmk(yadqdtsiqtVar);
        }
        if (i13 == 8) {
            return gtknphoqwx(yadqdtsiqtVar);
        }
        if (i13 == 10) {
            return wflxmlrfwp(yadqdtsiqtVar);
        }
        if (i13 != 11) {
            return null;
        }
        return dxjokdxxww(yadqdtsiqtVar);
    }

    private static int ojitshcjhn(yadqdtsiqt yadqdtsiqtVar) {
        return yadqdtsiqtVar.wwaezpbzkn();
    }

    private static ArrayList wflxmlrfwp(yadqdtsiqt yadqdtsiqtVar) {
        int iJpowsppfya = yadqdtsiqtVar.jpowsppfya();
        ArrayList arrayList = new ArrayList(iJpowsppfya);
        for (int i13 = 0; i13 < iJpowsppfya; i13++) {
            Object objNufgyqmvbu = nufgyqmvbu(yadqdtsiqtVar, ojitshcjhn(yadqdtsiqtVar));
            if (objNufgyqmvbu != null) {
                arrayList.add(objNufgyqmvbu);
            }
        }
        return arrayList;
    }

    public long[] eablkybsjg() {
        return this.f11689wkgbmnqykc;
    }

    public long[] gxszxtbevo() {
        return this.f11688ppxfxbqfkf;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar, long j13) {
        if (ojitshcjhn(yadqdtsiqtVar) != 2 || !"onMetaData".equals(agtfadlqog(yadqdtsiqtVar)) || yadqdtsiqtVar.iobyxmoadg() == 0 || ojitshcjhn(yadqdtsiqtVar) != 8) {
            return false;
        }
        HashMap mapGtknphoqwx = gtknphoqwx(yadqdtsiqtVar);
        Object obj = mapGtknphoqwx.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f11690zoijcleaow = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapGtknphoqwx.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f11688ppxfxbqfkf = new long[size];
                this.f11689wkgbmnqykc = new long[size];
                for (int i13 = 0; i13 < size; i13++) {
                    Object obj5 = list.get(i13);
                    Object obj6 = list2.get(i13);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f11688ppxfxbqfkf = new long[0];
                        this.f11689wkgbmnqykc = new long[0];
                        break;
                    }
                    this.f11688ppxfxbqfkf[i13] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f11689wkgbmnqykc[i13] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long wkgbmnqykc() {
        return this.f11690zoijcleaow;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean zoijcleaow(yadqdtsiqt yadqdtsiqtVar) {
        return true;
    }
}
