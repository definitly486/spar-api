package qb2;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.review.model.ReviewInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements ServiceConnection {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final tg.draadjrbmk f78432cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final tg.iobyxmoadg f78433iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final String f78434jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final ReviewInfo f78435yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final Context f78436zdlpuopuiu;

    public static final class iobyxmoadg extends lqeggnwhkg {
        public iobyxmoadg() {
        }
    }

    public gxszxtbevo(Context context, ReviewInfo reviewInfo, String applicationId, zdlpuopuiu onSuccess, yggfygwlhe onError) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reviewInfo, "reviewInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(applicationId, "applicationId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onSuccess, "onSuccess");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onError, "onError");
        this.f78436zdlpuopuiu = context;
        this.f78435yggfygwlhe = reviewInfo;
        this.f78434jyumaefscl = applicationId;
        this.f78433iwizpuwonk = onSuccess;
        this.f78432cqumvgiudr = onError;
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
            c1756iobyxmoadg.gxszxtbevo(this.f78435yggfygwlhe.toBundle$sdk_public_review_release(), this.f78434jyumaefscl, new iobyxmoadg());
        } catch (Exception e13) {
            tg.draadjrbmk draadjrbmkVar = this.f78432cqumvgiudr;
            String message = e13.getMessage();
            if (message == null) {
                message = "";
            }
            draadjrbmkVar.invoke(new RuStoreException(message));
            lb2.zoijcleaow.zoijcleaow(this.f78436zdlpuopuiu, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f78432cqumvgiudr.invoke(new RuStoreException("onServiceDisconnected"));
        lb2.zoijcleaow.zoijcleaow(this.f78436zdlpuopuiu, this);
    }
}
