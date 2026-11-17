package ud;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg implements nufgyqmvbu {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f113403zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tc.zoijcleaow f113404iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public lqeggnwhkg(tc.zoijcleaow transportFactoryProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transportFactoryProvider, "transportFactoryProvider");
        this.f113404iobyxmoadg = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] ppxfxbqfkf(lereixgezr lereixgezrVar) {
        String strZoijcleaow = pmvmpeiblj.f113406iobyxmoadg.ppxfxbqfkf().zoijcleaow(lereixgezrVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + strZoijcleaow);
        byte[] bytes = strZoijcleaow.getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // ud.nufgyqmvbu
    public void iobyxmoadg(lereixgezr sessionEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionEvent, "sessionEvent");
        ((o9.btonecajqb) this.f113404iobyxmoadg.get()).iobyxmoadg("FIREBASE_APPQUALITY_SESSION", lereixgezr.class, o9.ppxfxbqfkf.zoijcleaow("json"), new o9.nufgyqmvbu() { // from class: ud.gxszxtbevo
            @Override // o9.nufgyqmvbu
            public final Object apply(Object obj) {
                return this.f113372iobyxmoadg.ppxfxbqfkf((lereixgezr) obj);
            }
        }).zoijcleaow(o9.wkgbmnqykc.gxszxtbevo(sessionEvent));
    }
}
