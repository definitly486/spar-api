package m42;

import com.google.firebase.messaging.FirebaseMessagingService;
import ru.myspar.services.push.google.PushMessagingService;
import xf.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg extends FirebaseMessagingService implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private volatile nufgyqmvbu f65192pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Object f65193zynmafqrjb = new Object();

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f65191istkbnxepw = false;

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: esjtqupxsv, reason: merged with bridge method [inline-methods] */
    public final nufgyqmvbu oxmwwwfdhm() {
        if (this.f65192pmvmpeiblj == null) {
            synchronized (this.f65193zynmafqrjb) {
                try {
                    if (this.f65192pmvmpeiblj == null) {
                        this.f65192pmvmpeiblj = lereixgezr();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f65192pmvmpeiblj;
    }

    protected nufgyqmvbu lereixgezr() {
        return new nufgyqmvbu(this);
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // android.app.Service
    public void onCreate() {
        pmvmpeiblj();
        super.onCreate();
    }

    protected void pmvmpeiblj() {
        if (this.f65191istkbnxepw) {
            return;
        }
        this.f65191istkbnxepw = true;
        ((ppxfxbqfkf) ojitshcjhn()).iobyxmoadg((PushMessagingService) zf.eablkybsjg.iobyxmoadg(this));
    }
}
