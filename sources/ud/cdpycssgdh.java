package ud;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;

/* JADX INFO: loaded from: classes2.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final zoijcleaow f113311gxszxtbevo = new zoijcleaow(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wkgbmnqykc f113312eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lg.btonecajqb f113313iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f113314ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final LinkedBlockingDeque f113315wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Messenger f113316zoijcleaow;

    public static final class iobyxmoadg extends Handler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lg.btonecajqb f113317iobyxmoadg;

        /* JADX INFO: renamed from: ud.cdpycssgdh$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2808iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ String f113318yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f113319zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2808iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f113318yggfygwlhe = str;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C2808iobyxmoadg(this.f113318yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f113319zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    vd.iobyxmoadg iobyxmoadgVar = vd.iobyxmoadg.f116509iobyxmoadg;
                    this.f113319zdlpuopuiu = 1;
                    obj = iobyxmoadgVar.ppxfxbqfkf(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                Collection<vd.zoijcleaow> collectionValues = ((Map) obj).values();
                String str = this.f113318yggfygwlhe;
                for (vd.zoijcleaow zoijcleaowVar : collectionValues) {
                    zoijcleaowVar.ppxfxbqfkf(new vd.zoijcleaow.C2906zoijcleaow(str));
                    Log.d("SessionLifecycleClient", "Notified " + zoijcleaowVar.zoijcleaow() + " of new session " + str);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C2808iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(lg.btonecajqb backgroundDispatcher) {
            super(Looper.getMainLooper());
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backgroundDispatcher, "backgroundDispatcher");
            this.f113317iobyxmoadg = backgroundDispatcher;
        }

        private final void iobyxmoadg(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            pj.gtknphoqwx.wkgbmnqykc(dsvhmnatus.iobyxmoadg(this.f113317iobyxmoadg), null, null, new C2808iobyxmoadg(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String string;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                iobyxmoadg(string);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f113320jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f113322zdlpuopuiu;

        public static final class iobyxmoadg implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return kg.iobyxmoadg.wkgbmnqykc(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(List list, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f113320jyumaefscl = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return cdpycssgdh.this.new ppxfxbqfkf(this.f113320jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f113322zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vd.iobyxmoadg iobyxmoadgVar = vd.iobyxmoadg.f116509iobyxmoadg;
                this.f113322zdlpuopuiu = 1;
                obj = iobyxmoadgVar.ppxfxbqfkf(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection collectionValues = map.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                } else {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((vd.zoijcleaow) it.next()).iobyxmoadg()) {
                            List listD = hg.jyumaefscl.d(hg.jyumaefscl.zfvoamnweg(hg.jyumaefscl.kcexrzcfyt(cdpycssgdh.this.draadjrbmk(this.f113320jyumaefscl, 2), cdpycssgdh.this.draadjrbmk(this.f113320jyumaefscl, 1))), new iobyxmoadg());
                            cdpycssgdh cdpycssgdhVar = cdpycssgdh.this;
                            Iterator it2 = listD.iterator();
                            while (it2.hasNext()) {
                                cdpycssgdhVar.rgvfuqvkyq((Message) it2.next());
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc implements ServiceConnection {
        wkgbmnqykc() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + cdpycssgdh.this.f113315wkgbmnqykc.size());
            cdpycssgdh.this.f113316zoijcleaow = new Messenger(iBinder);
            cdpycssgdh.this.f113314ppxfxbqfkf = true;
            cdpycssgdh cdpycssgdhVar = cdpycssgdh.this;
            cdpycssgdhVar.ojitshcjhn(cdpycssgdhVar.btonecajqb());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            cdpycssgdh.this.f113316zoijcleaow = null;
            cdpycssgdh.this.f113314ppxfxbqfkf = false;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public cdpycssgdh(lg.btonecajqb backgroundDispatcher) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backgroundDispatcher, "backgroundDispatcher");
        this.f113313iobyxmoadg = backgroundDispatcher;
        this.f113315wkgbmnqykc = new LinkedBlockingDeque(20);
        this.f113312eablkybsjg = new wkgbmnqykc();
    }

    private final void agtfadlqog(int i13) {
        List listBtonecajqb = btonecajqb();
        Message messageObtain = Message.obtain(null, i13, 0, 0);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(messageObtain, "obtain(null, messageCode, 0, 0)");
        listBtonecajqb.add(messageObtain);
        ojitshcjhn(listBtonecajqb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List btonecajqb() {
        ArrayList arrayList = new ArrayList();
        this.f113315wkgbmnqykc.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message draadjrbmk(List list, int i13) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i13) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok ojitshcjhn(List list) {
        return pj.gtknphoqwx.wkgbmnqykc(dsvhmnatus.iobyxmoadg(this.f113313iobyxmoadg), null, null, new ppxfxbqfkf(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rgvfuqvkyq(Message message) {
        if (this.f113316zoijcleaow == null) {
            wflxmlrfwp(message);
            return;
        }
        try {
            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
            Messenger messenger = this.f113316zoijcleaow;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e13) {
            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e13);
            wflxmlrfwp(message);
        }
    }

    private final void wflxmlrfwp(Message message) {
        if (!this.f113315wkgbmnqykc.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.f113315wkgbmnqykc.size());
    }

    public final void dxjokdxxww(iozdgvuglv sessionLifecycleServiceBinder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.iobyxmoadg(new Messenger(new iobyxmoadg(this.f113313iobyxmoadg)), this.f113312eablkybsjg);
    }

    public final void gtknphoqwx() {
        agtfadlqog(1);
    }

    public final void nufgyqmvbu() {
        agtfadlqog(2);
    }
}
