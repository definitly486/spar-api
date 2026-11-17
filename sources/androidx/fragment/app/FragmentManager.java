package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private static boolean f9072ntlheqmsrt = false;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    static boolean f9073ulzqkzuiru = true;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f9077cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private iwizpuwonk f9078cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private ArrayList f9080dsvhmnatus;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private ArrayList f9082eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private androidx.fragment.app.zdlpuopuiu f9083esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f9086hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f9087hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private eablkybsjg.zoijcleaow f9089iozdgvuglv;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f9092jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private lmojexxdyd f9095kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Fragment f9096lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private eablkybsjg.zoijcleaow f9097lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private androidx.activity.iwizpuwonk f9098lqeggnwhkg;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f9103pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    Fragment f9104pmvmpeiblj;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private ArrayList f9107stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private l2.zoijcleaow.ppxfxbqfkf f9108tzroggbefp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private eablkybsjg.zoijcleaow f9112wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private ArrayList f9113wypolnanlu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f9118zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayList f9088iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hcddaimhww f9105ppxfxbqfkf = new hcddaimhww();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    ArrayList f9111wkgbmnqykc = new ArrayList();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final cqumvgiudr f9085gxszxtbevo = new cqumvgiudr(this);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    androidx.fragment.app.iobyxmoadg f9100nufgyqmvbu = null;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    boolean f9081dxjokdxxww = false;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final androidx.activity.jyumaefscl f9075btonecajqb = new zoijcleaow(false);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final AtomicInteger f9084gtknphoqwx = new AtomicInteger();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final Map f9079draadjrbmk = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final Map f9110wflxmlrfwp = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final Map f9074agtfadlqog = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    ArrayList f9101ojitshcjhn = new ArrayList();

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final esjtqupxsv f9106rgvfuqvkyq = new esjtqupxsv(this);

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final CopyOnWriteArrayList f9109vdvldrhtss = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final u1.iobyxmoadg f9102oxmwwwfdhm = new u1.iobyxmoadg() { // from class: androidx.fragment.app.lereixgezr
        @Override // u1.iobyxmoadg
        public final void accept(Object obj) {
            this.f9281iobyxmoadg.g((Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final u1.iobyxmoadg f9094kcexrzcfyt = new u1.iobyxmoadg() { // from class: androidx.fragment.app.pmvmpeiblj
        @Override // u1.iobyxmoadg
        public final void accept(Object obj) {
            this.f9342iobyxmoadg.h((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final u1.iobyxmoadg f9117zdlpuopuiu = new u1.iobyxmoadg() { // from class: androidx.fragment.app.zynmafqrjb
        @Override // u1.iobyxmoadg
        public final void accept(Object obj) {
            this.f9418iobyxmoadg.i((androidx.core.app.btonecajqb) obj);
        }
    };

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final u1.iobyxmoadg f9115yggfygwlhe = new u1.iobyxmoadg() { // from class: androidx.fragment.app.istkbnxepw
        @Override // u1.iobyxmoadg
        public final void accept(Object obj) {
            this.f9237iobyxmoadg.j((androidx.core.app.kcexrzcfyt) obj);
        }
    };

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final v1.istkbnxepw f9093jyumaefscl = new ppxfxbqfkf();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    int f9091iwizpuwonk = -1;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private jyumaefscl f9119zynmafqrjb = null;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private jyumaefscl f9090istkbnxepw = new wkgbmnqykc();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private ulzqkzuiru f9076cdpycssgdh = null;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private ulzqkzuiru f9114yadqdtsiqt = new eablkybsjg();

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    ArrayDeque f9116ylkuphrtab = new ArrayDeque();

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private Runnable f9099mbcevpiqjq = new gxszxtbevo();

    private static class agtfadlqog implements ylkuphrtab {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final androidx.lifecycle.gtknphoqwx f9122iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final androidx.lifecycle.agtfadlqog f9123ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ylkuphrtab f9124zoijcleaow;

        agtfadlqog(androidx.lifecycle.gtknphoqwx gtknphoqwxVar, ylkuphrtab ylkuphrtabVar, androidx.lifecycle.agtfadlqog agtfadlqogVar) {
            this.f9122iobyxmoadg = gtknphoqwxVar;
            this.f9124zoijcleaow = ylkuphrtabVar;
            this.f9123ppxfxbqfkf = agtfadlqogVar;
        }

        @Override // androidx.fragment.app.ylkuphrtab
        public void iobyxmoadg(String str, Bundle bundle) {
            this.f9124zoijcleaow.iobyxmoadg(str, bundle);
        }

        public void ppxfxbqfkf() {
            this.f9122iobyxmoadg.wkgbmnqykc(this.f9123ppxfxbqfkf);
        }

        public boolean zoijcleaow(androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar) {
            return this.f9122iobyxmoadg.zoijcleaow().wkgbmnqykc(zoijcleaowVar);
        }
    }

    class btonecajqb implements eablkybsjg.iobyxmoadg {
        btonecajqb() {
        }

        @Override // eablkybsjg.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f9116ylkuphrtab.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfo.f9121zdlpuopuiu;
            int i13 = launchedFragmentInfo.f9120yggfygwlhe;
            Fragment fragmentDxjokdxxww = FragmentManager.this.f9105ppxfxbqfkf.dxjokdxxww(str);
            if (fragmentDxjokdxxww != null) {
                fragmentDxjokdxxww.onActivityResult(i13, activityResult.ppxfxbqfkf(), activityResult.zoijcleaow());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class draadjrbmk extends gxszxtbevo.iobyxmoadg {
        draadjrbmk() {
        }

        @Override // gxszxtbevo.iobyxmoadg
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public ActivityResult ppxfxbqfkf(int i13, Intent intent) {
            return new ActivityResult(i13, intent);
        }

        @Override // gxszxtbevo.iobyxmoadg
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public Intent iobyxmoadg(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.iobyxmoadg(intentSenderRequest.getIntentSender()).zoijcleaow(null).ppxfxbqfkf(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).iobyxmoadg();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }
    }

    class dxjokdxxww implements eablkybsjg.iobyxmoadg {
        dxjokdxxww() {
        }

        @Override // eablkybsjg.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f9116ylkuphrtab.pollLast();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfo.f9121zdlpuopuiu;
            int i13 = launchedFragmentInfo.f9120yggfygwlhe;
            Fragment fragmentDxjokdxxww = FragmentManager.this.f9105ppxfxbqfkf.dxjokdxxww(str);
            if (fragmentDxjokdxxww != null) {
                fragmentDxjokdxxww.onActivityResult(i13, activityResult.ppxfxbqfkf(), activityResult.zoijcleaow());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class eablkybsjg implements ulzqkzuiru {
        eablkybsjg() {
        }

        @Override // androidx.fragment.app.ulzqkzuiru
        public ntlheqmsrt iobyxmoadg(ViewGroup viewGroup) {
            return new androidx.fragment.app.wkgbmnqykc(viewGroup);
        }
    }

    public interface gtknphoqwx {
        int getId();

        String getName();
    }

    class gxszxtbevo implements Runnable {
        gxszxtbevo() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.metgxyhuhe(true);
        }
    }

    class iobyxmoadg implements eablkybsjg.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // eablkybsjg.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                iArr[i13] = ((Boolean) arrayList.get(i13)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f9116ylkuphrtab.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfo.f9121zdlpuopuiu;
            int i14 = launchedFragmentInfo.f9120yggfygwlhe;
            Fragment fragmentDxjokdxxww = FragmentManager.this.f9105ppxfxbqfkf.dxjokdxxww(str);
            if (fragmentDxjokdxxww != null) {
                fragmentDxjokdxxww.onRequestPermissionsResult(i14, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    private class kcexrzcfyt implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f9130iobyxmoadg;

        kcexrzcfyt(String str) {
            this.f9130iobyxmoadg = str;
        }

        @Override // androidx.fragment.app.FragmentManager.rgvfuqvkyq
        public boolean iobyxmoadg(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.H(arrayList, arrayList2, this.f9130iobyxmoadg);
        }
    }

    class lqeggnwhkg implements androidx.lifecycle.agtfadlqog {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx f9133jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ylkuphrtab f9134yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ String f9135zdlpuopuiu;

        lqeggnwhkg(String str, ylkuphrtab ylkuphrtabVar, androidx.lifecycle.gtknphoqwx gtknphoqwxVar) {
            this.f9135zdlpuopuiu = str;
            this.f9134yggfygwlhe = ylkuphrtabVar;
            this.f9133jyumaefscl = gtknphoqwxVar;
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
            Bundle bundle;
            if (iobyxmoadgVar == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_START && (bundle = (Bundle) FragmentManager.this.f9110wflxmlrfwp.get(this.f9135zdlpuopuiu)) != null) {
                this.f9134yggfygwlhe.iobyxmoadg(this.f9135zdlpuopuiu, bundle);
                FragmentManager.this.esjtqupxsv(this.f9135zdlpuopuiu);
            }
            if (iobyxmoadgVar == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY) {
                this.f9133jyumaefscl.wkgbmnqykc(this);
                FragmentManager.this.f9074agtfadlqog.remove(this.f9135zdlpuopuiu);
            }
        }
    }

    class nufgyqmvbu implements wwaezpbzkn {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f9137zdlpuopuiu;

        nufgyqmvbu(Fragment fragment) {
            this.f9137zdlpuopuiu = fragment;
        }

        @Override // androidx.fragment.app.wwaezpbzkn
        public void iobyxmoadg(FragmentManager fragmentManager, Fragment fragment) {
            this.f9137zdlpuopuiu.onAttachFragment(fragment);
        }
    }

    public interface ojitshcjhn {
        void eablkybsjg();

        default void iobyxmoadg(androidx.activity.zoijcleaow zoijcleaowVar) {
        }

        default void ppxfxbqfkf(Fragment fragment, boolean z13) {
        }

        default void wkgbmnqykc() {
        }

        default void zoijcleaow(Fragment fragment, boolean z13) {
        }
    }

    class oxmwwwfdhm implements rgvfuqvkyq {
        oxmwwwfdhm() {
        }

        @Override // androidx.fragment.app.FragmentManager.rgvfuqvkyq
        public boolean iobyxmoadg(ArrayList arrayList, ArrayList arrayList2) {
            boolean z13 = FragmentManager.this.z(arrayList, arrayList2);
            if (!FragmentManager.this.f9101ojitshcjhn.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.lrnfpwlwnk((androidx.fragment.app.iobyxmoadg) it.next()));
                }
                for (ojitshcjhn ojitshcjhnVar : FragmentManager.this.f9101ojitshcjhn) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        ojitshcjhnVar.ppxfxbqfkf((Fragment) it2.next(), zBooleanValue);
                    }
                }
            }
            return z13;
        }
    }

    class ppxfxbqfkf implements v1.istkbnxepw {
        ppxfxbqfkf() {
        }

        @Override // v1.istkbnxepw
        public void iobyxmoadg(Menu menu) {
            FragmentManager.this.stevsuqkhv(menu);
        }

        @Override // v1.istkbnxepw
        public boolean ppxfxbqfkf(MenuItem menuItem) {
            return FragmentManager.this.wypolnanlu(menuItem);
        }

        @Override // v1.istkbnxepw
        public void wkgbmnqykc(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.ylkuphrtab(menu, menuInflater);
        }

        @Override // v1.istkbnxepw
        public void zoijcleaow(Menu menu) {
            FragmentManager.this.ntlheqmsrt(menu);
        }
    }

    interface rgvfuqvkyq {
        boolean iobyxmoadg(ArrayList arrayList, ArrayList arrayList2);
    }

    private class vdvldrhtss implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final String f9140iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final int f9141ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final int f9143zoijcleaow;

        vdvldrhtss(String str, int i13, int i14) {
            this.f9140iobyxmoadg = str;
            this.f9143zoijcleaow = i13;
            this.f9141ppxfxbqfkf = i14;
        }

        @Override // androidx.fragment.app.FragmentManager.rgvfuqvkyq
        public boolean iobyxmoadg(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f9104pmvmpeiblj;
            if (fragment == null || this.f9143zoijcleaow >= 0 || this.f9140iobyxmoadg != null || !fragment.getChildFragmentManager().v()) {
                return FragmentManager.this.y(arrayList, arrayList2, this.f9140iobyxmoadg, this.f9143zoijcleaow, this.f9141ppxfxbqfkf);
            }
            return false;
        }
    }

    public static abstract class wflxmlrfwp {
        public void agtfadlqog(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void btonecajqb(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void draadjrbmk(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void dxjokdxxww(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void eablkybsjg(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void gtknphoqwx(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void gxszxtbevo(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void iobyxmoadg(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void lqeggnwhkg(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void nufgyqmvbu(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void ppxfxbqfkf(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void wflxmlrfwp(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void wkgbmnqykc(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void zoijcleaow(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }
    }

    class wkgbmnqykc extends jyumaefscl {
        wkgbmnqykc() {
        }

        @Override // androidx.fragment.app.jyumaefscl
        public Fragment iobyxmoadg(ClassLoader classLoader, String str) {
            return FragmentManager.this.lxfrhoxuzk().zoijcleaow(FragmentManager.this.lxfrhoxuzk().gxszxtbevo(), str, null);
        }
    }

    private class zdlpuopuiu implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f9145iobyxmoadg;

        zdlpuopuiu(String str) {
            this.f9145iobyxmoadg = str;
        }

        @Override // androidx.fragment.app.FragmentManager.rgvfuqvkyq
        public boolean iobyxmoadg(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.M(arrayList, arrayList2, this.f9145iobyxmoadg);
        }
    }

    class zoijcleaow extends androidx.activity.jyumaefscl {
        zoijcleaow(boolean z13) {
            super(z13);
        }

        @Override // androidx.activity.jyumaefscl
        public void dxjokdxxww(androidx.activity.zoijcleaow zoijcleaowVar) {
            if (FragmentManager.rhgxfdycjh(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + FragmentManager.f9073ulzqkzuiru + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.f9073ulzqkzuiru) {
                FragmentManager.this.okpsazkaxt();
                FragmentManager.this.A();
            }
        }

        @Override // androidx.activity.jyumaefscl
        public void gxszxtbevo() {
            if (FragmentManager.rhgxfdycjh(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + FragmentManager.f9073ulzqkzuiru + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.f9073ulzqkzuiru) {
                FragmentManager.this.zdlpuopuiu();
            }
        }

        @Override // androidx.activity.jyumaefscl
        public void lqeggnwhkg() {
            if (FragmentManager.rhgxfdycjh(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + FragmentManager.f9073ulzqkzuiru + " fragment manager " + FragmentManager.this);
            }
            FragmentManager.this.ixidwrxhsl();
        }

        @Override // androidx.activity.jyumaefscl
        public void nufgyqmvbu(androidx.activity.zoijcleaow zoijcleaowVar) {
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + FragmentManager.f9073ulzqkzuiru + " fragment manager " + FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f9100nufgyqmvbu != null) {
                Iterator it = fragmentManager.pmvmpeiblj(new ArrayList(Collections.singletonList(FragmentManager.this.f9100nufgyqmvbu)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((ntlheqmsrt) it.next()).pmvmpeiblj(zoijcleaowVar);
                }
                Iterator it2 = FragmentManager.this.f9101ojitshcjhn.iterator();
                while (it2.hasNext()) {
                    ((ojitshcjhn) it2.next()).iobyxmoadg(zoijcleaowVar);
                }
            }
        }
    }

    private void D(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            if (!((androidx.fragment.app.iobyxmoadg) arrayList.get(i13)).f9255oxmwwwfdhm) {
                if (i14 != i13) {
                    uwvvkdfqfp(arrayList, arrayList2, i14, i13);
                }
                i14 = i13 + 1;
                if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                    while (i14 < size && ((Boolean) arrayList2.get(i14)).booleanValue() && !((androidx.fragment.app.iobyxmoadg) arrayList.get(i14)).f9255oxmwwwfdhm) {
                        i14++;
                    }
                }
                uwvvkdfqfp(arrayList, arrayList2, i13, i14);
                i13 = i14 - 1;
            }
            i13++;
        }
        if (i14 != size) {
            uwvvkdfqfp(arrayList, arrayList2, i14, size);
        }
    }

    private void F() {
        for (int i13 = 0; i13 < this.f9101ojitshcjhn.size(); i13++) {
            ((ojitshcjhn) this.f9101ojitshcjhn.get(i13)).eablkybsjg();
        }
    }

    static int J(int i13) {
        int i14 = 4097;
        if (i13 == 4097) {
            return 8194;
        }
        if (i13 != 8194) {
            i14 = 8197;
            if (i13 == 8197) {
                return 4100;
            }
            if (i13 == 4099) {
                return 4099;
            }
            if (i13 != 4100) {
                return 0;
            }
        }
        return i14;
    }

    private void U(Fragment fragment) {
        ViewGroup viewGroupIwxlajgraz = iwxlajgraz(fragment);
        if (viewGroupIwxlajgraz == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupIwxlajgraz.getTag(k2.zoijcleaow.visible_removing_fragment_view_tag) == null) {
            viewGroupIwxlajgraz.setTag(k2.zoijcleaow.visible_removing_fragment_view_tag, fragment);
        }
        ((Fragment) viewGroupIwxlajgraz.getTag(k2.zoijcleaow.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
    }

    private void W() {
        Iterator it = this.f9105ppxfxbqfkf.gtknphoqwx().iterator();
        while (it.hasNext()) {
            q((pkzmftpjix) it.next());
        }
    }

    private void X(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new kegysxyocb("FragmentManager"));
        iwizpuwonk iwizpuwonkVar = this.f9078cqumvgiudr;
        if (iwizpuwonkVar != null) {
            try {
                iwizpuwonkVar.dxjokdxxww("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e13) {
                Log.e("FragmentManager", "Failed dumping state", e13);
                throw runtimeException;
            }
        }
        try {
            ikoacuggdj("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e14) {
            Log.e("FragmentManager", "Failed dumping state", e14);
            throw runtimeException;
        }
    }

    private void Z() {
        synchronized (this.f9088iobyxmoadg) {
            try {
                if (!this.f9088iobyxmoadg.isEmpty()) {
                    this.f9075btonecajqb.wflxmlrfwp(true);
                    if (rhgxfdycjh(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z13 = roivzttewh() > 0 && b(this.f9096lereixgezr);
                if (rhgxfdycjh(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z13);
                }
                this.f9075btonecajqb.wflxmlrfwp(z13);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void cqumvgiudr() {
        boolean zIwizpuwonk;
        iwizpuwonk iwizpuwonkVar = this.f9078cqumvgiudr;
        if (iwizpuwonkVar instanceof ribwqtqdhb) {
            zIwizpuwonk = this.f9105ppxfxbqfkf.rgvfuqvkyq().iwizpuwonk();
        } else {
            zIwizpuwonk = iwizpuwonkVar.gxszxtbevo() instanceof Activity ? !((Activity) this.f9078cqumvgiudr.gxszxtbevo()).isChangingConfigurations() : true;
        }
        if (zIwizpuwonk) {
            Iterator it = this.f9079draadjrbmk.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f9021zdlpuopuiu.iterator();
                while (it2.hasNext()) {
                    this.f9105ppxfxbqfkf.rgvfuqvkyq().agtfadlqog((String) it2.next(), false);
                }
            }
        }
    }

    private static void czzsidtyhn(ArrayList arrayList, ArrayList arrayList2, int i13, int i14) {
        while (i13 < i14) {
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar = (androidx.fragment.app.iobyxmoadg) arrayList.get(i13);
            if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                iobyxmoadgVar.lereixgezr(-1);
                iobyxmoadgVar.iozdgvuglv();
            } else {
                iobyxmoadgVar.lereixgezr(1);
                iobyxmoadgVar.yadqdtsiqt();
            }
            i13++;
        }
    }

    private boolean eslsurpljm() {
        Fragment fragment = this.f9096lereixgezr;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f9096lereixgezr.getParentFragmentManager().eslsurpljm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        Iterator it = this.f9101ojitshcjhn.iterator();
        while (it.hasNext()) {
            ((ojitshcjhn) it.next()).wkgbmnqykc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Configuration configuration) {
        if (eslsurpljm()) {
            iozdgvuglv(configuration, false);
        }
    }

    static Fragment grlcpdaxtj(View view) {
        Object tag = view.getTag(k2.zoijcleaow.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Integer num) {
        if (eslsurpljm() && num.intValue() == 80) {
            jpowsppfya(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(androidx.core.app.btonecajqb btonecajqbVar) {
        if (eslsurpljm()) {
            hkdspvbjdz(btonecajqbVar.iobyxmoadg(), false);
        }
    }

    private void iwizpuwonk() {
        this.f9118zoijcleaow = false;
        this.f9113wypolnanlu.clear();
        this.f9080dsvhmnatus.clear();
    }

    private ViewGroup iwxlajgraz(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f9083esjtqupxsv.wkgbmnqykc()) {
            View viewPpxfxbqfkf = this.f9083esjtqupxsv.ppxfxbqfkf(fragment.mContainerId);
            if (viewPpxfxbqfkf instanceof ViewGroup) {
                return (ViewGroup) viewPpxfxbqfkf;
            }
        }
        return null;
    }

    static Fragment iyctptxqzt(View view) {
        while (view != null) {
            Fragment fragmentGrlcpdaxtj = grlcpdaxtj(view);
            if (fragmentGrlcpdaxtj != null) {
                return fragmentGrlcpdaxtj;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(androidx.core.app.kcexrzcfyt kcexrzcfytVar) {
        if (eslsurpljm()) {
            mbcevpiqjq(kcexrzcfytVar.iobyxmoadg(), false);
        }
    }

    private void jhduphickx() {
        if (this.f9077cllcsxoeiz) {
            this.f9077cllcsxoeiz = false;
            W();
        }
    }

    private void jlmebxxoox(int i13) {
        try {
            this.f9118zoijcleaow = true;
            this.f9105ppxfxbqfkf.wkgbmnqykc(i13);
            n(i13, false);
            Iterator it = lereixgezr().iterator();
            while (it.hasNext()) {
                ((ntlheqmsrt) it.next()).vdvldrhtss();
            }
            this.f9118zoijcleaow = false;
            metgxyhuhe(true);
        } catch (Throwable th2) {
            this.f9118zoijcleaow = false;
            throw th2;
        }
    }

    private void jyumaefscl() {
        if (d()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void kegysxyocb(Fragment fragment) {
        if (fragment == null || !fragment.equals(ydmasvzmpa(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private Set lereixgezr() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f9105ppxfxbqfkf.gtknphoqwx().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((pkzmftpjix) it.next()).gtknphoqwx().mContainer;
            if (viewGroup != null) {
                hashSet.add(ntlheqmsrt.jyumaefscl(viewGroup, fyldjkxazc()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void okpsazkaxt() {
        Iterator it = lereixgezr().iterator();
        while (it.hasNext()) {
            ((ntlheqmsrt) it.next()).vdvldrhtss();
        }
    }

    public static FragmentManager opjhrmiecq(View view) {
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVar;
        Fragment fragmentIyctptxqzt = iyctptxqzt(view);
        if (fragmentIyctptxqzt != null) {
            if (fragmentIyctptxqzt.isAdded()) {
                return fragmentIyctptxqzt.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentIyctptxqzt + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                oxmwwwfdhmVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.oxmwwwfdhm) {
                oxmwwwfdhmVar = (androidx.fragment.app.oxmwwwfdhm) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (oxmwwwfdhmVar != null) {
            return oxmwwwfdhmVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static boolean rhgxfdycjh(int i13) {
        return f9072ntlheqmsrt || Log.isLoggable("FragmentManager", i13);
    }

    private int sflfametgt(String str, int i13, boolean z13) {
        if (this.f9111wkgbmnqykc.isEmpty()) {
            return -1;
        }
        if (str == null && i13 < 0) {
            if (z13) {
                return 0;
            }
            return this.f9111wkgbmnqykc.size() - 1;
        }
        int size = this.f9111wkgbmnqykc.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar = (androidx.fragment.app.iobyxmoadg) this.f9111wkgbmnqykc.get(size);
            if ((str != null && str.equals(iobyxmoadgVar.getName())) || (i13 >= 0 && i13 == iobyxmoadgVar.f9234jyumaefscl)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z13) {
            if (size == this.f9111wkgbmnqykc.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar2 = (androidx.fragment.app.iobyxmoadg) this.f9111wkgbmnqykc.get(size - 1);
            if ((str == null || !str.equals(iobyxmoadgVar2.getName())) && (i13 < 0 || i13 != iobyxmoadgVar2.f9234jyumaefscl)) {
                return size;
            }
            size--;
        }
        return size;
    }

    private lmojexxdyd uawqvzlxes(Fragment fragment) {
        return this.f9095kegysxyocb.oxmwwwfdhm(fragment);
    }

    private void uwvvkdfqfp(ArrayList arrayList, ArrayList arrayList2, int i13, int i14) {
        boolean z13 = ((androidx.fragment.app.iobyxmoadg) arrayList.get(i13)).f9255oxmwwwfdhm;
        ArrayList arrayList3 = this.f9107stevsuqkhv;
        if (arrayList3 == null) {
            this.f9107stevsuqkhv = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f9107stevsuqkhv.addAll(this.f9105ppxfxbqfkf.ojitshcjhn());
        Fragment fragmentAgeimvtcrz = ageimvtcrz();
        boolean z14 = false;
        for (int i15 = i13; i15 < i14; i15++) {
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar = (androidx.fragment.app.iobyxmoadg) arrayList.get(i15);
            fragmentAgeimvtcrz = !((Boolean) arrayList2.get(i15)).booleanValue() ? iobyxmoadgVar.lmojexxdyd(this.f9107stevsuqkhv, fragmentAgeimvtcrz) : iobyxmoadgVar.ylkuphrtab(this.f9107stevsuqkhv, fragmentAgeimvtcrz);
            z14 = z14 || iobyxmoadgVar.f9246dxjokdxxww;
        }
        this.f9107stevsuqkhv.clear();
        if (!z13 && this.f9091iwizpuwonk >= 1) {
            for (int i16 = i13; i16 < i14; i16++) {
                Iterator it = ((androidx.fragment.app.iobyxmoadg) arrayList.get(i16)).f9256ppxfxbqfkf.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((jpowsppfya.iobyxmoadg) it.next()).f9270zoijcleaow;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f9105ppxfxbqfkf.oxmwwwfdhm(zynmafqrjb(fragment));
                    }
                }
            }
        }
        czzsidtyhn(arrayList, arrayList2, i13, i14);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i14 - 1)).booleanValue();
        if (z14 && !this.f9101ojitshcjhn.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(lrnfpwlwnk((androidx.fragment.app.iobyxmoadg) it2.next()));
            }
            if (this.f9100nufgyqmvbu == null) {
                for (ojitshcjhn ojitshcjhnVar : this.f9101ojitshcjhn) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        ojitshcjhnVar.ppxfxbqfkf((Fragment) it3.next(), zBooleanValue);
                    }
                }
                for (ojitshcjhn ojitshcjhnVar2 : this.f9101ojitshcjhn) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        ojitshcjhnVar2.zoijcleaow((Fragment) it4.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i17 = i13; i17 < i14; i17++) {
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar2 = (androidx.fragment.app.iobyxmoadg) arrayList.get(i17);
            if (zBooleanValue) {
                for (int size = iobyxmoadgVar2.f9256ppxfxbqfkf.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((jpowsppfya.iobyxmoadg) iobyxmoadgVar2.f9256ppxfxbqfkf.get(size)).f9270zoijcleaow;
                    if (fragment2 != null) {
                        zynmafqrjb(fragment2).wflxmlrfwp();
                    }
                }
            } else {
                Iterator it5 = iobyxmoadgVar2.f9256ppxfxbqfkf.iterator();
                while (it5.hasNext()) {
                    Fragment fragment3 = ((jpowsppfya.iobyxmoadg) it5.next()).f9270zoijcleaow;
                    if (fragment3 != null) {
                        zynmafqrjb(fragment3).wflxmlrfwp();
                    }
                }
            }
        }
        n(this.f9091iwizpuwonk, true);
        for (ntlheqmsrt ntlheqmsrtVar : pmvmpeiblj(arrayList, i13, i14)) {
            ntlheqmsrtVar.cdpycssgdh(zBooleanValue);
            ntlheqmsrtVar.lereixgezr();
            ntlheqmsrtVar.agtfadlqog();
        }
        while (i13 < i14) {
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar3 = (androidx.fragment.app.iobyxmoadg) arrayList.get(i13);
            if (((Boolean) arrayList2.get(i13)).booleanValue() && iobyxmoadgVar3.f9234jyumaefscl >= 0) {
                iobyxmoadgVar3.f9234jyumaefscl = -1;
            }
            iobyxmoadgVar3.wwaezpbzkn();
            i13++;
        }
        if (z14) {
            F();
        }
    }

    private void weqkydbzbr() {
        Iterator it = lereixgezr().iterator();
        while (it.hasNext()) {
            ((ntlheqmsrt) it.next()).oxmwwwfdhm();
        }
    }

    private boolean x(String str, int i13, int i14) {
        metgxyhuhe(false);
        xrmfcynszj(true);
        Fragment fragment = this.f9104pmvmpeiblj;
        if (fragment != null && i13 < 0 && str == null && fragment.getChildFragmentManager().v()) {
            return true;
        }
        boolean zY = y(this.f9080dsvhmnatus, this.f9113wypolnanlu, str, i13, i14);
        if (zY) {
            this.f9118zoijcleaow = true;
            try {
                D(this.f9080dsvhmnatus, this.f9113wypolnanlu);
                iwizpuwonk();
            } catch (Throwable th2) {
                iwizpuwonk();
                throw th2;
            }
        }
        Z();
        jhduphickx();
        this.f9105ppxfxbqfkf.zoijcleaow();
        return zY;
    }

    private void xrmfcynszj(boolean z13) {
        if (this.f9118zoijcleaow) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f9078cqumvgiudr == null) {
            if (!this.f9087hkdspvbjdz) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f9078cqumvgiudr.nufgyqmvbu().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z13) {
            jyumaefscl();
        }
        if (this.f9080dsvhmnatus == null) {
            this.f9080dsvhmnatus = new ArrayList();
            this.f9113wypolnanlu = new ArrayList();
        }
    }

    private boolean yzdjzghtvl(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.yggfygwlhe();
    }

    private boolean zeieaojujs(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f9088iobyxmoadg) {
            if (this.f9088iobyxmoadg.isEmpty()) {
                return false;
            }
            try {
                int size = this.f9088iobyxmoadg.size();
                boolean zIobyxmoadg = false;
                for (int i13 = 0; i13 < size; i13++) {
                    zIobyxmoadg |= ((rgvfuqvkyq) this.f9088iobyxmoadg.get(i13)).iobyxmoadg(arrayList, arrayList2);
                }
                this.f9088iobyxmoadg.clear();
                this.f9078cqumvgiudr.nufgyqmvbu().removeCallbacks(this.f9099mbcevpiqjq);
                return zIobyxmoadg;
            } catch (Throwable th2) {
                this.f9088iobyxmoadg.clear();
                this.f9078cqumvgiudr.nufgyqmvbu().removeCallbacks(this.f9099mbcevpiqjq);
                throw th2;
            }
        }
    }

    void A() {
        jztzpxfvev(new oxmwwwfdhm(), false);
    }

    public void B(wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        this.f9106rgvfuqvkyq.ojitshcjhn(wflxmlrfwpVar, z13);
    }

    void C(Fragment fragment) {
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f9105ppxfxbqfkf.yggfygwlhe(fragment);
        if (yzdjzghtvl(fragment)) {
            this.f9103pkzmftpjix = true;
        }
        fragment.mRemoving = true;
        U(fragment);
    }

    void E(Fragment fragment) {
        this.f9095kegysxyocb.cqumvgiudr(fragment);
    }

    public void G(String str) {
        jztzpxfvev(new kcexrzcfyt(str), false);
    }

    boolean H(ArrayList arrayList, ArrayList arrayList2, String str) {
        BackStackState backStackState = (BackStackState) this.f9079draadjrbmk.remove(str);
        if (backStackState == null) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar = (androidx.fragment.app.iobyxmoadg) it.next();
            if (iobyxmoadgVar.f9233iwizpuwonk) {
                Iterator it2 = iobyxmoadgVar.f9256ppxfxbqfkf.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = ((jpowsppfya.iobyxmoadg) it2.next()).f9270zoijcleaow;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator it3 = backStackState.zoijcleaow(this, map).iterator();
        while (true) {
            boolean z13 = false;
            while (it3.hasNext()) {
                if (((androidx.fragment.app.iobyxmoadg) it3.next()).iobyxmoadg(arrayList, arrayList2) || z13) {
                    z13 = true;
                }
            }
            return z13;
        }
    }

    void I(Parcelable parcelable) {
        pkzmftpjix pkzmftpjixVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f9078cqumvgiudr.gxszxtbevo().getClassLoader());
                this.f9110wflxmlrfwp.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f9078cqumvgiudr.gxszxtbevo().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f9105ppxfxbqfkf.cqumvgiudr(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f9105ppxfxbqfkf.jyumaefscl();
        Iterator it = fragmentManagerState.f9155zdlpuopuiu.iterator();
        while (it.hasNext()) {
            Bundle bundleZynmafqrjb = this.f9105ppxfxbqfkf.zynmafqrjb((String) it.next(), null);
            if (bundleZynmafqrjb != null) {
                Fragment fragmentVdvldrhtss = this.f9095kegysxyocb.vdvldrhtss(((FragmentState) bundleZynmafqrjb.getParcelable("state")).f9168yggfygwlhe);
                if (fragmentVdvldrhtss != null) {
                    if (rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentVdvldrhtss);
                    }
                    pkzmftpjixVar = new pkzmftpjix(this.f9106rgvfuqvkyq, this.f9105ppxfxbqfkf, fragmentVdvldrhtss, bundleZynmafqrjb);
                } else {
                    pkzmftpjixVar = new pkzmftpjix(this.f9106rgvfuqvkyq, this.f9105ppxfxbqfkf, this.f9078cqumvgiudr.gxszxtbevo().getClassLoader(), dvvnrvtcbc(), bundleZynmafqrjb);
                }
                Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
                fragmentGtknphoqwx.mSavedFragmentState = bundleZynmafqrjb;
                fragmentGtknphoqwx.mFragmentManager = this;
                if (rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentGtknphoqwx.mWho + "): " + fragmentGtknphoqwx);
                }
                pkzmftpjixVar.ojitshcjhn(this.f9078cqumvgiudr.gxszxtbevo().getClassLoader());
                this.f9105ppxfxbqfkf.oxmwwwfdhm(pkzmftpjixVar);
                pkzmftpjixVar.zdlpuopuiu(this.f9091iwizpuwonk);
            }
        }
        for (Fragment fragment : this.f9095kegysxyocb.yggfygwlhe()) {
            if (!this.f9105ppxfxbqfkf.ppxfxbqfkf(fragment.mWho)) {
                if (rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f9155zdlpuopuiu);
                }
                this.f9095kegysxyocb.cqumvgiudr(fragment);
                fragment.mFragmentManager = this;
                pkzmftpjix pkzmftpjixVar2 = new pkzmftpjix(this.f9106rgvfuqvkyq, this.f9105ppxfxbqfkf, fragment);
                pkzmftpjixVar2.zdlpuopuiu(1);
                pkzmftpjixVar2.wflxmlrfwp();
                fragment.mRemoving = true;
                pkzmftpjixVar2.wflxmlrfwp();
            }
        }
        this.f9105ppxfxbqfkf.iwizpuwonk(fragmentManagerState.f9154yggfygwlhe);
        if (fragmentManagerState.f9151jyumaefscl != null) {
            this.f9111wkgbmnqykc = new ArrayList(fragmentManagerState.f9151jyumaefscl.length);
            int i13 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f9151jyumaefscl;
                if (i13 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = backStackRecordStateArr[i13].ppxfxbqfkf(this);
                if (rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i13 + " (index " + iobyxmoadgVarPpxfxbqfkf.f9234jyumaefscl + "): " + iobyxmoadgVarPpxfxbqfkf);
                    PrintWriter printWriter = new PrintWriter(new kegysxyocb("FragmentManager"));
                    iobyxmoadgVarPpxfxbqfkf.cdpycssgdh("  ", printWriter, false);
                    printWriter.close();
                }
                this.f9111wkgbmnqykc.add(iobyxmoadgVarPpxfxbqfkf);
                i13++;
            }
        } else {
            this.f9111wkgbmnqykc = new ArrayList();
        }
        this.f9084gtknphoqwx.set(fragmentManagerState.f9150iwizpuwonk);
        String str3 = fragmentManagerState.f9148cqumvgiudr;
        if (str3 != null) {
            Fragment fragmentYdmasvzmpa = ydmasvzmpa(str3);
            this.f9104pmvmpeiblj = fragmentYdmasvzmpa;
            kegysxyocb(fragmentYdmasvzmpa);
        }
        ArrayList arrayList = fragmentManagerState.f9149esjtqupxsv;
        if (arrayList != null) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                this.f9079draadjrbmk.put((String) arrayList.get(i14), (BackStackState) fragmentManagerState.f9152lereixgezr.get(i14));
            }
        }
        this.f9116ylkuphrtab = new ArrayDeque(fragmentManagerState.f9153pmvmpeiblj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Bundle e() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        weqkydbzbr();
        okpsazkaxt();
        metgxyhuhe(true);
        this.f9086hcddaimhww = true;
        this.f9095kegysxyocb.esjtqupxsv(true);
        ArrayList arrayListEsjtqupxsv = this.f9105ppxfxbqfkf.esjtqupxsv();
        HashMap mapWflxmlrfwp = this.f9105ppxfxbqfkf.wflxmlrfwp();
        if (!mapWflxmlrfwp.isEmpty()) {
            ArrayList arrayListLereixgezr = this.f9105ppxfxbqfkf.lereixgezr();
            int size = this.f9111wkgbmnqykc.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i13 = 0; i13 < size; i13++) {
                    backStackRecordStateArr[i13] = new BackStackRecordState((androidx.fragment.app.iobyxmoadg) this.f9111wkgbmnqykc.get(i13));
                    if (rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i13 + ": " + this.f9111wkgbmnqykc.get(i13));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f9155zdlpuopuiu = arrayListEsjtqupxsv;
            fragmentManagerState.f9154yggfygwlhe = arrayListLereixgezr;
            fragmentManagerState.f9151jyumaefscl = backStackRecordStateArr;
            fragmentManagerState.f9150iwizpuwonk = this.f9084gtknphoqwx.get();
            Fragment fragment = this.f9104pmvmpeiblj;
            if (fragment != null) {
                fragmentManagerState.f9148cqumvgiudr = fragment.mWho;
            }
            fragmentManagerState.f9149esjtqupxsv.addAll(this.f9079draadjrbmk.keySet());
            fragmentManagerState.f9152lereixgezr.addAll(this.f9079draadjrbmk.values());
            fragmentManagerState.f9153pmvmpeiblj = new ArrayList(this.f9116ylkuphrtab);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f9110wflxmlrfwp.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f9110wflxmlrfwp.get(str));
            }
            for (String str2 : mapWflxmlrfwp.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapWflxmlrfwp.get(str2));
            }
        } else if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public void L(String str) {
        jztzpxfvev(new zdlpuopuiu(str), false);
    }

    boolean M(ArrayList arrayList, ArrayList arrayList2, String str) {
        int i13;
        int iSflfametgt = sflfametgt(str, -1, true);
        if (iSflfametgt < 0) {
            return false;
        }
        for (int i14 = iSflfametgt; i14 < this.f9111wkgbmnqykc.size(); i14++) {
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar = (androidx.fragment.app.iobyxmoadg) this.f9111wkgbmnqykc.get(i14);
            if (!iobyxmoadgVar.f9255oxmwwwfdhm) {
                X(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + iobyxmoadgVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i15 = iSflfametgt; i15 < this.f9111wkgbmnqykc.size(); i15++) {
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar2 = (androidx.fragment.app.iobyxmoadg) this.f9111wkgbmnqykc.get(i15);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (jpowsppfya.iobyxmoadg iobyxmoadgVar3 : iobyxmoadgVar2.f9256ppxfxbqfkf) {
                Fragment fragment = iobyxmoadgVar3.f9270zoijcleaow;
                if (fragment != null) {
                    if (!iobyxmoadgVar3.f9268ppxfxbqfkf || (i13 = iobyxmoadgVar3.f9265iobyxmoadg) == 1 || i13 == 2 || i13 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i16 = iobyxmoadgVar3.f9265iobyxmoadg;
                    if (i16 == 1 || i16 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("saveBackStack(\"");
                sb3.append(str);
                sb3.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb3.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb3.append(" in ");
                sb3.append(iobyxmoadgVar2);
                sb3.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                X(new IllegalArgumentException(sb3.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("saveBackStack(\"");
                sb4.append(str);
                sb4.append("\") must not contain retained fragments. Found ");
                sb4.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb4.append("fragment ");
                sb4.append(fragment2);
                X(new IllegalArgumentException(sb4.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.nuxfzjnpeb()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Fragment) it.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f9111wkgbmnqykc.size() - iSflfametgt);
        for (int i17 = iSflfametgt; i17 < this.f9111wkgbmnqykc.size(); i17++) {
            arrayList4.add(null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f9111wkgbmnqykc.size() - 1; size >= iSflfametgt; size--) {
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar4 = (androidx.fragment.app.iobyxmoadg) this.f9111wkgbmnqykc.remove(size);
            androidx.fragment.app.iobyxmoadg iobyxmoadgVar5 = new androidx.fragment.app.iobyxmoadg(iobyxmoadgVar4);
            iobyxmoadgVar5.pmvmpeiblj();
            arrayList4.set(size - iSflfametgt, new BackStackRecordState(iobyxmoadgVar5));
            iobyxmoadgVar4.f9233iwizpuwonk = true;
            arrayList.add(iobyxmoadgVar4);
            arrayList2.add(Boolean.TRUE);
        }
        this.f9079draadjrbmk.put(str, backStackState);
        return true;
    }

    public Fragment.SavedState N(Fragment fragment) {
        pkzmftpjix pkzmftpjixVarAgtfadlqog = this.f9105ppxfxbqfkf.agtfadlqog(fragment.mWho);
        if (pkzmftpjixVarAgtfadlqog == null || !pkzmftpjixVarAgtfadlqog.gtknphoqwx().equals(fragment)) {
            X(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return pkzmftpjixVarAgtfadlqog.vdvldrhtss();
    }

    void O() {
        synchronized (this.f9088iobyxmoadg) {
            try {
                if (this.f9088iobyxmoadg.size() == 1) {
                    this.f9078cqumvgiudr.nufgyqmvbu().removeCallbacks(this.f9099mbcevpiqjq);
                    this.f9078cqumvgiudr.nufgyqmvbu().post(this.f9099mbcevpiqjq);
                    Z();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void P(Fragment fragment, boolean z13) {
        ViewGroup viewGroupIwxlajgraz = iwxlajgraz(fragment);
        if (viewGroupIwxlajgraz == null || !(viewGroupIwxlajgraz instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupIwxlajgraz).setDrawDisappearingViewsLast(!z13);
    }

    public final void Q(String str, Bundle bundle) {
        agtfadlqog agtfadlqogVar = (agtfadlqog) this.f9074agtfadlqog.get(str);
        if (agtfadlqogVar == null || !agtfadlqogVar.zoijcleaow(androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED)) {
            this.f9110wflxmlrfwp.put(str, bundle);
        } else {
            agtfadlqogVar.iobyxmoadg(str, bundle);
        }
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final void R(String str, androidx.lifecycle.vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) {
        androidx.lifecycle.gtknphoqwx lifecycle = vdvldrhtssVar.getLifecycle();
        if (lifecycle.zoijcleaow() == androidx.lifecycle.gtknphoqwx.zoijcleaow.DESTROYED) {
            return;
        }
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(str, ylkuphrtabVar, lifecycle);
        agtfadlqog agtfadlqogVar = (agtfadlqog) this.f9074agtfadlqog.put(str, new agtfadlqog(lifecycle, ylkuphrtabVar, lqeggnwhkgVar));
        if (agtfadlqogVar != null) {
            agtfadlqogVar.ppxfxbqfkf();
        }
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + ylkuphrtabVar);
        }
        lifecycle.iobyxmoadg(lqeggnwhkgVar);
    }

    void S(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar) {
        if (fragment.equals(ydmasvzmpa(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = zoijcleaowVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void T(Fragment fragment) {
        if (fragment == null || (fragment.equals(ydmasvzmpa(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f9104pmvmpeiblj;
            this.f9104pmvmpeiblj = fragment;
            kegysxyocb(fragment2);
            kegysxyocb(this.f9104pmvmpeiblj);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void V(Fragment fragment) {
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void Y(wflxmlrfwp wflxmlrfwpVar) {
        this.f9106rgvfuqvkyq.rgvfuqvkyq(wflxmlrfwpVar);
    }

    boolean a(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public Fragment ageimvtcrz() {
        return this.f9104pmvmpeiblj;
    }

    public void agtfadlqog(ojitshcjhn ojitshcjhnVar) {
        this.f9101ojitshcjhn.add(ojitshcjhnVar);
    }

    androidx.fragment.app.zdlpuopuiu auzgnhcxok() {
        return this.f9083esjtqupxsv;
    }

    boolean b(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.ageimvtcrz()) && b(fragmentManager.f9096lereixgezr);
    }

    Fragment bfopjjpdmp(String str) {
        return this.f9105ppxfxbqfkf.dxjokdxxww(str);
    }

    boolean c(int i13) {
        return this.f9091iwizpuwonk >= i13;
    }

    void cdpycssgdh() {
        this.f9086hcddaimhww = false;
        this.f9092jpowsppfya = false;
        this.f9095kegysxyocb.esjtqupxsv(false);
        jlmebxxoox(4);
    }

    void cllcsxoeiz(Fragment fragment) {
        Iterator it = this.f9109vdvldrhtss.iterator();
        while (it.hasNext()) {
            ((wwaezpbzkn) it.next()).iobyxmoadg(this, fragment);
        }
    }

    void crxdokpmqz() {
        this.f9086hcddaimhww = false;
        this.f9092jpowsppfya = false;
        this.f9095kegysxyocb.esjtqupxsv(false);
        jlmebxxoox(5);
    }

    public boolean d() {
        return this.f9086hcddaimhww || this.f9092jpowsppfya;
    }

    pkzmftpjix draadjrbmk(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            l2.zoijcleaow.gxszxtbevo(fragment, str);
        }
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        pkzmftpjix pkzmftpjixVarZynmafqrjb = zynmafqrjb(fragment);
        fragment.mFragmentManager = this;
        this.f9105ppxfxbqfkf.oxmwwwfdhm(pkzmftpjixVarZynmafqrjb);
        if (!fragment.mDetached) {
            this.f9105ppxfxbqfkf.iobyxmoadg(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (yzdjzghtvl(fragment)) {
                this.f9103pkzmftpjix = true;
            }
        }
        return pkzmftpjixVarZynmafqrjb;
    }

    void dsvhmnatus() {
        for (Fragment fragment : this.f9105ppxfxbqfkf.draadjrbmk()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.dsvhmnatus();
            }
        }
    }

    public jyumaefscl dvvnrvtcbc() {
        jyumaefscl jyumaefsclVar = this.f9119zynmafqrjb;
        if (jyumaefsclVar != null) {
            return jyumaefsclVar;
        }
        Fragment fragment = this.f9096lereixgezr;
        return fragment != null ? fragment.mFragmentManager.dvvnrvtcbc() : this.f9090istkbnxepw;
    }

    public final void esjtqupxsv(String str) {
        this.f9110wflxmlrfwp.remove(str);
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public boolean ezmngbhpjk() {
        return this.f9087hkdspvbjdz;
    }

    Fragment fiwbwshyhd() {
        return this.f9096lereixgezr;
    }

    void fmlbqenlif(Fragment fragment) {
        if (fragment.mAdded && yzdjzghtvl(fragment)) {
            this.f9103pkzmftpjix = true;
        }
    }

    ulzqkzuiru fyldjkxazc() {
        ulzqkzuiru ulzqkzuiruVar = this.f9076cdpycssgdh;
        if (ulzqkzuiruVar != null) {
            return ulzqkzuiruVar;
        }
        Fragment fragment = this.f9096lereixgezr;
        return fragment != null ? fragment.mFragmentManager.fyldjkxazc() : this.f9114yadqdtsiqt;
    }

    void gtknphoqwx(androidx.fragment.app.iobyxmoadg iobyxmoadgVar) {
        this.f9111wkgbmnqykc.add(iobyxmoadgVar);
    }

    void hcddaimhww() {
        jlmebxxoox(1);
    }

    void hkdspvbjdz(boolean z13, boolean z14) {
        if (z14 && (this.f9078cqumvgiudr instanceof androidx.core.app.vdvldrhtss)) {
            X(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f9105ppxfxbqfkf.ojitshcjhn()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z13);
                if (z14) {
                    fragment.mChildFragmentManager.hkdspvbjdz(z13, true);
                }
            }
        }
    }

    esjtqupxsv hszhottldk() {
        return this.f9106rgvfuqvkyq;
    }

    public List igdgnonuha() {
        return this.f9105ppxfxbqfkf.ojitshcjhn();
    }

    public void ikoacuggdj(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f9105ppxfxbqfkf.eablkybsjg(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f9082eablkybsjg;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i13 = 0; i13 < size; i13++) {
                Fragment fragment = (Fragment) this.f9082eablkybsjg.get(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i13);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        int size2 = this.f9111wkgbmnqykc.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i14 = 0; i14 < size2; i14++) {
                androidx.fragment.app.iobyxmoadg iobyxmoadgVar = (androidx.fragment.app.iobyxmoadg) this.f9111wkgbmnqykc.get(i14);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i14);
                printWriter.print(": ");
                printWriter.println(iobyxmoadgVar.toString());
                iobyxmoadgVar.istkbnxepw(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f9084gtknphoqwx.get());
        synchronized (this.f9088iobyxmoadg) {
            try {
                int size3 = this.f9088iobyxmoadg.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i15 = 0; i15 < size3; i15++) {
                        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) this.f9088iobyxmoadg.get(i15);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i15);
                        printWriter.print(": ");
                        printWriter.println(rgvfuqvkyqVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f9078cqumvgiudr);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f9083esjtqupxsv);
        if (this.f9096lereixgezr != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f9096lereixgezr);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f9091iwizpuwonk);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f9086hcddaimhww);
        printWriter.print(" mStopped=");
        printWriter.print(this.f9092jpowsppfya);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f9087hkdspvbjdz);
        if (this.f9103pkzmftpjix) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f9103pkzmftpjix);
        }
    }

    void iozdgvuglv(Configuration configuration, boolean z13) {
        if (z13 && (this.f9078cqumvgiudr instanceof androidx.core.content.zoijcleaow)) {
            X(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f9105ppxfxbqfkf.ojitshcjhn()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z13) {
                    fragment.mChildFragmentManager.iozdgvuglv(configuration, true);
                }
            }
        }
    }

    public l2.zoijcleaow.ppxfxbqfkf ipoelvxyzq() {
        return this.f9108tzroggbefp;
    }

    void istkbnxepw(Fragment fragment) {
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (rhgxfdycjh(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f9105ppxfxbqfkf.yggfygwlhe(fragment);
            if (yzdjzghtvl(fragment)) {
                this.f9103pkzmftpjix = true;
            }
            U(fragment);
        }
    }

    void ixidwrxhsl() {
        this.f9081dxjokdxxww = true;
        metgxyhuhe(true);
        this.f9081dxjokdxxww = false;
        if (!f9073ulzqkzuiru || this.f9100nufgyqmvbu == null) {
            if (this.f9075btonecajqb.btonecajqb()) {
                if (rhgxfdycjh(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                v();
                return;
            } else {
                if (rhgxfdycjh(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f9098lqeggnwhkg.draadjrbmk();
                return;
            }
        }
        if (!this.f9101ojitshcjhn.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(lrnfpwlwnk(this.f9100nufgyqmvbu));
            for (ojitshcjhn ojitshcjhnVar : this.f9101ojitshcjhn) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ojitshcjhnVar.zoijcleaow((Fragment) it.next(), true);
                }
            }
        }
        Iterator it2 = this.f9100nufgyqmvbu.f9256ppxfxbqfkf.iterator();
        while (it2.hasNext()) {
            Fragment fragment = ((jpowsppfya.iobyxmoadg) it2.next()).f9270zoijcleaow;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator it3 = pmvmpeiblj(new ArrayList(Collections.singletonList(this.f9100nufgyqmvbu)), 0, 1).iterator();
        while (it3.hasNext()) {
            ((ntlheqmsrt) it3.next()).gxszxtbevo();
        }
        Iterator it4 = this.f9100nufgyqmvbu.f9256ppxfxbqfkf.iterator();
        while (it4.hasNext()) {
            Fragment fragment2 = ((jpowsppfya.iobyxmoadg) it4.next()).f9270zoijcleaow;
            if (fragment2 != null && fragment2.mContainer == null) {
                zynmafqrjb(fragment2).wflxmlrfwp();
            }
        }
        this.f9100nufgyqmvbu = null;
        Z();
        if (rhgxfdycjh(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f9075btonecajqb.btonecajqb() + " for  FragmentManager " + this);
        }
    }

    void jpowsppfya(boolean z13) {
        if (z13 && (this.f9078cqumvgiudr instanceof androidx.core.content.ppxfxbqfkf)) {
            X(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f9105ppxfxbqfkf.ojitshcjhn()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z13) {
                    fragment.mChildFragmentManager.jpowsppfya(true);
                }
            }
        }
    }

    void jrbgnlbqoe(Fragment fragment) {
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        U(fragment);
    }

    void jztzpxfvev(rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        if (!z13) {
            if (this.f9078cqumvgiudr == null) {
                if (!this.f9087hkdspvbjdz) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            jyumaefscl();
        }
        synchronized (this.f9088iobyxmoadg) {
            try {
                if (this.f9078cqumvgiudr == null) {
                    if (!z13) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f9088iobyxmoadg.add(rgvfuqvkyqVar);
                    O();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void k(Fragment fragment, String[] strArr, int i13) {
        if (this.f9112wwaezpbzkn == null) {
            this.f9078cqumvgiudr.draadjrbmk(fragment, strArr, i13);
            return;
        }
        this.f9116ylkuphrtab.addLast(new LaunchedFragmentInfo(fragment.mWho, i13));
        this.f9112wwaezpbzkn.iobyxmoadg(strArr);
    }

    public jpowsppfya kcexrzcfyt() {
        return new androidx.fragment.app.iobyxmoadg(this);
    }

    boolean krqnebusok(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void l(Fragment fragment, Intent intent, int i13, Bundle bundle) {
        if (this.f9089iozdgvuglv == null) {
            this.f9078cqumvgiudr.agtfadlqog(fragment, intent, i13, bundle);
            return;
        }
        this.f9116ylkuphrtab.addLast(new LaunchedFragmentInfo(fragment.mWho, i13));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f9089iozdgvuglv.iobyxmoadg(intent);
    }

    boolean lmojexxdyd(MenuItem menuItem) {
        if (this.f9091iwizpuwonk < 1) {
            return false;
        }
        for (Fragment fragment : this.f9105ppxfxbqfkf.ojitshcjhn()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    Set lrnfpwlwnk(androidx.fragment.app.iobyxmoadg iobyxmoadgVar) {
        HashSet hashSet = new HashSet();
        for (int i13 = 0; i13 < iobyxmoadgVar.f9256ppxfxbqfkf.size(); i13++) {
            Fragment fragment = ((jpowsppfya.iobyxmoadg) iobyxmoadgVar.f9256ppxfxbqfkf.get(i13)).f9270zoijcleaow;
            if (fragment != null && iobyxmoadgVar.f9246dxjokdxxww) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public iwizpuwonk lxfrhoxuzk() {
        return this.f9078cqumvgiudr;
    }

    void m(Fragment fragment, IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16, Bundle bundle) {
        Intent intent2;
        if (this.f9097lmojexxdyd == null) {
            this.f9078cqumvgiudr.ojitshcjhn(fragment, intentSender, i13, intent, i14, i15, i16, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (rhgxfdycjh(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest intentSenderRequestIobyxmoadg = new IntentSenderRequest.iobyxmoadg(intentSender).zoijcleaow(intent2).ppxfxbqfkf(i15, i14).iobyxmoadg();
        this.f9116ylkuphrtab.addLast(new LaunchedFragmentInfo(fragment.mWho, i13));
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f9097lmojexxdyd.iobyxmoadg(intentSenderRequestIobyxmoadg);
    }

    void mbcevpiqjq(boolean z13, boolean z14) {
        if (z14 && (this.f9078cqumvgiudr instanceof androidx.core.app.oxmwwwfdhm)) {
            X(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f9105ppxfxbqfkf.ojitshcjhn()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z13);
                if (z14) {
                    fragment.mChildFragmentManager.mbcevpiqjq(z13, true);
                }
            }
        }
    }

    boolean metgxyhuhe(boolean z13) {
        androidx.fragment.app.iobyxmoadg iobyxmoadgVar;
        xrmfcynszj(z13);
        boolean z14 = false;
        if (!this.f9081dxjokdxxww && (iobyxmoadgVar = this.f9100nufgyqmvbu) != null) {
            iobyxmoadgVar.f9235yggfygwlhe = false;
            iobyxmoadgVar.pmvmpeiblj();
            if (rhgxfdycjh(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f9100nufgyqmvbu + " as part of execPendingActions for actions " + this.f9088iobyxmoadg);
            }
            this.f9100nufgyqmvbu.zynmafqrjb(false, false);
            this.f9088iobyxmoadg.add(0, this.f9100nufgyqmvbu);
            Iterator it = this.f9100nufgyqmvbu.f9256ppxfxbqfkf.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((jpowsppfya.iobyxmoadg) it.next()).f9270zoijcleaow;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f9100nufgyqmvbu = null;
        }
        while (zeieaojujs(this.f9080dsvhmnatus, this.f9113wypolnanlu)) {
            z14 = true;
            this.f9118zoijcleaow = true;
            try {
                D(this.f9080dsvhmnatus, this.f9113wypolnanlu);
                iwizpuwonk();
            } catch (Throwable th2) {
                iwizpuwonk();
                throw th2;
            }
        }
        Z();
        jhduphickx();
        this.f9105ppxfxbqfkf.zoijcleaow();
        return z14;
    }

    jlmebxxoox mhtqkkgtqm(Fragment fragment) {
        return this.f9095kegysxyocb.jyumaefscl(fragment);
    }

    void n(int i13, boolean z13) {
        iwizpuwonk iwizpuwonkVar;
        if (this.f9078cqumvgiudr == null && i13 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z13 || i13 != this.f9091iwizpuwonk) {
            this.f9091iwizpuwonk = i13;
            this.f9105ppxfxbqfkf.zdlpuopuiu();
            W();
            if (this.f9103pkzmftpjix && (iwizpuwonkVar = this.f9078cqumvgiudr) != null && this.f9091iwizpuwonk == 7) {
                iwizpuwonkVar.rgvfuqvkyq();
                this.f9103pkzmftpjix = false;
            }
        }
    }

    boolean ntlheqmsrt(Menu menu) {
        boolean z13 = false;
        if (this.f9091iwizpuwonk < 1) {
            return false;
        }
        for (Fragment fragment : this.f9105ppxfxbqfkf.ojitshcjhn()) {
            if (fragment != null && a(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z13 = true;
            }
        }
        return z13;
    }

    List nuxfzjnpeb() {
        return this.f9105ppxfxbqfkf.draadjrbmk();
    }

    void o() {
        if (this.f9078cqumvgiudr == null) {
            return;
        }
        this.f9086hcddaimhww = false;
        this.f9092jpowsppfya = false;
        this.f9095kegysxyocb.esjtqupxsv(false);
        for (Fragment fragment : this.f9105ppxfxbqfkf.ojitshcjhn()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public Fragment oipsdeybqn(String str) {
        return this.f9105ppxfxbqfkf.nufgyqmvbu(str);
    }

    void ojitshcjhn(Fragment fragment) {
        this.f9095kegysxyocb.gtknphoqwx(fragment);
    }

    void oxmwwwfdhm(Fragment fragment) {
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f9105ppxfxbqfkf.iobyxmoadg(fragment);
            if (rhgxfdycjh(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (yzdjzghtvl(fragment)) {
                this.f9103pkzmftpjix = true;
            }
        }
    }

    public final void p(FragmentContainerView fragmentContainerView) {
        View view;
        for (pkzmftpjix pkzmftpjixVar : this.f9105ppxfxbqfkf.gtknphoqwx()) {
            Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
            if (fragmentGtknphoqwx.mContainerId == fragmentContainerView.getId() && (view = fragmentGtknphoqwx.mView) != null && view.getParent() == null) {
                fragmentGtknphoqwx.mContainer = fragmentContainerView;
                pkzmftpjixVar.zoijcleaow();
                pkzmftpjixVar.wflxmlrfwp();
            }
        }
    }

    void pkzmftpjix() {
        this.f9087hkdspvbjdz = true;
        metgxyhuhe(true);
        okpsazkaxt();
        cqumvgiudr();
        jlmebxxoox(-1);
        Object obj = this.f9078cqumvgiudr;
        if (obj instanceof androidx.core.content.ppxfxbqfkf) {
            ((androidx.core.content.ppxfxbqfkf) obj).removeOnTrimMemoryListener(this.f9094kcexrzcfyt);
        }
        Object obj2 = this.f9078cqumvgiudr;
        if (obj2 instanceof androidx.core.content.zoijcleaow) {
            ((androidx.core.content.zoijcleaow) obj2).removeOnConfigurationChangedListener(this.f9102oxmwwwfdhm);
        }
        Object obj3 = this.f9078cqumvgiudr;
        if (obj3 instanceof androidx.core.app.vdvldrhtss) {
            ((androidx.core.app.vdvldrhtss) obj3).removeOnMultiWindowModeChangedListener(this.f9117zdlpuopuiu);
        }
        Object obj4 = this.f9078cqumvgiudr;
        if (obj4 instanceof androidx.core.app.oxmwwwfdhm) {
            ((androidx.core.app.oxmwwwfdhm) obj4).removeOnPictureInPictureModeChangedListener(this.f9115yggfygwlhe);
        }
        Object obj5 = this.f9078cqumvgiudr;
        if ((obj5 instanceof v1.cqumvgiudr) && this.f9096lereixgezr == null) {
            ((v1.cqumvgiudr) obj5).removeMenuProvider(this.f9093jyumaefscl);
        }
        this.f9078cqumvgiudr = null;
        this.f9083esjtqupxsv = null;
        this.f9096lereixgezr = null;
        if (this.f9098lqeggnwhkg != null) {
            this.f9075btonecajqb.gtknphoqwx();
            this.f9098lqeggnwhkg = null;
        }
        eablkybsjg.zoijcleaow zoijcleaowVar = this.f9089iozdgvuglv;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.ppxfxbqfkf();
            this.f9097lmojexxdyd.ppxfxbqfkf();
            this.f9112wwaezpbzkn.ppxfxbqfkf();
        }
    }

    Set pmvmpeiblj(ArrayList arrayList, int i13, int i14) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i13 < i14) {
            Iterator it = ((androidx.fragment.app.iobyxmoadg) arrayList.get(i13)).f9256ppxfxbqfkf.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((jpowsppfya.iobyxmoadg) it.next()).f9270zoijcleaow;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(ntlheqmsrt.yggfygwlhe(viewGroup, this));
                }
            }
            i13++;
        }
        return hashSet;
    }

    void q(pkzmftpjix pkzmftpjixVar) {
        Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
        if (fragmentGtknphoqwx.mDeferStart) {
            if (this.f9118zoijcleaow) {
                this.f9077cllcsxoeiz = true;
            } else {
                fragmentGtknphoqwx.mDeferStart = false;
                pkzmftpjixVar.wflxmlrfwp();
            }
        }
    }

    public void r() {
        jztzpxfvev(new vdvldrhtss(null, -1, 0), false);
    }

    int rgvfuqvkyq() {
        return this.f9084gtknphoqwx.getAndIncrement();
    }

    void ribwqtqdhb() {
        this.f9092jpowsppfya = true;
        this.f9095kegysxyocb.esjtqupxsv(true);
        jlmebxxoox(4);
    }

    void rlfsiqarku(rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        if (z13 && (this.f9078cqumvgiudr == null || this.f9087hkdspvbjdz)) {
            return;
        }
        xrmfcynszj(z13);
        androidx.fragment.app.iobyxmoadg iobyxmoadgVar = this.f9100nufgyqmvbu;
        boolean z14 = false;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.f9235yggfygwlhe = false;
            iobyxmoadgVar.pmvmpeiblj();
            if (rhgxfdycjh(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f9100nufgyqmvbu + " as part of execSingleAction for action " + rgvfuqvkyqVar);
            }
            this.f9100nufgyqmvbu.zynmafqrjb(false, false);
            boolean zIobyxmoadg = this.f9100nufgyqmvbu.iobyxmoadg(this.f9080dsvhmnatus, this.f9113wypolnanlu);
            Iterator it = this.f9100nufgyqmvbu.f9256ppxfxbqfkf.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((jpowsppfya.iobyxmoadg) it.next()).f9270zoijcleaow;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f9100nufgyqmvbu = null;
            z14 = zIobyxmoadg;
        }
        boolean zIobyxmoadg2 = rgvfuqvkyqVar.iobyxmoadg(this.f9080dsvhmnatus, this.f9113wypolnanlu);
        if (z14 || zIobyxmoadg2) {
            this.f9118zoijcleaow = true;
            try {
                D(this.f9080dsvhmnatus, this.f9113wypolnanlu);
                iwizpuwonk();
            } catch (Throwable th2) {
                iwizpuwonk();
                throw th2;
            }
        }
        Z();
        jhduphickx();
        this.f9105ppxfxbqfkf.zoijcleaow();
    }

    public int roivzttewh() {
        return this.f9111wkgbmnqykc.size() + (this.f9100nufgyqmvbu != null ? 1 : 0);
    }

    public void s(int i13, int i14) {
        t(i13, i14, false);
    }

    hcddaimhww skhdrjzrfn() {
        return this.f9105ppxfxbqfkf;
    }

    void sopmlzcsov() {
        this.f9086hcddaimhww = false;
        this.f9092jpowsppfya = false;
        this.f9095kegysxyocb.esjtqupxsv(false);
        jlmebxxoox(7);
    }

    void stevsuqkhv(Menu menu) {
        if (this.f9091iwizpuwonk < 1) {
            return;
        }
        for (Fragment fragment : this.f9105ppxfxbqfkf.ojitshcjhn()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void t(int i13, int i14, boolean z13) {
        if (i13 >= 0) {
            jztzpxfvev(new vdvldrhtss(null, i13, i14), z13);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i13);
    }

    public gtknphoqwx tbqsvytpvh(int i13) {
        if (i13 != this.f9111wkgbmnqykc.size()) {
            return (gtknphoqwx) this.f9111wkgbmnqykc.get(i13);
        }
        androidx.fragment.app.iobyxmoadg iobyxmoadgVar = this.f9100nufgyqmvbu;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        throw new IndexOutOfBoundsException();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb3.append("FragmentManager{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append(" in ");
        Fragment fragment = this.f9096lereixgezr;
        if (fragment != null) {
            sb3.append(fragment.getClass().getSimpleName());
            sb3.append("{");
            sb3.append(Integer.toHexString(System.identityHashCode(this.f9096lereixgezr)));
            sb3.append("}");
        } else {
            iwizpuwonk iwizpuwonkVar = this.f9078cqumvgiudr;
            if (iwizpuwonkVar != null) {
                sb3.append(iwizpuwonkVar.getClass().getSimpleName());
                sb3.append("{");
                sb3.append(Integer.toHexString(System.identityHashCode(this.f9078cqumvgiudr)));
                sb3.append("}");
            } else {
                sb3.append("null");
            }
        }
        sb3.append("}}");
        return sb3.toString();
    }

    void tzroggbefp() {
        jlmebxxoox(5);
    }

    public void u(String str, int i13) {
        jztzpxfvev(new vdvldrhtss(str, -1, i13), false);
    }

    void ulzqkzuiru() {
        Z();
        kegysxyocb(this.f9104pmvmpeiblj);
    }

    public boolean v() {
        return x(null, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void vdvldrhtss(iwizpuwonk iwizpuwonkVar, androidx.fragment.app.zdlpuopuiu zdlpuopuiuVar, Fragment fragment) {
        String str;
        androidx.lifecycle.vdvldrhtss vdvldrhtssVar;
        if (this.f9078cqumvgiudr != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f9078cqumvgiudr = iwizpuwonkVar;
        this.f9083esjtqupxsv = zdlpuopuiuVar;
        this.f9096lereixgezr = fragment;
        if (fragment != null) {
            wflxmlrfwp(new nufgyqmvbu(fragment));
        } else if (iwizpuwonkVar instanceof wwaezpbzkn) {
            wflxmlrfwp((wwaezpbzkn) iwizpuwonkVar);
        }
        if (this.f9096lereixgezr != null) {
            Z();
        }
        if (iwizpuwonkVar instanceof androidx.activity.lereixgezr) {
            androidx.activity.lereixgezr lereixgezrVar = (androidx.activity.lereixgezr) iwizpuwonkVar;
            androidx.activity.iwizpuwonk onBackPressedDispatcher = lereixgezrVar.getOnBackPressedDispatcher();
            this.f9098lqeggnwhkg = onBackPressedDispatcher;
            if (fragment != null) {
                vdvldrhtssVar = lereixgezrVar;
                vdvldrhtssVar = fragment;
            }
            vdvldrhtssVar = lereixgezrVar;
            onBackPressedDispatcher.dxjokdxxww(vdvldrhtssVar, this.f9075btonecajqb);
        }
        if (fragment != null) {
            this.f9095kegysxyocb = fragment.mFragmentManager.uawqvzlxes(fragment);
        } else if (iwizpuwonkVar instanceof ribwqtqdhb) {
            this.f9095kegysxyocb = lmojexxdyd.zdlpuopuiu(((ribwqtqdhb) iwizpuwonkVar).getViewModelStore());
        } else {
            this.f9095kegysxyocb = new lmojexxdyd(false);
        }
        this.f9095kegysxyocb.esjtqupxsv(d());
        this.f9105ppxfxbqfkf.pmvmpeiblj(this.f9095kegysxyocb);
        Object obj = this.f9078cqumvgiudr;
        if ((obj instanceof q5.dxjokdxxww) && fragment == null) {
            q5.gxszxtbevo savedStateRegistry = ((q5.dxjokdxxww) obj).getSavedStateRegistry();
            savedStateRegistry.ppxfxbqfkf("android:support:fragments", new q5.gxszxtbevo.zoijcleaow() { // from class: androidx.fragment.app.cdpycssgdh
                @Override // q5.gxszxtbevo.zoijcleaow
                public final Bundle iobyxmoadg() {
                    return this.f9187iobyxmoadg.e();
                }
            });
            Bundle bundleIobyxmoadg = savedStateRegistry.iobyxmoadg("android:support:fragments");
            if (bundleIobyxmoadg != null) {
                I(bundleIobyxmoadg);
            }
        }
        Object obj2 = this.f9078cqumvgiudr;
        if (obj2 instanceof eablkybsjg.wkgbmnqykc) {
            eablkybsjg.ppxfxbqfkf activityResultRegistry = ((eablkybsjg.wkgbmnqykc) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + StringUtils.PROCESS_POSTFIX_DELIMITER;
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f9089iozdgvuglv = activityResultRegistry.btonecajqb(str2 + "StartActivityForResult", new gxszxtbevo.lqeggnwhkg(), new dxjokdxxww());
            this.f9097lmojexxdyd = activityResultRegistry.btonecajqb(str2 + "StartIntentSenderForResult", new draadjrbmk(), new btonecajqb());
            this.f9112wwaezpbzkn = activityResultRegistry.btonecajqb(str2 + "RequestPermissions", new gxszxtbevo.gxszxtbevo(), new iobyxmoadg());
        }
        Object obj3 = this.f9078cqumvgiudr;
        if (obj3 instanceof androidx.core.content.zoijcleaow) {
            ((androidx.core.content.zoijcleaow) obj3).addOnConfigurationChangedListener(this.f9102oxmwwwfdhm);
        }
        Object obj4 = this.f9078cqumvgiudr;
        if (obj4 instanceof androidx.core.content.ppxfxbqfkf) {
            ((androidx.core.content.ppxfxbqfkf) obj4).addOnTrimMemoryListener(this.f9094kcexrzcfyt);
        }
        Object obj5 = this.f9078cqumvgiudr;
        if (obj5 instanceof androidx.core.app.vdvldrhtss) {
            ((androidx.core.app.vdvldrhtss) obj5).addOnMultiWindowModeChangedListener(this.f9117zdlpuopuiu);
        }
        Object obj6 = this.f9078cqumvgiudr;
        if (obj6 instanceof androidx.core.app.oxmwwwfdhm) {
            ((androidx.core.app.oxmwwwfdhm) obj6).addOnPictureInPictureModeChangedListener(this.f9115yggfygwlhe);
        }
        Object obj7 = this.f9078cqumvgiudr;
        if ((obj7 instanceof v1.cqumvgiudr) && fragment == null) {
            ((v1.cqumvgiudr) obj7).addMenuProvider(this.f9093jyumaefscl);
        }
    }

    void vipkmwdibw() {
        jlmebxxoox(2);
    }

    public boolean w(int i13, int i14) {
        if (i13 >= 0) {
            return x(null, i13, i14);
        }
        throw new IllegalArgumentException("Bad id: " + i13);
    }

    public void wflxmlrfwp(wwaezpbzkn wwaezpbzknVar) {
        this.f9109vdvldrhtss.add(wwaezpbzknVar);
    }

    LayoutInflater.Factory2 wizcaqwiak() {
        return this.f9085gxszxtbevo;
    }

    void wwaezpbzkn() {
        this.f9086hcddaimhww = false;
        this.f9092jpowsppfya = false;
        this.f9095kegysxyocb.esjtqupxsv(false);
        jlmebxxoox(1);
    }

    boolean wypolnanlu(MenuItem menuItem) {
        if (this.f9091iwizpuwonk < 1) {
            return false;
        }
        for (Fragment fragment : this.f9105ppxfxbqfkf.ojitshcjhn()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean y(ArrayList arrayList, ArrayList arrayList2, String str, int i13, int i14) {
        int iSflfametgt = sflfametgt(str, i13, (i14 & 1) != 0);
        if (iSflfametgt < 0) {
            return false;
        }
        for (int size = this.f9111wkgbmnqykc.size() - 1; size >= iSflfametgt; size--) {
            arrayList.add((androidx.fragment.app.iobyxmoadg) this.f9111wkgbmnqykc.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void yadqdtsiqt() {
        this.f9086hcddaimhww = false;
        this.f9092jpowsppfya = false;
        this.f9095kegysxyocb.esjtqupxsv(false);
        jlmebxxoox(0);
    }

    Fragment ydmasvzmpa(String str) {
        return this.f9105ppxfxbqfkf.gxszxtbevo(str);
    }

    public boolean yfnezrywwk() {
        boolean zMetgxyhuhe = metgxyhuhe(true);
        weqkydbzbr();
        return zMetgxyhuhe;
    }

    boolean yggfygwlhe() {
        boolean zYzdjzghtvl = false;
        for (Fragment fragment : this.f9105ppxfxbqfkf.draadjrbmk()) {
            if (fragment != null) {
                zYzdjzghtvl = yzdjzghtvl(fragment);
            }
            if (zYzdjzghtvl) {
                return true;
            }
        }
        return false;
    }

    boolean ylkuphrtab(Menu menu, MenuInflater menuInflater) {
        if (this.f9091iwizpuwonk < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z13 = false;
        for (Fragment fragment : this.f9105ppxfxbqfkf.ojitshcjhn()) {
            if (fragment != null && a(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z13 = true;
            }
        }
        if (this.f9082eablkybsjg != null) {
            for (int i13 = 0; i13 < this.f9082eablkybsjg.size(); i13++) {
                Fragment fragment2 = (Fragment) this.f9082eablkybsjg.get(i13);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f9082eablkybsjg = arrayList;
        return z13;
    }

    boolean z(ArrayList arrayList, ArrayList arrayList2) {
        if (rhgxfdycjh(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f9088iobyxmoadg);
        }
        if (this.f9111wkgbmnqykc.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList arrayList3 = this.f9111wkgbmnqykc;
        androidx.fragment.app.iobyxmoadg iobyxmoadgVar = (androidx.fragment.app.iobyxmoadg) arrayList3.get(arrayList3.size() - 1);
        this.f9100nufgyqmvbu = iobyxmoadgVar;
        Iterator it = iobyxmoadgVar.f9256ppxfxbqfkf.iterator();
        while (it.hasNext()) {
            Fragment fragment = ((jpowsppfya.iobyxmoadg) it.next()).f9270zoijcleaow;
            if (fragment != null) {
                fragment.mTransitioning = true;
            }
        }
        return y(arrayList, arrayList2, null, -1, 0);
    }

    void zdlpuopuiu() {
        if (rhgxfdycjh(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f9100nufgyqmvbu);
        }
        androidx.fragment.app.iobyxmoadg iobyxmoadgVar = this.f9100nufgyqmvbu;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.f9235yggfygwlhe = false;
            iobyxmoadgVar.pmvmpeiblj();
            this.f9100nufgyqmvbu.kcexrzcfyt(true, new Runnable() { // from class: androidx.fragment.app.yadqdtsiqt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9414zdlpuopuiu.f();
                }
            });
            this.f9100nufgyqmvbu.dxjokdxxww();
            this.f9081dxjokdxxww = true;
            yfnezrywwk();
            this.f9081dxjokdxxww = false;
            this.f9100nufgyqmvbu = null;
        }
    }

    public Fragment zfvoamnweg(int i13) {
        return this.f9105ppxfxbqfkf.lqeggnwhkg(i13);
    }

    pkzmftpjix zynmafqrjb(Fragment fragment) {
        pkzmftpjix pkzmftpjixVarAgtfadlqog = this.f9105ppxfxbqfkf.agtfadlqog(fragment.mWho);
        if (pkzmftpjixVarAgtfadlqog != null) {
            return pkzmftpjixVarAgtfadlqog;
        }
        pkzmftpjix pkzmftpjixVar = new pkzmftpjix(this.f9106rgvfuqvkyq, this.f9105ppxfxbqfkf, fragment);
        pkzmftpjixVar.ojitshcjhn(this.f9078cqumvgiudr.gxszxtbevo().getClassLoader());
        pkzmftpjixVar.zdlpuopuiu(this.f9091iwizpuwonk);
        return pkzmftpjixVar;
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f9120yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        String f9121zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i13) {
                return new LaunchedFragmentInfo[i13];
            }
        }

        LaunchedFragmentInfo(String str, int i13) {
            this.f9121zdlpuopuiu = str;
            this.f9120yggfygwlhe = i13;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeString(this.f9121zdlpuopuiu);
            parcel.writeInt(this.f9120yggfygwlhe);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f9121zdlpuopuiu = parcel.readString();
            this.f9120yggfygwlhe = parcel.readInt();
        }
    }
}
