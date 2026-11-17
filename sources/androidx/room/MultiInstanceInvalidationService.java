package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import gg.wwaezpbzkn;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "zdlpuopuiu", "I", "ppxfxbqfkf", "()I", "wkgbmnqykc", "(I)V", "maxClientId", "", "", "yggfygwlhe", "Ljava/util/Map;", "zoijcleaow", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/zoijcleaow;", "jyumaefscl", "Landroid/os/RemoteCallbackList;", "iobyxmoadg", "()Landroid/os/RemoteCallbackList;", "callbackList", "Landroidx/room/ppxfxbqfkf$iobyxmoadg;", "iwizpuwonk", "Landroidx/room/ppxfxbqfkf$iobyxmoadg;", "binder", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private int maxClientId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final Map clientNames = new LinkedHashMap();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final RemoteCallbackList callbackList = new zoijcleaow();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final ppxfxbqfkf.iobyxmoadg binder = new iobyxmoadg();

    public static final class iobyxmoadg extends ppxfxbqfkf.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // androidx.room.ppxfxbqfkf
        public int btonecajqb(androidx.room.zoijcleaow callback, String str) {
            zdlpuopuiu.btonecajqb(callback, "callback");
            int i13 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList callbackList = MultiInstanceInvalidationService.this.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList) {
                try {
                    multiInstanceInvalidationService.wkgbmnqykc(multiInstanceInvalidationService.getMaxClientId() + 1);
                    int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                    if (multiInstanceInvalidationService.getCallbackList().register(callback, Integer.valueOf(maxClientId))) {
                        multiInstanceInvalidationService.getClientNames().put(Integer.valueOf(maxClientId), str);
                        i13 = maxClientId;
                    } else {
                        multiInstanceInvalidationService.wkgbmnqykc(multiInstanceInvalidationService.getMaxClientId() - 1);
                        multiInstanceInvalidationService.getMaxClientId();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i13;
        }

        @Override // androidx.room.ppxfxbqfkf
        public void draadjrbmk(androidx.room.zoijcleaow callback, int i13) {
            zdlpuopuiu.btonecajqb(callback, "callback");
            RemoteCallbackList callbackList = MultiInstanceInvalidationService.this.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList) {
                multiInstanceInvalidationService.getCallbackList().unregister(callback);
            }
        }

        @Override // androidx.room.ppxfxbqfkf
        public void lqeggnwhkg(int i13, String[] tables) {
            zdlpuopuiu.btonecajqb(tables, "tables");
            RemoteCallbackList callbackList = MultiInstanceInvalidationService.this.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList) {
                String str = (String) multiInstanceInvalidationService.getClientNames().get(Integer.valueOf(i13));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.getCallbackList().beginBroadcast();
                for (int i14 = 0; i14 < iBeginBroadcast; i14++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.getCallbackList().getBroadcastCookie(i14);
                        zdlpuopuiu.nufgyqmvbu(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.getClientNames().get(num);
                        if (i13 != iIntValue && zdlpuopuiu.eablkybsjg(str, str2)) {
                            try {
                                ((androidx.room.zoijcleaow) multiInstanceInvalidationService.getCallbackList().getBroadcastItem(i14)).zoijcleaow(tables);
                            } catch (RemoteException e13) {
                                Log.w("ROOM", "Error invoking a remote callback", e13);
                            }
                        }
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.getCallbackList().finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.getCallbackList().finishBroadcast();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
        }
    }

    public static final class zoijcleaow extends RemoteCallbackList {
        zoijcleaow() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.zoijcleaow callback, Object cookie) {
            zdlpuopuiu.btonecajqb(callback, "callback");
            zdlpuopuiu.btonecajqb(cookie, "cookie");
            MultiInstanceInvalidationService.this.getClientNames().remove((Integer) cookie);
        }
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final RemoteCallbackList getCallbackList() {
        return this.callbackList;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        return this.binder;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    public final void wkgbmnqykc(int i13) {
        this.maxClientId = i13;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final Map getClientNames() {
        return this.clientNames;
    }
}
