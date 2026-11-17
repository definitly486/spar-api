package rc;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import ub.pmvmpeiblj;
import ub.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo implements dxjokdxxww, btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Executor f82519eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tc.zoijcleaow f82520iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tc.zoijcleaow f82521ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Set f82522wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f82523zoijcleaow;

    private gxszxtbevo(final Context context, final String str, Set set, tc.zoijcleaow zoijcleaowVar, Executor executor) {
        this(new tc.zoijcleaow() { // from class: rc.ppxfxbqfkf
            @Override // tc.zoijcleaow
            public final Object get() {
                return gxszxtbevo.btonecajqb(context, str);
            }
        }, set, executor, zoijcleaowVar, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gtknphoqwx btonecajqb(Context context, String str) {
        return new gtknphoqwx(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String dxjokdxxww() {
        String string;
        synchronized (this) {
            try {
                gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f82520iobyxmoadg.get();
                List listPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf();
                gtknphoqwxVar.zoijcleaow();
                JSONArray jSONArray = new JSONArray();
                for (int i13 = 0; i13 < listPpxfxbqfkf.size(); i13++) {
                    draadjrbmk draadjrbmkVar = (draadjrbmk) listPpxfxbqfkf.get(i13);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", draadjrbmkVar.ppxfxbqfkf());
                    jSONObject.put("dates", new JSONArray((Collection) draadjrbmkVar.zoijcleaow()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th2) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void gtknphoqwx() {
        synchronized (this) {
            ((gtknphoqwx) this.f82520iobyxmoadg.get()).gtknphoqwx(System.currentTimeMillis(), ((od.dxjokdxxww) this.f82521ppxfxbqfkf.get()).getUserAgent());
        }
        return null;
    }

    public static ub.ppxfxbqfkf lqeggnwhkg() {
        final pmvmpeiblj pmvmpeibljVarIobyxmoadg = pmvmpeiblj.iobyxmoadg(tb.iobyxmoadg.class, Executor.class);
        return ub.ppxfxbqfkf.wkgbmnqykc(gxszxtbevo.class, dxjokdxxww.class, btonecajqb.class).zoijcleaow(vdvldrhtss.gtknphoqwx(Context.class)).zoijcleaow(vdvldrhtss.gtknphoqwx(com.google.firebase.gxszxtbevo.class)).zoijcleaow(vdvldrhtss.ojitshcjhn(lqeggnwhkg.class)).zoijcleaow(vdvldrhtss.wflxmlrfwp(od.dxjokdxxww.class)).zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVarIobyxmoadg)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: rc.zoijcleaow
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return gxszxtbevo.nufgyqmvbu(pmvmpeibljVarIobyxmoadg, wkgbmnqykcVar);
            }
        }).wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gxszxtbevo nufgyqmvbu(pmvmpeiblj pmvmpeibljVar, ub.wkgbmnqykc wkgbmnqykcVar) {
        return new gxszxtbevo((Context) wkgbmnqykcVar.iobyxmoadg(Context.class), ((com.google.firebase.gxszxtbevo) wkgbmnqykcVar.iobyxmoadg(com.google.firebase.gxszxtbevo.class)).ojitshcjhn(), wkgbmnqykcVar.wkgbmnqykc(lqeggnwhkg.class), wkgbmnqykcVar.gxszxtbevo(od.dxjokdxxww.class), (Executor) wkgbmnqykcVar.zoijcleaow(pmvmpeibljVar));
    }

    public Task draadjrbmk() {
        if (this.f82522wkgbmnqykc.size() > 0 && q1.draadjrbmk.iobyxmoadg(this.f82523zoijcleaow)) {
            return Tasks.call(this.f82519eablkybsjg, new Callable() { // from class: rc.eablkybsjg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f82517iobyxmoadg.gtknphoqwx();
                }
            });
        }
        return Tasks.forResult(null);
    }

    @Override // rc.dxjokdxxww
    public Task iobyxmoadg() {
        return !q1.draadjrbmk.iobyxmoadg(this.f82523zoijcleaow) ? Tasks.forResult("") : Tasks.call(this.f82519eablkybsjg, new Callable() { // from class: rc.wkgbmnqykc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f82528iobyxmoadg.dxjokdxxww();
            }
        });
    }

    @Override // rc.btonecajqb
    public synchronized btonecajqb.iobyxmoadg zoijcleaow(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f82520iobyxmoadg.get();
        if (!gtknphoqwxVar.dxjokdxxww(jCurrentTimeMillis)) {
            return btonecajqb.iobyxmoadg.NONE;
        }
        gtknphoqwxVar.lqeggnwhkg();
        return btonecajqb.iobyxmoadg.GLOBAL;
    }

    gxszxtbevo(tc.zoijcleaow zoijcleaowVar, Set set, Executor executor, tc.zoijcleaow zoijcleaowVar2, Context context) {
        this.f82520iobyxmoadg = zoijcleaowVar;
        this.f82522wkgbmnqykc = set;
        this.f82519eablkybsjg = executor;
        this.f82521ppxfxbqfkf = zoijcleaowVar2;
        this.f82523zoijcleaow = context;
    }
}
