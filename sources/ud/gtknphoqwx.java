package ud;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f113365ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f113366iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wd.gxszxtbevo f113367zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iozdgvuglv f113368iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lg.btonecajqb f113369jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f113371zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(lg.btonecajqb btonecajqbVar, iozdgvuglv iozdgvuglvVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f113369jyumaefscl = btonecajqbVar;
            this.f113368iwizpuwonk = iozdgvuglvVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return gtknphoqwx.this.new iobyxmoadg(this.f113369jyumaefscl, this.f113368iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0075  */
        /* JADX WARN: Code duplicated, block: B:29:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f113371zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                if (gtknphoqwx.this.f113367zoijcleaow.wkgbmnqykc()) {
                    cdpycssgdh cdpycssgdhVar = new cdpycssgdh(this.f113369jyumaefscl);
                    cdpycssgdhVar.dxjokdxxww(this.f113368iwizpuwonk);
                    wwaezpbzkn.f113454zdlpuopuiu.iobyxmoadg(cdpycssgdhVar);
                    gtknphoqwx.this.f113366iobyxmoadg.nufgyqmvbu(new com.google.firebase.lqeggnwhkg() { // from class: ud.btonecajqb
                    });
                } else {
                    Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            vd.iobyxmoadg iobyxmoadgVar = vd.iobyxmoadg.f116509iobyxmoadg;
            this.f113371zdlpuopuiu = 1;
            obj = iobyxmoadgVar.ppxfxbqfkf(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            Collection collectionValues = ((Map) obj).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((vd.zoijcleaow) it.next()).iobyxmoadg()) {
                            wd.gxszxtbevo gxszxtbevoVar = gtknphoqwx.this.f113367zoijcleaow;
                            this.f113371zdlpuopuiu = 2;
                            if (gxszxtbevoVar.lqeggnwhkg(this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            if (gtknphoqwx.this.f113367zoijcleaow.wkgbmnqykc()) {
                                Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                            } else {
                                cdpycssgdh cdpycssgdhVar2 = new cdpycssgdh(this.f113369jyumaefscl);
                                cdpycssgdhVar2.dxjokdxxww(this.f113368iwizpuwonk);
                                wwaezpbzkn.f113454zdlpuopuiu.iobyxmoadg(cdpycssgdhVar2);
                                gtknphoqwx.this.f113366iobyxmoadg.nufgyqmvbu(new com.google.firebase.lqeggnwhkg() { // from class: ud.btonecajqb
                                });
                            }
                            return gg.wwaezpbzkn.f37140iobyxmoadg;
                        }
                    }
                }
            }
            Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public gtknphoqwx(com.google.firebase.gxszxtbevo firebaseApp, wd.gxszxtbevo settings, lg.btonecajqb backgroundDispatcher, iozdgvuglv lifecycleServiceBinder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(settings, "settings");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.f113366iobyxmoadg = firebaseApp;
        this.f113367zoijcleaow = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.gtknphoqwx().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(wwaezpbzkn.f113454zdlpuopuiu);
            pj.gtknphoqwx.wkgbmnqykc(dsvhmnatus.iobyxmoadg(backgroundDispatcher), null, null, new iobyxmoadg(backgroundDispatcher, lifecycleServiceBinder, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
