package androidx.room;

import androidx.lifecycle.cqumvgiudr;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.zdlpuopuiu;
import n5.draadjrbmk;
import n5.oxmwwwfdhm;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg extends cqumvgiudr {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final boolean f13225agtfadlqog;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final oxmwwwfdhm f13226draadjrbmk;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final AtomicBoolean f13227kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final Callable f13228ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final AtomicBoolean f13229oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final wkgbmnqykc.ppxfxbqfkf f13230rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final AtomicBoolean f13231vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f13232wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Runnable f13233yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Runnable f13234zdlpuopuiu;

    public static final class iobyxmoadg extends wkgbmnqykc.ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f13235zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(String[] strArr, lqeggnwhkg lqeggnwhkgVar) {
            super(strArr);
            this.f13235zoijcleaow = lqeggnwhkgVar;
        }

        @Override // androidx.room.wkgbmnqykc.ppxfxbqfkf
        public void ppxfxbqfkf(Set tables) {
            zdlpuopuiu.btonecajqb(tables, "tables");
            wflxmlrfwp.ppxfxbqfkf.nufgyqmvbu().zoijcleaow(this.f13235zoijcleaow.oxmwwwfdhm());
        }
    }

    public lqeggnwhkg(oxmwwwfdhm database, draadjrbmk container, boolean z13, Callable computeFunction, String[] tableNames) {
        zdlpuopuiu.btonecajqb(database, "database");
        zdlpuopuiu.btonecajqb(container, "container");
        zdlpuopuiu.btonecajqb(computeFunction, "computeFunction");
        zdlpuopuiu.btonecajqb(tableNames, "tableNames");
        this.f13226draadjrbmk = database;
        this.f13232wflxmlrfwp = container;
        this.f13225agtfadlqog = z13;
        this.f13228ojitshcjhn = computeFunction;
        this.f13230rgvfuqvkyq = new iobyxmoadg(tableNames, this);
        this.f13231vdvldrhtss = new AtomicBoolean(true);
        this.f13229oxmwwwfdhm = new AtomicBoolean(false);
        this.f13227kcexrzcfyt = new AtomicBoolean(false);
        this.f13234zdlpuopuiu = new Runnable() { // from class: n5.jyumaefscl
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.lqeggnwhkg.yggfygwlhe(this.f68811zdlpuopuiu);
            }
        };
        this.f13233yggfygwlhe = new Runnable() { // from class: n5.iwizpuwonk
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.lqeggnwhkg.zdlpuopuiu(this.f68810zdlpuopuiu);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0034 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void yggfygwlhe(androidx.room.lqeggnwhkg r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(r5, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f13227kcexrzcfyt
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L1a
            n5.oxmwwwfdhm r0 = r5.f13226draadjrbmk
            androidx.room.wkgbmnqykc r0 = r0.iwizpuwonk()
            androidx.room.wkgbmnqykc$ppxfxbqfkf r3 = r5.f13230rgvfuqvkyq
            r0.wkgbmnqykc(r3)
        L1a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f13229oxmwwwfdhm
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L50
            r0 = 0
            r3 = r1
        L24:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.f13231vdvldrhtss     // Catch: java.lang.Throwable -> L34
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L3f
            java.util.concurrent.Callable r0 = r5.f13228ojitshcjhn     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r3 = r2
            goto L24
        L34:
            r0 = move-exception
            goto L4a
        L36:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "Exception while computing database live data."
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L34
            throw r2     // Catch: java.lang.Throwable -> L34
        L3f:
            if (r3 == 0) goto L44
            r5.wflxmlrfwp(r0)     // Catch: java.lang.Throwable -> L34
        L44:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f13229oxmwwwfdhm
            r0.set(r1)
            goto L51
        L4a:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f13229oxmwwwfdhm
            r5.set(r1)
            throw r0
        L50:
            r3 = r1
        L51:
            if (r3 == 0) goto L5b
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f13231vdvldrhtss
            boolean r0 = r0.get()
            if (r0 != 0) goto L1a
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.lqeggnwhkg.yggfygwlhe(androidx.room.lqeggnwhkg):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(lqeggnwhkg this$0) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        boolean zNufgyqmvbu = this$0.nufgyqmvbu();
        if (this$0.f13231vdvldrhtss.compareAndSet(false, true) && zNufgyqmvbu) {
            this$0.kcexrzcfyt().execute(this$0.f13234zdlpuopuiu);
        }
    }

    @Override // androidx.lifecycle.cqumvgiudr
    protected void draadjrbmk() {
        super.draadjrbmk();
        draadjrbmk draadjrbmkVar = this.f13232wflxmlrfwp;
        zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        draadjrbmkVar.ppxfxbqfkf(this);
    }

    @Override // androidx.lifecycle.cqumvgiudr
    protected void gtknphoqwx() {
        super.gtknphoqwx();
        draadjrbmk draadjrbmkVar = this.f13232wflxmlrfwp;
        zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        draadjrbmkVar.zoijcleaow(this);
        kcexrzcfyt().execute(this.f13234zdlpuopuiu);
    }

    public final Executor kcexrzcfyt() {
        return this.f13225agtfadlqog ? this.f13226draadjrbmk.istkbnxepw() : this.f13226draadjrbmk.esjtqupxsv();
    }

    public final Runnable oxmwwwfdhm() {
        return this.f13233yggfygwlhe;
    }
}
