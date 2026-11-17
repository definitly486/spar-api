package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes2.dex */
public class wflxmlrfwp {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final long f24800btonecajqb = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    static final int[] f24801gtknphoqwx = {2, 4, 8, 16, 32, 64, UserVerificationMethods.USER_VERIFY_PATTERN, UserVerificationMethods.USER_VERIFY_HANDPRINT};

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Map f24802dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Random f24803eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gxszxtbevo f24804gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final uc.eablkybsjg f24805iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ConfigFetchHttpClient f24806lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final rgvfuqvkyq f24807nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Executor f24808ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Clock f24809wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tc.zoijcleaow f24810zoijcleaow;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Date f24811iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lqeggnwhkg f24812ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f24813wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f24814zoijcleaow;

        private iobyxmoadg(Date date, int i13, lqeggnwhkg lqeggnwhkgVar, String str) {
            this.f24811iobyxmoadg = date;
            this.f24814zoijcleaow = i13;
            this.f24812ppxfxbqfkf = lqeggnwhkgVar;
            this.f24813wkgbmnqykc = str;
        }

        public static iobyxmoadg iobyxmoadg(Date date, lqeggnwhkg lqeggnwhkgVar) {
            return new iobyxmoadg(date, 1, lqeggnwhkgVar, null);
        }

        public static iobyxmoadg ppxfxbqfkf(Date date) {
            return new iobyxmoadg(date, 2, null, null);
        }

        public static iobyxmoadg zoijcleaow(lqeggnwhkg lqeggnwhkgVar, String str) {
            return new iobyxmoadg(lqeggnwhkgVar.nufgyqmvbu(), 0, lqeggnwhkgVar, str);
        }

        String eablkybsjg() {
            return this.f24813wkgbmnqykc;
        }

        int gxszxtbevo() {
            return this.f24814zoijcleaow;
        }

        public lqeggnwhkg wkgbmnqykc() {
            return this.f24812ppxfxbqfkf;
        }
    }

    public enum zoijcleaow {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f24818zdlpuopuiu;

        zoijcleaow(String str) {
            this.f24818zdlpuopuiu = str;
        }

        String wkgbmnqykc() {
            return this.f24818zdlpuopuiu;
        }
    }

    public wflxmlrfwp(uc.eablkybsjg eablkybsjgVar, tc.zoijcleaow zoijcleaowVar, Executor executor, Clock clock, Random random, gxszxtbevo gxszxtbevoVar, ConfigFetchHttpClient configFetchHttpClient, rgvfuqvkyq rgvfuqvkyqVar, Map map) {
        this.f24805iobyxmoadg = eablkybsjgVar;
        this.f24810zoijcleaow = zoijcleaowVar;
        this.f24808ppxfxbqfkf = executor;
        this.f24809wkgbmnqykc = clock;
        this.f24803eablkybsjg = random;
        this.f24804gxszxtbevo = gxszxtbevoVar;
        this.f24806lqeggnwhkg = configFetchHttpClient;
        this.f24807nufgyqmvbu = rgvfuqvkyqVar;
        this.f24802dxjokdxxww = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task cqumvgiudr(Date date, Task task) {
        istkbnxepw(task, date);
        return task;
    }

    private Task draadjrbmk(String str, String str2, Date date, Map map) {
        try {
            final iobyxmoadg iobyxmoadgVarGtknphoqwx = gtknphoqwx(str, str2, date, map);
            return iobyxmoadgVarGtknphoqwx.gxszxtbevo() != 0 ? Tasks.forResult(iobyxmoadgVarGtknphoqwx) : this.f24804gxszxtbevo.gtknphoqwx(iobyxmoadgVarGtknphoqwx.wkgbmnqykc()).onSuccessTask(this.f24808ppxfxbqfkf, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.draadjrbmk
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return wflxmlrfwp.jyumaefscl(iobyxmoadgVarGtknphoqwx, (lqeggnwhkg) obj);
                }
            });
        } catch (FirebaseRemoteConfigException e13) {
            return Tasks.forException(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task esjtqupxsv(Map map, Task task) {
        return yggfygwlhe(task, 0L, map);
    }

    private iobyxmoadg gtknphoqwx(String str, String str2, Date date, Map map) throws FirebaseRemoteConfigException {
        try {
            iobyxmoadg iobyxmoadgVarFetch = this.f24806lqeggnwhkg.fetch(this.f24806lqeggnwhkg.wkgbmnqykc(), str, str2, kcexrzcfyt(), this.f24807nufgyqmvbu.wkgbmnqykc(), map, rgvfuqvkyq(), date);
            if (iobyxmoadgVarFetch.wkgbmnqykc() != null) {
                this.f24807nufgyqmvbu.agtfadlqog(iobyxmoadgVarFetch.wkgbmnqykc().gtknphoqwx());
            }
            if (iobyxmoadgVarFetch.eablkybsjg() != null) {
                this.f24807nufgyqmvbu.wflxmlrfwp(iobyxmoadgVarFetch.eablkybsjg());
            }
            this.f24807nufgyqmvbu.dxjokdxxww();
            return iobyxmoadgVarFetch;
        } catch (FirebaseRemoteConfigServerException e13) {
            rgvfuqvkyq.iobyxmoadg iobyxmoadgVarPmvmpeiblj = pmvmpeiblj(e13.iobyxmoadg(), date);
            if (lereixgezr(iobyxmoadgVarPmvmpeiblj, e13.iobyxmoadg())) {
                throw new FirebaseRemoteConfigFetchThrottledException(iobyxmoadgVarPmvmpeiblj.iobyxmoadg().getTime());
            }
            throw lqeggnwhkg(e13);
        }
    }

    private boolean gxszxtbevo(long j13, Date date) {
        Date dateEablkybsjg = this.f24807nufgyqmvbu.eablkybsjg();
        if (dateEablkybsjg.equals(rgvfuqvkyq.f24778eablkybsjg)) {
            return false;
        }
        return date.before(new Date(dateEablkybsjg.getTime() + TimeUnit.SECONDS.toMillis(j13)));
    }

    private void istkbnxepw(Task task, Date date) {
        if (task.isSuccessful()) {
            this.f24807nufgyqmvbu.vdvldrhtss(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f24807nufgyqmvbu.oxmwwwfdhm();
        } else {
            this.f24807nufgyqmvbu.rgvfuqvkyq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task iwizpuwonk(Task task, Task task2, Date date, Map map, Task task3) {
        if (task.isSuccessful()) {
            return !task2.isSuccessful() ? Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException())) : draadjrbmk((String) task.getResult(), ((com.google.firebase.installations.gxszxtbevo) task2.getResult()).zoijcleaow(), date, map);
        }
        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task jyumaefscl(iobyxmoadg iobyxmoadgVar, lqeggnwhkg lqeggnwhkgVar) {
        return Tasks.forResult(iobyxmoadgVar);
    }

    private Map kcexrzcfyt() {
        HashMap map = new HashMap();
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(this.f24810zoijcleaow.get());
        return map;
    }

    private boolean lereixgezr(rgvfuqvkyq.iobyxmoadg iobyxmoadgVar, int i13) {
        return iobyxmoadgVar.zoijcleaow() > 1 || i13 == 429;
    }

    private FirebaseRemoteConfigServerException lqeggnwhkg(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int iIobyxmoadg = firebaseRemoteConfigServerException.iobyxmoadg();
        if (iIobyxmoadg == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iIobyxmoadg == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iIobyxmoadg == 429) {
                throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iIobyxmoadg != 500) {
                switch (iIobyxmoadg) {
                    case 502:
                    case OkHttpErrorHandlerImpl.HTTP_UNAVAILABLE /* 503 */:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.iobyxmoadg(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String nufgyqmvbu(long j13) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j13)));
    }

    private Date ojitshcjhn(Date date) {
        Date dateIobyxmoadg = this.f24807nufgyqmvbu.iobyxmoadg().iobyxmoadg();
        if (date.before(dateIobyxmoadg)) {
            return dateIobyxmoadg;
        }
        return null;
    }

    private rgvfuqvkyq.iobyxmoadg pmvmpeiblj(int i13, Date date) {
        if (zdlpuopuiu(i13)) {
            zynmafqrjb(date);
        }
        return this.f24807nufgyqmvbu.iobyxmoadg();
    }

    private Long rgvfuqvkyq() {
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(this.f24810zoijcleaow.get());
        return null;
    }

    private long vdvldrhtss(int i13) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f24801gtknphoqwx;
        long millis = timeUnit.toMillis(iArr[Math.min(i13, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f24803eablkybsjg.nextInt((int) millis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public Task yggfygwlhe(Task task, long j13, final Map map) {
        Task taskContinueWithTask;
        final Date date = new Date(this.f24809wkgbmnqykc.currentTimeMillis());
        if (task.isSuccessful() && gxszxtbevo(j13, date)) {
            return Tasks.forResult(iobyxmoadg.ppxfxbqfkf(date));
        }
        Date dateOjitshcjhn = ojitshcjhn(date);
        if (dateOjitshcjhn != null) {
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(nufgyqmvbu(dateOjitshcjhn.getTime() - date.getTime()), dateOjitshcjhn.getTime()));
        } else {
            final Task id2 = this.f24805iobyxmoadg.getId();
            final Task taskIobyxmoadg = this.f24805iobyxmoadg.iobyxmoadg(false);
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, taskIobyxmoadg}).continueWithTask(this.f24808ppxfxbqfkf, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.dxjokdxxww
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return this.f24720iobyxmoadg.iwizpuwonk(id2, taskIobyxmoadg, date, map, task2);
                }
            });
        }
        return taskContinueWithTask.continueWithTask(this.f24808ppxfxbqfkf, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.btonecajqb
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return this.f24714iobyxmoadg.cqumvgiudr(date, task2);
            }
        });
    }

    private boolean zdlpuopuiu(int i13) {
        return i13 == 429 || i13 == 502 || i13 == 503 || i13 == 504;
    }

    private void zynmafqrjb(Date date) {
        int iZoijcleaow = this.f24807nufgyqmvbu.iobyxmoadg().zoijcleaow() + 1;
        this.f24807nufgyqmvbu.gtknphoqwx(iZoijcleaow, new Date(date.getTime() + vdvldrhtss(iZoijcleaow)));
    }

    public Task agtfadlqog(zoijcleaow zoijcleaowVar, int i13) {
        final HashMap map = new HashMap(this.f24802dxjokdxxww);
        map.put("X-Firebase-RC-Fetch-Type", zoijcleaowVar.wkgbmnqykc() + CardDateFormatTextWatcher.DIVIDER_CHARACTER + i13);
        return this.f24804gxszxtbevo.eablkybsjg().continueWithTask(this.f24808ppxfxbqfkf, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.gtknphoqwx
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f24727iobyxmoadg.esjtqupxsv(map, task);
            }
        });
    }

    public Task btonecajqb(final long j13) {
        final HashMap map = new HashMap(this.f24802dxjokdxxww);
        map.put("X-Firebase-RC-Fetch-Type", zoijcleaow.BASE.wkgbmnqykc() + CardDateFormatTextWatcher.DIVIDER_CHARACTER + 1);
        return this.f24804gxszxtbevo.eablkybsjg().continueWithTask(this.f24808ppxfxbqfkf, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.nufgyqmvbu
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f24765iobyxmoadg.yggfygwlhe(j13, map, task);
            }
        });
    }

    public Task dxjokdxxww() {
        return btonecajqb(this.f24807nufgyqmvbu.lqeggnwhkg());
    }

    public long oxmwwwfdhm() {
        return this.f24807nufgyqmvbu.gxszxtbevo();
    }
}
