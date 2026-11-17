package n5;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import hg.ikoacuggdj;
import hg.tzroggbefp;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oxmwwwfdhm {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final ppxfxbqfkf f68837ojitshcjhn = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final Map f68838agtfadlqog;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private n5.ppxfxbqfkf f68843gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f68844gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected volatile u5.lqeggnwhkg f68845iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f68846lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    protected List f68847nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Executor f68848ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final Map f68849wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private u5.nufgyqmvbu f68850wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Executor f68851zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.room.wkgbmnqykc f68842eablkybsjg = vdvldrhtss();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private Map f68841dxjokdxxww = new LinkedHashMap();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ReentrantReadWriteLock f68839btonecajqb = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ThreadLocal f68840draadjrbmk = new ThreadLocal();

    public static class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f68852iobyxmoadg = new LinkedHashMap();

        /* JADX WARN: Code duplicated, block: B:10:0x0019  */
        /* JADX WARN: Code duplicated, block: B:11:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x002c  */
        /* JADX WARN: Code duplicated, block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:0x005f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:40:0x0036 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:9:0x0017 A[DONT_INVERT] */
        private final List eablkybsjg(List list, boolean z13, int i13, int i14) {
            TreeMap treeMap;
            Set setKeySet;
            Iterator it;
            boolean z14;
            Integer targetVersion;
            int i15;
            int iIntValue;
            int iIntValue2;
            do {
                if (!z13) {
                    if (i13 <= i14) {
                        return list;
                    }
                    treeMap = (TreeMap) this.f68852iobyxmoadg.get(Integer.valueOf(i13));
                    if (treeMap == null) {
                        if (z13) {
                            setKeySet = treeMap.descendingKeySet();
                        } else {
                            setKeySet = treeMap.keySet();
                        }
                        it = setKeySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z14 = false;
                                break;
                                break;
                            }
                            targetVersion = (Integer) it.next();
                            if (!z13) {
                                i15 = i13 + 1;
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(targetVersion, "targetVersion");
                                iIntValue = targetVersion.intValue();
                                if (i15 <= iIntValue) {
                                    continue;
                                }
                            } else {
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(targetVersion, "targetVersion");
                                iIntValue2 = targetVersion.intValue();
                                if (i14 <= iIntValue2) {
                                    continue;
                                }
                            }
                        }
                    } else {
                        return null;
                    }
                } else {
                    if (i13 >= i14) {
                        return list;
                    }
                    treeMap = (TreeMap) this.f68852iobyxmoadg.get(Integer.valueOf(i13));
                    if (treeMap == null) {
                        if (z13) {
                            setKeySet = treeMap.descendingKeySet();
                        } else {
                            setKeySet = treeMap.keySet();
                        }
                        it = setKeySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z14 = false;
                                break;
                            }
                            targetVersion = (Integer) it.next();
                            if (!z13) {
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(targetVersion, "targetVersion");
                                iIntValue2 = targetVersion.intValue();
                                if (i14 <= iIntValue2 && iIntValue2 < i13) {
                                    Object obj = treeMap.get(targetVersion);
                                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
                                    list.add(obj);
                                    i13 = targetVersion.intValue();
                                    z14 = true;
                                    break;
                                    break;
                                }
                            } else {
                                i15 = i13 + 1;
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(targetVersion, "targetVersion");
                                iIntValue = targetVersion.intValue();
                                if (i15 <= iIntValue && iIntValue <= i14) {
                                    Object obj2 = treeMap.get(targetVersion);
                                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj2);
                                    list.add(obj2);
                                    i13 = targetVersion.intValue();
                                    z14 = true;
                                    break;
                                }
                            }
                        }
                    } else {
                        return null;
                    }
                }
            } while (z14);
            return null;
        }

        private final void iobyxmoadg(o5.zoijcleaow zoijcleaowVar) {
            int i13 = zoijcleaowVar.f72062iobyxmoadg;
            int i14 = zoijcleaowVar.f72063zoijcleaow;
            Map map = this.f68852iobyxmoadg;
            Integer numValueOf = Integer.valueOf(i13);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i14))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i14)) + " with " + zoijcleaowVar);
            }
            treeMap2.put(Integer.valueOf(i14), zoijcleaowVar);
        }

        public Map gxszxtbevo() {
            return this.f68852iobyxmoadg;
        }

        public final boolean ppxfxbqfkf(int i13, int i14) {
            Map mapGxszxtbevo = gxszxtbevo();
            if (!mapGxszxtbevo.containsKey(Integer.valueOf(i13))) {
                return false;
            }
            Map mapDxjokdxxww = (Map) mapGxszxtbevo.get(Integer.valueOf(i13));
            if (mapDxjokdxxww == null) {
                mapDxjokdxxww = tzroggbefp.dxjokdxxww();
            }
            return mapDxjokdxxww.containsKey(Integer.valueOf(i14));
        }

        public List wkgbmnqykc(int i13, int i14) {
            if (i13 == i14) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            return eablkybsjg(new ArrayList(), i14 > i13, i13, i14);
        }

        public void zoijcleaow(o5.zoijcleaow... migrations) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(migrations, "migrations");
            for (o5.zoijcleaow zoijcleaowVar : migrations) {
                iobyxmoadg(zoijcleaowVar);
            }
        }
    }

    public static abstract class gxszxtbevo {
    }

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private boolean f68853agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private boolean f68854btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private Intent f68855draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private u5.nufgyqmvbu.ppxfxbqfkf f68856dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f68857eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private wkgbmnqykc f68858gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private List f68859gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f68860iobyxmoadg;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Callable f68861jyumaefscl;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        private Set f68862kcexrzcfyt;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private Executor f68863lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private Executor f68864nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private long f68865ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        private Set f68866oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f68867ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private TimeUnit f68868rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private final eablkybsjg f68869vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private boolean f68870wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f68871wkgbmnqykc;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private File f68872yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private String f68873zdlpuopuiu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Class f68874zoijcleaow;

        public iobyxmoadg(Context context, Class klass, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(klass, "klass");
            this.f68860iobyxmoadg = context;
            this.f68874zoijcleaow = klass;
            this.f68867ppxfxbqfkf = str;
            this.f68871wkgbmnqykc = new ArrayList();
            this.f68857eablkybsjg = new ArrayList();
            this.f68859gxszxtbevo = new ArrayList();
            this.f68858gtknphoqwx = wkgbmnqykc.AUTOMATIC;
            this.f68870wflxmlrfwp = true;
            this.f68865ojitshcjhn = -1L;
            this.f68869vdvldrhtss = new eablkybsjg();
            this.f68866oxmwwwfdhm = new LinkedHashSet();
        }

        public iobyxmoadg eablkybsjg() {
            this.f68870wflxmlrfwp = false;
            this.f68853agtfadlqog = true;
            return this;
        }

        public iobyxmoadg gxszxtbevo(int... startVersions) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(startVersions, "startVersions");
            for (int i13 : startVersions) {
                this.f68866oxmwwwfdhm.add(Integer.valueOf(i13));
            }
            return this;
        }

        public iobyxmoadg iobyxmoadg(zoijcleaow callback) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
            this.f68871wkgbmnqykc.add(callback);
            return this;
        }

        public iobyxmoadg lqeggnwhkg(u5.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f68856dxjokdxxww = ppxfxbqfkfVar;
            return this;
        }

        public iobyxmoadg nufgyqmvbu(Executor executor) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(executor, "executor");
            this.f68863lqeggnwhkg = executor;
            return this;
        }

        public iobyxmoadg ppxfxbqfkf() {
            this.f68854btonecajqb = true;
            return this;
        }

        public oxmwwwfdhm wkgbmnqykc() {
            Executor executor = this.f68863lqeggnwhkg;
            if (executor == null && this.f68864nufgyqmvbu == null) {
                Executor executorLqeggnwhkg = wflxmlrfwp.ppxfxbqfkf.lqeggnwhkg();
                this.f68864nufgyqmvbu = executorLqeggnwhkg;
                this.f68863lqeggnwhkg = executorLqeggnwhkg;
            } else if (executor != null && this.f68864nufgyqmvbu == null) {
                this.f68864nufgyqmvbu = executor;
            } else if (executor == null) {
                this.f68863lqeggnwhkg = this.f68864nufgyqmvbu;
            }
            Set set = this.f68862kcexrzcfyt;
            if (set != null) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (this.f68866oxmwwwfdhm.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            u5.nufgyqmvbu.ppxfxbqfkf esjtqupxsvVar = this.f68856dxjokdxxww;
            if (esjtqupxsvVar == null) {
                esjtqupxsvVar = new v5.gxszxtbevo();
            }
            if (esjtqupxsvVar != null) {
                if (this.f68865ojitshcjhn > 0) {
                    if (this.f68867ppxfxbqfkf == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j13 = this.f68865ojitshcjhn;
                    TimeUnit timeUnit = this.f68868rgvfuqvkyq;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f68863lqeggnwhkg;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    esjtqupxsvVar = new n5.eablkybsjg(esjtqupxsvVar, new n5.ppxfxbqfkf(j13, timeUnit, executor2));
                }
                String str = this.f68873zdlpuopuiu;
                if (str != null || this.f68872yggfygwlhe != null || this.f68861jyumaefscl != null) {
                    if (this.f68867ppxfxbqfkf == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i13 = str == null ? 0 : 1;
                    File file = this.f68872yggfygwlhe;
                    int i14 = file == null ? 0 : 1;
                    Callable callable = this.f68861jyumaefscl;
                    if (i13 + i14 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    esjtqupxsvVar = new esjtqupxsv(str, file, callable, esjtqupxsvVar);
                }
            } else {
                esjtqupxsvVar = null;
            }
            u5.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar = esjtqupxsvVar;
            if (ppxfxbqfkfVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f68860iobyxmoadg;
            String str2 = this.f68867ppxfxbqfkf;
            eablkybsjg eablkybsjgVar = this.f68869vdvldrhtss;
            List list = this.f68871wkgbmnqykc;
            boolean z13 = this.f68854btonecajqb;
            wkgbmnqykc wkgbmnqykcVarLqeggnwhkg = this.f68858gtknphoqwx.lqeggnwhkg(context);
            Executor executor3 = this.f68863lqeggnwhkg;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f68864nufgyqmvbu;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            n5.lqeggnwhkg lqeggnwhkgVar = new n5.lqeggnwhkg(context, str2, ppxfxbqfkfVar, eablkybsjgVar, list, z13, wkgbmnqykcVarLqeggnwhkg, executor3, executor4, this.f68855draadjrbmk, this.f68870wflxmlrfwp, this.f68853agtfadlqog, this.f68866oxmwwwfdhm, this.f68873zdlpuopuiu, this.f68872yggfygwlhe, this.f68861jyumaefscl, null, this.f68857eablkybsjg, this.f68859gxszxtbevo);
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) vdvldrhtss.zoijcleaow(this.f68874zoijcleaow, "_Impl");
            oxmwwwfdhmVar.yadqdtsiqt(lqeggnwhkgVar);
            return oxmwwwfdhmVar;
        }

        public iobyxmoadg zoijcleaow(o5.zoijcleaow... migrations) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(migrations, "migrations");
            if (this.f68862kcexrzcfyt == null) {
                this.f68862kcexrzcfyt = new HashSet();
            }
            for (o5.zoijcleaow zoijcleaowVar : migrations) {
                Set set = this.f68862kcexrzcfyt;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(set);
                set.add(Integer.valueOf(zoijcleaowVar.f72062iobyxmoadg));
                Set set2 = this.f68862kcexrzcfyt;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(set2);
                set2.add(Integer.valueOf(zoijcleaowVar.f72063zoijcleaow));
            }
            this.f68869vdvldrhtss.zoijcleaow((o5.zoijcleaow[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }
    }

    static final class lqeggnwhkg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        lqeggnwhkg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u5.lqeggnwhkg it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            oxmwwwfdhm.this.iozdgvuglv();
            return null;
        }
    }

    static final class nufgyqmvbu extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        nufgyqmvbu() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u5.lqeggnwhkg it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            oxmwwwfdhm.this.lmojexxdyd();
            return null;
        }
    }

    public static final class ppxfxbqfkf {
        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private ppxfxbqfkf() {
        }
    }

    public enum wkgbmnqykc {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean wkgbmnqykc(ActivityManager activityManager) {
            return u5.ppxfxbqfkf.zoijcleaow(activityManager);
        }

        public final wkgbmnqykc lqeggnwhkg(Context context) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || wkgbmnqykc(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static abstract class zoijcleaow {
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        }

        public void ppxfxbqfkf(u5.lqeggnwhkg db3) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        }

        public void zoijcleaow(u5.lqeggnwhkg db3) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        }
    }

    public oxmwwwfdhm() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f68849wflxmlrfwp = mapSynchronizedMap;
        this.f68838agtfadlqog = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iozdgvuglv() {
        wflxmlrfwp();
        u5.lqeggnwhkg writableDatabase = cqumvgiudr().getWritableDatabase();
        iwizpuwonk().iwizpuwonk(writableDatabase);
        if (writableDatabase.d0()) {
            writableDatabase.ikoacuggdj();
        } else {
            writableDatabase.oxmwwwfdhm();
        }
    }

    public static /* synthetic */ Cursor jpowsppfya(oxmwwwfdhm oxmwwwfdhmVar, u5.btonecajqb btonecajqbVar, CancellationSignal cancellationSignal, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i13 & 2) != 0) {
            cancellationSignal = null;
        }
        return oxmwwwfdhmVar.hcddaimhww(btonecajqbVar, cancellationSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lmojexxdyd() {
        cqumvgiudr().getWritableDatabase().uwvvkdfqfp();
        if (cdpycssgdh()) {
            return;
        }
        iwizpuwonk().ojitshcjhn();
    }

    private final Object wypolnanlu(Class cls, u5.nufgyqmvbu nufgyqmvbuVar) {
        if (cls.isInstance(nufgyqmvbuVar)) {
            return nufgyqmvbuVar;
        }
        if (nufgyqmvbuVar instanceof n5.nufgyqmvbu) {
            return wypolnanlu(cls, ((n5.nufgyqmvbu) nufgyqmvbuVar).iobyxmoadg());
        }
        return null;
    }

    public void agtfadlqog() {
        if (!cdpycssgdh() && this.f68840draadjrbmk.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public boolean cdpycssgdh() {
        return cqumvgiudr().getWritableDatabase().S();
    }

    public void cllcsxoeiz(Runnable body) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(body, "body");
        ojitshcjhn();
        try {
            body.run();
            dsvhmnatus();
        } finally {
            kcexrzcfyt();
        }
    }

    public u5.nufgyqmvbu cqumvgiudr() {
        u5.nufgyqmvbu nufgyqmvbuVar = this.f68850wkgbmnqykc;
        if (nufgyqmvbuVar != null) {
            return nufgyqmvbuVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("internalOpenHelper");
        return null;
    }

    public void dsvhmnatus() {
        cqumvgiudr().getWritableDatabase().vipkmwdibw();
    }

    public Executor esjtqupxsv() {
        Executor executor = this.f68851zoijcleaow;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("internalQueryExecutor");
        return null;
    }

    public Cursor hcddaimhww(u5.btonecajqb query, CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
        wflxmlrfwp();
        agtfadlqog();
        return cancellationSignal != null ? cqumvgiudr().getWritableDatabase().l(query, cancellationSignal) : cqumvgiudr().getWritableDatabase().c0(query);
    }

    public Object hkdspvbjdz(Callable body) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(body, "body");
        ojitshcjhn();
        try {
            Object objCall = body.call();
            dsvhmnatus();
            return objCall;
        } finally {
            kcexrzcfyt();
        }
    }

    public Executor istkbnxepw() {
        Executor executor = this.f68848ppxfxbqfkf;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("internalTransactionExecutor");
        return null;
    }

    public androidx.room.wkgbmnqykc iwizpuwonk() {
        return this.f68842eablkybsjg;
    }

    public final Lock jyumaefscl() {
        ReentrantReadWriteLock.ReadLock lock = this.f68839btonecajqb.readLock();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lock, "readWriteLock.readLock()");
        return lock;
    }

    public void kcexrzcfyt() {
        n5.ppxfxbqfkf ppxfxbqfkfVar = this.f68843gtknphoqwx;
        if (ppxfxbqfkfVar == null) {
            lmojexxdyd();
        } else {
            ppxfxbqfkfVar.lqeggnwhkg(new nufgyqmvbu());
        }
    }

    public Set lereixgezr() {
        return ikoacuggdj.eablkybsjg();
    }

    public void ojitshcjhn() {
        wflxmlrfwp();
        n5.ppxfxbqfkf ppxfxbqfkfVar = this.f68843gtknphoqwx;
        if (ppxfxbqfkfVar == null) {
            iozdgvuglv();
        } else {
            ppxfxbqfkfVar.lqeggnwhkg(new lqeggnwhkg());
        }
    }

    protected abstract u5.nufgyqmvbu oxmwwwfdhm(n5.lqeggnwhkg lqeggnwhkgVar);

    public final boolean pkzmftpjix() {
        u5.lqeggnwhkg lqeggnwhkgVar = this.f68845iobyxmoadg;
        return lqeggnwhkgVar != null && lqeggnwhkgVar.isOpen();
    }

    protected Map pmvmpeiblj() {
        return tzroggbefp.dxjokdxxww();
    }

    public u5.gtknphoqwx rgvfuqvkyq(String sql) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sql, "sql");
        wflxmlrfwp();
        agtfadlqog();
        return cqumvgiudr().getWritableDatabase().k(sql);
    }

    protected abstract androidx.room.wkgbmnqykc vdvldrhtss();

    public void wflxmlrfwp() {
        if (!this.f68844gxszxtbevo && ylkuphrtab()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    protected void wwaezpbzkn(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        iwizpuwonk().draadjrbmk(db3);
    }

    public void yadqdtsiqt(n5.lqeggnwhkg configuration) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
        this.f68850wkgbmnqykc = oxmwwwfdhm(configuration);
        Set setLereixgezr = lereixgezr();
        BitSet bitSet = new BitSet();
        Iterator it = setLereixgezr.iterator();
        while (true) {
            int i13 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = configuration.f68829oxmwwwfdhm.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i14 = size - 1;
                        if (cls.isAssignableFrom(configuration.f68829oxmwwwfdhm.get(size).getClass())) {
                            bitSet.set(size);
                            i13 = size;
                            break;
                        } else if (i14 < 0) {
                            break;
                        } else {
                            size = i14;
                        }
                    }
                }
                if (i13 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f68841dxjokdxxww.put(cls, configuration.f68829oxmwwwfdhm.get(i13));
            } else {
                int size2 = configuration.f68829oxmwwwfdhm.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i15 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i15 < 0) {
                            break;
                        } else {
                            size2 = i15;
                        }
                    }
                }
                for (o5.zoijcleaow zoijcleaowVar : zdlpuopuiu(this.f68841dxjokdxxww)) {
                    if (!configuration.f68834wkgbmnqykc.ppxfxbqfkf(zoijcleaowVar.f72062iobyxmoadg, zoijcleaowVar.f72063zoijcleaow)) {
                        configuration.f68834wkgbmnqykc.zoijcleaow(zoijcleaowVar);
                    }
                }
                cqumvgiudr cqumvgiudrVar = (cqumvgiudr) wypolnanlu(cqumvgiudr.class, cqumvgiudr());
                if (cqumvgiudrVar != null) {
                    cqumvgiudrVar.nufgyqmvbu(configuration);
                }
                n5.wkgbmnqykc wkgbmnqykcVar = (n5.wkgbmnqykc) wypolnanlu(n5.wkgbmnqykc.class, cqumvgiudr());
                if (wkgbmnqykcVar != null) {
                    this.f68843gtknphoqwx = wkgbmnqykcVar.f68901yggfygwlhe;
                    iwizpuwonk().oxmwwwfdhm(wkgbmnqykcVar.f68901yggfygwlhe);
                }
                boolean z13 = configuration.f68826lqeggnwhkg == wkgbmnqykc.WRITE_AHEAD_LOGGING;
                cqumvgiudr().setWriteAheadLoggingEnabled(z13);
                this.f68847nufgyqmvbu = configuration.f68821eablkybsjg;
                this.f68851zoijcleaow = configuration.f68827nufgyqmvbu;
                this.f68848ppxfxbqfkf = new zynmafqrjb(configuration.f68820dxjokdxxww);
                this.f68844gxszxtbevo = configuration.f68823gxszxtbevo;
                this.f68846lqeggnwhkg = z13;
                if (configuration.f68818btonecajqb != null) {
                    if (configuration.f68835zoijcleaow == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    iwizpuwonk().kcexrzcfyt(configuration.f68824iobyxmoadg, configuration.f68835zoijcleaow, configuration.f68818btonecajqb);
                }
                Map mapPmvmpeiblj = pmvmpeiblj();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mapPmvmpeiblj.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = configuration.f68832vdvldrhtss.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i16 = size3 - 1;
                            if (cls3.isAssignableFrom(configuration.f68832vdvldrhtss.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                if (i16 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i16;
                            }
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f68838agtfadlqog.put(cls3, configuration.f68832vdvldrhtss.get(size3));
                    }
                }
                int size4 = configuration.f68832vdvldrhtss.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i17 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f68832vdvldrhtss.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i17 < 0) {
                        return;
                    } else {
                        size4 = i17;
                    }
                }
            }
        }
    }

    public final Map yggfygwlhe() {
        return this.f68849wflxmlrfwp;
    }

    public final boolean ylkuphrtab() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public List zdlpuopuiu(Map autoMigrationSpecs) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(autoMigrationSpecs, "autoMigrationSpecs");
        return hg.jyumaefscl.wflxmlrfwp();
    }

    public final ThreadLocal zynmafqrjb() {
        return this.f68840draadjrbmk;
    }
}
