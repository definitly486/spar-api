package p72;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import o72.Splash;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n72.iobyxmoadg f75968zoijcleaow;

    public static final class iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((Splash) obj).getId()), Integer.valueOf(((Splash) obj2).getId()));
        }
    }

    /* JADX INFO: renamed from: p72.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1674zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f75970esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f75971iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f75972jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f75973yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75974zdlpuopuiu;

        C1674zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75971iwizpuwonk = obj;
            this.f75970esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(n72.iobyxmoadg splashRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(splashRepository, "splashRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f75968zoijcleaow = splashRepository;
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
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        C1674zoijcleaow c1674zoijcleaow;
        int iCurrentTimeMillis;
        zoijcleaow zoijcleaowVar;
        Object next;
        Splash splash;
        zoijcleaow zoijcleaowVar2;
        if (gxszxtbevoVar instanceof C1674zoijcleaow) {
            c1674zoijcleaow = (C1674zoijcleaow) gxszxtbevoVar;
            int i13 = c1674zoijcleaow.f75970esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1674zoijcleaow.f75970esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                c1674zoijcleaow = new C1674zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c1674zoijcleaow = new C1674zoijcleaow(gxszxtbevoVar);
        }
        Object objEablkybsjg = c1674zoijcleaow.f75971iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1674zoijcleaow.f75970esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iCurrentTimeMillis = c1674zoijcleaow.f75972jyumaefscl;
                zoijcleaowVar = (zoijcleaow) c1674zoijcleaow.f75974zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                splash = (Splash) c1674zoijcleaow.f75973yggfygwlhe;
                zoijcleaowVar2 = (zoijcleaow) c1674zoijcleaow.f75974zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            }
            if (zoijcleaowVar2.ppxfxbqfkf((File) objEablkybsjg)) {
                return splash;
            }
            return null;
        }
        gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        iCurrentTimeMillis = (int) System.currentTimeMillis();
        n72.iobyxmoadg iobyxmoadgVar = this.f75968zoijcleaow;
        c1674zoijcleaow.f75974zdlpuopuiu = this;
        c1674zoijcleaow.f75972jyumaefscl = iCurrentTimeMillis;
        c1674zoijcleaow.f75970esjtqupxsv = 1;
        objEablkybsjg = iobyxmoadgVar.eablkybsjg(c1674zoijcleaow);
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
        n72.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f75968zoijcleaow;
        String filePath = splash2.getFilePath();
        c1674zoijcleaow.f75974zdlpuopuiu = zoijcleaowVar;
        c1674zoijcleaow.f75973yggfygwlhe = splash2;
        c1674zoijcleaow.f75970esjtqupxsv = 2;
        Object objZoijcleaow = iobyxmoadgVar2.zoijcleaow(filePath, c1674zoijcleaow);
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
