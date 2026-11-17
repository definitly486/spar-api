package bz;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class czzsidtyhn extends metgxyhuhe implements e {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String[] f17398eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Set f17399gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Context f17400lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final t6.zdlpuopuiu f17401nufgyqmvbu;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final String f17397dxjokdxxww = t6.iwizpuwonk.iobyxmoadg(new byte[]{12, -92, -14, 97, 42, 62, -75, 46, -12, 119, -98, -59, -12, -15, 32, -67});

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final String f17396btonecajqb = t6.iwizpuwonk.iobyxmoadg(new byte[]{85, -121, 73, 68, 100, 116, -47, 17, 59, 36, 117, 9, 34, -35, 119, -6, -13, -22, -31, -105, -108, -35, -99, -83, -64, 98, 48, -83, 124, 86, 46, -108, 32, 0, 58, 45, -94, -118, -87, 2, -32, -100, 26, 7, 90, 29, 113, 106});

    class iobyxmoadg extends e.iobyxmoadg {
        iobyxmoadg(kc2.gxszxtbevo gxszxtbevoVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Cursor cursorQuery = czzsidtyhn.this.f17400lqeggnwhkg.getContentResolver().query(Uri.parse(czzsidtyhn.f17396btonecajqb), null, null, czzsidtyhn.this.f17398eablkybsjg, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        if (czzsidtyhn.f17397dxjokdxxww.equals(cursorQuery.getString(0))) {
                            czzsidtyhn.this.f17401nufgyqmvbu.ppxfxbqfkf(kc2.lqeggnwhkg.GoogleServicesDeviceId, cursorQuery.getString(1));
                            break;
                        }
                    } catch (Throwable th2) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                cursorQuery.close();
            } catch (Throwable unused) {
            }
        }
    }

    czzsidtyhn(Set set, Context context, t6.zdlpuopuiu zdlpuopuiuVar) {
        super(kc2.lqeggnwhkg.GoogleServicesParameters);
        this.f17398eablkybsjg = new String[]{f17397dxjokdxxww};
        this.f17399gxszxtbevo = set;
        this.f17400lqeggnwhkg = context;
        this.f17401nufgyqmvbu = zdlpuopuiuVar;
    }

    @Override // bz.e
    public e.iobyxmoadg agtfadlqog(kc2.gxszxtbevo gxszxtbevoVar) {
        return new iobyxmoadg(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        Set set = this.f17399gxszxtbevo;
        kc2.lqeggnwhkg lqeggnwhkgVar = kc2.lqeggnwhkg.GoogleServicesDeviceId;
        if (set.contains(lqeggnwhkgVar)) {
            iobyxmoadgVar.put(lqeggnwhkgVar.name(), this.f17401nufgyqmvbu.iobyxmoadg(lqeggnwhkgVar, TimeUnit.DAYS.toMillis(30L)));
        }
        return iobyxmoadgVar;
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17401nufgyqmvbu;
    }
}
