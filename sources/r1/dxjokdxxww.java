package r1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.jztzpxfvev;
import androidx.collection.pmvmpeiblj;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import lereixgezr.istkbnxepw;

/* JADX INFO: loaded from: classes.dex */
abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final pmvmpeiblj f81423iobyxmoadg = new pmvmpeiblj(16);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ExecutorService f81426zoijcleaow = draadjrbmk.iobyxmoadg("fonts-androidx", 10, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final Object f81424ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final jztzpxfvev f81425wkgbmnqykc = new jztzpxfvev();

    class iobyxmoadg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f81429iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ r1.eablkybsjg f81430ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ int f81431wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Context f81432zoijcleaow;

        iobyxmoadg(String str, Context context, r1.eablkybsjg eablkybsjgVar, int i13) {
            this.f81429iobyxmoadg = str;
            this.f81432zoijcleaow = context;
            this.f81430ppxfxbqfkf = eablkybsjgVar;
            this.f81431wkgbmnqykc = i13;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public eablkybsjg call() {
            return dxjokdxxww.ppxfxbqfkf(this.f81429iobyxmoadg, this.f81432zoijcleaow, istkbnxepw.iobyxmoadg(new Object[]{this.f81430ppxfxbqfkf}), this.f81431wkgbmnqykc);
        }
    }

    class ppxfxbqfkf implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f81433iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ List f81434ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ int f81435wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Context f81436zoijcleaow;

        ppxfxbqfkf(String str, Context context, List list, int i13) {
            this.f81433iobyxmoadg = str;
            this.f81436zoijcleaow = context;
            this.f81434ppxfxbqfkf = list;
            this.f81435wkgbmnqykc = i13;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public eablkybsjg call() {
            try {
                return dxjokdxxww.ppxfxbqfkf(this.f81433iobyxmoadg, this.f81436zoijcleaow, this.f81434ppxfxbqfkf, this.f81435wkgbmnqykc);
            } catch (Throwable unused) {
                return new eablkybsjg(-3);
            }
        }
    }

    class wkgbmnqykc implements u1.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f81437iobyxmoadg;

        wkgbmnqykc(String str) {
            this.f81437iobyxmoadg = str;
        }

        @Override // u1.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void accept(eablkybsjg eablkybsjgVar) {
            synchronized (dxjokdxxww.f81424ppxfxbqfkf) {
                try {
                    jztzpxfvev jztzpxfvevVar = dxjokdxxww.f81425wkgbmnqykc;
                    ArrayList arrayList = (ArrayList) jztzpxfvevVar.get(this.f81437iobyxmoadg);
                    if (arrayList == null) {
                        return;
                    }
                    jztzpxfvevVar.remove(this.f81437iobyxmoadg);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        ((u1.iobyxmoadg) arrayList.get(i13)).accept(eablkybsjgVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class zoijcleaow implements u1.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ r1.iobyxmoadg f81438iobyxmoadg;

        zoijcleaow(r1.iobyxmoadg iobyxmoadgVar) {
            this.f81438iobyxmoadg = iobyxmoadgVar;
        }

        @Override // u1.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void accept(eablkybsjg eablkybsjgVar) {
            if (eablkybsjgVar == null) {
                eablkybsjgVar = new eablkybsjg(-3);
            }
            this.f81438iobyxmoadg.zoijcleaow(eablkybsjgVar);
        }
    }

    static Typeface eablkybsjg(Context context, r1.eablkybsjg eablkybsjgVar, r1.iobyxmoadg iobyxmoadgVar, int i13, int i14) {
        String strIobyxmoadg = iobyxmoadg(istkbnxepw.iobyxmoadg(new Object[]{eablkybsjgVar}), i13);
        Typeface typeface = (Typeface) f81423iobyxmoadg.get(strIobyxmoadg);
        if (typeface != null) {
            iobyxmoadgVar.zoijcleaow(new eablkybsjg(typeface));
            return typeface;
        }
        if (i14 == -1) {
            eablkybsjg eablkybsjgVarPpxfxbqfkf = ppxfxbqfkf(strIobyxmoadg, context, istkbnxepw.iobyxmoadg(new Object[]{eablkybsjgVar}), i13);
            iobyxmoadgVar.zoijcleaow(eablkybsjgVarPpxfxbqfkf);
            return eablkybsjgVarPpxfxbqfkf.f81427iobyxmoadg;
        }
        try {
            eablkybsjg eablkybsjgVar2 = (eablkybsjg) draadjrbmk.wkgbmnqykc(f81426zoijcleaow, new iobyxmoadg(strIobyxmoadg, context, eablkybsjgVar, i13), i14);
            iobyxmoadgVar.zoijcleaow(eablkybsjgVar2);
            return eablkybsjgVar2.f81427iobyxmoadg;
        } catch (InterruptedException unused) {
            iobyxmoadgVar.zoijcleaow(new eablkybsjg(-3));
            return null;
        }
    }

    private static String iobyxmoadg(List list, int i13) {
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < list.size(); i14++) {
            sb3.append(((r1.eablkybsjg) list.get(i14)).wkgbmnqykc());
            sb3.append("-");
            sb3.append(i13);
            if (i14 < list.size() - 1) {
                sb3.append(";");
            }
        }
        return sb3.toString();
    }

    static eablkybsjg ppxfxbqfkf(String str, Context context, List list, int i13) {
        y5.iobyxmoadg.ppxfxbqfkf("getFontSync");
        try {
            pmvmpeiblj pmvmpeibljVar = f81423iobyxmoadg;
            Typeface typeface = (Typeface) pmvmpeibljVar.get(str);
            if (typeface != null) {
                eablkybsjg eablkybsjgVar = new eablkybsjg(typeface);
                y5.iobyxmoadg.gxszxtbevo();
                return eablkybsjgVar;
            }
            try {
                gtknphoqwx.iobyxmoadg iobyxmoadgVarEablkybsjg = r1.wkgbmnqykc.eablkybsjg(context, list, null);
                int iZoijcleaow = zoijcleaow(iobyxmoadgVarEablkybsjg);
                if (iZoijcleaow != 0) {
                    eablkybsjg eablkybsjgVar2 = new eablkybsjg(iZoijcleaow);
                    y5.iobyxmoadg.gxszxtbevo();
                    return eablkybsjgVar2;
                }
                Typeface typefaceZoijcleaow = (!iobyxmoadgVarEablkybsjg.gxszxtbevo() || Build.VERSION.SDK_INT < 29) ? j1.dxjokdxxww.zoijcleaow(context, null, iobyxmoadgVarEablkybsjg.ppxfxbqfkf(), i13) : j1.dxjokdxxww.ppxfxbqfkf(context, null, iobyxmoadgVarEablkybsjg.wkgbmnqykc(), i13);
                if (typefaceZoijcleaow == null) {
                    eablkybsjg eablkybsjgVar3 = new eablkybsjg(-3);
                    y5.iobyxmoadg.gxszxtbevo();
                    return eablkybsjgVar3;
                }
                pmvmpeibljVar.put(str, typefaceZoijcleaow);
                eablkybsjg eablkybsjgVar4 = new eablkybsjg(typefaceZoijcleaow);
                y5.iobyxmoadg.gxszxtbevo();
                return eablkybsjgVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                eablkybsjg eablkybsjgVar5 = new eablkybsjg(-1);
                y5.iobyxmoadg.gxszxtbevo();
                return eablkybsjgVar5;
            }
        } catch (Throwable th2) {
            y5.iobyxmoadg.gxszxtbevo();
            throw th2;
        }
    }

    static Typeface wkgbmnqykc(Context context, List list, int i13, Executor executor, r1.iobyxmoadg iobyxmoadgVar) {
        String strIobyxmoadg = iobyxmoadg(list, i13);
        Typeface typeface = (Typeface) f81423iobyxmoadg.get(strIobyxmoadg);
        if (typeface != null) {
            iobyxmoadgVar.zoijcleaow(new eablkybsjg(typeface));
            return typeface;
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadgVar);
        synchronized (f81424ppxfxbqfkf) {
            try {
                jztzpxfvev jztzpxfvevVar = f81425wkgbmnqykc;
                ArrayList arrayList = (ArrayList) jztzpxfvevVar.get(strIobyxmoadg);
                if (arrayList != null) {
                    arrayList.add(zoijcleaowVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(zoijcleaowVar);
                jztzpxfvevVar.put(strIobyxmoadg, arrayList2);
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(strIobyxmoadg, context, list, i13);
                if (executor == null) {
                    executor = f81426zoijcleaow;
                }
                draadjrbmk.ppxfxbqfkf(executor, ppxfxbqfkfVar, new wkgbmnqykc(strIobyxmoadg));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static int zoijcleaow(gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
        int i13 = 1;
        if (iobyxmoadgVar.eablkybsjg() != 0) {
            return iobyxmoadgVar.eablkybsjg() != 1 ? -3 : -2;
        }
        gtknphoqwx.zoijcleaow[] zoijcleaowVarArrPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        if (zoijcleaowVarArrPpxfxbqfkf != null && zoijcleaowVarArrPpxfxbqfkf.length != 0) {
            i13 = 0;
            for (gtknphoqwx.zoijcleaow zoijcleaowVar : zoijcleaowVarArrPpxfxbqfkf) {
                int iZoijcleaow = zoijcleaowVar.zoijcleaow();
                if (iZoijcleaow != 0) {
                    if (iZoijcleaow < 0) {
                        return -3;
                    }
                    return iZoijcleaow;
                }
            }
        }
        return i13;
    }

    static final class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Typeface f81427iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final int f81428zoijcleaow;

        eablkybsjg(int i13) {
            this.f81427iobyxmoadg = null;
            this.f81428zoijcleaow = i13;
        }

        boolean iobyxmoadg() {
            return this.f81428zoijcleaow == 0;
        }

        eablkybsjg(Typeface typeface) {
            this.f81427iobyxmoadg = typeface;
            this.f81428zoijcleaow = 0;
        }
    }
}
