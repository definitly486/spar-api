package ic;

import ac.cdpycssgdh;
import ac.iozdgvuglv;
import ac.pkzmftpjix;
import ac.vipkmwdibw;
import ac.yadqdtsiqt;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg implements btonecajqb {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final AtomicReference f42363dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ic.iobyxmoadg f42364eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final draadjrbmk f42365gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f42366iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final yadqdtsiqt f42367lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final AtomicReference f42368nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final nufgyqmvbu f42369ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cdpycssgdh f42370wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f42371zoijcleaow;

    class iobyxmoadg implements SuccessContinuation {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ bc.gxszxtbevo f42372iobyxmoadg;

        iobyxmoadg(bc.gxszxtbevo gxszxtbevoVar) {
            this.f42372iobyxmoadg = gxszxtbevoVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ JSONObject zoijcleaow() {
            return lqeggnwhkg.this.f42365gxszxtbevo.iobyxmoadg(lqeggnwhkg.this.f42371zoijcleaow, true);
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public Task then(Void r13) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.f42372iobyxmoadg.f15697wkgbmnqykc.ppxfxbqfkf().submit(new Callable() { // from class: ic.gxszxtbevo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f42361iobyxmoadg.zoijcleaow();
                }
            }).get();
            if (jSONObject != null) {
                wkgbmnqykc wkgbmnqykcVarZoijcleaow = lqeggnwhkg.this.f42369ppxfxbqfkf.zoijcleaow(jSONObject);
                lqeggnwhkg.this.f42364eablkybsjg.ppxfxbqfkf(wkgbmnqykcVarZoijcleaow.f42383ppxfxbqfkf, jSONObject);
                lqeggnwhkg.this.vdvldrhtss(jSONObject, "Loaded settings: ");
                lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
                lqeggnwhkgVar.oxmwwwfdhm(lqeggnwhkgVar.f42371zoijcleaow.f42354gxszxtbevo);
                lqeggnwhkg.this.f42368nufgyqmvbu.set(wkgbmnqykcVarZoijcleaow);
                ((TaskCompletionSource) lqeggnwhkg.this.f42363dxjokdxxww.get()).trySetResult(wkgbmnqykcVarZoijcleaow);
            }
            return Tasks.forResult(null);
        }
    }

    lqeggnwhkg(Context context, gtknphoqwx gtknphoqwxVar, cdpycssgdh cdpycssgdhVar, nufgyqmvbu nufgyqmvbuVar, ic.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, yadqdtsiqt yadqdtsiqtVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.f42368nufgyqmvbu = atomicReference;
        this.f42363dxjokdxxww = new AtomicReference(new TaskCompletionSource());
        this.f42366iobyxmoadg = context;
        this.f42371zoijcleaow = gtknphoqwxVar;
        this.f42370wkgbmnqykc = cdpycssgdhVar;
        this.f42369ppxfxbqfkf = nufgyqmvbuVar;
        this.f42364eablkybsjg = iobyxmoadgVar;
        this.f42365gxszxtbevo = draadjrbmkVar;
        this.f42367lqeggnwhkg = yadqdtsiqtVar;
        atomicReference.set(zoijcleaow.zoijcleaow(cdpycssgdhVar));
    }

    private String agtfadlqog() {
        return ac.btonecajqb.vdvldrhtss(this.f42366iobyxmoadg).getString("existing_instance_identifier", "");
    }

    public static lqeggnwhkg draadjrbmk(Context context, String str, pkzmftpjix pkzmftpjixVar, fc.zoijcleaow zoijcleaowVar, String str2, String str3, gc.lqeggnwhkg lqeggnwhkgVar, yadqdtsiqt yadqdtsiqtVar) {
        String strLqeggnwhkg = pkzmftpjixVar.lqeggnwhkg();
        vipkmwdibw vipkmwdibwVar = new vipkmwdibw();
        return new lqeggnwhkg(context, new gtknphoqwx(str, pkzmftpjixVar.nufgyqmvbu(), pkzmftpjixVar.dxjokdxxww(), pkzmftpjixVar.btonecajqb(), pkzmftpjixVar, ac.btonecajqb.nufgyqmvbu(ac.btonecajqb.wflxmlrfwp(context), str, str3, str2), str3, str2, iozdgvuglv.wkgbmnqykc(strLqeggnwhkg).lqeggnwhkg()), vipkmwdibwVar, new nufgyqmvbu(vipkmwdibwVar), new ic.iobyxmoadg(lqeggnwhkgVar), new ppxfxbqfkf(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), zoijcleaowVar), yadqdtsiqtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean oxmwwwfdhm(String str) {
        SharedPreferences.Editor editorEdit = ac.btonecajqb.vdvldrhtss(this.f42366iobyxmoadg).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vdvldrhtss(JSONObject jSONObject, String str) {
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow(str + jSONObject.toString());
    }

    private wkgbmnqykc wflxmlrfwp(eablkybsjg eablkybsjgVar) throws Throwable {
        wkgbmnqykc wkgbmnqykcVar = null;
        try {
            if (!eablkybsjg.SKIP_CACHE_LOOKUP.equals(eablkybsjgVar)) {
                JSONObject jSONObjectZoijcleaow = this.f42364eablkybsjg.zoijcleaow();
                if (jSONObjectZoijcleaow != null) {
                    wkgbmnqykc wkgbmnqykcVarZoijcleaow = this.f42369ppxfxbqfkf.zoijcleaow(jSONObjectZoijcleaow);
                    if (wkgbmnqykcVarZoijcleaow != null) {
                        vdvldrhtss(jSONObjectZoijcleaow, "Loaded cached settings: ");
                        long jIobyxmoadg = this.f42370wkgbmnqykc.iobyxmoadg();
                        if (eablkybsjg.IGNORE_CACHE_EXPIRATION.equals(eablkybsjgVar) || !wkgbmnqykcVarZoijcleaow.iobyxmoadg(jIobyxmoadg)) {
                            try {
                                xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Returning cached settings.");
                                wkgbmnqykcVar = wkgbmnqykcVarZoijcleaow;
                            } catch (Exception e13) {
                                e = e13;
                                wkgbmnqykcVar = wkgbmnqykcVarZoijcleaow;
                                xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Failed to get cached settings", e);
                            }
                        } else {
                            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Cached settings have expired.");
                        }
                    } else {
                        xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Failed to parse cached settings data.", null);
                    }
                } else {
                    xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("No cached settings data found.");
                }
            }
        } catch (Exception e14) {
            e = e14;
        }
        return wkgbmnqykcVar;
    }

    boolean gtknphoqwx() {
        return !agtfadlqog().equals(this.f42371zoijcleaow.f42354gxszxtbevo);
    }

    @Override // ic.btonecajqb
    public Task iobyxmoadg() {
        return ((TaskCompletionSource) this.f42363dxjokdxxww.get()).getTask();
    }

    public Task ojitshcjhn(bc.gxszxtbevo gxszxtbevoVar) {
        return rgvfuqvkyq(eablkybsjg.USE_CACHE, gxszxtbevoVar);
    }

    public Task rgvfuqvkyq(eablkybsjg eablkybsjgVar, bc.gxszxtbevo gxszxtbevoVar) throws Throwable {
        wkgbmnqykc wkgbmnqykcVarWflxmlrfwp;
        if (!gtknphoqwx() && (wkgbmnqykcVarWflxmlrfwp = wflxmlrfwp(eablkybsjgVar)) != null) {
            this.f42368nufgyqmvbu.set(wkgbmnqykcVarWflxmlrfwp);
            ((TaskCompletionSource) this.f42363dxjokdxxww.get()).trySetResult(wkgbmnqykcVarWflxmlrfwp);
            return Tasks.forResult(null);
        }
        wkgbmnqykc wkgbmnqykcVarWflxmlrfwp2 = wflxmlrfwp(eablkybsjg.IGNORE_CACHE_EXPIRATION);
        if (wkgbmnqykcVarWflxmlrfwp2 != null) {
            this.f42368nufgyqmvbu.set(wkgbmnqykcVarWflxmlrfwp2);
            ((TaskCompletionSource) this.f42363dxjokdxxww.get()).trySetResult(wkgbmnqykcVarWflxmlrfwp2);
        }
        return this.f42367lqeggnwhkg.dxjokdxxww().onSuccessTask(gxszxtbevoVar.f15695iobyxmoadg, new iobyxmoadg(gxszxtbevoVar));
    }

    @Override // ic.btonecajqb
    public wkgbmnqykc zoijcleaow() {
        return (wkgbmnqykc) this.f42368nufgyqmvbu.get();
    }
}
