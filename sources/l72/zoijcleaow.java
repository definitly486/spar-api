package l72;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lk.cdpycssgdh;
import lk.lereixgezr;
import lk.yadqdtsiqt;
import lk.zynmafqrjb;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements l72.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f61808iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ns.iobyxmoadg f61809ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lereixgezr f61810zoijcleaow;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f61811iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f61812jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f61813yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f61814zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61812jyumaefscl = str;
            this.f61811iwizpuwonk = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f61812jyumaefscl, this.f61811iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) throws iobyxmoadg {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61813yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lk.eablkybsjg eablkybsjgVarIobyxmoadg = this.f61811iwizpuwonk.f61810zoijcleaow.iobyxmoadg(new zynmafqrjb.iobyxmoadg().kcexrzcfyt(this.f61812jyumaefscl).zoijcleaow());
                this.f61814zdlpuopuiu = eablkybsjgVarIobyxmoadg;
                this.f61813yggfygwlhe = 1;
                pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(this), 1);
                rgvfuqvkyqVar.lereixgezr();
                o40.iobyxmoadg iobyxmoadgVar = new o40.iobyxmoadg(eablkybsjgVarIobyxmoadg, rgvfuqvkyqVar);
                FirebasePerfOkHttpClient.enqueue(eablkybsjgVarIobyxmoadg, iobyxmoadgVar);
                rgvfuqvkyqVar.stevsuqkhv(iobyxmoadgVar);
                obj = rgvfuqvkyqVar.zdlpuopuiu();
                if (obj == mg.zoijcleaow.gxszxtbevo()) {
                    kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(this);
                }
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) obj;
            if (cdpycssgdhVar.iwxlajgraz()) {
                return cdpycssgdhVar;
            }
            throw new iobyxmoadg(cdpycssgdhVar.zdlpuopuiu(), cdpycssgdhVar.btonecajqb());
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61816zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new gxszxtbevo(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            File[] fileArrListFiles;
            mg.zoijcleaow.gxszxtbevo();
            if (this.f61816zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            File file = new File(zoijcleaow.this.f61808iobyxmoadg.getFilesDir(), "splash_screens");
            if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                ArrayList arrayList = new ArrayList();
                for (File file2 : fileArrListFiles) {
                    String path = file2.getPath();
                    if (!file2.isFile()) {
                        path = null;
                    }
                    if (path != null) {
                        arrayList.add(path);
                    }
                }
                return arrayList;
            }
            return jyumaefscl.wflxmlrfwp();
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static final class iobyxmoadg extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String message, int i13) {
            super("Failed to download Splash: code: " + i13 + ", message: " + message);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f61817yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61818zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61817yggfygwlhe = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new lqeggnwhkg(this.f61817yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f61818zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            File file = new File(this.f61817yggfygwlhe);
            if (file.exists()) {
                return file;
            }
            return null;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ cdpycssgdh f61819iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f61820jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61822zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(String str, cdpycssgdh cdpycssgdhVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61820jyumaefscl = str;
            this.f61819iwizpuwonk = cdpycssgdhVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new nufgyqmvbu(this.f61820jyumaefscl, this.f61819iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f61822zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            File file = new File(zoijcleaow.this.f61808iobyxmoadg.getFilesDir(), "splash_screens");
            if (!file.exists() && !file.mkdirs()) {
                throw new IllegalStateException("SplashProvider failed to create directory");
            }
            File file2 = new File(file, this.f61820jyumaefscl);
            if (file2.exists()) {
                file2.delete();
            }
            yadqdtsiqt yadqdtsiqtVarWkgbmnqykc = this.f61819iwizpuwonk.wkgbmnqykc();
            if (yadqdtsiqtVarWkgbmnqykc == null) {
                throw new IllegalArgumentException("SplashProvider splash response body is null");
            }
            InputStream inputStreamIobyxmoadg = yadqdtsiqtVarWkgbmnqykc.iobyxmoadg();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    rg.iobyxmoadg.zoijcleaow(inputStreamIobyxmoadg, fileOutputStream, 0, 2, null);
                    rg.zoijcleaow.iobyxmoadg(fileOutputStream, null);
                    rg.zoijcleaow.iobyxmoadg(inputStreamIobyxmoadg, null);
                    return file2;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        rg.zoijcleaow.iobyxmoadg(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    rg.zoijcleaow.iobyxmoadg(inputStreamIobyxmoadg, th4);
                    throw th5;
                }
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61824zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f61824zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            File file = new File(zoijcleaow.this.f61808iobyxmoadg.getFilesDir(), "splash_screens");
            if (file.exists()) {
                rg.gxszxtbevo.rgvfuqvkyq(file);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f61825yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61826zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61825yggfygwlhe = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f61825yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f61826zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(new File(this.f61825yggfygwlhe).delete());
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: l72.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1253zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f61827yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61828zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1253zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61827yggfygwlhe = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1253zoijcleaow(this.f61827yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f61828zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            File file = new File(this.f61827yggfygwlhe);
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(file.exists() && file.isFile());
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1253zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public zoijcleaow(Context context, lereixgezr client, ns.iobyxmoadg dispatchersProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(client, "client");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f61808iobyxmoadg = context;
        this.f61810zoijcleaow = client;
        this.f61809ppxfxbqfkf = dispatchersProvider;
    }

    @Override // l72.iobyxmoadg
    public Object eablkybsjg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(this.f61809ppxfxbqfkf.zoijcleaow(), new wkgbmnqykc(str, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // l72.iobyxmoadg
    public Object gxszxtbevo(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f61809ppxfxbqfkf.zoijcleaow(), new eablkybsjg(str, this, null), gxszxtbevoVar);
    }

    @Override // l72.iobyxmoadg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(this.f61809ppxfxbqfkf.zoijcleaow(), new ppxfxbqfkf(null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // l72.iobyxmoadg
    public Object lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f61809ppxfxbqfkf.zoijcleaow(), new gxszxtbevo(null), gxszxtbevoVar);
    }

    @Override // l72.iobyxmoadg
    public Object ppxfxbqfkf(cdpycssgdh cdpycssgdhVar, String str, lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f61809ppxfxbqfkf.zoijcleaow(), new nufgyqmvbu(str, cdpycssgdhVar, null), gxszxtbevoVar);
    }

    @Override // l72.iobyxmoadg
    public Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f61809ppxfxbqfkf.zoijcleaow(), new C1253zoijcleaow(str, null), gxszxtbevoVar);
    }

    @Override // l72.iobyxmoadg
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f61809ppxfxbqfkf.zoijcleaow(), new lqeggnwhkg(str, null), gxszxtbevoVar);
    }
}
