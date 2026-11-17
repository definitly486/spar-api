package ru.myspar.services.push.google;

import android.content.SharedPreferences;
import com.google.firebase.messaging.RemoteMessage;
import dt.gxszxtbevo;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.services.push.google.PushMessagingService;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019R#\u0010!\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/myspar/services/push/google/PushMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "", "token", "Lgg/wwaezpbzkn;", "jyumaefscl", "(Ljava/lang/String;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "zdlpuopuiu", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "Ldt/gxszxtbevo;", "cdpycssgdh", "Ldt/gxszxtbevo;", "yadqdtsiqt", "()Ldt/gxszxtbevo;", "setPushManager", "(Ldt/gxszxtbevo;)V", "pushManager", "Lxr0/gxszxtbevo;", "Lxr0/gxszxtbevo;", "()Lxr0/gxszxtbevo;", "setProloyaltyPushManager", "(Lxr0/gxszxtbevo;)V", "proloyaltyPushManager", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "iozdgvuglv", "Lgg/gtknphoqwx;", "istkbnxepw", "()Landroid/content/SharedPreferences;", "preferences", "google_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PushMessagingService extends m42.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public gxszxtbevo pushManager;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx preferences = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: m42.zoijcleaow
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return PushMessagingService.iozdgvuglv(this.f65194zdlpuopuiu);
        }
    });

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public xr0.gxszxtbevo proloyaltyPushManager;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f103825iobyxmoadg;

        static {
            int[] iArr = new int[j40.iobyxmoadg.values().length];
            try {
                iArr[j40.iobyxmoadg.BITRIX_OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j40.iobyxmoadg.BITRIX_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103825iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences iozdgvuglv(PushMessagingService pushMessagingService) {
        return pushMessagingService.getSharedPreferences("network_preferences", 0);
    }

    private final SharedPreferences istkbnxepw() {
        return (SharedPreferences) this.preferences.getValue();
    }

    public final xr0.gxszxtbevo cdpycssgdh() {
        xr0.gxszxtbevo gxszxtbevoVar = this.proloyaltyPushManager;
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar;
        }
        zdlpuopuiu.pmvmpeiblj("proloyaltyPushManager");
        return null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void jyumaefscl(String token) {
        zdlpuopuiu.btonecajqb(token, "token");
        int i13 = iobyxmoadg.f103825iobyxmoadg[j40.iobyxmoadg.f50684yggfygwlhe.iobyxmoadg(istkbnxepw().getString("bitrix_version", null)).ordinal()];
        if (i13 == 1) {
            yadqdtsiqt().iobyxmoadg(token);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cdpycssgdh().iobyxmoadg(token);
        }
    }

    public final gxszxtbevo yadqdtsiqt() {
        gxszxtbevo gxszxtbevoVar = this.pushManager;
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar;
        }
        zdlpuopuiu.pmvmpeiblj("pushManager");
        return null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void zdlpuopuiu(RemoteMessage remoteMessage) {
        zdlpuopuiu.btonecajqb(remoteMessage, "remoteMessage");
        super.zdlpuopuiu(remoteMessage);
        int i13 = iobyxmoadg.f103825iobyxmoadg[j40.iobyxmoadg.f50684yggfygwlhe.iobyxmoadg(istkbnxepw().getString("bitrix_version", null)).ordinal()];
        if (i13 == 1) {
            gxszxtbevo gxszxtbevoVarYadqdtsiqt = yadqdtsiqt();
            RemoteMessage.zoijcleaow zoijcleaowVarLqeggnwhkg = remoteMessage.lqeggnwhkg();
            String strWkgbmnqykc = zoijcleaowVarLqeggnwhkg != null ? zoijcleaowVarLqeggnwhkg.wkgbmnqykc() : null;
            RemoteMessage.zoijcleaow zoijcleaowVarLqeggnwhkg2 = remoteMessage.lqeggnwhkg();
            gxszxtbevoVarYadqdtsiqt.zoijcleaow(strWkgbmnqykc, zoijcleaowVarLqeggnwhkg2 != null ? zoijcleaowVarLqeggnwhkg2.iobyxmoadg() : null, remoteMessage.getMessageId(), remoteMessage.getData());
            return;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        xr0.gxszxtbevo gxszxtbevoVarCdpycssgdh = cdpycssgdh();
        RemoteMessage.zoijcleaow zoijcleaowVarLqeggnwhkg3 = remoteMessage.lqeggnwhkg();
        String strWkgbmnqykc2 = zoijcleaowVarLqeggnwhkg3 != null ? zoijcleaowVarLqeggnwhkg3.wkgbmnqykc() : null;
        RemoteMessage.zoijcleaow zoijcleaowVarLqeggnwhkg4 = remoteMessage.lqeggnwhkg();
        String strIobyxmoadg = zoijcleaowVarLqeggnwhkg4 != null ? zoijcleaowVarLqeggnwhkg4.iobyxmoadg() : null;
        String messageId = remoteMessage.getMessageId();
        Map data = remoteMessage.getData();
        RemoteMessage.zoijcleaow zoijcleaowVarLqeggnwhkg5 = remoteMessage.lqeggnwhkg();
        gxszxtbevoVarCdpycssgdh.zoijcleaow(strWkgbmnqykc2, strIobyxmoadg, zoijcleaowVarLqeggnwhkg5 != null ? zoijcleaowVarLqeggnwhkg5.zoijcleaow() : null, messageId, data);
    }
}
