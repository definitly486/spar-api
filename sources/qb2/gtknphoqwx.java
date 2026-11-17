package qb2;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import ru.rustore.sdk.core.exception.RuStoreException;

/* JADX INFO: loaded from: classes6.dex */
public final class gtknphoqwx implements ServiceConnection {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final tg.draadjrbmk f78427iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final tg.draadjrbmk f78428jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final String f78429yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final Context f78430zdlpuopuiu;

    public static final class iobyxmoadg extends btonecajqb {
        public iobyxmoadg() {
        }
    }

    public gtknphoqwx(Context context, String applicationId, cqumvgiudr onSuccess, esjtqupxsv onError) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(applicationId, "applicationId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onSuccess, "onSuccess");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onError, "onError");
        this.f78430zdlpuopuiu = context;
        this.f78429yggfygwlhe = applicationId;
        this.f78428jyumaefscl = onSuccess;
        this.f78427iwizpuwonk = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cdpycssgdh c1756iobyxmoadg;
        try {
            int i13 = cdpycssgdh.iobyxmoadg.f78416eablkybsjg;
            if (iBinder == null) {
                c1756iobyxmoadg = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.review.ReviewProvider");
                c1756iobyxmoadg = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof cdpycssgdh)) ? new cdpycssgdh.iobyxmoadg.C1756iobyxmoadg(iBinder) : (cdpycssgdh) iInterfaceQueryLocalInterface;
            }
            c1756iobyxmoadg.dxjokdxxww(this.f78429yggfygwlhe, new iobyxmoadg());
        } catch (Exception e13) {
            tg.draadjrbmk draadjrbmkVar = this.f78427iwizpuwonk;
            String message = e13.getMessage();
            if (message == null) {
                message = "";
            }
            draadjrbmkVar.invoke(new RuStoreException(message));
            lb2.zoijcleaow.zoijcleaow(this.f78430zdlpuopuiu, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f78427iwizpuwonk.invoke(new RuStoreException("onServiceDisconnected"));
        lb2.zoijcleaow.zoijcleaow(this.f78430zdlpuopuiu, this);
    }
}
