package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import wd.gxszxtbevo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0007\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/Messenger;", "iobyxmoadg", "(Landroid/content/Intent;)Landroid/os/Messenger;", "Lgg/wwaezpbzkn;", "onCreate", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "Landroid/os/HandlerThread;", "zdlpuopuiu", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "handlerThread", "Lcom/google/firebase/sessions/SessionLifecycleService$zoijcleaow;", "yggfygwlhe", "Lcom/google/firebase/sessions/SessionLifecycleService$zoijcleaow;", "messageHandler", "jyumaefscl", "Landroid/os/Messenger;", "messenger", "iwizpuwonk", "zoijcleaow", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionLifecycleService extends Service {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private Messenger messenger;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private zoijcleaow messageHandler;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final HandlerThread handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");

    public static final class zoijcleaow extends Handler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f24886iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ArrayList f24887ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f24888zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Looper looper) {
            super(looper);
            zdlpuopuiu.btonecajqb(looper, "looper");
            this.f24887ppxfxbqfkf = new ArrayList();
        }

        private final boolean eablkybsjg(long j13) {
            return j13 - this.f24888zoijcleaow > nj.iobyxmoadg.ojitshcjhn(gxszxtbevo.f119348ppxfxbqfkf.ppxfxbqfkf().ppxfxbqfkf());
        }

        private final void gxszxtbevo(Messenger messenger) {
            if (this.f24886iobyxmoadg) {
                nufgyqmvbu(messenger, ppxfxbqfkf.f24891gxszxtbevo.iobyxmoadg().ppxfxbqfkf().zoijcleaow());
                return;
            }
            String strIobyxmoadg = iobyxmoadg.f24889iobyxmoadg.iobyxmoadg().iobyxmoadg();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + strIobyxmoadg);
            if (strIobyxmoadg != null) {
                nufgyqmvbu(messenger, strIobyxmoadg);
            }
        }

        private final void iobyxmoadg() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Broadcasting new session: ");
            ppxfxbqfkf.zoijcleaow zoijcleaowVar = ppxfxbqfkf.f24891gxszxtbevo;
            sb3.append(zoijcleaowVar.iobyxmoadg().ppxfxbqfkf());
            Log.d("SessionLifecycleService", sb3.toString());
            com.google.firebase.sessions.zoijcleaow.f24898iobyxmoadg.iobyxmoadg().iobyxmoadg(zoijcleaowVar.iobyxmoadg().ppxfxbqfkf());
            for (Messenger it : new ArrayList(this.f24887ppxfxbqfkf)) {
                zdlpuopuiu.dxjokdxxww(it, "it");
                gxszxtbevo(it);
            }
        }

        private final void lqeggnwhkg() {
            ppxfxbqfkf.zoijcleaow zoijcleaowVar = ppxfxbqfkf.f24891gxszxtbevo;
            zoijcleaowVar.iobyxmoadg().iobyxmoadg();
            Log.d("SessionLifecycleService", "Generated new session " + zoijcleaowVar.iobyxmoadg().ppxfxbqfkf().zoijcleaow());
            iobyxmoadg();
            iobyxmoadg.f24889iobyxmoadg.iobyxmoadg().zoijcleaow(zoijcleaowVar.iobyxmoadg().ppxfxbqfkf().zoijcleaow());
        }

        private final void nufgyqmvbu(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f24887ppxfxbqfkf.remove(messenger);
            } catch (Exception e13) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e13);
            }
        }

        private final void ppxfxbqfkf(Message message) {
            this.f24887ppxfxbqfkf.add(message.replyTo);
            Messenger messenger = message.replyTo;
            zdlpuopuiu.dxjokdxxww(messenger, "msg.replyTo");
            gxszxtbevo(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f24887ppxfxbqfkf.size());
        }

        private final void wkgbmnqykc(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f24886iobyxmoadg) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f24886iobyxmoadg = true;
                lqeggnwhkg();
            } else if (eablkybsjg(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                lqeggnwhkg();
            }
            this.f24888zoijcleaow = message.getWhen();
        }

        private final void zoijcleaow(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f24888zoijcleaow = message.getWhen();
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            zdlpuopuiu.btonecajqb(msg, "msg");
            if (this.f24888zoijcleaow > msg.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.f24888zoijcleaow + '.');
                return;
            }
            int i13 = msg.what;
            if (i13 == 1) {
                wkgbmnqykc(msg);
                return;
            }
            if (i13 == 2) {
                zoijcleaow(msg);
                return;
            }
            if (i13 == 4) {
                ppxfxbqfkf(msg);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
            super.handleMessage(msg);
        }
    }

    private final Messenger iobyxmoadg(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messengerIobyxmoadg = iobyxmoadg(intent);
        if (messengerIobyxmoadg != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messengerIobyxmoadg;
            zoijcleaow zoijcleaowVar = this.messageHandler;
            if (zoijcleaowVar != null) {
                zoijcleaowVar.sendMessage(messageObtain);
            }
        }
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        zdlpuopuiu.dxjokdxxww(looper, "handlerThread.looper");
        this.messageHandler = new zoijcleaow(looper);
        this.messenger = new Messenger(this.messageHandler);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}
