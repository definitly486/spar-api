package wd;

import ah.gtknphoqwx;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.lmojexxdyd;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.btonecajqb;
import tg.draadjrbmk;
import ud.iwizpuwonk;
import ud.pmvmpeiblj;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f119348ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final wg.wkgbmnqykc f119349wkgbmnqykc = f2.iobyxmoadg.zoijcleaow(iwizpuwonk.f113386iobyxmoadg.zoijcleaow(), new e2.zoijcleaow(iobyxmoadg.f119352zdlpuopuiu), null, null, 12, null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f119350iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f119351zoijcleaow;

    static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f119352zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final g2.wkgbmnqykc invoke(CorruptionException ex2) {
            zdlpuopuiu.btonecajqb(ex2, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + ud.jyumaefscl.f113390iobyxmoadg.eablkybsjg() + '.', ex2);
            return g2.eablkybsjg.iobyxmoadg();
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f119353iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f119355yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f119356zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f119355yggfygwlhe = obj;
            this.f119353iwizpuwonk |= Integer.MIN_VALUE;
            return gxszxtbevo.this.lqeggnwhkg(this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ gtknphoqwx[] f119357iobyxmoadg = {cllcsxoeiz.nufgyqmvbu(new lmojexxdyd(zoijcleaow.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d2.eablkybsjg zoijcleaow(Context context) {
            return (d2.eablkybsjg) gxszxtbevo.f119349wkgbmnqykc.iobyxmoadg(context, f119357iobyxmoadg[0]);
        }

        public final gxszxtbevo ppxfxbqfkf() {
            Object objBtonecajqb = com.google.firebase.draadjrbmk.iobyxmoadg(com.google.firebase.ppxfxbqfkf.f24690iobyxmoadg).btonecajqb(gxszxtbevo.class);
            zdlpuopuiu.dxjokdxxww(objBtonecajqb, "Firebase.app[SessionsSettings::class.java]");
            return (gxszxtbevo) objBtonecajqb;
        }

        private zoijcleaow() {
        }
    }

    public gxszxtbevo(nufgyqmvbu localOverrideSettings, nufgyqmvbu remoteSettings) {
        zdlpuopuiu.btonecajqb(localOverrideSettings, "localOverrideSettings");
        zdlpuopuiu.btonecajqb(remoteSettings, "remoteSettings");
        this.f119350iobyxmoadg = localOverrideSettings;
        this.f119351zoijcleaow = remoteSettings;
    }

    private final boolean eablkybsjg(double d13) {
        return 0.0d <= d13 && d13 <= 1.0d;
    }

    private final boolean gxszxtbevo(long j13) {
        return nj.iobyxmoadg.yadqdtsiqt(j13) && nj.iobyxmoadg.lereixgezr(j13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f119353iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f119353iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f119355yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f119353iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                gxszxtbevoVar2 = (gxszxtbevo) ppxfxbqfkfVar.f119356zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        nufgyqmvbu nufgyqmvbuVar = this.f119350iobyxmoadg;
        ppxfxbqfkfVar.f119356zdlpuopuiu = this;
        ppxfxbqfkfVar.f119353iwizpuwonk = 1;
        if (nufgyqmvbuVar.wkgbmnqykc(ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gxszxtbevoVar2 = this;
        nufgyqmvbu nufgyqmvbuVar2 = gxszxtbevoVar2.f119351zoijcleaow;
        ppxfxbqfkfVar.f119356zdlpuopuiu = null;
        ppxfxbqfkfVar.f119353iwizpuwonk = 2;
        if (nufgyqmvbuVar2.wkgbmnqykc(ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final long ppxfxbqfkf() {
        nj.iobyxmoadg iobyxmoadgVarZoijcleaow = this.f119350iobyxmoadg.zoijcleaow();
        if (iobyxmoadgVarZoijcleaow != null) {
            long jHcddaimhww = iobyxmoadgVarZoijcleaow.hcddaimhww();
            if (gxszxtbevo(jHcddaimhww)) {
                return jHcddaimhww;
            }
        }
        nj.iobyxmoadg iobyxmoadgVarZoijcleaow2 = this.f119351zoijcleaow.zoijcleaow();
        if (iobyxmoadgVarZoijcleaow2 != null) {
            long jHcddaimhww2 = iobyxmoadgVarZoijcleaow2.hcddaimhww();
            if (gxszxtbevo(jHcddaimhww2)) {
                return jHcddaimhww2;
            }
        }
        nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
        return nj.ppxfxbqfkf.kcexrzcfyt(30, nj.wkgbmnqykc.MINUTES);
    }

    public final boolean wkgbmnqykc() {
        Boolean boolIobyxmoadg = this.f119350iobyxmoadg.iobyxmoadg();
        if (boolIobyxmoadg != null) {
            return boolIobyxmoadg.booleanValue();
        }
        Boolean boolIobyxmoadg2 = this.f119351zoijcleaow.iobyxmoadg();
        if (boolIobyxmoadg2 != null) {
            return boolIobyxmoadg2.booleanValue();
        }
        return true;
    }

    public final double zoijcleaow() {
        Double dPpxfxbqfkf = this.f119350iobyxmoadg.ppxfxbqfkf();
        if (dPpxfxbqfkf != null) {
            double dDoubleValue = dPpxfxbqfkf.doubleValue();
            if (eablkybsjg(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dPpxfxbqfkf2 = this.f119351zoijcleaow.ppxfxbqfkf();
        if (dPpxfxbqfkf2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dPpxfxbqfkf2.doubleValue();
        if (eablkybsjg(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    private gxszxtbevo(Context context, btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2, uc.eablkybsjg eablkybsjgVar, ud.zoijcleaow zoijcleaowVar) {
        this(new wd.zoijcleaow(context), new wd.ppxfxbqfkf(btonecajqbVar2, eablkybsjgVar, zoijcleaowVar, new wkgbmnqykc(zoijcleaowVar, btonecajqbVar, null, 4, null), f119348ppxfxbqfkf.zoijcleaow(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gxszxtbevo(com.google.firebase.gxszxtbevo firebaseApp, btonecajqb blockingDispatcher, btonecajqb backgroundDispatcher, uc.eablkybsjg firebaseInstallationsApi) {
        zdlpuopuiu.btonecajqb(firebaseApp, "firebaseApp");
        zdlpuopuiu.btonecajqb(blockingDispatcher, "blockingDispatcher");
        zdlpuopuiu.btonecajqb(backgroundDispatcher, "backgroundDispatcher");
        zdlpuopuiu.btonecajqb(firebaseInstallationsApi, "firebaseInstallationsApi");
        Context contextGtknphoqwx = firebaseApp.gtknphoqwx();
        zdlpuopuiu.dxjokdxxww(contextGtknphoqwx, "firebaseApp.applicationContext");
        this(contextGtknphoqwx, blockingDispatcher, backgroundDispatcher, firebaseInstallationsApi, pmvmpeiblj.f113406iobyxmoadg.zoijcleaow(firebaseApp));
    }
}
