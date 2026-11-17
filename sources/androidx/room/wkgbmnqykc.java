package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.cqumvgiudr;
import gg.wwaezpbzkn;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import n5.draadjrbmk;
import n5.oxmwwwfdhm;
import u5.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final Object f13243agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final zoijcleaow f13244btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final agtfadlqog.zoijcleaow f13245draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private volatile gtknphoqwx f13246dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String[] f13247eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f13248gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private n5.ppxfxbqfkf f13249gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f13250iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final AtomicBoolean f13251lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private volatile boolean f13252nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final Object f13253ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f13254ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final Runnable f13255rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private androidx.room.eablkybsjg f13256wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f13257wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f13258zoijcleaow;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final iobyxmoadg f13242vdvldrhtss = new iobyxmoadg(null);

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final String[] f13241oxmwwwfdhm = {"UPDATE", "DELETE", "INSERT"};

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final WeakReference f13259ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wkgbmnqykc f13260zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(wkgbmnqykc tracker, ppxfxbqfkf delegate) {
            super(delegate.iobyxmoadg());
            zdlpuopuiu.btonecajqb(tracker, "tracker");
            zdlpuopuiu.btonecajqb(delegate, "delegate");
            this.f13260zoijcleaow = tracker;
            this.f13259ppxfxbqfkf = new WeakReference(delegate);
        }

        @Override // androidx.room.wkgbmnqykc.ppxfxbqfkf
        public void ppxfxbqfkf(Set tables) {
            zdlpuopuiu.btonecajqb(tables, "tables");
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f13259ppxfxbqfkf.get();
            if (ppxfxbqfkfVar == null) {
                this.f13260zoijcleaow.rgvfuqvkyq(this);
            } else {
                ppxfxbqfkfVar.ppxfxbqfkf(tables);
            }
        }
    }

    public static final class gxszxtbevo implements Runnable {
        gxszxtbevo() {
        }

        private final Set iobyxmoadg() {
            wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
            Set setZoijcleaow = ikoacuggdj.zoijcleaow();
            Cursor cursorJpowsppfya = oxmwwwfdhm.jpowsppfya(wkgbmnqykcVar.nufgyqmvbu(), new u5.iobyxmoadg("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorJpowsppfya.moveToNext()) {
                try {
                    setZoijcleaow.add(Integer.valueOf(cursorJpowsppfya.getInt(0)));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        rg.zoijcleaow.iobyxmoadg(cursorJpowsppfya, th2);
                        throw th3;
                    }
                }
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            rg.zoijcleaow.iobyxmoadg(cursorJpowsppfya, null);
            Set setIobyxmoadg = ikoacuggdj.iobyxmoadg(setZoijcleaow);
            if (!setIobyxmoadg.isEmpty()) {
                if (wkgbmnqykc.this.lqeggnwhkg() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                gtknphoqwx gtknphoqwxVarLqeggnwhkg = wkgbmnqykc.this.lqeggnwhkg();
                if (gtknphoqwxVarLqeggnwhkg == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                gtknphoqwxVarLqeggnwhkg.pkzmftpjix();
            }
            return setIobyxmoadg;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set setEablkybsjg;
            n5.ppxfxbqfkf ppxfxbqfkfVar;
            Lock lockJyumaefscl = wkgbmnqykc.this.nufgyqmvbu().jyumaefscl();
            lockJyumaefscl.lock();
            try {
                try {
                    if (!wkgbmnqykc.this.gxszxtbevo()) {
                        lockJyumaefscl.unlock();
                        n5.ppxfxbqfkf ppxfxbqfkfVar2 = wkgbmnqykc.this.f13249gxszxtbevo;
                        if (ppxfxbqfkfVar2 != null) {
                            ppxfxbqfkfVar2.eablkybsjg();
                            return;
                        }
                        return;
                    }
                    if (!wkgbmnqykc.this.btonecajqb().compareAndSet(true, false)) {
                        lockJyumaefscl.unlock();
                        n5.ppxfxbqfkf ppxfxbqfkfVar3 = wkgbmnqykc.this.f13249gxszxtbevo;
                        if (ppxfxbqfkfVar3 != null) {
                            ppxfxbqfkfVar3.eablkybsjg();
                            return;
                        }
                        return;
                    }
                    if (wkgbmnqykc.this.nufgyqmvbu().cdpycssgdh()) {
                        lockJyumaefscl.unlock();
                        n5.ppxfxbqfkf ppxfxbqfkfVar4 = wkgbmnqykc.this.f13249gxszxtbevo;
                        if (ppxfxbqfkfVar4 != null) {
                            ppxfxbqfkfVar4.eablkybsjg();
                            return;
                        }
                        return;
                    }
                    u5.lqeggnwhkg writableDatabase = wkgbmnqykc.this.nufgyqmvbu().cqumvgiudr().getWritableDatabase();
                    writableDatabase.ikoacuggdj();
                    try {
                        setEablkybsjg = iobyxmoadg();
                        writableDatabase.vipkmwdibw();
                        writableDatabase.uwvvkdfqfp();
                        lockJyumaefscl.unlock();
                        ppxfxbqfkfVar = wkgbmnqykc.this.f13249gxszxtbevo;
                        if (ppxfxbqfkfVar != null) {
                            ppxfxbqfkfVar.eablkybsjg();
                        }
                        if (setEablkybsjg.isEmpty()) {
                            return;
                        }
                        agtfadlqog.zoijcleaow zoijcleaowVarDxjokdxxww = wkgbmnqykc.this.dxjokdxxww();
                        wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                        synchronized (zoijcleaowVarDxjokdxxww) {
                            try {
                                Iterator it = wkgbmnqykcVar.dxjokdxxww().iterator();
                                while (it.hasNext()) {
                                    ((C0191wkgbmnqykc) ((Map.Entry) it.next()).getValue()).zoijcleaow(setEablkybsjg);
                                }
                                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        writableDatabase.uwvvkdfqfp();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    lockJyumaefscl.unlock();
                    n5.ppxfxbqfkf ppxfxbqfkfVar5 = wkgbmnqykc.this.f13249gxszxtbevo;
                    if (ppxfxbqfkfVar5 != null) {
                        ppxfxbqfkfVar5.eablkybsjg();
                    }
                    throw th4;
                }
            } catch (SQLiteException e13) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e13);
                setEablkybsjg = ikoacuggdj.eablkybsjg();
                lockJyumaefscl.unlock();
                ppxfxbqfkfVar = wkgbmnqykc.this.f13249gxszxtbevo;
                if (ppxfxbqfkfVar != null) {
                }
            } catch (IllegalStateException e14) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e14);
                setEablkybsjg = ikoacuggdj.eablkybsjg();
                lockJyumaefscl.unlock();
                ppxfxbqfkfVar = wkgbmnqykc.this.f13249gxszxtbevo;
                if (ppxfxbqfkfVar != null) {
                }
            }
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final void iobyxmoadg(u5.lqeggnwhkg database) {
            zdlpuopuiu.btonecajqb(database, "database");
            if (database.d0()) {
                database.ikoacuggdj();
            } else {
                database.oxmwwwfdhm();
            }
        }

        public final String zoijcleaow(String tableName, String triggerType) {
            zdlpuopuiu.btonecajqb(tableName, "tableName");
            zdlpuopuiu.btonecajqb(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private iobyxmoadg() {
        }
    }

    public static abstract class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String[] f13262iobyxmoadg;

        public ppxfxbqfkf(String[] tables) {
            zdlpuopuiu.btonecajqb(tables, "tables");
            this.f13262iobyxmoadg = tables;
        }

        public final String[] iobyxmoadg() {
            return this.f13262iobyxmoadg;
        }

        public abstract void ppxfxbqfkf(Set set);

        public boolean zoijcleaow() {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.room.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0191wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ppxfxbqfkf f13263iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String[] f13264ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Set f13265wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int[] f13266zoijcleaow;

        public C0191wkgbmnqykc(ppxfxbqfkf observer, int[] tableIds, String[] tableNames) {
            zdlpuopuiu.btonecajqb(observer, "observer");
            zdlpuopuiu.btonecajqb(tableIds, "tableIds");
            zdlpuopuiu.btonecajqb(tableNames, "tableNames");
            this.f13263iobyxmoadg = observer;
            this.f13266zoijcleaow = tableIds;
            this.f13264ppxfxbqfkf = tableNames;
            this.f13265wkgbmnqykc = !(tableNames.length == 0) ? ikoacuggdj.wkgbmnqykc(tableNames[0]) : ikoacuggdj.eablkybsjg();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] iobyxmoadg() {
            return this.f13266zoijcleaow;
        }

        public final void ppxfxbqfkf(String[] tables) {
            Set setEablkybsjg;
            zdlpuopuiu.btonecajqb(tables, "tables");
            int length = this.f13264ppxfxbqfkf.length;
            if (length == 0) {
                setEablkybsjg = ikoacuggdj.eablkybsjg();
            } else if (length == 1) {
                int length2 = tables.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        setEablkybsjg = ikoacuggdj.eablkybsjg();
                        break;
                    } else {
                        if (kcexrzcfyt.istkbnxepw(tables[i13], this.f13264ppxfxbqfkf[0], true)) {
                            setEablkybsjg = this.f13265wkgbmnqykc;
                            break;
                        }
                        i13++;
                    }
                }
            } else {
                Set setZoijcleaow = ikoacuggdj.zoijcleaow();
                for (String str : tables) {
                    for (String str2 : this.f13264ppxfxbqfkf) {
                        if (kcexrzcfyt.istkbnxepw(str2, str, true)) {
                            setZoijcleaow.add(str2);
                        }
                    }
                }
                setEablkybsjg = ikoacuggdj.iobyxmoadg(setZoijcleaow);
            }
            if (setEablkybsjg.isEmpty()) {
                return;
            }
            this.f13263iobyxmoadg.ppxfxbqfkf(setEablkybsjg);
        }

        public final void zoijcleaow(Set invalidatedTablesIds) {
            Set setEablkybsjg;
            zdlpuopuiu.btonecajqb(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f13266zoijcleaow;
            int length = iArr.length;
            if (length != 0) {
                int i13 = 0;
                if (length != 1) {
                    Set setZoijcleaow = ikoacuggdj.zoijcleaow();
                    int[] iArr2 = this.f13266zoijcleaow;
                    int length2 = iArr2.length;
                    int i14 = 0;
                    while (i13 < length2) {
                        int i15 = i14 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i13]))) {
                            setZoijcleaow.add(this.f13264ppxfxbqfkf[i14]);
                        }
                        i13++;
                        i14 = i15;
                    }
                    setEablkybsjg = ikoacuggdj.iobyxmoadg(setZoijcleaow);
                } else {
                    setEablkybsjg = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f13265wkgbmnqykc : ikoacuggdj.eablkybsjg();
                }
            } else {
                setEablkybsjg = ikoacuggdj.eablkybsjg();
            }
            if (setEablkybsjg.isEmpty()) {
                return;
            }
            this.f13263iobyxmoadg.ppxfxbqfkf(setEablkybsjg);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final iobyxmoadg f13267eablkybsjg = new iobyxmoadg(null);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final long[] f13268iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int[] f13269ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f13270wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean[] f13271zoijcleaow;

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private iobyxmoadg() {
            }
        }

        public zoijcleaow(int i13) {
            this.f13268iobyxmoadg = new long[i13];
            this.f13271zoijcleaow = new boolean[i13];
            this.f13269ppxfxbqfkf = new int[i13];
        }

        public final int[] iobyxmoadg() {
            synchronized (this) {
                try {
                    if (!this.f13270wkgbmnqykc) {
                        return null;
                    }
                    long[] jArr = this.f13268iobyxmoadg;
                    int length = jArr.length;
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < length) {
                        int i15 = i14 + 1;
                        int i16 = 1;
                        boolean z13 = jArr[i13] > 0;
                        boolean[] zArr = this.f13271zoijcleaow;
                        if (z13 != zArr[i14]) {
                            int[] iArr = this.f13269ppxfxbqfkf;
                            if (!z13) {
                                i16 = 2;
                            }
                            iArr[i14] = i16;
                        } else {
                            this.f13269ppxfxbqfkf[i14] = 0;
                        }
                        zArr[i14] = z13;
                        i13++;
                        i14 = i15;
                    }
                    this.f13270wkgbmnqykc = false;
                    return (int[]) this.f13269ppxfxbqfkf.clone();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean ppxfxbqfkf(int... tableIds) {
            boolean z13;
            zdlpuopuiu.btonecajqb(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z13 = false;
                    for (int i13 : tableIds) {
                        long[] jArr = this.f13268iobyxmoadg;
                        long j13 = jArr[i13];
                        jArr[i13] = j13 - 1;
                        if (j13 == 1) {
                            this.f13270wkgbmnqykc = true;
                            z13 = true;
                        }
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z13;
        }

        public final void wkgbmnqykc() {
            synchronized (this) {
                Arrays.fill(this.f13271zoijcleaow, false);
                this.f13270wkgbmnqykc = true;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public final boolean zoijcleaow(int... tableIds) {
            boolean z13;
            zdlpuopuiu.btonecajqb(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z13 = false;
                    for (int i13 : tableIds) {
                        long[] jArr = this.f13268iobyxmoadg;
                        long j13 = jArr[i13];
                        jArr[i13] = 1 + j13;
                        if (j13 == 0) {
                            this.f13270wkgbmnqykc = true;
                            z13 = true;
                        }
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z13;
        }
    }

    public wkgbmnqykc(oxmwwwfdhm database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String lowerCase;
        zdlpuopuiu.btonecajqb(database, "database");
        zdlpuopuiu.btonecajqb(shadowTablesMap, "shadowTablesMap");
        zdlpuopuiu.btonecajqb(viewTables, "viewTables");
        zdlpuopuiu.btonecajqb(tableNames, "tableNames");
        this.f13250iobyxmoadg = database;
        this.f13258zoijcleaow = shadowTablesMap;
        this.f13254ppxfxbqfkf = viewTables;
        this.f13251lqeggnwhkg = new AtomicBoolean(false);
        this.f13244btonecajqb = new zoijcleaow(tableNames.length);
        this.f13248gtknphoqwx = new draadjrbmk(database);
        this.f13245draadjrbmk = new agtfadlqog.zoijcleaow();
        this.f13243agtfadlqog = new Object();
        this.f13253ojitshcjhn = new Object();
        this.f13257wkgbmnqykc = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i13 = 0; i13 < length; i13++) {
            String str = tableNames[i13];
            Locale US = Locale.US;
            zdlpuopuiu.dxjokdxxww(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            zdlpuopuiu.dxjokdxxww(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f13257wkgbmnqykc.put(lowerCase2, Integer.valueOf(i13));
            String str2 = (String) this.f13258zoijcleaow.get(tableNames[i13]);
            if (str2 != null) {
                zdlpuopuiu.dxjokdxxww(US, "US");
                lowerCase = str2.toLowerCase(US);
                zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i13] = lowerCase2;
        }
        this.f13247eablkybsjg = strArr;
        for (Map.Entry entry : this.f13258zoijcleaow.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            zdlpuopuiu.dxjokdxxww(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            zdlpuopuiu.dxjokdxxww(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f13257wkgbmnqykc.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                zdlpuopuiu.dxjokdxxww(US2, "US");
                String lowerCase4 = str4.toLowerCase(US2);
                zdlpuopuiu.dxjokdxxww(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f13257wkgbmnqykc;
                map.put(lowerCase4, tzroggbefp.btonecajqb(map, lowerCase3));
            }
        }
        this.f13255rgvfuqvkyq = new gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void agtfadlqog() {
        synchronized (this.f13253ojitshcjhn) {
            this.f13252nufgyqmvbu = false;
            this.f13244btonecajqb.wkgbmnqykc();
            gtknphoqwx gtknphoqwxVar = this.f13246dxjokdxxww;
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.close();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
        }
    }

    private final String[] cqumvgiudr(String[] strArr) {
        String[] strArrVdvldrhtss = vdvldrhtss(strArr);
        for (String str : strArrVdvldrhtss) {
            Map map = this.f13257wkgbmnqykc;
            Locale US = Locale.US;
            zdlpuopuiu.dxjokdxxww(US, "US");
            String lowerCase = str.toLowerCase(US);
            zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return strArrVdvldrhtss;
    }

    private final String[] vdvldrhtss(String[] strArr) {
        Set setZoijcleaow = ikoacuggdj.zoijcleaow();
        for (String str : strArr) {
            Map map = this.f13254ppxfxbqfkf;
            Locale US = Locale.US;
            zdlpuopuiu.dxjokdxxww(US, "US");
            String lowerCase = str.toLowerCase(US);
            zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f13254ppxfxbqfkf;
                zdlpuopuiu.dxjokdxxww(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                zdlpuopuiu.dxjokdxxww(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                zdlpuopuiu.lqeggnwhkg(obj);
                setZoijcleaow.addAll((Collection) obj);
            } else {
                setZoijcleaow.add(str);
            }
        }
        return (String[]) ikoacuggdj.iobyxmoadg(setZoijcleaow).toArray(new String[0]);
    }

    private final void yggfygwlhe(u5.lqeggnwhkg lqeggnwhkgVar, int i13) {
        String str = this.f13247eablkybsjg[i13];
        for (String str2 : f13241oxmwwwfdhm) {
            String str3 = "DROP TRIGGER IF EXISTS " + f13242vdvldrhtss.zoijcleaow(str, str2);
            zdlpuopuiu.dxjokdxxww(str3, "StringBuilder().apply(builderAction).toString()");
            lqeggnwhkgVar.lmojexxdyd(str3);
        }
    }

    private final void zdlpuopuiu(u5.lqeggnwhkg lqeggnwhkgVar, int i13) {
        lqeggnwhkgVar.lmojexxdyd("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i13 + ", 0)");
        String str = this.f13247eablkybsjg[i13];
        for (String str2 : f13241oxmwwwfdhm) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f13242vdvldrhtss.zoijcleaow(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i13 + " AND invalidated = 0; END";
            zdlpuopuiu.dxjokdxxww(str3, "StringBuilder().apply(builderAction).toString()");
            lqeggnwhkgVar.lmojexxdyd(str3);
        }
    }

    public final AtomicBoolean btonecajqb() {
        return this.f13251lqeggnwhkg;
    }

    public final void draadjrbmk(u5.lqeggnwhkg database) {
        zdlpuopuiu.btonecajqb(database, "database");
        synchronized (this.f13253ojitshcjhn) {
            if (this.f13252nufgyqmvbu) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.lmojexxdyd("PRAGMA temp_store = MEMORY;");
            database.lmojexxdyd("PRAGMA recursive_triggers='ON';");
            database.lmojexxdyd("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            iwizpuwonk(database);
            this.f13246dxjokdxxww = database.k("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f13252nufgyqmvbu = true;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public final agtfadlqog.zoijcleaow dxjokdxxww() {
        return this.f13245draadjrbmk;
    }

    public cqumvgiudr eablkybsjg(String[] tableNames, boolean z13, Callable computeFunction) {
        zdlpuopuiu.btonecajqb(tableNames, "tableNames");
        zdlpuopuiu.btonecajqb(computeFunction, "computeFunction");
        return this.f13248gtknphoqwx.iobyxmoadg(cqumvgiudr(tableNames), z13, computeFunction);
    }

    public final Map gtknphoqwx() {
        return this.f13257wkgbmnqykc;
    }

    public final boolean gxszxtbevo() {
        if (!this.f13250iobyxmoadg.pkzmftpjix()) {
            return false;
        }
        if (!this.f13252nufgyqmvbu) {
            this.f13250iobyxmoadg.cqumvgiudr().getWritableDatabase();
        }
        if (this.f13252nufgyqmvbu) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void iwizpuwonk(u5.lqeggnwhkg database) {
        zdlpuopuiu.btonecajqb(database, "database");
        if (database.S()) {
            return;
        }
        try {
            Lock lockJyumaefscl = this.f13250iobyxmoadg.jyumaefscl();
            lockJyumaefscl.lock();
            try {
                synchronized (this.f13243agtfadlqog) {
                    int[] iArrIobyxmoadg = this.f13244btonecajqb.iobyxmoadg();
                    if (iArrIobyxmoadg == null) {
                        lockJyumaefscl.unlock();
                        return;
                    }
                    f13242vdvldrhtss.iobyxmoadg(database);
                    try {
                        int length = iArrIobyxmoadg.length;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < length) {
                            int i15 = iArrIobyxmoadg[i13];
                            int i16 = i14 + 1;
                            if (i15 == 1) {
                                zdlpuopuiu(database, i14);
                            } else if (i15 == 2) {
                                yggfygwlhe(database, i14);
                            }
                            i13++;
                            i14 = i16;
                        }
                        database.vipkmwdibw();
                        database.uwvvkdfqfp();
                        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                        lockJyumaefscl.unlock();
                    } catch (Throwable th2) {
                        database.uwvvkdfqfp();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                lockJyumaefscl.unlock();
                throw th3;
            }
        } catch (SQLiteException e13) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e13);
        } catch (IllegalStateException e14) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e14);
        }
    }

    public final void jyumaefscl() {
        if (this.f13250iobyxmoadg.pkzmftpjix()) {
            iwizpuwonk(this.f13250iobyxmoadg.cqumvgiudr().getWritableDatabase());
        }
    }

    public final void kcexrzcfyt(Context context, String name, Intent serviceIntent) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(serviceIntent, "serviceIntent");
        this.f13256wflxmlrfwp = new androidx.room.eablkybsjg(context, name, serviceIntent, this, this.f13250iobyxmoadg.esjtqupxsv());
    }

    public final gtknphoqwx lqeggnwhkg() {
        return this.f13246dxjokdxxww;
    }

    public final oxmwwwfdhm nufgyqmvbu() {
        return this.f13250iobyxmoadg;
    }

    public void ojitshcjhn() {
        if (this.f13251lqeggnwhkg.compareAndSet(false, true)) {
            n5.ppxfxbqfkf ppxfxbqfkfVar = this.f13249gxszxtbevo;
            if (ppxfxbqfkfVar != null) {
                ppxfxbqfkfVar.btonecajqb();
            }
            this.f13250iobyxmoadg.esjtqupxsv().execute(this.f13255rgvfuqvkyq);
        }
    }

    public final void oxmwwwfdhm(n5.ppxfxbqfkf autoCloser) {
        zdlpuopuiu.btonecajqb(autoCloser, "autoCloser");
        this.f13249gxszxtbevo = autoCloser;
        autoCloser.draadjrbmk(new Runnable() { // from class: n5.wflxmlrfwp
            @Override // java.lang.Runnable
            public final void run() {
                this.f68899zdlpuopuiu.agtfadlqog();
            }
        });
    }

    public void ppxfxbqfkf(ppxfxbqfkf observer) {
        C0191wkgbmnqykc c0191wkgbmnqykc;
        zdlpuopuiu.btonecajqb(observer, "observer");
        String[] strArrVdvldrhtss = vdvldrhtss(observer.iobyxmoadg());
        ArrayList arrayList = new ArrayList(strArrVdvldrhtss.length);
        for (String str : strArrVdvldrhtss) {
            Map map = this.f13257wkgbmnqykc;
            Locale US = Locale.US;
            zdlpuopuiu.dxjokdxxww(US, "US");
            String lowerCase = str.toLowerCase(US);
            zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrL = jyumaefscl.l(arrayList);
        C0191wkgbmnqykc c0191wkgbmnqykc2 = new C0191wkgbmnqykc(observer, iArrL, strArrVdvldrhtss);
        synchronized (this.f13245draadjrbmk) {
            c0191wkgbmnqykc = (C0191wkgbmnqykc) this.f13245draadjrbmk.gxszxtbevo(observer, c0191wkgbmnqykc2);
        }
        if (c0191wkgbmnqykc == null && this.f13244btonecajqb.zoijcleaow(Arrays.copyOf(iArrL, iArrL.length))) {
            jyumaefscl();
        }
    }

    public void rgvfuqvkyq(ppxfxbqfkf observer) {
        C0191wkgbmnqykc c0191wkgbmnqykc;
        zdlpuopuiu.btonecajqb(observer, "observer");
        synchronized (this.f13245draadjrbmk) {
            c0191wkgbmnqykc = (C0191wkgbmnqykc) this.f13245draadjrbmk.dxjokdxxww(observer);
        }
        if (c0191wkgbmnqykc != null) {
            zoijcleaow zoijcleaowVar = this.f13244btonecajqb;
            int[] iArrIobyxmoadg = c0191wkgbmnqykc.iobyxmoadg();
            if (zoijcleaowVar.ppxfxbqfkf(Arrays.copyOf(iArrIobyxmoadg, iArrIobyxmoadg.length))) {
                jyumaefscl();
            }
        }
    }

    public final void wflxmlrfwp(String... tables) {
        zdlpuopuiu.btonecajqb(tables, "tables");
        synchronized (this.f13245draadjrbmk) {
            try {
                for (Map.Entry entry : this.f13245draadjrbmk) {
                    zdlpuopuiu.dxjokdxxww(entry, "(observer, wrapper)");
                    ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) entry.getKey();
                    C0191wkgbmnqykc c0191wkgbmnqykc = (C0191wkgbmnqykc) entry.getValue();
                    if (!ppxfxbqfkfVar.zoijcleaow()) {
                        c0191wkgbmnqykc.ppxfxbqfkf(tables);
                    }
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void wkgbmnqykc(ppxfxbqfkf observer) {
        zdlpuopuiu.btonecajqb(observer, "observer");
        ppxfxbqfkf(new eablkybsjg(this, observer));
    }
}
