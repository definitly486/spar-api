package vd;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import yj.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f116509iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f116510zoijcleaow = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: vd.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2905iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final yj.iobyxmoadg f116511iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private vd.zoijcleaow f116512zoijcleaow;

        public C2905iobyxmoadg(yj.iobyxmoadg mutex, vd.zoijcleaow zoijcleaowVar) {
            zdlpuopuiu.btonecajqb(mutex, "mutex");
            this.f116511iobyxmoadg = mutex;
            this.f116512zoijcleaow = zoijcleaowVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2905iobyxmoadg)) {
                return false;
            }
            C2905iobyxmoadg c2905iobyxmoadg = (C2905iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f116511iobyxmoadg, c2905iobyxmoadg.f116511iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116512zoijcleaow, c2905iobyxmoadg.f116512zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f116511iobyxmoadg.hashCode() * 31;
            vd.zoijcleaow zoijcleaowVar = this.f116512zoijcleaow;
            return iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode());
        }

        public final yj.iobyxmoadg iobyxmoadg() {
            return this.f116511iobyxmoadg;
        }

        public final void ppxfxbqfkf(vd.zoijcleaow zoijcleaowVar) {
            this.f116512zoijcleaow = zoijcleaowVar;
        }

        public String toString() {
            return "Dependency(mutex=" + this.f116511iobyxmoadg + ", subscriber=" + this.f116512zoijcleaow + ')';
        }

        public final vd.zoijcleaow zoijcleaow() {
            return this.f116512zoijcleaow;
        }

        public /* synthetic */ C2905iobyxmoadg(yj.iobyxmoadg iobyxmoadgVar, vd.zoijcleaow zoijcleaowVar, int i13, gtknphoqwx gtknphoqwxVar) {
            this(iobyxmoadgVar, (i13 & 2) != 0 ? null : zoijcleaowVar);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f116513cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        Object f116514esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f116515iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f116516jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        /* synthetic */ Object f116517lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f116519yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f116520zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        int f116521zynmafqrjb;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116517lereixgezr = obj;
            this.f116521zynmafqrjb |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(this);
        }
    }

    private iobyxmoadg() {
    }

    public static final void eablkybsjg(vd.zoijcleaow subscriber) {
        zdlpuopuiu.btonecajqb(subscriber, "subscriber");
        vd.zoijcleaow.iobyxmoadg iobyxmoadgVarZoijcleaow = subscriber.zoijcleaow();
        C2905iobyxmoadg c2905iobyxmoadgZoijcleaow = f116509iobyxmoadg.zoijcleaow(iobyxmoadgVarZoijcleaow);
        if (c2905iobyxmoadgZoijcleaow.zoijcleaow() != null) {
            Log.d("SessionsDependencies", "Subscriber " + iobyxmoadgVarZoijcleaow + " already registered.");
            return;
        }
        c2905iobyxmoadgZoijcleaow.ppxfxbqfkf(subscriber);
        Log.d("SessionsDependencies", "Subscriber " + iobyxmoadgVarZoijcleaow + " registered.");
        yj.iobyxmoadg.C3196iobyxmoadg.ppxfxbqfkf(c2905iobyxmoadgZoijcleaow.iobyxmoadg(), null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void iobyxmoadg(vd.zoijcleaow.iobyxmoadg subscriberName) {
        zdlpuopuiu.btonecajqb(subscriberName, "subscriberName");
        if (subscriberName == vd.zoijcleaow.iobyxmoadg.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map dependencies = f116510zoijcleaow;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
            return;
        }
        zdlpuopuiu.dxjokdxxww(dependencies, "dependencies");
        dependencies.put(subscriberName, new C2905iobyxmoadg(lqeggnwhkg.iobyxmoadg(true), null, 2, 0 == true ? 1 : 0));
        Log.d("SessionsDependencies", "Dependency to " + subscriberName + " added.");
    }

    private final C2905iobyxmoadg zoijcleaow(vd.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        Map dependencies = f116510zoijcleaow;
        zdlpuopuiu.dxjokdxxww(dependencies, "dependencies");
        Object obj = dependencies.get(iobyxmoadgVar);
        if (obj != null) {
            zdlpuopuiu.dxjokdxxww(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C2905iobyxmoadg) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + iobyxmoadgVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ppxfxbqfkf(lg.gxszxtbevo r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof vd.iobyxmoadg.zoijcleaow
            if (r0 == 0) goto L13
            r0 = r11
            vd.iobyxmoadg$zoijcleaow r0 = (vd.iobyxmoadg.zoijcleaow) r0
            int r1 = r0.f116521zynmafqrjb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116521zynmafqrjb = r1
            goto L18
        L13:
            vd.iobyxmoadg$zoijcleaow r0 = new vd.iobyxmoadg$zoijcleaow
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f116517lereixgezr
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f116521zynmafqrjb
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f116514esjtqupxsv
            java.lang.Object r5 = r0.f116513cqumvgiudr
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f116515iwizpuwonk
            yj.iobyxmoadg r6 = (yj.iobyxmoadg) r6
            java.lang.Object r7 = r0.f116516jyumaefscl
            vd.zoijcleaow$iobyxmoadg r7 = (vd.zoijcleaow.iobyxmoadg) r7
            java.lang.Object r8 = r0.f116519yggfygwlhe
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f116520zdlpuopuiu
            java.util.Map r9 = (java.util.Map) r9
            gg.zdlpuopuiu.zoijcleaow(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            gg.zdlpuopuiu.zoijcleaow(r11)
            java.util.Map r11 = vd.iobyxmoadg.f116510zoijcleaow
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = hg.tzroggbefp.eablkybsjg(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            vd.zoijcleaow$iobyxmoadg r7 = (vd.zoijcleaow.iobyxmoadg) r7
            java.lang.Object r11 = r11.getValue()
            vd.iobyxmoadg$iobyxmoadg r11 = (vd.iobyxmoadg.C2905iobyxmoadg) r11
            yj.iobyxmoadg r6 = r11.iobyxmoadg()
            r0.f116520zdlpuopuiu = r5
            r0.f116519yggfygwlhe = r8
            r0.f116516jyumaefscl = r7
            r0.f116515iwizpuwonk = r6
            r0.f116513cqumvgiudr = r5
            r0.f116514esjtqupxsv = r2
            r0.f116521zynmafqrjb = r3
            java.lang.Object r11 = r6.iobyxmoadg(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            vd.iobyxmoadg r11 = vd.iobyxmoadg.f116509iobyxmoadg     // Catch: java.lang.Throwable -> Lb0
            vd.zoijcleaow r11 = r11.wkgbmnqykc(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.eablkybsjg(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.eablkybsjg(r4)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.iobyxmoadg.ppxfxbqfkf(lg.gxszxtbevo):java.lang.Object");
    }

    public final vd.zoijcleaow wkgbmnqykc(vd.zoijcleaow.iobyxmoadg subscriberName) {
        zdlpuopuiu.btonecajqb(subscriberName, "subscriberName");
        vd.zoijcleaow zoijcleaowVarZoijcleaow = zoijcleaow(subscriberName).zoijcleaow();
        if (zoijcleaowVarZoijcleaow != null) {
            return zoijcleaowVarZoijcleaow;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
