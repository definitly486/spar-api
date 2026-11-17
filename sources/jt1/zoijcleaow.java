package jt1;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import it1.Splash;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ht1.iobyxmoadg f52357zoijcleaow;

    public static final class iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((Splash) obj).getId()), Integer.valueOf(((Splash) obj2).getId()));
        }
    }

    /* JADX INFO: renamed from: jt1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1117zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f52359esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f52360iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f52361jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f52362yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f52363zdlpuopuiu;

        C1117zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52360iwizpuwonk = obj;
            this.f52359esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(ht1.iobyxmoadg splashRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(splashRepository, "splashRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f52357zoijcleaow = splashRepository;
    }

    private final boolean eablkybsjg(int i13, int i14) {
        return i13 > i14;
    }

    private final boolean gxszxtbevo(String str) {
        try {
            try {
                new JSONObject(str);
                return true;
            } catch (JSONException unused) {
                new JSONArray(str);
                return true;
            }
        } catch (JSONException unused2) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    private final boolean ppxfxbqfkf(File file) {
        String strNufgyqmvbu;
        if (file == null) {
            strNufgyqmvbu = null;
        } else {
            if (!file.exists() || !file.isFile()) {
                file = null;
            }
            if (file != null) {
                strNufgyqmvbu = rg.gxszxtbevo.nufgyqmvbu(file, null, 1, null);
            } else {
                strNufgyqmvbu = null;
            }
        }
        String string = strNufgyqmvbu != null ? kcexrzcfyt.p(strNufgyqmvbu).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return false;
        }
        return gxszxtbevo(string);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        C1117zoijcleaow c1117zoijcleaow;
        int iCurrentTimeMillis;
        zoijcleaow zoijcleaowVar;
        Object next;
        Splash splash;
        zoijcleaow zoijcleaowVar2;
        if (gxszxtbevoVar instanceof C1117zoijcleaow) {
            c1117zoijcleaow = (C1117zoijcleaow) gxszxtbevoVar;
            int i13 = c1117zoijcleaow.f52359esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1117zoijcleaow.f52359esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                c1117zoijcleaow = new C1117zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c1117zoijcleaow = new C1117zoijcleaow(gxszxtbevoVar);
        }
        Object objEablkybsjg = c1117zoijcleaow.f52360iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1117zoijcleaow.f52359esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iCurrentTimeMillis = c1117zoijcleaow.f52361jyumaefscl;
                zoijcleaowVar = (zoijcleaow) c1117zoijcleaow.f52363zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                splash = (Splash) c1117zoijcleaow.f52362yggfygwlhe;
                zoijcleaowVar2 = (zoijcleaow) c1117zoijcleaow.f52363zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            }
            if (zoijcleaowVar2.ppxfxbqfkf((File) objEablkybsjg)) {
                return splash;
            }
            return null;
        }
        gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        iCurrentTimeMillis = (int) System.currentTimeMillis();
        ht1.iobyxmoadg iobyxmoadgVar = this.f52357zoijcleaow;
        c1117zoijcleaow.f52363zdlpuopuiu = this;
        c1117zoijcleaow.f52361jyumaefscl = iCurrentTimeMillis;
        c1117zoijcleaow.f52359esjtqupxsv = 1;
        objEablkybsjg = iobyxmoadgVar.eablkybsjg(c1117zoijcleaow);
        if (objEablkybsjg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objEablkybsjg) {
            Integer endTime = ((Splash) obj).getEndTime();
            if (endTime != null ? zoijcleaowVar.eablkybsjg(endTime.intValue(), iCurrentTimeMillis) : true) {
                arrayList.add(obj);
            }
        }
        Iterator it = jyumaefscl.d(arrayList, new iobyxmoadg()).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int showCount = ((Splash) next).getShowCount();
                do {
                    Object next2 = it.next();
                    int showCount2 = ((Splash) next2).getShowCount();
                    if (showCount > showCount2) {
                        next = next2;
                        showCount = showCount2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Splash splash2 = (Splash) next;
        if (splash2 == null) {
            return null;
        }
        ht1.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f52357zoijcleaow;
        String filePath = splash2.getFilePath();
        c1117zoijcleaow.f52363zdlpuopuiu = zoijcleaowVar;
        c1117zoijcleaow.f52362yggfygwlhe = splash2;
        c1117zoijcleaow.f52359esjtqupxsv = 2;
        Object objZoijcleaow = iobyxmoadgVar2.zoijcleaow(filePath, c1117zoijcleaow);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        splash = splash2;
        objEablkybsjg = objZoijcleaow;
        zoijcleaowVar2 = zoijcleaowVar;
        if (zoijcleaowVar2.ppxfxbqfkf((File) objEablkybsjg)) {
            return null;
        }
        return splash;
    }
}
